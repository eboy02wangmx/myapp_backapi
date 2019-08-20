package jp.co.myapp.welcome;

import java.io.UnsupportedEncodingException;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Base64;
import java.util.Locale;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jp.co.myapp.common.Constants;
import jp.co.myapp.common.ConstantsEnum;
import jp.co.myapp.common.util.CryptUtil;

/**
 * NHA_O_0027 楽天ログイン遷移
 */
@Controller
public class AwayController {

	private static final Logger logger = LoggerFactory.getLogger(AwayController.class);

	/**
	 * Dispatch / to index.html.
	 */
	@RequestMapping(value = {"/away/{entryNo}/{screenId}","/away/{entryNo}/{screenId}/{action}"}, method = { RequestMethod.GET })
	public String home(HttpServletRequest request, HttpServletResponse response, Locale locale,
			@PathVariable(required = true) String entryNo,
			@PathVariable(required = false) String screenId,
			@PathVariable(required = false) String action
			) throws Exception {

		logger.info(ConstantsEnum.API_ID.NHA_O_0027.getId() + " 処理開始");

		HttpSession session = request.getSession();
		session.setAttribute(Constants.REF_ENTRY_NO, entryNo);
		session.setAttribute(Constants.REF_SCREEN_ID, screenId);
		session.setAttribute(Constants.REF_ACTION, action);
		session.removeAttribute(Constants.MYTOKEN);

		String key = encId();
		String returnUrl =  "/homeassist/next/" + key;
		logger.debug("returnUrl:::" + returnUrl);

		logger.info(ConstantsEnum.API_ID.NHA_O_0027.getId() + " 処理終了");

		return "redirect:/../mypage/auth/login?returnUrl=" + returnUrl;
	}

    /**
     * nextController参照Key
     * Token + 有効期限
     * @param params
     * @param entity
     * @return
     * @throws UnsupportedEncodingException
     */
    private String encId() throws UnsupportedEncodingException {

		UUID token = UUID.randomUUID();

        StringBuffer buf = new StringBuffer();
        buf.append(token);
        LocalDateTime due = LocalDateTime.now();
        due = due.plusDays(1);
        Instant instant = due.toInstant(ZoneOffset.UTC);

        buf.append(",");
        buf.append(instant.getEpochSecond());
        String base = Base64.getUrlEncoder().encodeToString(CryptUtil.encrypt(Constants.REF_SEC_KEY, buf.toString()).getBytes());
        return base;

    }

}
