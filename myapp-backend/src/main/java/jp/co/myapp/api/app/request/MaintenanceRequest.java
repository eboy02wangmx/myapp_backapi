package jp.co.myapp.api.app.request;

import java.io.Serializable;

import jp.co.myapp.api.domain.validate.annotation.CustomizeDateFormatString;
import jp.co.myapp.api.domain.validate.annotation.CustomizeTypeSizeString;

public class MaintenanceRequest implements Serializable {
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
	@CustomizeDateFormatString(pattern = "yyyyMMdd", message = "E00001", params="{'アカウント有効期間From';'日付';'ご入力して'}")
	private String patternDateFrom;

	/**
	 * パターンコード有効日To	pattern_date_to
	 */
	@CustomizeDateFormatString(pattern = "yyyyMMdd", message = "E00001", params="{'アカウント有効期間To';'日付';'ご入力して'}")
	private String patternDateTo;

	/**
	 * 幹事の代理店コード
	 */
	@CustomizeTypeSizeString(max = 10, message = "E00001", params = "{'幹事代理店コード';'10桁まで';'ご入力'}")
	private String kanjiDairiCd;

	/**
	 * 非幹事1の代理店コード
	 */
	@CustomizeTypeSizeString(max = 10, message = "E00001", params = "{'非幹事1の代理店コード';'10桁まで';'ご入力'}")
	private String hiKanji1DairiCd;

	/**
	 * 非幹事2の代理店コード
	 */
	@CustomizeTypeSizeString(max = 10, message = "E00001", params = "{'非幹事2の代理店コード';'10桁まで';'ご入力'}")
	private String hiKanji2DairiCd;

	/**
	 * 非幹事１の分担割合
	 */
	@CustomizeTypeSizeString(max = 6, message = "E00001", params = "{'非幹事１の分担割合';'6桁まで';'ご入力'}")
	private String hiKanji1BntWariFrom;

	/**
	 * 非幹事2の分担割合
	 */
	@CustomizeTypeSizeString(max = 6, message = "E00001", params = "{'非幹事2の分担割合';'6桁まで';'ご入力'}")
	private String hiKanji2BntWariFrom;

	/**
	 * 審査依頼日From
	 */
	@CustomizeDateFormatString(pattern = "yyyyMMdd", message = "E00001", params="{'審査依頼日FROM';'日付';'ご入力して'}")
	private String checkDateFrom;

	/**
	 * 審査依頼日To
	 */
	@CustomizeDateFormatString(pattern = "yyyyMMdd", message = "E00001", params="{'審査依頼日TO';'日付';'ご入力して'}")
	private String checkDateTo;

	/**
	 * 表示文言
	 */
	@CustomizeTypeSizeString(max = 1024, message = "E00001", params = "{'表示文言';'1024桁まで';'ご入力'}")
	private String disBungen;

	/**
	 * 削除フラグ
	 */
	@CustomizeTypeSizeString(max = 1, message = "E00001", params = "{'削除フラグ';'1桁まで';'ご入力'}")
	private String deleteKbn;

	/**
	 * 登録処理ID
	 */
	@CustomizeTypeSizeString(max = 10, message = "E00001", params = "{'登録処理ID';'10桁まで';'ご入力'}")
	private String addProcId;

	/**
	 * 登録日時
	 */
	//@CustomizeDateFormatString(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS")
	private String addDate;

	/**
	 * 更新処理Id
	 */
	@CustomizeTypeSizeString(max = 10, message = "E00001", params = "{'更新処理ID';'10桁まで';'ご入力'}")
	private String updProcId;

	/**
	 * 更新日時
	 */
	//@CustomizeDateFormatString(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS")
	private String updDate;

	/**
	 * pageSize
	 */
	private int pageSize;

	/**
	 * currentPage
	 */
	private int currentPage;

	/**
	 * rownoStart
	 */
	private int rownoStart;

	/**
	 * rownoStart
	 */
	private int rownoEnd;

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
	 * 非幹事1の代理店コードの取得
	 * @return hikanji1DairiCd
	 */
	public String getHiKanji1DairiCd() {
		return hiKanji1DairiCd;
	}

	/**
	 * 非幹事1の代理店コードの設定
	 * @param hikanji1DairiCd
	 */
	public void setHiKanji1DairiCd(String hiKanji1DairiCd) {
		this.hiKanji1DairiCd = hiKanji1DairiCd;
	}

	/**
	 * 非幹事2の代理店コードの取得
	 * @return hikanji2DairiCd
	 */
	public String getHiKanji2DairiCd() {
		return hiKanji2DairiCd;
	}

	/**
	 * 非幹事2の代理店コードの設定
	 * @param hikanji2DairiCd
	 */
	public void setHiKanji2DairiCd(String hiKanji2DairiCd) {
		this.hiKanji2DairiCd = hiKanji2DairiCd;
	}

	/**
	 * 非幹事１の分担割合の取得
	 * @return hiKanji1BntWariFrom
	 */
	public String getHiKanji1BntWariFrom() {
		return hiKanji1BntWariFrom;
	}

	/**
	 * 非幹事１の分担割合の設定
	 * @param bntWariFrom
	 */
	public void setHiKanji1BntWariFrom(String hiKanji1BntWariFrom) {
		this.hiKanji1BntWariFrom = hiKanji1BntWariFrom;
	}

	/**
	 * 非幹事2の分担割合の取得
	 * @return hiKanji1BntWariFrom
	 */
	public String getHiKanji2BntWariFrom() {
		return hiKanji2BntWariFrom;
	}

	/**
	 * 非幹事2の分担割合の設定
	 * @param bntWariFrom
	 */
	public void setHiKanji2BntWariFrom(String hiKanji2BntWariFrom) {
		this.hiKanji2BntWariFrom = hiKanji2BntWariFrom;
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
	 * 表示文言の取得
	 * @return disBungen
	 */
	public String getDisBungen() {
		return disBungen;
	}

	/**
	 * 表示文言の設定
	 * @param disBungen
	 */
	public void setDisBungen(String disBungen) {
		this.disBungen = disBungen;
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

	/**
	 * 登録処理IDの取得
	 * @return addProcId
	 */
	public String getAddProcId() {
		return addProcId;
	}

	/**
	 * 登録処理IDの設定
	 * @param addProcId
	 */
	public void setAddProcId(String addProcId) {
		this.addProcId = addProcId;
	}

	/**
	 * 登録日時の取得
	 * @return addDate
	 */
	public String getAddDate() {
		return addDate;
	}

	/**
	 * 登録日時の設定
	 * @param addDate
	 */
	public void setAddDate(String addDate) {
		this.addDate = addDate;
	}

	/**
	 * 更新処理IDの取得
	 * @return updProcId
	 */
	public String getUpdProcId() {
		return updProcId;
	}

	/**
	 * 更新処理IDの取得
	 * @param updProcId
	 */
	public void setUpdProcId(String updProcId) {
		this.updProcId = updProcId;
	}

	/**
	 * 更新日時の取得
	 * @return updDate
	 */
	public String getUpdDate() {
		return updDate;
	}

	/**
	 * 更新日時の設定
	 * @param updDate
	 */
	public void setUpdDate(String updDate) {
		this.updDate = updDate;
	}

	/**
	 * @return serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public int getRownoStart() {
		return rownoStart;
	}

	public void setRownoStart(int rownoStart) {
		this.rownoStart = rownoStart;
	}

	public int getRownoEnd() {
		return rownoEnd;
	}

	public void setRownoEnd(int rownoEnd) {
		this.rownoEnd = rownoEnd;
	}

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

}
