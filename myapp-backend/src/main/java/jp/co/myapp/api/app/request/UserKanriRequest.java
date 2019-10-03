package jp.co.myapp.api.app.request;

import java.io.Serializable;

public class UserKanriRequest implements Serializable {

	private String userId;

	private String yukokbn;

	private String orderName;

	private String orderDirect;

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

	public String getOrderName() {
		return orderName;
	}

	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}

	public String getOrderDirect() {
		return orderDirect;
	}

	public void setOrderDirect(String orderDirect) {
		this.orderDirect = orderDirect;
	}

}
