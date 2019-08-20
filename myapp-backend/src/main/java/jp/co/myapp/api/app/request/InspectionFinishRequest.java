package jp.co.myapp.api.app.request;

import java.io.Serializable;
import java.util.List;

import javax.validation.Valid;

import jp.co.myapp.api.domain.validate.annotation.CustomizeNoNull;
import jp.co.myapp.api.domain.validate.annotation.CustomizeTypeSizeString;

public class InspectionFinishRequest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3865768618827277023L;

	/**
	 * 申込依頼NO(entryNo)
	 */
	private String entryNo;

	/**
	 * 担当者名(managerName)
	 */
	@CustomizeNoNull(message = "E00002", params = "{'担当者名';'ご入力'}")
	@CustomizeTypeSizeString(max = 30, message = "E00001", params = "{'担当者名';'30桁まで';'ご入力'}")
	private String managerName;

	/**
	 * メモ(memo)
	 */
	@CustomizeTypeSizeString(max = 1000, message = "E00001", params = "{'メモ';'1000桁まで';'ご入力して'}")
	private String memo;

	/**
	 * 更新日時(updateTime)
	 */
	private String updateTime;

	/**
	 * 点検画像リスト
	 */
	@Valid
	private List<InspectionImageRequest> inspectionImageList;

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

	/**
	 * 追加アップロードファイルリストの取得
	 * 
	 * @return inspectionImageList
	 */
	public List<InspectionImageRequest> getInspectionImageList() {
		return inspectionImageList;
	}

	/**
	 * 追加アップロードファイルリストの設定
	 * 
	 * @param inspectionImageList
	 */
	public void setInspectionImageList(List<InspectionImageRequest> inspectionImageList) {
		this.inspectionImageList = inspectionImageList;
	}

}
