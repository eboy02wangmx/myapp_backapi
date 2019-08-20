package jp.co.myapp.error;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.MessageSource;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.databind.ObjectMapper;

import jp.co.myapp.api.app.data.error.ErrorInfoData;
import jp.co.myapp.api.app.data.error.ErrorResponseJson;
import jp.co.myapp.common.Constants;
import jp.co.myapp.common.util.MyUtils;

/**
 * Error Controller
 */
@Controller
public class ErrorController {

	private static final Logger logger = LoggerFactory.getLogger(ErrorController.class);

	@Resource(name = "messageSource")
	public MessageSource messageSource;

	/**
	 * ResourceNotFound
	 */
	@RequestMapping(value = "/error/csrf", method = { RequestMethod.GET, RequestMethod.POST },
			headers = "Content-Type= application/json")
	@ResponseBody
	public ErrorResponseJson csrf(HttpServletRequest request, HttpServletResponse response, Locale locale)
			throws Exception {
		ErrorResponseJson json = new ErrorResponseJson();

		ErrorInfoData error = new ErrorInfoData("", "E00000",
				MyUtils.getMessageDiscription(messageSource, Constants.ERROR_E00000, null, locale));
		json.addErrors(error);

		response.setStatus(HttpServletResponse.SC_FORBIDDEN);
		response.setHeader("Content-Disposition", "attachment; filename=" + "secerror.json");

		logger.info("403 Forbidden");

		return json;
	}

	@RequestMapping(value = "/error/csrf", method = { RequestMethod.GET, RequestMethod.POST },
			headers = "Content-Type= multipart/form-data", produces = "multipart/form-data;charset=UTF-8")
	@ResponseBody
	public ResponseEntity<MultiValueMap<String, Object>> csrfMulti(HttpServletRequest request, HttpServletResponse response, Locale locale)
			throws Exception {
		ErrorResponseJson errors = new ErrorResponseJson();

		ErrorInfoData error = new ErrorInfoData("", "E00000",
				MyUtils.getMessageDiscription(messageSource, Constants.ERROR_E00000, null, locale));
		errors.addErrors(error);

		response.setStatus(HttpServletResponse.SC_FORBIDDEN);
		response.setHeader("Content-Disposition", "attachment; filename=" + "secerror.json");

		logger.info("403 Forbidden");

		return multipartResponse(HttpStatus.FORBIDDEN,errors);
	}

	/**
	 * ResourceNotFound
	 */
	@RequestMapping(value = "/error/notfound", method = { RequestMethod.GET, RequestMethod.POST })
	@ResponseBody
	public ErrorResponseJson notFound(HttpServletRequest request, HttpServletResponse response, Locale locale)
			throws Exception {
		ErrorResponseJson json = new ErrorResponseJson();

		ErrorInfoData error = new ErrorInfoData("", "E00000",
				MyUtils.getMessageDiscription(messageSource, Constants.ERROR_E00000, null, locale));
		json.addErrors(error);

		response.setStatus(HttpServletResponse.SC_NOT_FOUND);
		response.setHeader("Content-Disposition", "attachment; filename=" + "notfound.json");

		logger.info("404 ResourceNotFound");

		return json;
	}

	/**
	 * File Upload Error
	 */
	@RequestMapping(value = "/error/upload", method = {
			RequestMethod.POST }, headers = "Content-Type= multipart/form-data", produces = "multipart/form-data;charset=UTF-8")
	@ResponseBody
	public ResponseEntity<MultiValueMap<String, Object>> upload(HttpServletRequest request,
			HttpServletResponse response, Locale locale) throws Exception {
		ErrorResponseJson errors = new ErrorResponseJson();

		String[] params = { "", "5" };
		ErrorInfoData error = new ErrorInfoData("", "E00004",
				MyUtils.getMessageDiscription(messageSource, Constants.ERROR_E00004, params, locale));
		List<ErrorInfoData> result = new ArrayList<ErrorInfoData>();
		result.add(error);

		errors.setResult(result);

		response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
		response.setHeader("Content-Disposition", "attachment; filename=" + "uploaderror.json");

		logger.info("400 File Upload Error");

		return multipartResponse(HttpStatus.BAD_REQUEST,errors);

	}

	/**
	 * System Error
	 */
	@RequestMapping(value = "/error/system", method = { RequestMethod.GET, RequestMethod.POST },
			headers = "Content-Type= application/json")
	@ResponseBody
	public ErrorResponseJson system(HttpServletRequest request, HttpServletResponse response, Locale locale)
			throws Exception {
		ErrorResponseJson json = new ErrorResponseJson();

		ErrorInfoData error = new ErrorInfoData("", "E00000",
				MyUtils.getMessageDiscription(messageSource, Constants.ERROR_E00000, null, locale));
		json.addErrors(error);

		response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
		response.setHeader("Content-Disposition", "attachment; filename=" + "systemerror.json");

		logger.info("500 Internal Server Error");

		return json;
	}

	@RequestMapping(value = "/error/system", method = { RequestMethod.GET, RequestMethod.POST },
			headers = "Content-Type= multipart/form-data", produces = "multipart/form-data;charset=UTF-8")
	@ResponseBody
	public ResponseEntity<MultiValueMap<String, Object>> systemMulti(HttpServletRequest request,
			HttpServletResponse response, Locale locale) throws Exception {
		ErrorResponseJson errors = new ErrorResponseJson();

		ErrorInfoData error = new ErrorInfoData("", "E00000",
				MyUtils.getMessageDiscription(messageSource, Constants.ERROR_E00000, null, locale));
		errors.addErrors(error);

		response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
		response.setHeader("Content-Disposition", "attachment; filename=" + "systemerror.json");

		logger.info("500 Internal Server Error");

		return multipartResponse(HttpStatus.BAD_REQUEST,errors);
	}

	/**
	 * create multipart form response.
	 * @param status
	 * @param errors
	 * @return
	 * @throws Exception
	 */
	private ResponseEntity<MultiValueMap<String, Object>> multipartResponse(HttpStatus status, ErrorResponseJson errors)
			throws Exception {

		ObjectMapper mapper = new ObjectMapper();
		String json = mapper.writeValueAsString(errors);

		MultiValueMap<String, Object> mpr = new LinkedMultiValueMap<String, Object>();
		HttpHeaders xHeader = new HttpHeaders();
		xHeader.add("Content-Type", "application/json;charset=UTF-8");
		HttpEntity<String> xPart = new HttpEntity<String>(json, xHeader);
		mpr.add("response", xPart);

		return new ResponseEntity<MultiValueMap<String, Object>>(mpr, status);

	}
}
