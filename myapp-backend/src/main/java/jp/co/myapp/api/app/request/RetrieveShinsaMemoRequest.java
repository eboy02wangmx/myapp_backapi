package jp.co.myapp.api.app.request;

import java.io.Serializable;

import jp.co.myapp.api.domain.validate.annotation.CustomizeNoEmpty;
import jp.co.myapp.api.domain.validate.annotation.CustomizeTypeSizeString;

public class RetrieveShinsaMemoRequest implements Serializable {

	private static final long serialVersionUID = 2222222L;

	/**
	 * 申込依頼№
	 */
	@CustomizeNoEmpty(message="E00002", params="{entryNo.label;input.event}")
	@CustomizeTypeSizeString(max=6, regexp="", message="E00001", params="{entryNo.label;max.6;enter.event}")
	private String entryNo;

	/**
	 * 証券番号
	 */
	@CustomizeNoEmpty(message="E00002", params="{policyNo.label;input.event}")
	@CustomizeTypeSizeString(max=11, regexp="", message="E00001", params="{policyNo.label;max.11;enter.event}")
	private String policyNo;

	/**
	 * 申込依頼№の取得
	 * 
	 * @return the entryNo
	 */
	public String getEntryNo() {
		return entryNo;
	}

	/**
	 * 申込依頼№の設定
	 * 
	 * @param entryNo String
	 */
	public void setEntryNo(String entryNo) {
		this.entryNo = entryNo;
	}

	/**
	 * 証券番号の取得
	 * 
	 * @return policyNo
	 */
	public String getPolicyNo() {
		return policyNo;
	}

	/**
	 * 証券番号の設定
	 * 
	 * @param policyNo String
	 */
	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}
	
}
