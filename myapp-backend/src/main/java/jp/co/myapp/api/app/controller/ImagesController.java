package jp.co.myapp.api.app.controller;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import jp.co.myapp.api.domain.model.ImagesBean;
import jp.co.myapp.api.domain.service.images.ImagesService;
import jp.co.myapp.util.StringUtil;

@Controller
public class ImagesController {

	@Inject
	ImagesService imagesService;

	@RequestMapping(value = "/api/imagesInfo", method = { RequestMethod.POST })
	@ResponseBody
	public List<ImagesBean> getImagesInfo(@RequestBody Map<String, String> params) {
		List<ImagesBean> images = null;
		if (params != null && params.containsKey("vrInfoId")) {
			String vrInfoId = params.get("vrInfoId");
			if (!StringUtil.isNull(vrInfoId)) {
				images = imagesService.getImagesInfo(vrInfoId);
			}
		}

		return images;
	}

}
