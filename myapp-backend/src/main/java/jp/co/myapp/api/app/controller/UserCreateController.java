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
import jp.co.myapp.api.app.request.UserCreateRequest;
import jp.co.myapp.api.domain.model.UserInfoBean;
import jp.co.myapp.api.domain.service.userkanri.UserCreateService;

@Controller
public class UserCreateController {

	private static final Logger logger = LoggerFactory.getLogger(UserCreateController.class);

	@Inject
	UserCreateService userCreateService;

	@RequestMapping(value = "/api/userCreate", method = { RequestMethod.POST })
	@ResponseBody
	public void getinfoHenshu(HttpServletRequest request, HttpServletResponse response, Locale locale,
			@RequestBody UserCreateRequest params) {
		userCreateService.userCreate(params);

	}

	@RequestMapping(value = "/api/userInfo", method = { RequestMethod.POST })
	@ResponseBody
	public AbstractResultData getUserInfo(HttpServletRequest request, HttpServletResponse response, Locale locale,
			@RequestBody UserCreateRequest params) {
		logger.info("NHA_O_0155" + " 処理開始");

		String userId = params.getUserid();

		UserInfoBean userInfoBean = userCreateService.getUserInfo(userId);

		logger.info("NHA_O_0155" + " 処理終了");
		return userInfoBean;
	}
}
