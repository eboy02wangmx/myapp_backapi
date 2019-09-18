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

import jp.co.myapp.api.app.request.AlbumRequest;
import jp.co.myapp.api.domain.service.album.SetsumeiService;

@Controller
public class SetsumeiController {
	@Inject
	SetsumeiService setsumeiService;

	@RequestMapping(value = "/api/insertSetsumei", method = { RequestMethod.POST })
	@ResponseBody
	public void setsumeiHenko(HttpServletRequest request, HttpServletResponse response, Locale locale,
			@RequestBody AlbumRequest params) {

			setsumeiService.insertSetsumei(params);
	}
}
