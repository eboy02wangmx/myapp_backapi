package jp.co.myapp.api.app.request;

import java.io.Serializable;

public class UserKanriRequest implements Serializable {
	private String userId;

	private String yukokbn;

	public String getYukokbn() {
		return yukokbn;
	}

	public void setYukokbn(String yukokbn) {
		this.yukokbn = yukokbn;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
}
