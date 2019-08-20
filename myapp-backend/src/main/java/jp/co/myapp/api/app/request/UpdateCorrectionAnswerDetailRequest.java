package jp.co.myapp.api.app.request;

import java.io.Serializable;

public class UpdateCorrectionAnswerDetailRequest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8732402384156100071L;

	/**
	 * ファイルID(file_ID)
	 */
	private String fileId;

	/**
	 * ファイルステータス(file_status)
	 */
	private String fileStatus;

	/**
	 * 更新日時(upd_date)
	 */
	private String updateTime;

	/**
	 * ファイルID(file_ID)の取得
	 * 
	 * @return fileId
	 */
	public String getFileId() {
		return fileId;
	}

	/**
	 * ファイルID(file_ID)の設定
	 * 
	 * @param fileId
	 *            String
	 */
	public void setFileId(String fileId) {
		this.fileId = fileId;
	}

	/**
	 * ファイルステータス(file_status)の取得
	 * 
	 * @return fileStatus
	 */
	public String getFileStatus() {
		return fileStatus;
	}

	/**
	 * ファイルステータス(file_status)の設定
	 * 
	 * @param fileStatus
	 *            String
	 */
	public void setFileStatus(String fileStatus) {
		this.fileStatus = fileStatus;
	}

	/**
	 * 更新日時(upd_date)の取得
	 * 
	 * @return updateTime
	 */
	public String getUpdateTime() {
		return updateTime;
	}

	/**
	 * 更新日時(upd_date)の設定
	 * 
	 * @param updateTime
	 *            Date
	 */
	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}

}
