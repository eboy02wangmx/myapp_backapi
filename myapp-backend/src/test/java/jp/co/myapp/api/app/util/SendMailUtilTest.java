package jp.co.myapp.api.app.util;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.ContextHierarchy;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import jp.co.myapp.common.util.SendMailUtil;

/**
 * メールテンプレート送信テストクラス
 *
 * @author temp
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextHierarchy({ @ContextConfiguration({ "classpath:META-INF/spring/applicationContext-test.xml" }),
@ContextConfiguration("classpath:META-INF/spring/spring-mvc-test.xml") })
@WebAppConfiguration()
public class SendMailUtilTest {

	@Inject
	private SendMailUtil mail;

	/**
	 * メールアドレス変更手続きのお願い
	 */
	@Test
	public void test01() {
		String  mailFrom     = "sample_user@example.com";
		String  mailTo       = "sample_user@example.com";
		String  subject      = "【楽天損保】メールアドレス変更手続きのお願い";
		String  templateFile = "chg-mailaddress-notification.ftl";
		Model01 model        = new Model01();
		model.setUrl("http://www.myapp.co.jp/mypage/readyMail?key=");
		model.setPolicyNo("T0001");
		model.setInsuranceType("ホームアシスト");

		mail.sendMail(mailFrom,mailTo,subject,templateFile,model);
	}

	/**
	 * @author temp
	 *
	 */
	public static class Model01{
		/** URL */
		String url;
		/** 証券番号 */
		String policyNo;
		/** 保険の種類 */
		String insuranceType;

		public String getUrl() {
			return url;
		}

		public void setUrl(String url) {
			this.url = url;
		}

		public String getPolicyNo() {
			return policyNo;
		}

		public void setPolicyNo(String policyNo) {
			this.policyNo = policyNo;
		}

		public String getInsuranceType() {
			return insuranceType;
		}

		public void setInsuranceType(String insuranceType) {
			this.insuranceType = insuranceType;
		}
	}


	/**
	 * メールアドレス変更手続き完了のお知らせ
	 */
	@Test
	public void test02() {
		String  mailFrom     = "sample_user@example.com";
		String  mailTo       = "sample_user@example.com";
		String  subject      = "【楽天損保】メールアドレス変更手続き完了のお知らせ";
		String  templateFile = "chg-mailaddress-complete.ftl";
		Model02 model        = new Model02();
		model.setEntryNo("192");
		model.setPolicyNo("T0001");
		model.setInsuranceType("ホームアシスト");

		mail.sendMail(mailFrom,mailTo,subject,templateFile,model);
	}

	public static class Model02{
		/** 受付番号 */
		String entryNo;
		/** 証券番号 */
		String policyNo;
		/** 保険の種類 */
		String insuranceType;

		public String getEntryNo() {
			return entryNo;
		}

		public void setEntryNo(String entryNo) {
			this.entryNo = entryNo;
		}

		public String getPolicyNo() {
			return policyNo;
		}

		public void setPolicyNo(String policyNo) {
			this.policyNo = policyNo;
		}

		public String getInsuranceType() {
			return insuranceType;
		}

		public void setInsuranceType(String insuranceType) {
			this.insuranceType = insuranceType;
		}
	}

	/**
	 * 【楽天損保】ご契約の変更受付完了のお知らせ
	 */
	@Test
	public void test03() {
		String  mailFrom     = "sample_user@example.com";
		String  mailTo       = "sample_user@example.com";
		String  subject      = "【楽天損保】ご契約の変更受付完了のお知らせ";
		String  templateFile = "chg-request-ha.ftl";
		Model03 model        = new Model03();
		model.setAcceptanceNo("192");
		model.setReason("「契約者情報の変更」「建物情報の変更」");
		model.setPolicy("T0001");
		model.setHokenType("ホームアシスト");
		model.setHenkoKibou("2018年12月31日");
		model.setTelHour("「午前中」「12:00～14:00」");
		model.setTel("6666");

		mail.sendMail(mailFrom,mailTo,subject,templateFile,model);
	}

	/**
	 * 【楽天損保】クレジットカード変更手続き完了のお知らせ
	 */
	@Test
	public void test04() {
		String  mailFrom     = "sample_user@example.com";
		String  mailTo       = "sample_user@example.com";
		String  subject      = "【楽天損保】クレジットカード変更手続き完了のお知らせ";
		String  templateFile = "chg-creditcard.ftl";
		Model03 model        = new Model03();
		model.setAcceptanceNo("192");
		model.setPolicy("T0001");
		model.setHokenType("ホームアシスト");

		mail.sendMail(mailFrom,mailTo,subject,templateFile,model);
	}

	public static class Model03{
		/** 受付番号 */
		String acceptanceNo;
		/** 受付内容 */
		String reason;
    	/** 対象契約証券番号 */
    	String policy;
    	/** 保険の種類 */
    	String hokenType;
    	/** 変更希望日 */
    	String henkoKibou;
    	/** ご連絡時間帯 */
    	String telHour;
    	/** ご連絡先電話番号 */
    	String tel;

    	/**
    	 * 受付番号
    	 * @return
    	 */
    	public String getAcceptanceNo() {
			return acceptanceNo;
		}

    	/**
    	 * 受付番号
    	 * @param policy
    	 */
		public void setAcceptanceNo(String acceptanceNo) {
			this.acceptanceNo = acceptanceNo;
		}

    	/**
    	 * 対象契約証券番号
    	 * @return
    	 */
    	public String getPolicy() {
			return policy;
		}

    	/**
    	 * 対象契約証券番号
    	 * @param policy
    	 */
		public void setPolicy(String policy) {
			this.policy = policy;
		}

    	/**
    	 * 保険の種類
    	 * @return
    	 */
    	public String getHokenType() {
			return hokenType;
		}

    	/**
    	 * 保険の種類
    	 * @param hokenType
    	 */
		public void setHokenType(String hokenType) {
			this.hokenType = hokenType;
		}

    	/**
    	 * 受付内容
    	 * @return
    	 */
    	public String getReason() {
			return reason;
		}

    	/**
    	 * 受付内容
    	 * @param reason
    	 */
		public void setReason(String reason) {
			this.reason = reason;
		}

    	/**
    	 * 変更希望日
    	 * @return
    	 */
    	public String getHenkoKibou() {
			return henkoKibou;
		}

    	/**
    	 * 変更希望日
    	 * @param henkoKibou
    	 */
		public void setHenkoKibou(String henkoKibou) {
			this.henkoKibou = henkoKibou;
		}

    	/**
    	 * ご連絡時間帯
    	 * @return
    	 */
    	public String getTelHour() {
			return telHour;
		}

    	/**
    	 * ご連絡時間帯
    	 * @param telHour
    	 */
		public void setTelHour(String telHour) {
			this.telHour = telHour;
		}

    	/**
    	 * ご連絡先電話番号
    	 * @return
    	 */
    	public String getTel() {
			return tel;
		}

    	/**
    	 * ご連絡先電話番号
    	 * @param telHour
    	 */
		public void setTel(String tel) {
			this.tel = tel;
		}
}

}
