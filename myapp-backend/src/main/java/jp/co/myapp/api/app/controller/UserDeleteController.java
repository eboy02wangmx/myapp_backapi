package jp.co.myapp.api.app.controller;

import java.util.Locale;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import jp.co.myapp.api.domain.service.userkanri.UserDeleteService;

@Controller
public class UserDeleteController {
	@Inject
	UserDeleteService userDeleteService;

	@RequestMapping(value = "/api/userDelete", method = { RequestMethod.POST })
	@ResponseBody
	public void getinfoSakuse(HttpServletRequest request, HttpServletResponse response, Locale locale,
			@RequestBody String params) {
		userDeleteService.delete(params);

	}
}
