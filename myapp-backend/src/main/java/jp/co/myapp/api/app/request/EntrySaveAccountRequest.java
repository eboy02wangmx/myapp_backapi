package jp.co.myapp.api.app.request;

import java.io.Serializable;

import jp.co.myapp.api.domain.validate.annotation.CustomizeTypeSizeString;

public class EntrySaveAccountRequest implements Serializable {

	private static final long serialVersionUID = -7263381817267214096L;

	/**
	 * 申込依頼№
	 */
	private String entryNo;

	/**
	 * 一時保存画面ID
	 */
	private String screenID;

	/**
	 * 銀行区分
	 */
	private Integer bankType;

	/**
	 * 金融機関コード
	 */
	@CustomizeTypeSizeString(max = 4, regexp = "", message = "E00001", params = "{financialInstitutionCode.label;max.4;enter.event}")
	private String financialInstitutionCode;

	/**
	 * 金融機関名
	 */
	private String ginkoNmKnj;

	/**
	 * 店番号
	 */
	@CustomizeTypeSizeString(max = 3, regexp = "", message = "E00001", params = "{shopNo.label;max.3;enter.event}")
	private String shopNo;

	/**
	 * 店名
	 */
	private String ginkoShitenNmKnj;

	/**
	 * 科目
	 */
	private Integer subject;

	/**
	 * 口座番号
	 */
	@CustomizeTypeSizeString(max = 7, regexp = "", message = "E00001", params = "{accountNo.label;max.7;enter.event}")
	private String accountNo;

	/**
	 * 口座名義人カナ
	 */
	@CustomizeTypeSizeString(max = 30, regexp = "", message = "E00001", params = "{accountHolderKana.label;max.30;enter.event}")
	private String accountHolderKana;

	/**
	 * 振替済通知
	 */
	private Integer transferredNotification;

	/**
	 * 記号
	 */
	@CustomizeTypeSizeString(max = 6, regexp = "", message = "E00001", params = "{sign.label;max.6;enter.event}")
	private String sign;

	/**
	 * 番号
	 */
	@CustomizeTypeSizeString(max = 8, regexp = "", message = "E00001", params = "{number.label;max.8;enter.event}")
	private String number;

	/**
	 * ゆうちょ口座名義人カナ
	 */
	@CustomizeTypeSizeString(max = 30, regexp = "", message = "E00001", params = "{accountHolderKanaYutyo.label;max.30;enter.event}")
	private String accountHolderKanaYutyo;

	/**
	 * ゆうちょ振替済通知
	 */
	private Integer transferredNotificationYutyo;

	/**
	 * 更新日時(updateTime)
	 */
	@CustomizeTypeSizeString(max = 21, regexp = "", message = "E00001", params = "{updateTime.label;max.21;enter.event}")
	private String updateTime;

	// 依頼書取付省略
	private Integer requestFormInstallationOmission;

	/**
	 * 口座振替依頼書印刷ボタンのflag
	 */
	private boolean printFlag;

	/**
	 * 口座名義人(漢字)
	 */
	@CustomizeTypeSizeString(max = 30, regexp = "", message = "E00001", params = "{accountHolderKanji.label;max.30;enter.event}")
	private String accountHolderKanji;

	/**
	 * 口座名義人(漢字)
	 */
	@CustomizeTypeSizeString(max = 30, regexp = "", message = "E00001", params = "{accountHolderKanjiYutyo.label;max.30;enter.event}")
	private String accountHolderKanjiYutyo;


	public String getAccountHolderKanji() {
		return accountHolderKanji;
	}

	public void setAccountHolderKanji(String accountHolderKanji) {
		this.accountHolderKanji = accountHolderKanji;
	}

	public String getAccountHolderKanjiYutyo() {
		return accountHolderKanjiYutyo;
	}

	public void setAccountHolderKanjiYutyo(String accountHolderKanjiYutyo) {
		this.accountHolderKanjiYutyo = accountHolderKanjiYutyo;
	}

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
	 * 一時保存画面ID(screenID)の取得
	 *
	 * @return screenID
	 */
	public String getScreenID() {
		return screenID;
	}

	/**
	 * 一時保存画面ID(screenID)の設定
	 *
	 * @param screenID
	 */
	public void setScreenID(String screenID) {
		this.screenID = screenID;
	}

	/**
	 * 銀行区分(bankType)の取得
	 *
	 * @return bankType
	 */
	public Integer getBankType() {
		return bankType;
	}

	/**
	 * 銀行区分(bankType)の設定
	 *
	 * @param bankType
	 */
	public void setBankType(Integer bankType) {
		this.bankType = bankType;
	}

	/**
	 * 金融機関コード(financialInstitutionCode)の取得
	 *
	 * @return financialInstitutionCode
	 */
	public String getFinancialInstitutionCode() {
		return financialInstitutionCode;
	}

	/**
	 * 金融機関コード(financialInstitutionCode)の設定
	 *
	 * @param financialInstitutionCode
	 */
	public void setFinancialInstitutionCode(String financialInstitutionCode) {
		this.financialInstitutionCode = financialInstitutionCode;
	}

