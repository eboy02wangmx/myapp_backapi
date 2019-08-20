package jp.co.myapp.welcome;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import jp.co.myapp.common.Constants;
import jp.co.myapp.common.ConstantsEnum;

/**
 * NHA_O_0028 一時申込連携
 */
@Controller
public class NextController {

	private static final Logger logger = LoggerFactory.getLogger(NextController.class);

	/**
	 * Dispatch / to index.html.
	 */
	@RequestMapping(value = "/next/{key}", method = { RequestMethod.GET })
	public String home(HttpServletRequest request, HttpServletResponse response, Locale locale,
			@PathVariable String key,
			@RequestParam(required = false) String mytoken,
			@RequestParam(required = false) String reqAgency) throws Exception {

		logger.info(ConstantsEnum.API_ID.NHA_O_0028.getId() + " 処理開始");

		HttpSession session = request.getSession(true);
		session.setAttribute(Constants.REF, key);
		if(mytoken != null) {
			session.setAttribute(Constants.MYTOKEN, mytoken);
		}
		if (reqAgency != null) {
			// タイムアウトでセッションから消えているので再セット
			session.setAttribute(Constants.LOGIN_KEY_PATTERN_CD, reqAgency);
		}

		logger.info(ConstantsEnum.API_ID.NHA_O_0028.getId() + " 処理開始");

//		String value = new String(Base64.getUrlDecoder().decode(key));
//		logger.debug(value);
//		logger.debug(CryptUtil.decrypt("test_openid", value));
		return "redirect:/";
	}
}
