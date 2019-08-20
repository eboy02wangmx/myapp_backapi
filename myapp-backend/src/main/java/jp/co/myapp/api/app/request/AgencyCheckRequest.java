package jp.co.myapp.api.app.request;

import java.io.Serializable;

public class AgencyCheckRequest implements Serializable {

	private static final long serialVersionUID = 2222222L;

	/**
	 * 自代理店コード
	 */
	private String selfAgentCode;

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
}
