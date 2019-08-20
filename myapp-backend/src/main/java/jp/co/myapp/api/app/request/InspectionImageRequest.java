package jp.co.myapp.api.app.request;

import java.io.Serializable;

import jp.co.myapp.api.domain.validate.annotation.CustomizeTypeSizeString;

public class InspectionImageRequest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4333231438992855965L;

	/**
	 * ファイルID(fileId)
	 */
	@CustomizeTypeSizeString(max = 32, message = "E00001", params = "{'ファイルID';'32桁まで';'ご入力'}")
	private String fileId;

	/**
	 * ファイルステータス(fileStatus)
	 */
	@CustomizeTypeSizeString(max = 1, message = "E00001", params = "{'ファイルステータス';'1桁まで';'ご入力'}")
	private String fileStatus;

	/**
	 * 更新日時(upd_date)
	 */
	private String updateTime;

	/**
	 * ファイルID(fileId)の取得
	 * 
	 * @return fileId
	 */
	public String getFileId() {
		return fileId;
	}

	/**
	 * ファイルID(fileId)の設定
	 * 
	 * @param fileId
	 */
	public void setFileId(String fileId) {
		this.fileId = fileId;
	}

	/**
	 * ファイルステータス(fileStatus)の取得
	 * 
	 * @return fileStatus
	 */
	public String getFileStatus() {
		return fileStatus;
	}

	/**
	 * ファイルステータス(fileStatus)の設定
	 * 
	 * @param fileStatus
	 */
	public void setFileStatus(String fileStatus) {
		this.fileStatus = fileStatus;
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

}
