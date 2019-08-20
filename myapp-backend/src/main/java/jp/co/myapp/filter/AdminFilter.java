package jp.co.myapp.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource(value = {"classpath:system.properties"})
public class AdminFilter implements Filter {

	private static final Logger logger = LoggerFactory.getLogger(AdminFilter.class);

	@Autowired
	private Environment eivironment;

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		String adminAuthority =
				 eivironment.getProperty("admin_authority");
		String adminAllowIp =
				 eivironment.getProperty("admin_allow_ip");

//		// 社内管理画面のチェック
//		if (StringUtils.isNotEmpty(adminAuthority) &&
//				"0".equals(adminAuthority) &&
//				StringUtils.isNotEmpty(adminAllowIp)) {
//
//			logger.info("社内管理画面チェック：" + xForwardedFor((HttpServletRequest)request));
//
//			if(!adminAllowIp.equals(xForwardedFor((HttpServletRequest)request))) {
//				// 社内管理画面許可IPが設定されている場合チェックしNGの場合、許可エラーにする。
//				((HttpServletResponse) response).sendError(HttpServletResponse.SC_FORBIDDEN, "Forbidden");
//				return;
//			} else {
//				((HttpServletResponse) response).addCookie(cookie("authority", "0"));
//			}
//		}

		if (StringUtils.isNotEmpty(adminAuthority) &&
				"0".equals(adminAuthority) ) {
			((HttpServletResponse) response).addCookie(cookie("authority", "0"));
		}

		chain.doFilter(request, response);
	}

	@Override
	public void destroy() {
	}

	/**
	 * クッキー（Secure）を設定
	 * @param name
	 * @param value
	 * @return
	 */
	private Cookie cookie(String name, String value) {
		Cookie object = new Cookie(name, value);
		object.setSecure(false);
		return object;
	}

	/**
	 * X-Forwarded-ForからIPを取得する。
	 * @return
	 */
	private String xForwardedFor(HttpServletRequest request) {

		String values = request.getHeader("X-Forwarded-For");
		if (values == null) {
			return "";
		} else {
			String[] ips = values.split(",");
			if (ips.length > 0) {
				return ips[0];
			}

		}

		return "";
	}

}
