package jp.co.myapp.api.app.request;

import java.io.Serializable;

public class AgentCodeSearchRequest implements Serializable {

	private static final long serialVersionUID = 2222222L;

	/**
	 * 課店コード
	 */
	private String storeCode;

	/**
	 * @return the storeCode
	 */
	public String getStoreCode() {
		return storeCode;
	}

	/**
	 * @param storeCode
	 *            the storeCode to set
	 */
	public void setStoreCode(String storeCode) {
		this.storeCode = storeCode;
	}

	/**
	 * 代理店コード
	 */
	private String agentCode;

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

}
