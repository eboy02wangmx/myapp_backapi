package jp.co.myapp.api.app.request;

import java.util.List;

import jp.co.myapp.api.domain.validate.annotation.CustomizeMailString;
import jp.co.myapp.api.domain.validate.annotation.CustomizeTypeSizeString;

public class UpdateExaminationFinishedRequest  {
	/**
	 * 見積連番
	 */
	@CustomizeTypeSizeString(max = 6, regexp = "^(\\s&&[^\\f\\n\\r\\t\\v])*|^[a-zA-Z0-9]+$", message = "E00001", params = "{'見積連番';'半角文字6桁まで';'ご入力して'}")
	private String entryNo;
	/**
	 * 連番
	 */
	
	private Long serial;
	/**
	 * 証券番号
	 */
	@CustomizeTypeSizeString(max = 11, regexp = "^(\\s&&[^\\f\\n\\r\\t\\v])*|^[a-zA-Z0-9]+$", message = "E00001", params = "{'証券番号';'半角文字11桁まで';'ご入力'}")
	private String policyNo;
	/**
	 * 口振質権ステータス
	 */
	private Integer accountTransferPledgeStatus;
	/**
	 * メールアドレス
	 */
	@CustomizeTypeSizeString(max=254, regexp="", message="E00001", params="{mail.label;mail.size;enter.event}")
    @CustomizeMailString(message="E00002", params="{mail.label;correct.enter.event}")
	private String mail;
	/**
	 * リスト
	 */
	private List<UpdateCorrectionInfoDetailRequest> list;

	/**
	 * 点検担当者名
	 */
	@CustomizeTypeSizeString(max = 10, params = "{'点検者名';'10桁以内';'入力して'}", message = "E00001")
	private String inspectionName;
	
	/**
	 * 更新日時(updateTime)
	 */
	@CustomizeTypeSizeString(max = 21, regexp = "", message = "E00001", params = "{updateTime.label;max.21;enter.event}")
	private String updateTime;

	/**
	 * 点検対象
	 */
	private String inspectionObject;
	
	public String getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}
	/**
	 * 見積連番を取得する。
	 * @return entryNo
	 */
	public String getEntryNo() {
	    return entryNo;
	}
	/**
	 * 見積連番を設定する。
	 * @param entryNo String
	 */
	public void setEntryNo(String entryNo) {
	    this.entryNo = entryNo;
	}
	/**
	 * 連番を取得する。
	 * @return serial
	 */
	public Long getSerial() {
	    return serial;
	}
	/**
	 * 連番を設定する。
	 * @param serialLong
	 */
	public void setSerial(Long serial) {
	    this.serial = serial;
	}
	/**
	 * 証券番号を取得する。
	 * @return policyNo
	 */
	public String getPolicyNo() {
	    return policyNo;
	}
	/**
	 * 証券番号を設定する。
	 * @param policyNoString
	 */
	public void setPolicyNo(String policyNo) {
	    this.policyNo = policyNo;
	}
	/**
	 * 口振質権ステータスを取得する。
	 * @return accountTransferPledgeStatus
	 */
	public Integer getAccountTransferPledgeStatus() {
	    return accountTransferPledgeStatus;
	}
	/**
	 * 口振質権ステータスを設定する。
	 * @param accountTransferPledgeStatusInteger
	 */
	public void setAccountTransferPledgeStatus(Integer accountTransferPledgeStatus) {
	    this.accountTransferPledgeStatus = accountTransferPledgeStatus;
	}
	/**
	 * メールアドレスを取得する。
	 * @return mail
	 */
	public String getMail() {
	    return mail;
	}
	/**
	 * メールアドレスを設定する。
	 * @param mailString
	 */
	public void setMail(String mail) {
	    this.mail = mail;
	}
	/**
	 * リストを取得する。
	 * @return list
	 */
	public List<UpdateCorrectionInfoDetailRequest> getList() {
	    return list;
	}
	/**
	 * リストを設定する。
	 * @param listList
	 */
	public void setList(List<UpdateCorrectionInfoDetailRequest> list) {
	    this.list = list;
	}

	/**
	 * 点検担当者名の取得
	 * 
	 * @return inspectionName
	 */
	public String getInspectionName() {
		return inspectionName;
	}

	/**
	 * 点検担当者名の設定
	 * 
	 * @param inspectionName
	 */
	public void setInspectionName(String inspectionName) {
		this.inspectionName = inspectionName;
	}

	/**
	 * 点検対象の取得
	 * 
	 * @return inspectionName
	 */
	public String getInspectionObject() {
		return inspectionObject;
	}

	/**
	 * 点検対象の設定
	 * 
	 * @param inspectionName
	 */
	public void setInspectionObject(String inspectionObject) {
		this.inspectionObject = inspectionObject;
	}

}
