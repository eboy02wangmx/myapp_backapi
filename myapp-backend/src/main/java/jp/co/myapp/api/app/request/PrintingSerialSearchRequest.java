package jp.co.myapp.api.app.request;

import java.io.Serializable;

public class PrintingSerialSearchRequest implements Serializable {

	private static final long serialVersionUID = 2222222L;

	/**
	 * 代理店コード
	 */
	private String agentCode;

	/**
	 * pageNo(pageNo)
	 */
	private int pageNo;

	/**
	 * pageSize
	 */
	private int pageSize;

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
	 * pageNo(pageNo)の取得
	 * 
	 * @return pageNo
	 */
	public int getPageNo() {
		return pageNo;
	}

	/**
	 * pageNo(pageNo)の設定
	 * 
	 * @param pageNo
	 *            int
	 */
	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}

	/**
	 * pageSizeの取得
	 * 
	 * @return pageSize
	 */
	public int getPageSize() {
		return pageSize;
	}

	/**
	 * pageSizeの設定
	 * 
	 * @param pageSize
	 *            int
	 */
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

}
