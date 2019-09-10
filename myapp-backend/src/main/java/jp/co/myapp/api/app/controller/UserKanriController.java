package jp.co.myapp.api.app.controller;

import java.util.List;
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

import jp.co.myapp.api.app.request.UserKanriRequest;
import jp.co.myapp.api.domain.model.UserKanriBean;
import jp.co.myapp.api.domain.service.userkanri.UserKanriService;

@Controller
public class UserKanriController {
	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);
	@Inject
	UserKanriService userKanriService;


	@RequestMapping(value = "/api/userKanri", method = { RequestMethod.POST })
	@ResponseBody
	public List<UserKanriBean> getUserkanriInfo(HttpServletRequest request, HttpServletResponse response,  Locale locale,
			@RequestBody UserKanriRequest params) {
		// logger.info(API_ID.NHA_O_0110 + " 処理開始");
		List<UserKanriBean> userKanri;
        if(params.getUserId().equals("panolib_admin")) {

        userKanri = userKanriService.getAdminInfo(params.getUserId());
        }else {

		userKanri = userKanriService.getUserkanriInfo(params.getUserId());

        }

		return userKanri;
	}
}
