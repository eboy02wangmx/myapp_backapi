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

import jp.co.myapp.api.app.request.AlbumRequest;
import jp.co.myapp.api.domain.model.AlbumBean;
import jp.co.myapp.api.domain.service.album.AlbumService;

@Controller
public class AlbumRemoveController {
	@Inject
	AlbumService albumService;

	@RequestMapping(value = "/api/albumRemove", method = { RequestMethod.POST })
	@ResponseBody
	public List<AlbumBean> getAlbumInfo(HttpServletRequest request, HttpServletResponse response, Locale locale,
			@RequestBody AlbumRequest params) {
		String filename = params.getFilename();

		albumService.removeAlbum(filename);

		return albumService.getAlbum(params.getUserid());


	}
}
