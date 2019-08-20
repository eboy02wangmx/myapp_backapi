package jp.co.myapp.welcome;

import java.util.Locale;
import java.util.Map;
import java.util.Objects;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import jp.co.myapp.api.app.request.AgnetRequest;
import jp.co.myapp.common.Constants;

/**
 * Handles requests for the entryList home page.
 */
@Controller
public class HelloController {

	private static final Logger logger = LoggerFactory.getLogger(HelloController.class);

	/**
	 * 管理画面の識別子（1:AGNET、0:社内、なし、外部サイト（HA、MyPage etc）
	 */
	@Value("#{system.admin_authority}")
	private String adminAuthority;

	/***
	 * 社内管理画面許可IP
	 */
	@Value("#{system.admin_allow_ip}")
	private String adminAllowIp;

	/**
	 * Dispatch / to index.html.
	 */
	@RequestMapping(value = "/", method = { RequestMethod.GET })
	public String home(HttpServletRequest request, HttpServletResponse response, Locale locale,
			@RequestParam(required = false, name = Constants.LOGIN_KEY_AGENCY) String agencyCode,
			@RequestParam(required = false) AgnetRequest agnet,
			@RequestBody(required = false) Map<String, String> requestParams) throws Exception {

		// アカウントコードチェック＆格納（To:セッション、cookie）
		HttpSession session = request.getSession(true);
		if (StringUtils.isNotEmpty(agencyCode)) {
			session.setAttribute(Constants.LOGIN_KEY_AGENCY, agencyCode);
			response.addCookie(cookie(Constants.LOGIN_KEY_AGENCY, agencyCode));
			return "redirect:/";
		} else if (!Objects.isNull(requestParams)
				&& StringUtils.isNotEmpty(requestParams.get(Constants.LOGIN_KEY_AGENCY))) {
			session.setAttribute(Constants.LOGIN_KEY_AGENCY, requestParams.get(Constants.LOGIN_KEY_AGENCY));
			response.addCookie(cookie(Constants.LOGIN_KEY_AGENCY, requestParams.get(Constants.LOGIN_KEY_AGENCY)));
			return "redirect:/";
		}

		// 社内管理画面のチェック
		if (StringUtils.isNotEmpty(adminAuthority) && "0".equals(adminAuthority)
				&& StringUtils.isNotEmpty(adminAllowIp)) {

			logger.info("社内管理画面チェック：" + request.getRemoteAddr());

			if (!adminAllowIp.equals(request.getRemoteAddr())) {
				// 社内管理画面許可IPが設定されている場合チェックしNGの場合、許可エラーにする。
				response.sendError(HttpServletResponse.SC_FORBIDDEN, "Forbidden");
				return null;
			} else {
				response.addCookie(cookie("authority", "0"));
			}
		}

//		if (StringUtils.isNotEmpty(adminAuthority) &&
//				"1".equals(adminAuthority)) {
//			response.sendError(HttpServletResponse.SC_FORBIDDEN, "Forbidden");
//			return null;
//		}

//		if (Objects.isNull(session.getAttribute(Constants.LOGIN_KEY_AGENCY))) {
//			logger.error("agent_code未指定");
//			throw new CustomizeSystemErrorException();
//		}

		return "welcome/start";
	}

	@CrossOrigin
//	@PostMapping(value = "/")
	@RequestMapping(value = "/ag", method = RequestMethod.POST)
	public String agnet(HttpServletRequest request, HttpServletResponse response, Locale locale,
			@ModelAttribute AgnetRequest agnet) throws Exception {

		logger.info("AGNET Login::Start");

		// AGNET
		if (StringUtils.isNotEmpty(adminAuthority) && "1".equals(adminAuthority)) {

			logger.info("AGNET adminAuthority::" + adminAuthority);

			if (agnet != null) {
				logger.info("AGNET Param authority::" + agnet.getAuthority());
			}

			if (agnet != null && agnet.getAuthority() != null && ("1".equals(agnet.getAuthority()) || "2".equals(agnet.getAuthority()))
					&& agnet.getSalesCode() != null && agnet.getSelfAgentCode() != null) {
				// AGNETのログイン
				response.addCookie(cookie("authority", agnet.getAuthority()));
				response.addCookie(cookie("salesCode", agnet.getSalesCode()));
				response.addCookie(cookie("selfAgentCode", agnet.getSelfAgentCode()));

				logger.info("AGNET Param authority::" + agnet.getAuthority());
				logger.info("AGNET Param salesCode::" + agnet.getSalesCode());
				logger.info("AGNET Param selfAgentCode::" + agnet.getSelfAgentCode());

			} else {
				// 許可がない
				response.sendError(HttpServletResponse.SC_FORBIDDEN, "Forbidden");
				return null;
			}
		} else {
			// 許可がない
			response.sendError(HttpServletResponse.SC_FORBIDDEN, "Forbidden");
			return null;
		}

		logger.info("AGNET Login::END");

		return "redirect:/";
	}

	/**
	 * クッキー（Secure）を設定
	 *
	 * @param name
	 * @param value
	 * @return
	 */
	private Cookie cookie(String name, String value) {
		Cookie object = new Cookie(name, value);
		object.setSecure(false);
		return object;
	}
}
