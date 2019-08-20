package jp.co.myapp.api.app.controller;

import java.net.BindException;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.TypeMismatchException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceResolvable;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.util.StringUtils;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.MissingPathVariableException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.ServletRequestBindingException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.support.MissingServletRequestPartException;

import jp.co.myapp.api.app.data.error.ErrorInfoData;
import jp.co.myapp.api.app.data.error.ErrorResponseJson;
import jp.co.myapp.common.Constants;
import jp.co.myapp.common.exception.CustomizeBadRequestException;
import jp.co.myapp.common.exception.CustomizeSystemErrorException;
import jp.co.myapp.common.log.EntryAccountLog;
import jp.co.myapp.common.util.CryptUtil;
import jp.co.myapp.common.util.MyUtils;


public abstract class AbstractApiController {

	private static final Logger log = LoggerFactory.getLogger(AbstractApiController.class);

	private String functionId;

	@Value("#{system.sig_key}")
	private String SIG_KEY;

	@Resource(name = "messageSource")
	public MessageSource messageSource;


	protected void initializeEntry(HttpServletRequest request) {
		// セッションクリアするのではなく、必要なものは削除する。

		// 申込依頼NO
		request.getSession().removeAttribute(Constants.OPERATION_ENTRY_NO);
	}

	/**
	 * 申込依頼Noの判定
	 * @param locale
	 * @param request
	 * @param entryNo
	 * @return
	 * @throws Exception
	 */
	protected boolean sameEntryNo(Locale locale, HttpServletRequest request,String entryNo) throws Exception {

		if (request.getSession().getAttribute(Constants.OPERATION_ENTRY_NO) == null) {
			// 操作中の申込依頼Noがない場合はOK
			return true;
		}

		String operationNo = (String)request.getSession().getAttribute(Constants.OPERATION_ENTRY_NO);

		if(entryNo != null) {
			// 操作中の申込依頼Noが同じ場合はOK
			if( entryNo.equals(operationNo)) {
				return true;
			}
		}
		// 申込依頼NoがSessionと異なる場合はシステムエラーにする。
		String message = getMessageDiscription(Constants.ERROR_E00000, locale);
		throw new CustomizeBadRequestException(new ErrorInfoData(null, Constants.ERROR_E00000, message));

	}

	/**
	 * BeanのValidateエラー（400）の戻り処理
	 *
	 * @param request
	 * @param response
	 * @param ex
	 * @return
	 */
	@ExceptionHandler(MethodArgumentNotValidException.class)
	//@ResponseStatus(HttpStatus.BAD_REQUEST)
    @ResponseBody
	private ErrorResponseJson handleMethodArgumentNotValidException(
			HttpServletRequest request, HttpServletResponse response,
			MethodArgumentNotValidException ex){
		this.outputBadReqLog(ex);

		List<ErrorInfoData> errList = new ArrayList<ErrorInfoData>();
		for (FieldError error : ex.getBindingResult().getFieldErrors()) {
			String messageId = error.getDefaultMessage();
			ErrorInfoData data = null;
			if (error.getCodes().length > 0
					&& error.getCodes()[0].startsWith(Constants.ANNOTATION_START_CUSTOMIZE)) {
				String[] params = this.getMessageParams(error, request.getLocale());
				String discription = this.getMessageDiscription(
						messageId, request.getLocale(), params);

				data = new ErrorInfoData(
						error.getField(), messageId, discription);
			} else {
				data = new ErrorInfoData(
						error.getField(), messageId, messageId);
			}
			errList.add(data);
		}
		Collections.sort(errList);

		response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
		return this.createExceptionJson(errList, null);
	}

	/**
	 * 自定義の400エラー戻り処理
	 *
	 * @param request
	 * @param response
	 * @param ex
	 * @return
	 */
	@ExceptionHandler(CustomizeBadRequestException.class)
    @ResponseBody
	private ErrorResponseJson handleMethodArgumentNotValidException(
			HttpServletRequest request, HttpServletResponse response,
			CustomizeBadRequestException ex){
		this.outputBadReqLog(ex);

		response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
		return this.createExceptionJson(ex.getErrorList(), request.getLocale());
	}

	/**
	 * 自定義の500エラー戻り処理
	 *
	 * @param request
	 * @param response
	 * @param ex
	 * @return
	 */
	@ExceptionHandler(CustomizeSystemErrorException.class)
    @ResponseBody
	private ErrorResponseJson handleMethodArgumentNotValidException(
			HttpServletRequest request, HttpServletResponse response,
			CustomizeSystemErrorException ex){
		this.outputExceptionLog(ex);

		response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);

