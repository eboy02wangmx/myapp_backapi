package jp.co.myapp.api.app.controller;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jp.co.myapp.api.domain.service.albumcreate.AlbumCreateService;

public class AlbumCreateController {
	@Inject
	AlbumCreateService albumCreateService;

	@RequestMapping(value = "/api/albumCreate", method = { RequestMethod.GET })
	public void albumCreate(HttpServletRequest request, HttpServletResponse response) {
		String user1 = request.getParameter("user");
		albumCreateService.create(user1);
	}
}
