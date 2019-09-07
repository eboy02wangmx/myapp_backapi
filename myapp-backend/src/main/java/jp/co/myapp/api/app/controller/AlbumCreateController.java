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

import jp.co.myapp.api.app.request.AlbumCreateRequest;
import jp.co.myapp.api.domain.service.album.AlbumCreateService;

@Controller
public class AlbumCreateController {
	@Inject
	AlbumCreateService albumCreateService;

	@RequestMapping(value = "/api/albumCreaet", method = { RequestMethod.POST })
	@ResponseBody
	public void getAlbumInfo(HttpServletRequest request, HttpServletResponse response, Locale locale,
			@RequestBody AlbumCreateRequest params) {
		albumCreateService.albumCreate(params);

	}
}
