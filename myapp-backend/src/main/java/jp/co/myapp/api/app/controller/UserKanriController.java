package jp.co.myapp.api.app.controller;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jp.co.myapp.api.domain.service.userkanri.UserKanriService;

public class UserKanriController {
	@Inject
	UserKanriService userKanriService;

	@RequestMapping(value = "/api/userKanri", method = { RequestMethod.POST })
	public void getuserKanriInfo(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk");
		String user1 = request.getParameter("user");
		userKanriService.getAlbumInfo(user1);
	}
}
