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

import jp.co.myapp.api.app.request.UserKanriRequest;
import jp.co.myapp.api.domain.service.userkanri.UserYukokbnService;

@Controller
public class UserYukokbnHenkoController {
	@Inject
	UserYukokbnService userYukokbnService;

	@RequestMapping(value = "/api/yukokbnHenko", method = { RequestMethod.POST })
	@ResponseBody
	public void updateinfoKengen(HttpServletRequest request, HttpServletResponse response, Locale locale,
			@RequestBody UserKanriRequest params) {

		userYukokbnService.updateyukokbn(params);
	}
}
