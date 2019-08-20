package jp.co.myapp.api.app.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import jp.co.myapp.common.Constants;
import jp.co.myapp.common.util.SendMailUtil;

public abstract class AbstractEntrySaveController extends AbstractApiController {

	/**
	 * 入力チェックAPI
	 */
	@Autowired
	protected InputCheckController inputCheckController;

	/**
	 * Mail連携用コンポーネント
	 */
	@Autowired
	protected SendMailUtil sendMailUtil;

	/**
	 * 送信者メールアドレス(楽天損保)
	 */
	@Value("#{system.send_mail_from}")
	protected String sendMailFrom;

	/**
	 * メールタイトル
	 */
	protected static String MAIL_TITLE = "【楽天損保】お見積結果の一時保存";

	/**
	 * メールTemplate
	 */
	protected static String MAIL_TEMPLATE = "entry-save-register-complete.ftl";


	//メンテナンス管理画面更新 2018/11/26 ADD END
		/**
	 * セッションにある申込区分を取得
	 * @param request
	 * @return
	 */
	protected String getEntryTypeFromSession(HttpServletRequest request) {
		HttpSession session = request.getSession(false);
		if (session != null) {
			return (String) session.getAttribute(Constants.OPERATION_ENTRY_TYPE);
		} else {
			return null;
		}
	}
}
