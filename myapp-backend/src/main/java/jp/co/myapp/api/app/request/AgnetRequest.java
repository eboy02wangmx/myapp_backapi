package jp.co.myapp.api.app.request;

import java.io.Serializable;

public class AgnetRequest implements Serializable {

	private static final long serialVersionUID = 99999998L;

	/**
	 * ユーザ権限
	 */
	private String authority;

	/**
	 * 営業課店コード
	 */
	private String salesCode;

	/**
	 * 自代理店コード
	 */
	private String selfAgentCode;

	public String getAuthority() {
		return authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}

	public String getSalesCode() {
		return salesCode;
	}

	public void setSalesCode(String salesCode) {
		this.salesCode = salesCode;
	}

	public String getSelfAgentCode() {
		return selfAgentCode;
	}

	public void setSelfAgentCode(String selfAgentCode) {
		this.selfAgentCode = selfAgentCode;
	}




}
