package jp.co.myapp.api.app.request;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import jp.co.myapp.common.Constants;

public class AcceptLimitSaveRequest implements Serializable {

	private static final long serialVersionUID = 2222222L;

	/**
	 * 申込依頼№
	 */
	private String entryNo;

	/**
	 * 制限コード
	 */
	private int seigenCd;

	/**
	 * 決定番号
	 */
	private int ketteiNo;

	/**
	 * 更新日時(newDate)
	 */
	@JsonFormat(pattern = Constants.DATE_FORMAT_YYYYMMDDHHMMSS, timezone = Constants.API_TIME_ZONE)
	private Date newDate;

	/**
	 * 画面ID
	 */
	private String screenId;

	/**
	 * entryNoを取得する
	 *
	 * @return entryNo
	 */
	public String getEntryNo() {
		return entryNo;
	}

	/**
	 * entryNoを設定する
	 *
	 * @param entryNo entryNo
	 */
	public void setEntryNo(String entryNo) {
		this.entryNo = entryNo;
	}

	/**
	 * seigenCdを取得する
	 *
	 * @return seigenCd
	 */
	public int getSeigenCd() {
		return seigenCd;
	}

	/**
	 * seigenCdを設定する
	 *
	 * @param seigenCd seigenCd
	 */
	public void setSeigenCd(int seigenCd) {
		this.seigenCd = seigenCd;
	}

	/**
	 * ketteiNoを取得する
	 *
	 * @return ketteiNo
	 */
	public int getKetteiNo() {
		return ketteiNo;
	}

	/**
	 * ketteiNoを設定する
	 *
	 * @param ketteiNo ketteiNo
	 */
	public void setKetteiNo(int ketteiNo) {
		this.ketteiNo = ketteiNo;
	}

	/**
	 * newDateを取得する
	 *
	 * @return newDate
	 */
	public Date getNewDate() {
		return newDate;
	}

	/**
	 * newDateを設定する
	 *
	 * @param newDate newDate
	 */
	public void setNewDate(Date newDate) {
		this.newDate = newDate;
	}

	/**
	 * screenIdを取得する
	 *
	 * @return screenId
	 */
	public String getScreenId() {
		return screenId;
	}

	/**
	 * screenIdを設定する
	 *
	 * @param screenId
	 */
	public void setScreenId(String screenId) {
		this.screenId = screenId;
	}
}
