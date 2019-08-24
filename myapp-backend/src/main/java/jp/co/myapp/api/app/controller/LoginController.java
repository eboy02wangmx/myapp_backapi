package jp.co.myapp.api.app.controller;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import jp.co.myapp.api.app.data.AbstractResultData;
import jp.co.myapp.api.domain.model.ConfigBean;
import jp.co.myapp.common.Constants;
import jp.co.myapp.common.ConstantsEnum.API_ID;
import jp.co.myapp.common.exception.CustomizeBadRequestException;
import jp.co.myapp.common.exception.CustomizeSystemErrorException;

/**
 * ログインチェックAPI
 */
@Controller
public class LoginController extends AbstractApiController {

	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);


//	@Inject
//	protected AgentSearchService agentSearchService;


	/**
	 * Config処理
	 *
	 * @param locale
	 *            Locale
	 * @param params
	 *            EntryRequestRequest
	 * @return ResponseJson
	 * @throws CustomizeSystemErrorException
	 * @throws CustomizeBadRequestException
	 */
	@RequestMapping(value = "/api/login", method = { RequestMethod.POST })
	@ResponseBody
	public AbstractResultData config(HttpServletRequest request, HttpServletResponse response, Locale locale,
			@RequestParam(required = false, name = Constants.LOGIN_KEY_AGENCY) String reqAgency,
			@RequestParam(required = false, name = Constants.LOGIN_KEY_ENTRY_TYPE) String reqEntryType,
			@RequestParam(required = false, name = Constants.LOGIN_KEY_AGENT_CODE) String reqAgentCode)
			throws CustomizeSystemErrorException, CustomizeBadRequestException {
		logger.info(API_ID.NHA_O_0001 + " 処理開始");
		ConfigBean configBean = new ConfigBean();
		configBean.setAgentName("ログイン用アプリの代理店名");

		logger.info(API_ID.NHA_O_0001 + " 処理完了");
		return configBean;
	}


}
