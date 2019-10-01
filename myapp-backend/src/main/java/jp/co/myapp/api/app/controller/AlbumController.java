package jp.co.myapp.api.app.controller;

import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

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

@RequestMapping(value = "/api/album")
@Controller
public class AlbumController {

	@Inject
	AlbumService albumService;

	@RequestMapping(method = { RequestMethod.POST })
	@ResponseBody
	public List<AlbumBean> search(HttpServletRequest request, HttpServletResponse response, Locale locale,
			@RequestBody AlbumRequest params) {
		String userId = params.getUserid();
		String orderName = params.getOrderName();
		String orderDirect = params.getOrderDirect();
		List<AlbumBean> albums = albumService.search(userId, orderName, orderDirect);
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

	@RequestMapping(value = "/domain", method = { RequestMethod.POST })
	@ResponseBody
	public void editDomain(@RequestBody Map<String, String> param) {
		String id = param.get("id");
		if (!StringUtil.isNull(id)) {
			String domain = param.get("domain");
			albumService.editDomain(Integer.valueOf(id), domain);
		}
	}

}
