package jp.co.myapp.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

import jp.co.myapp.common.Constants;

/**
 *
 *  変更履歴:
 *                      契約情報登録画面を追加 2019/01/21 BY キョク
 */
 
@Configuration
public class CustomFilter implements Filter {

    private static final Logger logger = LoggerFactory.getLogger(CustomFilter.class);


    private static final String MYPAGE_CONTEXT = "/mypage";
//  private static final String MYPAGE_CONTEXT = "/myapp-backend";
    private static final String AUTH_URL = "/auth/";
    private static final String STATIC_URL = "/static/";
    private static final String LOGIN_URL = "/auth/login";
    private static final String READY_MAIL = "/readyMail";
    // 契約情報登録画面を追加 2019/01/21 ADD
    private static final String KEIREGS_UPD = "/keiRegsUpd";

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {

        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse res = (HttpServletResponse)response;

        if (MYPAGE_CONTEXT.equals(req.getServletContext().getContextPath().toLowerCase())
                && !req.getRequestURI().contains(AUTH_URL)
                && !req.getRequestURI().contains(STATIC_URL)
                && !req.getRequestURI().contains(READY_MAIL)
                && !req.getRequestURI().contains(KEIREGS_UPD)) {
            HttpSession session = ((HttpServletRequest)request).getSession();
            if(session.getAttribute(Constants.OPEN_ID) == null) {
                logger.debug("Mypage OpenId Not Found!!!");
                logger.debug(req.getRequestURI());
                // MypageでOpenIdがないばあいはリダイレクトする。
                res.sendRedirect(req.getContextPath() + LOGIN_URL);
                return;
            }
        }

        if (req.getContentType() != null &&
                req.getContentType().contains("application/json")) {
            // Request が application/json の場合、Content-Dispositionを追加
            res.setHeader("Content-Disposition","attachment;filename=\"" + lastPathSegment(req.getRequestURI()) + ".json\"");
        }

        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {
    }

    /***
     * Pathの最終セグメント
     * @param path
     * @return
     */
    private String lastPathSegment(String path) {
        String[] segments = path.split("/");
        if (segments.length >= 0 ) {
            return segments[segments.length-1];
        }
        return path;
    }
}
