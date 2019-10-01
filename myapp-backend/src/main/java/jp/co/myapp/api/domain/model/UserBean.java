package jp.co.myapp.api.domain.model;

import java.io.Serializable;

import jp.co.myapp.api.app.data.AbstractResultData;

public class UserBean extends AbstractResultData implements Serializable {

	private static final long serialVersionUID = -8103595080889462692L;

	/**
	 * ユーザー名称
	 */
	private String userName;

	/**
	 * パスワード
	 */
	private String password;

	/**
	 * お客様id
	 */
	private String customId;

	/**
	 * 権限
	 */
	private String kengen;

	private String yukokbn;

	private Boolean success = true;

	private String msg;

	public String getCustomId() {
		return customId;
	}

	public void setCustomId(String customId) {
		this.customId = customId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getKengen() {
		return kengen;
	}

	public void setKengen(String kengen) {
		this.kengen = kengen;
	}

	public Boolean getSuccess() {
		return success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getYukokbn() {
		return yukokbn;
	}

	public void setYukokbn(String yukokbn) {
		this.yukokbn = yukokbn;
	}

}
