package jp.co.myapp.api.app.request;

import java.io.Serializable;

public class CancelKeijoRequest implements Serializable {

	private static final long serialVersionUID = 2222222L;

	/**
	 * 証券番号
	 */
	private String[] policyNo;

	/**
	 * 更新日時(upd_date)
	 */
	private String[] updateTime;

	/**
	 * 証券番号
	 * 
	 * @return policyNo
	 */
	public String[] getPolicyNo() {
		return policyNo;
	}

	/**
	 * 証券番号
	 * 
	 * @return policyNo
	 */
	public void setPolicyNo(String[] policyNo) {
		this.policyNo = policyNo;
	}

	/**
	 * 更新日時(updateTime)の取得
	 * 
	 * @return updateTime
	 */
	public String[] getUpdateTime() {
		return updateTime;
	}

	/**
	 * 更新日時(updateTime)の設定
	 * 
	 * @param updateTime
	 *            String
	 */
	public void setUpdateTime(String[] updateTime) {
		this.updateTime = updateTime;
	}

}
