package jp.co.myapp.api.app.request;

import java.io.Serializable;

import jp.co.myapp.api.domain.validate.annotation.CustomizeTypeSizeString;

public class MailConfirmInputRequest implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 2119186133106524497L;

	/**
	 * 申込依頼№
	 */
	@CustomizeTypeSizeString(max=6, regexp="", message="E00001", params="{entryNo.label;entryNo.type;input.event}")
	private String entryNo;

	/**
	 * 申込依頼№(url)
	 */
	private String urlEntryNo;

	/**
	 * メールアドレス
	 */
	@CustomizeTypeSizeString(max=254, regexp="", message="E00001", params="{contractorMail.label;max.254;input.event}")
	private String mail;

	/**
	 * 代理店コード
	 */
	private String urlAgentCode;

	/**
	 * パターン
	 */
	private String partern;



	/**
	 * 申込依頼№(entryNo)の取得
	 *
	 * @return entryNo
	 */
	public String getEntryNo() {
		return entryNo;
	}

	/**
	 * 申込依頼№(entryNo)の設定
	 *
	 * @param entryNo
	 */
	public void setEntryNo(String entryNo) {
		this.entryNo = entryNo;
	}

	/**
	 * メールアドレス(mail)の取得
	 *
	 * @return entryNo
	 */
	public String getMail() {
		return mail;
	}

	/**
	 * メールアドレス(mail)の設定
	 *
	 * @param entryNo
	 */
	public void setMail(String mail) {
		this.mail = mail;
	}

	/**
	 * url申込依頼№(urlEntryNo)の取得
	 *
	 * @return entryNo
	 */
	public String getUrlEntryNo() {
		return urlEntryNo;
	}

	/**
	 * url申込依頼№(entryNo)の設定
	 *
	 * @param entryNo
	 */
	public void setUrlEntryNo(String urlEntryNo) {
		this.urlEntryNo = urlEntryNo;
	}

	/**
	 * url代理店コード(urlAgentCode)の取得
	 *
	 * @return entryNo
	 */
	public String getUrlAgentCode() {
		return urlAgentCode;
	}

	/**
	 * url申込依頼№(urlAgentCode)の設定
	 *
	 * @param UrlAgentCode
	 */
	public void setUrlAgentCode(String urlAgentCode) {
		this.urlAgentCode = urlAgentCode;
	}

	/**
	 * パターン(partern)の取得
	 *
	 * @return partern
	 */
	public String getPartern() {
		return partern;
	}

	/**
	 * パターン(urlAgentCode)の設定
	 *
	 * @param entryNo
	 */
	public void setPartern(String partern) {
		this.partern = partern;
	}

}
