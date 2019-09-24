package jp.co.myapp.api.app.controller;

import java.util.Iterator;
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
import jp.co.myapp.util.StringUtil;

@Controller
public class AlbumController {
	@Inject
	AlbumService albumService;

	@RequestMapping(value = "/api/album", method = { RequestMethod.POST })
	@ResponseBody
	public List<AlbumBean> getAlbumInfo(HttpServletRequest request, HttpServletResponse response, Locale locale,
			@RequestBody AlbumRequest params) {
		String userid = params.getUserid();
		List<AlbumBean> albums = albumService.getAlbum(userid);
		if (albums != null && albums.size() > 0) {
			StringBuilder appFullPath = new StringBuilder();
			appFullPath.append(request.getScheme());
			appFullPath.append("://");
			appFullPath.append(request.getServerName());
			if (request.getServerPort() != 80) {
				appFullPath.append(":");
				appFullPath.append(request.getServerPort());
			}
			appFullPath.append(request.getContextPath());

			for (Iterator<AlbumBean> iter = albums.iterator(); iter.hasNext();) {
				AlbumBean album = iter.next();
				if (!StringUtil.isNull(album.getPicnum()) && Integer.valueOf(album.getPicnum()) > 0) {
					String panoPreviewUrl = appFullPath.toString() + "/pano_preview.html?pid=" + album.getId();
					album.setPanoPreviewUrl(panoPreviewUrl);
				}
			}
		}

		return albums;
	}
}
