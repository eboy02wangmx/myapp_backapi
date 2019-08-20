package jp.co.myapp.api.app.request;

import java.io.Serializable;
import java.util.List;

import jp.co.myapp.api.domain.validate.annotation.CustomizeTypeSizeString;

public class UpdateCorrectionInfoRequest implements Serializable {

	private static final long serialVersionUID = 3345320896514072990L;
	
	/**
	 * リスト
	 */
	private List<UpdateCorrectionInfoDetailRequest> list;
	
	/**
	 * 回答期限日
	 */
	private String responseDueDate;
	
	/**
	 * 点検担当者名
	 */
	@CustomizeTypeSizeString(max = 30, message = "E00001", params = "{'点検者';'30桁まで';'ご入力'}")
	private String inspectionName;
	
	/**
	 * 更新日時(updDate)
	 */
	private String updDate;
	
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
	 * 回答期限日を取得する。
	 * @return responseDueDate
	 */
	public String getResponseDueDate() {
	    return responseDueDate;
	}
	
	/**
	 * 回答期限日を設定する。
	 * @param responseDueDateString
	 */
	public void setResponseDueDate(String responseDueDate) {
	    this.responseDueDate = responseDueDate;
	}
	
	/**
	 * 点検担当者名を取得する。
	 * @return inspectionName
	 */
	public String getInspectionName() {
	    return inspectionName;
	}
	
	/**
	 * 点検担当者名を設定する。
	 * @param inspectionNameString
	 */
	public void setInspectionName(String inspectionName) {
	    this.inspectionName = inspectionName;
	}
	
	/**
	 * 更新日時(updDate)の取得
	 * 
	 * @return updDate
	 */
	public String getUpdDate() {
		return updDate;
	}

	/**
	 * 更新日時(updDate)の設定
	 * 
	 * @param updDate
	 */
	public void setUpdDate(String updDate) {
		this.updDate = updDate;
	}

}
