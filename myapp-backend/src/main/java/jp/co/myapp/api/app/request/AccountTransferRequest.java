package jp.co.myapp.api.app.request;

import java.io.Serializable;

import jp.co.myapp.api.domain.validate.annotation.CustomizeTypeSizeString;

public class AccountTransferRequest implements Serializable {

	private static final long serialVersionUID = 2222222L;

	/**
	 * 申込ステータス
	 */
	@CustomizeTypeSizeString(max = 1, regexp = "[0-8]", message = "E00001", params = "{entryStatus.label;max.1;enter.event}")
	private String entryStatus;

	@CustomizeTypeSizeString(max = 8, regexp = "", message = "E00001", params = "{requestDate.label;max.8;enter.event}")
	private String requestDate;

	/**
	 * 口座振替連携日時
	 */
	@CustomizeTypeSizeString(max = 14, regexp = "", message = "E00001", params = "{accountSendDate.label;max.14;enter.event}")
	private String accountSendDate;

	/**
	 * 削除フラグ
	 */
	@CustomizeTypeSizeString(max = 1, regexp = "", message = "E00001", params = "{deleteFlag.label;max.1;enter.event}")
	private String deleteFlag;

	/**
	 * 商品区分(goodsType)
	 */
	private String goodsType;

	/**
	 * 申込依頼№
	 */
	@CustomizeTypeSizeString(max = 6, regexp = "", message = "E00001", params = "{entryNo.label;max.6;enter.event}")
	private String entryNo;
	/**
	 * 証券番号
	 */
	@CustomizeTypeSizeString(max = 11, regexp = "", message = "E00001", params = "{policy.label;max.11;enter.event}")
	private String policyNo;
	/**
	 * 楽天OpenID
	 */
	@CustomizeTypeSizeString(max = 6, regexp = "", message = "E00001", params = "{openId.label;max.6;enter.event}")
	private String openId;

	/**
	 * 支払区分
	 */
	@CustomizeTypeSizeString(max = 1, regexp = "[2,3]", message = "E00001", params = "{paymentType.label;max.1;enter.event}")
	private String paymentType;
	
	/**
	 * パスワード(password)
	 */
	private String password;

	/**
	 * @return the entryStatus
	 */
	public String getEntryStatus() {
		return entryStatus;
	}

	/**
	 * @param entryStatus
	 *            the entryStatus to set
	 */
	public void setEntryStatus(String entryStatus) {
		this.entryStatus = entryStatus;
	}

	/**
	 * 依頼日
	 * 
	 * @return the requestDate
	 */
	public String getRequestDate() {
		return requestDate;
	}

	/**
	 * 依頼日
	 * 
	 * @param requestDate
	 *            the requestDate to set
	 */
	public void setRequestDate(String requestDate) {
		this.requestDate = requestDate;
	}

	/**
	 * @return the accountSendDate
	 */
	public String getAccountSendDate() {
		return accountSendDate;
	}

	/**
	 * @param accountSendDate
	 *            the accountSendDate to set
	 */
	public void setAccountSendDate(String accountSendDate) {
		this.accountSendDate = accountSendDate;
	}

	/**
	 * @return the deleteFlag
	 */
	public String getDeleteFlag() {
		return deleteFlag;
	}

	/**
	 * @param deleteFlag
	 *            the deleteFlag to set
	 */
	public void setDeleteFlag(String deleteFlag) {
		this.deleteFlag = deleteFlag;
	}

	/**
	 * @return the goodsType
	 */
	public String getGoodsType() {
		return goodsType;
	}

	/**
	 * @param goodsType
	 *            the goodsType to set
	 */
	public void setGoodsType(String goodsType) {
		this.goodsType = goodsType;
	}

	/**
	 * @return the entryNo
	 */
	public String getEntryNo() {
		return entryNo;
	}

	/**
	 * @param entryNo
	 *            the entryNo to set
	 */
	public void setEntryNo(String entryNo) {
		this.entryNo = entryNo;
	}

	/**
	 * @return the policyNo
	 */
	public String getPolicyNo() {
		return policyNo;
	}

	/**
	 * @param policyNo
	 *            the policyNo to set
	 */
	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}

	/**
	 * @return the openId
	 */
	public String getOpenId() {
		return openId;
	}

	/**
	 * @param openId
	 *            the openId to set
	 */
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	/**
	 * @return the paymentType
	 */
	public String getPaymentType() {
		return paymentType;
	}

	/**
	 * @param paymentType
	 *            the paymentType to set
	 */
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	
	/**
	 * パスワード(password)の取得
	 * 
	 * @return password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * パスワード(password)の設定
	 * 
	 * @param password
	 */
	public void setPassword(String password) {
		this.password = password;
	}
}
