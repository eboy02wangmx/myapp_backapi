package jp.co.myapp.api.app.controller;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jp.co.myapp.api.domain.service.album.AlbumInfoService;

public class AlbumInfoController {
	@Inject
	AlbumInfoService albumInfoService;

	@RequestMapping(value = "/api/albumInfo", method = { RequestMethod.GET })
	public void getAlbumInfo(HttpServletRequest request, HttpServletResponse response) {
		String user1 = request.getParameter("user");
		albumInfoService.getAlbumInfo(user1);
	}
}
