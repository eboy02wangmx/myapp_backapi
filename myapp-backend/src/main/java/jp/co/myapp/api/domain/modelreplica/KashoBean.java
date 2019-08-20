package jp.co.myapp.api.domain.modelreplica;

import java.io.Serializable;

public class KashoBean implements Serializable {

	private static final long serialVersionUID = 2222222L;

	/**
	 * 扱課所コード
	 */
	private String sectionCode;

	/**
	 * 課所名称（漢字）
	 */
	private String sectionName;

	/**
	 * 課所名称（カナ）
	 */
	private String sectionNameKana;

	/**
	 * @return the sectionCode
	 */
	public String getSectionCode() {
		return sectionCode;
	}

	/**
	 * @param sectionCode
	 *            the sectionCode to set
	 */
	public void setSectionCode(String sectionCode) {
		this.sectionCode = sectionCode;
	}

	/**
	 * @return the sectionName
	 */
	public String getSectionName() {
		return sectionName;
	}

	/**
	 * @param sectionName
	 *            the sectionName to set
	 */
	public void setSectionName(String sectionName) {
		this.sectionName = sectionName;
	}

	/**
	 * @return the sectionNameKana
	 */
	public String getSectionNameKana() {
		return sectionNameKana;
	}

	/**
	 * @param sectionNameKana
	 *            the sectionNameKana to set
	 */
	public void setSectionNameKana(String sectionNameKana) {
		this.sectionNameKana = sectionNameKana;
	}

}
