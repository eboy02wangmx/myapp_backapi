package jp.co.myapp.api.app.controller;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import jp.co.myapp.api.domain.model.AlbumBean;
import jp.co.myapp.api.domain.service.album.AlbumService;
import jp.co.myapp.util.StringUtil;

@Controller
public class AlbumRemoveController {

	@Inject
	AlbumService albumService;

	@RequestMapping(value = "/api/albumRemove", method = { RequestMethod.POST })
	@ResponseBody
	public List<AlbumBean> getAlbumInfo(HttpServletRequest request, @RequestBody Map<String, String> param) {
		List<AlbumBean> albums = null;
		String id = param.get("id");
		if (!StringUtil.isNull(id)) {
			albumService.removeAlbum(Integer.valueOf(id));
		}

		String userId = param.get("userid");
		if (!StringUtil.isNull(userId)) {
			albums = albumService.search(userId, null, null);
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
		}

		return albums;
	}

}
