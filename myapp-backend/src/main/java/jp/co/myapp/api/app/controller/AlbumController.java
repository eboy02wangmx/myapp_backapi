package jp.co.myapp.api.app.controller;

import java.util.List;
import java.util.Locale;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import jp.co.myapp.api.app.request.UserRequest;
import jp.co.myapp.api.domain.model.AlbumBean;
import jp.co.myapp.api.domain.service.album.AlbumService;

public class AlbumController {
	@Inject
	AlbumService albumService;

	@RequestMapping(value = "/api/album", method = { RequestMethod.POST })
	@ResponseBody
	public List<AlbumBean> getAlbumInfo(HttpServletRequest request, HttpServletResponse response, Locale locale,
			@RequestBody UserRequest params) {
		String user = request.getParameter("userid");
		return albumService.getAlbum(user);
	}
}
