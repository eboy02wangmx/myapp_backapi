package jp.co.myapp.api.app.request;

import java.io.Serializable;

public class ReviseCountRequest implements Serializable {

	private static final long serialVersionUID = 2222222L;

	/**
	 * 営業課店コード
	 */
	private String salesCode;

	/**
	 * 代理店コード
	 */
	private String selfAgentCode;

	/**
	 * @return the salesCode
	 */
	public String getSalesCode() {
		return salesCode;
	}

	/**
	 * @param salesCode
	 *            the salesCode to set
	 */
	public void setSalesCode(String salesCode) {
		this.salesCode = salesCode;
	}

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
