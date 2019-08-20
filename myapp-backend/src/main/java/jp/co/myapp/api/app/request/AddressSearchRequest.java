package jp.co.myapp.api.app.request;

import java.io.Serializable;

import jp.co.myapp.api.domain.validate.annotation.CustomizeNoEmpty;
import jp.co.myapp.api.domain.validate.annotation.CustomizeTypeSizeString;

public class AddressSearchRequest implements Serializable {

	private static final long serialVersionUID = 2222222L;

	/**
	 * 郵便番号
	 */
	@CustomizeNoEmpty(message="E00002", params="{postalCode.label;input.event}")
	@CustomizeTypeSizeString(max = 7, regexp = "^[0-9]*$", message = "E00001", params = "{postalCode.label;postalCode.type;input.event}")
	private String postalCode;

	/**
	 * 郵便番号の取得
	 * 
	 * @return postalCode 
	 */
	public String getPostalCode () {
		return postalCode ;
	}

	/**
	 * 郵便番号の設定
	 * 
	 * @param PostalCode
	 *            String
	 */
	public void setPostalCode(String postalCode) {
		this.postalCode  = postalCode ;
	}

}
