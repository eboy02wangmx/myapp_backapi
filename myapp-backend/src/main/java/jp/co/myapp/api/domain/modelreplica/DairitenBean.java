package jp.co.myapp.api.domain.modelreplica;

import java.io.Serializable;

public class DairitenBean implements Serializable {

	private static final long serialVersionUID = 2222222L;

	/**
	 * 代理店コード
	 */
	private String agentCode;

	/**
	 * 代理店名（漢字）
	 */
	private String agentName;

	/**
	 * 代理店名（カナ）
	 */
	private String agentNameKana;

	/**
	 * @return the agentCode
	 */
	public String getAgentCode() {
		return agentCode;
	}

	/**
	 * @param agentCode the agentCode to set
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
	 * @param agentName the agentName to set
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
	 * @param agentNameKana the agentNameKana to set
	 */
	public void setAgentNameKana(String agentNameKana) {
		this.agentNameKana = agentNameKana;
	}

}
