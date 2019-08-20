package jp.co.myapp.api.app.request;

import java.io.Serializable;

import jp.co.myapp.api.domain.validate.annotation.CustomizeDateFormatString;
import jp.co.myapp.api.domain.validate.annotation.CustomizeDateTimeLimitString;
import jp.co.myapp.api.domain.validate.annotation.CustomizeTypeSizeString;

public class MaintenanceDeleteRequest implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	*パターンコード
	*/
	@CustomizeTypeSizeString(max = 10, message = "E00001", params = "{'アカウント';'10桁まで';'ご入力'}")
	private String patternCd;

	/**
	 * パターンコード有効日From
	 */
	@CustomizeTypeSizeString(max = 8, message = "E00001", params = "{'アカウント有効期間FROM';'8桁まで';'ご入力'}")
	private String patternDateFrom;

	/**
	 * パターンコード有効日To	pattern_date_to
	 */
	@CustomizeTypeSizeString(max = 8, message = "E00001", params = "{'アカウント有効期間TO';'8桁まで';'ご入力'}")
	private String patternDateTo;

	/**
	 * 幹事の代理店コード
	 */
	@CustomizeTypeSizeString(max = 10, message = "E00001", params = "{'幹事代理店コード';'10桁まで';'ご入力'}")
	private String kanjiDairiCd;

	/**
	 * 審査依頼日TO
	 */
	@CustomizeDateFormatString(pattern = "yyyyMMdd", message = "E00001", params="{'審査依頼日TO';'日付';'ご入力して'}")
	@CustomizeDateTimeLimitString(min = "20180101", max = "99991231", message = "E00013", params="{'2018年1月1日';'9999年12月31日'}")
	private String checkDateFrom;

	/**
	 * 審査依頼日FROM
	 */
	@CustomizeDateFormatString(pattern = "yyyyMMdd", message = "E00001", params="{'審査依頼日FROM';'日付';'ご入力して'}")
	@CustomizeDateTimeLimitString(min = "20180101", max = "99991231", message = "E00013", params="{'2018年1月1日';'9999年12月31日'}")
	private String checkDateTo;

	/**
	 * 削除フラグ
	 */
	@CustomizeTypeSizeString(max = 1, message = "E00001", params = "{'削除フラグ';'1桁まで';'ご入力'}")
	private String deleteKbn;


	/**
	* パターンコードの取得
	* @return patternCd
	*/
	public String getPatternCd() {
		return patternCd;
	}

	/**
	 * パターンコードの設定
	 */
	public void setPatternCd(String patternCd) {
		this.patternCd = patternCd;
	}

	/**
	* パターンコード有効日Fromの取得
	* @return　patternDateFrom
	*/
	public String getPatternDateFrom() {
		return patternDateFrom;
	}

	/**
	 * パターンコード有効日Fromの設定
	 */
	public void setPatternDateFrom(String patternDateFrom) {
		this.patternDateFrom = patternDateFrom;
	}

	/**
	 * パターンコード有効日Toの取得
	 * @return patternDateTo
	 */
	public String getPatternDateTo() {
		return patternDateTo;
	}

	/**
	 * パターンコード有効日Toの設定
	 * @return patternDateTo
	 */
	public void setPatternDateTo(String patternDateTo) {
		this.patternDateTo = patternDateTo;
	}

	/**
	 * 幹事の代理店コードの取得
	 * @return kanjiDaririCd
	 */
	public String getKanjiDairiCd() {
		return kanjiDairiCd;
	}

	/**
	 * 幹事の代理店コードの設定
	 * @param kanjiDaririCd
	 */
	public void setKanjiDairiCd(String kanjiDaririCd) {
		this.kanjiDairiCd = kanjiDaririCd;
	}

	/**
	 * 審査依頼日Fromの取得
	 * @return checkDateFrom
	 */
	public String getCheckDateFrom() {
		return checkDateFrom;
	}

	/**
	 * 審査依頼日Fromの設定
	 * @param checkDateFrom
	 */
	public void setCheckDateFrom(String checkDateFrom) {
		this.checkDateFrom = checkDateFrom;
	}

	/**
	 * 審査依頼日Toの取得
	 * @return checkDateTo
	 */
	public String getCheckDateTo() {
		return checkDateTo;
	}

	/**
	 * 審査依頼日Toの設定
	 * @param checkDateTo
	 */
	public void setCheckDateTo(String checkDateTo) {
		this.checkDateTo = checkDateTo;
	}


	/**
	 * 削除フラグの取得
	 * @return deleteKbn
	 */
	public String getDeleteKbn() {
		return deleteKbn;
	}

	/**
	 * 削除フラグの設定
	 * @param deleteKbn
	 */
	public void setDeleteKbn(String deleteKbn) {
		this.deleteKbn = deleteKbn;
	}

}
