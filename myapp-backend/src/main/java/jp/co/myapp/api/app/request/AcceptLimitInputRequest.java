package jp.co.myapp.api.app.request;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import jp.co.myapp.common.Constants;

public class AcceptLimitInputRequest implements Serializable {

	private static final long serialVersionUID = 2222222L;

	/**
	 * 申込依頼No.
	 */
	private String entryNo;

	/**
	 * 代理店コード
	 */
	private String agencyCd;

	/**
	 * 画面ID
	 */
	private String screenId;

	/**
	 * 制限規則の番号
	 */
	private String acceptLimitRules;

	/**
	 * 制限規則決定番号
	 */
	private String acceptLimitConfirmCode;

	/**
	 * 更新日時(newDate)
	 */
	@JsonFormat(pattern = Constants.DATE_FORMAT_YYYYMMDDHHMMSS, timezone = Constants.API_TIME_ZONE)
	private Date newDate;


	public String getEntryNo() {
		return entryNo;
	}

	public void setEntryNo(String entryNo) {
		this.entryNo = entryNo;
	}

	public String getAgencyCd() {
		return agencyCd;
	}

	public void setAgencyCd(String agencyCd) {
		this.agencyCd = agencyCd;
	}

	public String getScreenId() {
		return screenId;
	}

	public void setScreenId(String screenId) {
		this.screenId = screenId;
	}

	public String getAcceptLimitRules() {
		return acceptLimitRules;
	}

	public void setAcceptLimitRules(String acceptLimitRules) {
		this.acceptLimitRules = acceptLimitRules;
	}

	public String getAcceptLimitConfirmCode() {
		return acceptLimitConfirmCode;
	}

	public void setAcceptLimitConfirmCode(String acceptLimitConfirmCode) {
		this.acceptLimitConfirmCode = acceptLimitConfirmCode;
	}

	public Date getNewDate() {
		return newDate;
	}

	public void setNewDate(Date newDate) {
		this.newDate = newDate;
	}



}
