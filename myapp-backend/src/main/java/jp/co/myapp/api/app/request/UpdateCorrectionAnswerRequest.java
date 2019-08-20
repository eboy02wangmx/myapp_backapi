package jp.co.myapp.api.app.request;

import java.io.Serializable;
import java.util.List;

public class UpdateCorrectionAnswerRequest implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7540475094451775367L;

	/**
	 * リスト
	 */
	private List<UpdateCorrectionAnswerDetailRequest> list;
	
	/**
	 * 回答期限日
	 */
	private String responseDueDate;

	/**
	 * 更新日時(updateTime)
	 */
	private String updateTime;
	
	/**
	 * リストを取得する。
	 * @return list
	 */
	public List<UpdateCorrectionAnswerDetailRequest> getList() {
	    return list;
	}
	
	/**
	 * リストを設定する。
	 * @param listList
	 */
	public void setList(List<UpdateCorrectionAnswerDetailRequest> list) {
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
