package jp.co.myapp.api.app.controller;

import java.util.List;
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
import jp.co.myapp.api.domain.model.UserKanriBean;
import jp.co.myapp.api.domain.service.userkanri.UserKanriService;

@Controller
public class UserKanriController {

	@Inject
	UserKanriService userKanriService;

	@RequestMapping(value = "/api/userKanri", method = { RequestMethod.POST })
	@ResponseBody
	public List<UserKanriBean> getUserkanriInfo(HttpServletRequest request, HttpServletResponse response, Locale locale,
			@RequestBody UserKanriRequest params) {
		List<UserKanriBean> userKanri;
		String userId = params.getUserId();
		String orderName = params.getOrderName();
		String orderDirect = params.getOrderDirect();
		if ("panolib_admin".equals(userId)) {
			userKanri = userKanriService.getAdminInfo(userId, orderName, orderDirect);
		} else {
			userKanri = userKanriService.getUserkanriInfo(userId, orderName, orderDirect);
		}

		return userKanri;
	}

}