	/**
	 * 店番号(shopNo)の取得
	 *
	 * @return shopNo
	 */
	public String getShopNo() {
		return shopNo;
	}

	/**
	 * 店番号(shopNo)の設定
	 *
	 * @param shopNo
	 */
	public void setShopNo(String shopNo) {
		this.shopNo = shopNo;
	}

	/**
	 * 科目(subject)の取得
	 *
	 * @return subject
	 */
	public Integer getSubject() {
		return subject;
	}

	/**
	 * 科目(subject)の設定
	 *
	 * @param subject
	 */
	public void setSubject(Integer subject) {
		this.subject = subject;
	}

	/**
	 * 口座番号(accountNo)の取得
	 *
	 * @return accountNo
	 */
	public String getAccountNo() {
		return accountNo;
	}

	/**
	 * 口座番号(accountNo)の設定
	 *
	 * @param accountNo
	 */
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	/**
	 * 口座名義人カナ(accountHolderKana)の取得
	 *
	 * @return accountHolderKana
	 */
	public String getAccountHolderKana() {
		return accountHolderKana;
	}

	/**
	 * 口座名義人カナ(accountHolderKana)の設定
	 *
	 * @param accountHolderKana
	 */
	public void setAccountHolderKana(String accountHolderKana) {
		this.accountHolderKana = accountHolderKana;
	}

	/**
	 * 振替済通知(transferredNotification)の取得
	 *
	 * @return transferredNotification
	 */
	public Integer getTransferredNotification() {
		return transferredNotification;
	}

	/**
	 * 振替済通知(transferredNotification)の設定
	 *
	 * @param transferredNotification
	 */
	public void setTransferredNotification(Integer transferredNotification) {
		this.transferredNotification = transferredNotification;
	}

	/**
	 * 記号(sign)の取得
	 *
	 * @return sign
	 */
	public String getSign() {
		if ((this.sign!=null) && (this.sign.length()>1)) {
			return this.sign.substring(1);
		}
		return sign;
	}

	/**
	 * 記号(sign)の設定
	 *
	 * @param sign
	 */
	public void setSign(String sign) {
		this.sign = sign;
	}

	/**
	 * 番号(number)の取得
	 *
	 * @return number
	 */
	public String getNumber() {
		return number;
	}

	/**
	 * 番号(number)の設定
	 *
	 * @param number
	 */
	public void setNumber(String number) {
		this.number = number;
	}

	/**
	 * ゆうちょ口座名義人カナ(accountHolderKanaYutyo)の取得
	 *
	 * @return accountHolderKanaYutyo
	 */
	public String getAccountHolderKanaYutyo() {
		return accountHolderKanaYutyo;
	}

	/**
	 * ゆうちょ口座名義人カナ(accountHolderKanaYutyo)の設定
	 *
	 * @param accountHolderKanaYutyo
	 */
	public void setAccountHolderKanaYutyo(String accountHolderKanaYutyo) {
		this.accountHolderKanaYutyo = accountHolderKanaYutyo;
	}

	/**
	 * ゆうちょ振替済通知(transferredNotificationYutyo)の取得
	 *
	 * @return transferredNotificationYutyo
	 */
	public Integer getTransferredNotificationYutyo() {
		return transferredNotificationYutyo;
	}

	/**
	 * ゆうちょ振替済通知(transferredNotificationYutyo)の設定
	 *
	 * @param transferredNotificationYutyo
	 */
	public void setTransferredNotificationYutyo(Integer transferredNotificationYutyo) {
		this.transferredNotificationYutyo = transferredNotificationYutyo;
	}

	/**
	 * 更新日時(updateTime)の取得
	 *
	 * @return updateTime
	 */
	public String getUpdateTime() {
		return updateTime;
	}

	/**
	 * 更新日時(updateTime)の設定
	 *
	 * @param updateTime
	 */
	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}

	public Integer getRequestFormInstallationOmission() {
		return requestFormInstallationOmission;
	}

	public void setRequestFormInstallationOmission(Integer requestFormInstallationOmission) {
		this.requestFormInstallationOmission = requestFormInstallationOmission;
	}

	/**
	 * 口座振替依頼書印刷ボタンのflag(printFlag)の取得
	 *
	 * @return printFlag
	 */
	public boolean getPrintFlag() {
		return printFlag;
	}

	/**
	 * 口座振替依頼書印刷ボタンのflag(printFlag)の設定
	 *
	 * @param printFlag
	 */
	public void setPrintFlag(boolean printFlag) {
		this.printFlag = printFlag;
	}

	public String getGinkoNmKnj() {
		return ginkoNmKnj;
	}

	public void setGinkoNmKnj(String ginkoNmKnj) {
		this.ginkoNmKnj = ginkoNmKnj;
	}

	public String getGinkoShitenNmKnj() {
		return ginkoShitenNmKnj;
	}

	public void setGinkoShitenNmKnj(String ginkoShitenNmKnj) {
		this.ginkoShitenNmKnj = ginkoShitenNmKnj;
	}

}
