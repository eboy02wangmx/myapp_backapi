package jp.co.myapp.api.app.request;

import java.io.Serializable;
import java.util.Date;

import jp.co.myapp.api.domain.validate.annotation.CustomizeNoNull;
import jp.co.myapp.api.domain.validate.annotation.CustomizeTypeSizeString;

public class ConfirmUpdateRequest implements Serializable {

	private static final long serialVersionUID = 3345320896514072990L;

	/**
	 * パスワード(password)
	 */
	private String password;

	/**
	 * 申込依頼No(entryNo)
	 */
	private String entryNo;

	/**
	 * 申込ステータス(entryStatus)
	 */
	private String entryStatus;
	
	/**
	 * ステータスFlag(updateFlag)
	 */
	private String updateFlag;
	
	/**
	 * 審査依頼前申込依頼№(oldEntryNo)
	 */
	private String oldEntryNo;

	/**
	 * 確認者(confirmedManagerName)
	 */
	@CustomizeNoNull(message = "E00002", params = "{'確認者';'ご入力'}")
	@CustomizeTypeSizeString(max = 30, message = "E00001", params = "{'確認者名';'30文字以内';'ご入力'}")
	private String confirmedManagerName;

	/**
	 * 楽天損保確認(confirmedMemo)
	 */
	@CustomizeNoNull(message = "E00002", params = "{'楽天損保確認';'ご入力'}")
	@CustomizeTypeSizeString(max = 1000, message = "E00001", params = "{'楽天損保確認';'1000文字以内';'ご入力'}")
	private String confirmedMemo;

	/**
	 * 更新日時(updateDateTime)
	 */
	private String updateTime;
	/**
	 * システム日時(sysDate)
	 */
	private Date sysDate;

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

	/**
	 * 申込依頼No(entryNo)の取得
	 * 
	 * @return entryNo
	 */
	public String getEntryNo() {
		return entryNo;
	}

	/**
	 * 申込依頼No(entryNo)の設定
	 * 
	 * @param entryNo
	 */
	public void setEntryNo(String entryNo) {
		this.entryNo = entryNo;
	}

	/**
	 * 申込ステータス(entryStatus)の取得
	 * 
	 * @return entryStatus
	 */
	public String getEntryStatus() {
		return entryStatus;
	}

	/**
	 * 申込ステータス(entryStatus)の設定
	 * 
	 * @param entryStatus
	 */
	public void setEntryStatus(String entryStatus) {
		this.entryStatus = entryStatus;
	}

	/**
	 * 確認者(confirmedManagerName)の取得
	 * 
	 * @return confirmedManagerName
	 */
	public String getConfirmedManagerName() {
		return confirmedManagerName;
	}

	/**
	 * 確認者(confirmedManagerName)の設定
	 * 
	 * @param confirmedManagerName
	 */
	public void setConfirmedManagerName(String confirmedManagerName) {
		this.confirmedManagerName = confirmedManagerName;
	}

	/**
	 * 楽天損保確認(confirmedMemo)の取得
	 * 
	 * @return confirmedMemo
	 */
	public String getConfirmedMemo() {
		return confirmedMemo;
	}

	/**
	 * 楽天損保確認(confirmedMemo)の設定
	 * 
	 * @param confirmedMemo
	 */
	public void setConfirmedMemo(String confirmedMemo) {
		this.confirmedMemo = confirmedMemo;
	}

	/**
	 * 更新日時(updateime)の取得
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

	/**
	 * システム日時(sysDate)の取得
	 * 
	 * @return sysDate
	 */
	public Date getSysDate() {
		return sysDate;
	}

	/**
	 * システム日時(sysDate)の設定
	 * 
	 * @param sysDate
	 */
	public void setSysDate(Date sysDate) {
		this.sysDate = sysDate;
	}
	
	/**
	 * 二次点検ステータスFlag(updateFlag)の取得
	 * 
	 * @return updateFlag
	 */
	public String getUpdateFlag() {
		return updateFlag;
	}

	/**
	 * 二次点検ステータスFlag(updateFlag)の設定
	 * 
	 * @param updateFlag
	 */
	public void setUpdateFlag(String updateFlag) {
		this.updateFlag = updateFlag;
	}
	
	/**
	 * 審査依頼前申込依頼№(oldEntryNo)の取得
	 * 
	 * @return oldEntryNo
	 */
	public String getOldEntryNo() {
		return oldEntryNo;
	}

	/**
	 * 審査依頼前申込依頼№(oldEntryNo)の設定
	 * 
	 * @param oldEntryNo
	 */
	public void setOldEntryNo(String oldEntryNo) {
		this.oldEntryNo = oldEntryNo;
	}

}
