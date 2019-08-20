package jp.co.myapp.api.app.request;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import jp.co.myapp.common.Constants;

public class EditDataOptionRequest implements Serializable {

	private static final long serialVersionUID = 2222222L;

	/**
	 * 申込依頼No.
	 */
	private String entryNo;

	/**
	 * 証券番号
	 */
	private String policy;

	/**
	 * 訂正項目選択
	 */
	private String edititem;

	/**
	 * 更新日時(newDate)
	 */
	@JsonFormat(pattern = Constants.DATE_FORMAT_YYYYMMDDHHMMSS, timezone = Constants.API_TIME_ZONE)
	private Date newDate;
	
	/**
	 * 連番
	 */
	private int serial;

	/**
	 * 更新日時(updateTime)
	 */
	private String updateTime;

	public String getEntryNo() {
		return entryNo;
	}

	public void setEntryNo(String entryNo) {
		this.entryNo = entryNo;
	}

	public String getPolicy() {
		return policy;
	}

	public void setPolicy(String policy) {
		this.policy = policy;
	}

	public String getEdititem() {
		return edititem;
	}

	public void setEdititem(String edititem) {
		this.edititem = edititem;
	}

	public Date getNewDate() {
		return newDate;
	}

	public void setNewDate(Date newDate) {
		this.newDate = newDate;
	}

	public int getSerial() {
		return serial;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

	/**
	 * 更新日時の取得
	 * 
	 * @return updateTime
	 */
	public String getUpdateTime() {
		return updateTime;
	}

	/**
	 * 更新日時の設定
	 * 
	 * @param updateTime
	 */
	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}
}