		if (ex.getErrorList() == null || ex.getErrorList().size() == 0) {
			return this.createExceptionJson(new ErrorInfoData(null, Constants.ERROR_E00000,
					this.getMessageDiscription(Constants.ERROR_E00000, request.getLocale())));
		} else {
			return this.createExceptionJson(ex.getErrorList(), request.getLocale());
		}
	}

	/**
	 * その他400のエラーの戻り処理
	 * @param request
	 * @param response
	 * @param ex
	 * @return
	 */
	@ExceptionHandler({
		MissingServletRequestParameterException.class,
		ServletRequestBindingException.class,
		TypeMismatchException.class,
		HttpMessageNotReadableException.class,
		MissingServletRequestPartException.class,
		BindException.class
	})
    @ResponseBody
	private ErrorResponseJson handleErrorException(
			HttpServletRequest request, HttpServletResponse response,
			Exception ex) {
		this.outputBadReqLog(ex);
		response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
		return this.createExceptionJson(request, ex, "");
	}

	/**
	 * その他500のエラーの戻り処理
	 * @param request
	 * @param response
	 * @param ex
	 * @return
	 */
	@ExceptionHandler({
		MissingPathVariableException.class,
		Exception.class
	})
    @ResponseBody
	private ErrorResponseJson handleSystemErrorException(
			HttpServletRequest request, HttpServletResponse response,
			Exception ex) {
		this.outputExceptionLog(ex);
		response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
		return this.createExceptionJson(request, ex, null);
	}

	/**
	 * エラーの場合、戻りjaon
	 * @param request
	 * @param ex
	 * @param param
	 * @param errorId
	 * @return
	 */
	public ErrorResponseJson createExceptionJson(HttpServletRequest request, Exception ex, String param) {

		ErrorInfoData data = new ErrorInfoData(param, Constants.ERROR_E00000,
				this.getMessageDiscription(Constants.ERROR_E00000, request.getLocale()));

		return this.createExceptionJson(data);
	}
	/**
	 * エラーの場合、戻りjaon
	 * @param data
	 * @return
	 */
	public ErrorResponseJson createExceptionJson(ErrorInfoData data) {
		List<ErrorInfoData> errList = new ArrayList<ErrorInfoData>();
		errList.add(data);

		return this.createExceptionJson(errList, null);
	}
	/**
	 * エラーの場合、戻りjaon
	 * @param errList
	 * @param local
	 * @return
	 */
	public ErrorResponseJson createExceptionJson(List<ErrorInfoData> errList, Locale local) {
		if (local != null) {
			for (ErrorInfoData data : errList) {
				if (!StringUtils.isEmpty(data.getErrorId())
						&& StringUtils.isEmpty(data.getDiscription())) {
					if (data.getMsgParams() == null) {
						data.setDiscription(this.getMessageDiscription(data.getErrorId(), local));
					} else {
						data.setDiscription(this.getMessageDiscription(data.getErrorId(), local, data.getMsgParams()));
					}
				}
			}
		}

		ErrorResponseJson json = new ErrorResponseJson();
		json.setResult(errList);
		return json;
	}

	/**
	 * FieldErrorのメッセージの引数を取得する
	 *
	 * @param error
	 * @return
	 */
	private String[] getMessageParams(FieldError error, Locale local) {
		String[] params = null;
		for (Object obj : error.getArguments()) {
			if (obj instanceof MessageSourceResolvable) {
				String str = ((MessageSourceResolvable) obj).getDefaultMessage();
				params = MyUtils.getMsgParams(str);
				if (params != null) {
					for (int i = 0; i < params.length; i++) {
						if (MyUtils.isMsgParamString(params[i])) {
							params[i] = params[i].substring(1, params[i].length() - 1);
						} else {
							params[i] = this.getMessageDiscription(params[i], local);
						}
					}
					break;
				}
			}
		}

		return params;
	}

	/**
	 * メッセージの内容を取得する
	 *
	 * @param messageId String
	 * @param local Locale
	 * @param params String[]
	 * @return
	 */
	public String getMessageDiscription(String messageId, Locale local, String... params) {
		return MyUtils.getMessageDiscription(messageSource, messageId, params, local);
	}
	/**
	 * メッセージの内容を取得する
	 *
	 * @param messageId String
	 * @param local Locale
	 * @param params String[]
	 * @return
	 */
	public String getMessageDiscription(String messageId, Locale local) {
		return MyUtils.getMessageDiscription(messageSource, messageId, null, local);
	}

	public void setFunctionId(String id) {
		this.functionId = id;
	}

	/**
	 * 500エラーの際のログ出力
	 * @param ex
	 */
	private void outputExceptionLog(Exception ex) {
		log.error(functionId + " " + ex.toString());
	}

	/**
	 * 400エラーの際のログ出力
	 * @param ex
	 */
	private void outputBadReqLog(Exception ex) {
		log.warn(functionId + " " + ex.toString());
	}

	/**
	 * クッキーをチェック
	 *
	 * @param request
	 * @param key
	 * @return
	 */
	protected String chkCookie(HttpServletRequest request, String key) {
		Cookie cookie[] = request.getCookies();

		if (cookie != null) {
			for (int i = 0; i < cookie.length; i++) {
				if (key.equals(cookie[i].getName())) {
					return cookie[i].getValue();
				}
			}
		}
		return null;
	}

	/**
	 * 申込依頼No.と代理店アカウントコードの紐付け出力
	 *
	 */
	protected void entryAccountLog(HttpServletRequest request, String entryNo) {

		String agencyString = null;
		String accountCode = null;

		HttpSession session = request.getSession(false);
		if (session != null && !Objects.isNull(session.getAttribute(Constants.SESSION_KEY_AGENT_CODE))) {
			agencyString = session.getAttribute(Constants.SESSION_KEY_AGENT_CODE).toString();
		} else {
			agencyString = chkCookie(request, Constants.SELF_AGENT_CODE);
		}

		if(agencyString != null) {
			// accountCode = new String(Base64.getUrlDecoder().decode(agencyString));
			accountCode = agencyString;
		} else {
			accountCode = Constants.DEFAULT_ACCOUNT_CODE;
		}
		String message =MyUtils.getMessageDiscription(messageSource, Constants.ERROR_I00020, new String[] {accountCode, entryNo}, Locale.JAPAN);
		EntryAccountLog.out(Constants.ERROR_I00020 + " " + message);

	}

}
