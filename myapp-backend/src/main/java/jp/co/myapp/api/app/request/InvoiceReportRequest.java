package jp.co.myapp.api.app.request;

import java.io.Serializable;

import jp.co.myapp.api.domain.validate.annotation.CustomizeTypeSizeString;
import jp.co.myapp.api.domain.validate.annotation.CustomizeTypeSizeStringArrays;

public class InvoiceReportRequest implements Serializable {

	private static final long serialVersionUID = 4237085122952282747L;

	/**
	 * 営業課店コード
	 */
	@CustomizeTypeSizeString(max = 4, regexp = "^[0-9]*$", message = "E00001", params = "{salesCode.label;max.4;enter.event}")
	private String salesCode;

	/**
	 * 代理店コード
	 */
	@CustomizeTypeSizeString(max = 10, regexp = "^[0-9]*$", message = "E00001", params = "{agentCode.label;max.10;enter.event}")
	private String agentCode;

	/**
	 * 代理店名
	 */
	@CustomizeTypeSizeString(max = 40, regexp = "", message = "E00001", params = "{agentCode.label;max.40;enter.event}")
	private String agentName;

	/**
	 * 証券番号
	 */
	@CustomizeTypeSizeStringArrays(max = 11, regexp = "^[0-9]*$", message = "E00001", params = "{policyNo.label;max.11;enter.event}")
	private String[] policyNo;

	/**
	 * 営業課店コードの取得
	 * 
	 * @return salesCode
	 */
	public String getSalesCode() {
		return salesCode;
	}

	/**
	 * 営業課店コードの設定
	 * 
	 * @param salesCode
	 */
	public void setSalesCode(String salesCode) {
		this.salesCode = salesCode;
	}

	/**
	 * 代理店コードの取得
	 * 
	 * @return agentCode
	 */
	public String getAgentCode() {
		return agentCode;
	}

	/**
	 * 代理店コードの設定
	 * 
	 * @param agentCode
	 */
	public void setAgentCode(String agentCode) {
		this.agentCode = agentCode;
	}

	/**
	 * 代理店名の取得
	 * 
	 * @return agentName
	 */
	public String getAgentName() {
		return agentName;
	}

	/**
	 * 代理店名の設定
	 * 
	 * @param agentName
	 */
	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}

	/**
	 * 証券番号の取得
	 * 
	 * @return policyNo
	 */
	public String[] getPolicyNo() {
		return policyNo;
	}

	/**
	 * 証券番号の設定
	 * 
	 * @param policyNo
	 */
	public void setPolicyNo(String[] policyNo) {
		this.policyNo = policyNo;
	}

}
