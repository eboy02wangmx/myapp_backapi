package jp.co.myapp.api.app.request;

import java.io.Serializable;
import java.util.List;

import jp.co.myapp.api.domain.validate.annotation.CustomizeNoNull;
import jp.co.myapp.api.domain.validate.annotation.CustomizeTypeSizeString;

public class ReUpRequestRequest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4878686130428852425L;

	/**
	 * 申込依頼No(entryNo)
	 */
	private String entryNo;

	/**
	 * 担当者名(managerName)
	 */
	@CustomizeNoNull(message = "E00002", params = "{'担当者名';'ご入力'}")
	@CustomizeTypeSizeString(max = 30, message = "E00001", params = "{'担当者名';'30文字以内';'ご入力'}")
	private String managerName;

	/**
	 * メモ(memo)
	 */
	@CustomizeTypeSizeString(max = 1000, message = "E00001", params = "{'メモ';'1000文字以内';'ご入力'}")
	private String memo;
	
	/**
	 * 再アップ依頼理由(reuploadReason)
	 */
	@CustomizeNoNull(message = "E00002", params = "{'再アップ依頼理由';'ご入力'}")
	@CustomizeTypeSizeString(max = 1000, message = "E00001", params = "{'再アップ依頼理由';'1000文字以内';'ご入力'}")
	private String reuploadReason;

	/**
	 * 更新日時(updateDateTime)
	 */
	private String updateTime;

	/**
	 * 点検画像リスト(inspectionImageList)
	 */
	private List<InspectionImageRequest> inspectionImageList;

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
	 * 担当者名(managerName)の取得
	 * 
	 * @return managerName
	 */
	public String getManagerName() {
		return managerName;
	}

	/**
	 * 担当者名(managerName)の設定
	 * 
	 * @param managerName
	 */
	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}

	/**
	 * メモ(memo)の取得
	 * 
	 * @return memo
	 */
	public String getMemo() {
		return memo;
	}

	/**
	 * メモ(memo)の設定
	 * 
	 * @param memo
	 */
	public void setMemo(String memo) {
		this.memo = memo;
	}

	/**
	 * 再アップ依頼理由(reuploadReason)の取得
	 * 
	 * @return reuploadReason
	 */
	public String getReuploadReason() {
		return reuploadReason;
	}

	/**
	 * 再アップ依頼理由(reuploadReason)の設定
	 * 
	 * @param reuploadReason
	 */
	public void setReuploadReason(String reuploadReason) {
		this.reuploadReason = reuploadReason;
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
	 * 点検画像リストの取得
	 * 
	 * @return inspectionImageList
	 */
	public List<InspectionImageRequest> getInspectionImageList() {
		return inspectionImageList;
	}

	/**
	 * 点検画像リストの設定
	 * 
	 * @param inspectionImageList
	 */
	public void setInspectionImageList(List<InspectionImageRequest> inspectionImageList) {
		this.inspectionImageList = inspectionImageList;
	}

}
