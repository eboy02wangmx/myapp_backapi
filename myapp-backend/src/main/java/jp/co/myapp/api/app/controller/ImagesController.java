package jp.co.myapp.api.app.controller;

import java.util.List;
import java.util.Locale;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import jp.co.myapp.api.app.request.AlbumRequest;
import jp.co.myapp.api.domain.model.ImagesBean;
import jp.co.myapp.api.domain.service.images.ImagesService;

@Controller
public class ImagesController {
	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);
	@Inject
	ImagesService imagesService;


	@RequestMapping(value = "/api/imagesInfo", method = { RequestMethod.POST })
	@ResponseBody
	public List<ImagesBean> getImagesInfo(HttpServletRequest request, HttpServletResponse response,  Locale locale,
			@RequestBody AlbumRequest params) {
		// logger.info(API_ID.NHA_O_0110 + " 処理開始");
		List<ImagesBean> images;
        if(params.getUserid().equals("panolib_admin")) {

        images = imagesService.getAdminInfo(params.getUserid());
        }else {

		images = imagesService.getImagesInfo(params.getUserid());

        }

		return images;
	}
}
