package jp.co.myapp.api.domain.model;

import java.io.Serializable;
import java.util.List;

import jp.co.myapp.api.app.data.AbstractResultData;

public class ConfigBean extends AbstractResultData implements Serializable {

	private static final long serialVersionUID = -8103595080889462692L;

	/**
	 * システム日付
	 */
	private String systemDate;
	/**
	 * 保険始期日最小値
	 */
	private String startDateMin;
	/**
	 * 保険始期日最大値
	 */
	private String startDateMax;
	/**
	 * 代理店コード
	 */
	private String agentCode;
	/**
	 * 代理店名
	 */
	private String agentName;
	/**
	 * 課店名
	 */
	private String storeName;

	/**
	 * Direct
	 */
	private Boolean direct;

	/**
	 * Action
	 */
	private String action;

	/**
	 * お知らせ
	 */
	private String notice;

	//メンテナンス管理画面入力チェック 2018/11/26 ADD START


	/**
	 * MyPage連携キー
	 */
	private String mytoken;

	/**
	 * @return notice
	 */
	public String getNotice() {
		return notice;
	}

	private String csrfToken;

	/**
	 * 代理店コードリスト
	 */
	private List<String> agentList;

	/**
	 * @param notice セットする notice
	 */
	public void setNotice(String notice) {
		this.notice = notice;
	}

	public Boolean getDirect() {
		return direct;
	}

	public void setDirect(Boolean direct) {
		this.direct = direct;
	}

	public String getSystemDate() {
		return systemDate;
	}

	public void setSystemDate(String systemDate) {
		this.systemDate = systemDate;
	}

	public String getStartDateMin() {
		return startDateMin;
	}

	public void setStartDateMin(String startDateMin) {
		this.startDateMin = startDateMin;
	}

	public String getStartDateMax() {
		return startDateMax;
	}

	public void setStartDateMax(String startDateMax) {
		this.startDateMax = startDateMax;
	}

	public String getAgentCode() {
		return agentCode;
	}

	public void setAgentCode(String agentCode) {
		this.agentCode = agentCode;
	}

	public String getAgentName() {
		return agentName;
	}

	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}

	public String getStoreName() {
		return storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public String getCsrfToken() {
		return csrfToken;
	}

	public void setCsrfToken(String csrfToken) {
		this.csrfToken = csrfToken;
	}

	public String getMytoken() {
		return mytoken;
	}

	public void setMytoken(String mytoken) {
		this.mytoken = mytoken;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public List<String> getAgentList() {
		return agentList;
	}

	public void setAgentList(List<String> agentList) {
		this.agentList = agentList;
	}
	//メンテナンス管理画面チェック 2018/11/26 ADD END
}
