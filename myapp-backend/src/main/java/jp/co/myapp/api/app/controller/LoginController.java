package jp.co.myapp.api.app.controller;

import java.util.Locale;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import jp.co.myapp.api.app.data.AbstractResultData;
import jp.co.myapp.api.app.request.UserRequest;
import jp.co.myapp.api.domain.model.UserBean;
import jp.co.myapp.api.domain.service.user.UserService;
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


	@Inject
	UserService userService;

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
	public AbstractResultData userLogin(HttpServletRequest request, HttpServletResponse response, Locale locale,
			@RequestBody UserRequest params)
			throws CustomizeSystemErrorException, CustomizeBadRequestException {
		logger.info(API_ID.NHA_O_0001 + " 処理開始");

		UserBean userBean = userService.userLogin(params.getUserName());
		if (userBean != null) {
			logger.info("ログインユーザー名称；" + userBean.getUserName() + "," + userBean.getPassword());
		} else {
			userBean = new UserBean();
			userBean.setUserName("");
		}
		if (params.getPassword() == null || !params.getPassword().equals(userBean.getPassword())) {
			userBean = new UserBean();
			userBean.setUserName("");
		}

		logger.info(API_ID.NHA_O_0001 + " 処理完了");
		return userBean;
	}
}
