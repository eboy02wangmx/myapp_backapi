package jp.co.myapp.api.app.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PanoPreviewController extends AbstractApiController {

	@CrossOrigin(origins = "*", maxAge = 3600)
	@RequestMapping(value = "/panoPreview", method = { RequestMethod.GET })
	public String preview(HttpServletRequest request, HttpServletResponse response) throws IOException {
		return "/views/welcome/start";
	}

}
