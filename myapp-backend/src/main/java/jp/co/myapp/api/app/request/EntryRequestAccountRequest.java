package jp.co.myapp.api.app.request;

import java.io.Serializable;
import java.util.Date;

public class EntryRequestAccountRequest implements Serializable {

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
	 * システム日時
	 */
	private Date sysDate;

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

}
