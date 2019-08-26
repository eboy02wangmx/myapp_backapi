package jp.co.myapp.api.app.request;

import java.io.Serializable;

public class UserRequest implements Serializable {

	private static final long serialVersionUID = 2222222L;

	private String userName;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	private String password;

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}



}
