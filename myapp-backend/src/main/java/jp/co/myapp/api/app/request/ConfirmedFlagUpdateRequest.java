package jp.co.myapp.api.app.request;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import jp.co.myapp.common.Constants;

/**
 * 変更依頼確認済フラグ更新Request
 * 
 * @author pactera japan
 *
 */
public class ConfirmedFlagUpdateRequest implements Serializable {

	/**
	 * シリアルバージョンUID
	 */
	private static final long serialVersionUID = -4126684042984505508L;

	/** 変更受付番号 */
	private String[] changeReceptionNo;

	/** システム日時 */
	@JsonFormat(pattern = Constants.DATE_FORMAT_YYYYMMDD_HH_MM_SS_SSS, timezone = Constants.API_TIME_ZONE)
	private Date newDate;

	/**
	 * 変更受付番号を取得します。
	 * 
	 * @return shohinKbn
	 */
	public String[] getChangeReceptionNo() {
		return changeReceptionNo;
	}

	/**
	 * 変更受付番号を設定します。
	 * 
	 * @param shohinKbn
	 *            変更受付番号
	 */
	public void setChangeReceptionNo(String[] changeReceptionNo) {
		this.changeReceptionNo = changeReceptionNo;
	}

	/**
	 * システム日時。
	 * 
	 * @return newDate
	 */
	public Date getNewDate() {
		return newDate;
	}

	/**
	 * システム日時。
	 * 
	 * @param newDate
	 *            システム日時
	 */
	public void setNewDate(Date newDate) {
		this.newDate = newDate;
	}

}
