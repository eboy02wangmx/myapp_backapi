package jp.co.myapp.api.app.controller;

import java.util.List;
import java.util.Locale;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;

import jp.co.myapp.api.app.request.AlbumRequest;
import jp.co.myapp.api.domain.model.ImagesBean;
import jp.co.myapp.api.domain.service.images.ImagesService;

@Controller
public class ImagesController {

	@Inject
	ImagesService imagesService;

	public List<ImagesBean> getImagesInfo(HttpServletRequest request, HttpServletResponse response, Locale locale,
			@RequestBody AlbumRequest params) {
		List<ImagesBean> images;
		if (params.getUserid().equals("panolib_admin")) {

			images = imagesService.getAdminInfo(params.getUserid());
		} else {

			images = imagesService.getImagesInfo(params.getUserid());

		}

		return images;
	}

}
