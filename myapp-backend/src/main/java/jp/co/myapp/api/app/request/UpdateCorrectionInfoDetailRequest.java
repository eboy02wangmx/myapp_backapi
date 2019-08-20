package jp.co.myapp.api.app.request;

import java.io.Serializable;

public class UpdateCorrectionInfoDetailRequest implements Serializable {

	private static final long serialVersionUID = 3345320896514072990L;	
	
	/**
	 * ファイルID(file_ID)
	 */
	private String fileId;
	
	/**
	 * ファイル種類(file_type)
	 */
	private String fileType;
	
	/**
	 * ファイルステータス(file_status)
	 */
	private String fileStatus;
	
	/**
	 * 更新日時(updateTime)
	 */
	private String updateTime;
	
	/**
	 * ファイルID(file_ID)の取得
	 * 
	 * @return fileID
	 */
	public String getFileId() {
		return fileId;
	}

	/**
	 * ファイルID(file_ID)の設定
	 * 
	 * @param fileID
	 *            String
	 */
	public void setFileId(String fileId) {
		this.fileId = fileId;
	}

	/**
	 * ファイル種類(file_type)の取得
	 * 
	 * @return fileType
	 */
	public String getFileType() {
		return fileType;
	}

	/**
	 * ファイル種類(file_type)の設定
	 * 
	 * @param fileType
	 *            String
	 */
	public void setFileType(String fileType) {
		this.fileType = fileType;
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
