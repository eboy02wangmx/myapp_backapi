package jp.co.myapp.api.app.request;

import java.io.Serializable;

public class UserKanriRequest implements Serializable {
	private String userId;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
}
