package jp.co.myapp.welcome;

import java.util.Base64;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import jp.co.myapp.common.util.CryptUtil;

/**
 * agency_code を暗号化する
 */
@Controller
public class AgencyEncodeController {

	@SuppressWarnings("unused")
	private static final Logger logger = LoggerFactory.getLogger(AgencyEncodeController.class);

	@Value("#{system.sig_key}")
	private String SIG_KEY;

	/**
	 * Dispatch / to index.html.
	 */
	@RequestMapping(value = "/agency/{code}", method = { RequestMethod.GET })
	@ResponseBody
	public Map<String, String> home(HttpServletRequest request, HttpServletResponse response, Locale locale,
			@PathVariable String code,
			@RequestParam(required = false) String mytoken) throws Exception {

		String encode = Base64.getUrlEncoder()
				.encodeToString(CryptUtil.encrypt(SIG_KEY, code).getBytes());

		Map<String, String> data = new HashMap<String, String>();
		data.put("agency_code", encode);

		return data;
	}
}
