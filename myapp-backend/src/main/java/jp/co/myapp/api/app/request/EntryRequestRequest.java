package jp.co.myapp.api.app.request;

import java.io.Serializable;

import jp.co.myapp.api.domain.validate.annotation.CustomizeTypeSizeString;

/**
 * 申込依頼 リクエストパラメータ
 */
public class EntryRequestRequest extends BaseEntrySaveRequest implements Serializable {

	private static final long serialVersionUID = -3265839323589085471L;

	/**
	 * 顧客名
	 */
	@CustomizeTypeSizeString(max = 60, regexp = "", message = "E00001", params = "{customerName.label;max.60;enter.event}")
	private String customerName;

	/**
	 * トークン
	 */
	private String token;

	/**
	 * 顧客名の設定
	 *
	 * @param customerName String
	 */
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	/**
	 * 顧客名の取得
	 *
	 * @return customerName
	 */
	public String getCustomerName() {
		return this.customerName;
	}

	/**
	 * トークンの設定
	 *
	 * @param token String
	 */
	public void setToken(String token) {
		this.token = token;
	}

	/**
	 * トークンの取得
	 *
	 * @return token
	 */
	public String getToken() {
		return this.token;
	}
}
