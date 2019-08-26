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


}
