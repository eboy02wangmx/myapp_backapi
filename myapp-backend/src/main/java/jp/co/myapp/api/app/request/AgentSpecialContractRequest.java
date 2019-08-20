package jp.co.myapp.api.app.request;

import jp.co.myapp.api.domain.validate.annotation.CustomizeTypeSizeString;

public class AgentSpecialContractRequest {

	/**
	 * 代理店コード
	 */
	@CustomizeTypeSizeString(max = 10, regexp = "^[0-9]*$", message = "E00001", params = "{'代理店コード';'半角数字10桁まで';'ご入力'}")
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
