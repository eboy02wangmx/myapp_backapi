package jp.co.myapp.api.app.request;

import java.io.Serializable;

import jp.co.myapp.api.domain.validate.annotation.CustomizeTypeSizeString;

public class AgentSearchRequest implements Serializable {

	private static final long serialVersionUID = 2222222L;

	/**
	 * 自代理店コード
	 */
	private String selfAgentCode;

	/**
	 * 代理店コード
	 */
	@CustomizeTypeSizeString(max = 10, regexp = "^[0-9]*$", message = "E00001", params = "{'代理店コード';'半角数字10桁まで';'ご入力'}")
	private String agentCode;

	/**
	 * 代理店名称
	 */
	private String agentName;

	/**
	 * 代理店カナ
	 */
	@CustomizeTypeSizeString(max = 20, regexp = "^[\\u30A0-\\u30FF\\uFF65-\\uFF9F]+$", message = "E00001", params = "{'代理店カナ';'全角カナ20桁まで';'ご入力'}")
	private String agentNameKana;
	
	/**
	 * 全国規模コード(KIBO_CD)
	 */
	private String nationalCode;

	/**
	 * @return the selfAgentCode
	 */
	public String getSelfAgentCode() {
		return selfAgentCode;
	}

	/**
	 * @param selfAgentCode
	 *            the selfAgentCode to set
	 */
	public void setSelfAgentCode(String selfAgentCode) {
		this.selfAgentCode = selfAgentCode;
	}

	/**
	 * @return the agentCode
	 */
	public String getAgentCode() {
		return agentCode;
	}

	/**
	 * @param agentCode
	 *            the agentCode to set
	 */
	public void setAgentCode(String agentCode) {
		this.agentCode = agentCode;
	}

	/**
	 * @return the agentName
	 */
	public String getAgentName() {
		return agentName;
	}

	/**
	 * @param agentName
	 *            the agentName to set
	 */
	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}

	/**
	 * @return the agentNameKana
	 */
	public String getAgentNameKana() {
		return agentNameKana;
	}

	/**
	 * @param agentNameKana
	 *            the agentNameKana to set
	 */
	public void setAgentNameKana(String agentNameKana) {
		this.agentNameKana = agentNameKana;
	}
	
	/**
	 * @return the nationalCode
	 */
	public String getNationalCode() {
		return nationalCode;
	}

	/**
	 * @param nationalCode the nationalCode to set
	 */
	public void setNationalCode(String nationalCode) {
		this.nationalCode = nationalCode;
	}

}
