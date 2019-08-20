package jp.co.myapp.api.app.request;

import java.io.Serializable;

import jp.co.myapp.api.domain.validate.annotation.CustomizeTypeSizeString;

public class SalesSearchRequest implements Serializable {

	private static final long serialVersionUID = 2222222L;

	/**
	 * 所属内務課コード
	 */
	@CustomizeTypeSizeString(max = 4, message = "E00001", params = "{'所属内務課コード';'4桁まで';'ご入力'}")
	private String affiliationDepartmentCode;
	
	/**
	 * 営業課店コード
	 */
	@CustomizeTypeSizeString(max = 4, regexp = "^[0-9]*$", message = "E00001", params = "{'営業課店コード';'半角数字4桁まで';'ご入力'}")
	private String salesCode;

	/**
	 * 営業課店名称
	 */
	private String salesName;

	/**
	 * 営業課店カナ
	 */
	@CustomizeTypeSizeString(max = 30, regexp = "^[\\u30A0-\\u30FF\\uFF65-\\uFF9F]+$", message = "E00001", params = "{'営業課店カナ';'全角カナ30桁まで';'ご入力'}")
	private String salesNameKana;

	/**
	 * @return the affiliationDepartmentCode
	 */
	public String getAffiliationDepartmentCode() {
		return affiliationDepartmentCode;
	}

	/**
	 * @param affiliationDepartmentCode
	 *            the affiliationDepartmentCode to set
	 */
	public void setAffiliationDepartmentCode(String affiliationDepartmentCode) {
		this.affiliationDepartmentCode = affiliationDepartmentCode;
	}
	
	/**
	 * @return the salesCode
	 */
	public String getSalesCode() {
		return salesCode;
	}

	/**
	 * @param salesCode
	 *            the salesCode to set
	 */
	public void setSalesCode(String salesCode) {
		this.salesCode = salesCode;
	}

	/**
	 * @return the salesName
	 */
	public String getSalesName() {
		return salesName;
	}

	/**
	 * @param salesName
	 *            the salesName to set
	 */
	public void setSalesName(String salesName) {
		this.salesName = salesName;
	}

	/**
	 * @return the salesNameKana
	 */
	public String getSalesNameKana() {
		return salesNameKana;
	}

	/**
	 * @param salesNameKana
	 *            the salesNameKana to set
	 */
	public void setSalesNameKana(String salesNameKana) {
		this.salesNameKana = salesNameKana;
	}

}
