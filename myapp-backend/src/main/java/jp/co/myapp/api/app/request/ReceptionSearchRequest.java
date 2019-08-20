package jp.co.myapp.api.app.request;

import java.io.Serializable;

import jp.co.myapp.api.domain.validate.annotation.CustomizeDateFormatString;
import jp.co.myapp.api.domain.validate.annotation.CustomizeTypeSizeString;
import jp.co.myapp.api.domain.validate.annotation.CustomizeTypeSizeStringArrays;

public class ReceptionSearchRequest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2314812710487535L;

	/**
	 * ページ番号(pageNo)
	 */
	private int pageNo;

	/**
	 * ページ件数(lineNum)
	 */
	private int lineNum;

	/**
	 * rownoStart
	 */
	private int rownoStart;

	/**
	 * rownoStart
	 */
	private int rownoEnd;

	/**
	 * 商品区分(shohinKbn)
	 */
	private String shohinKbn;

	/**
	 * 営業課店コード(eigyoKatenCd)
	 */
	@CustomizeTypeSizeString(max = 4, regexp = "^[0-9]*$", message = "E00001", params = "{'営業課店';'半角数字4桁まで';'ご入力'}")
	private String eigyoKatenCd;

	/**
	 * 代理店コード(dairitenCd)
	 */
	@CustomizeTypeSizeStringArrays(max = 7, regexp = "^[0-9]*$", message = "E00001", params = "{'代理店';'半角数字7桁まで';'ご入力'}")
	private String[] dairitenCd;

	/**
	 * 証券番号(policy)
	 */
	@CustomizeTypeSizeString(max = 11, regexp = "^[0-9]*$", params = "{'証券番号';'半角文字11桁まで';'ご入力'}", message = "E00001")
	private String policy;

	/**
	 * 契約者（カナ）(keiyakuNameKana)
	 */
	@CustomizeTypeSizeString(max = 60, regexp = "^[\\u30A0-\\u30FF-\\u3000]+$", message = "E00001", params = "{'契約者（カナ）';'全角カナ60桁まで';'ご入力'}")
	private String keiyakuNameKana;

	/**
	 * 契約区分(agreeType)
	 */
	private String[] agreeType;

	/**
	 * 変更受付番号_変更受付番号開始(henkouketsukeStartYmd)
	 */
	@CustomizeTypeSizeString(max = 8, regexp = "^[0-9]*$", message = "E00001", params = "{'変更受付番号';'半角数字8桁まで';'ご入力'}")
	private String henkouketsukeStartYmd;

	/**
	 * 変更受付番号_変更受付番号終了(henkouketsukeEndYmd)
	 */
	@CustomizeTypeSizeString(max = 8, regexp = "^[0-9]*$", message = "E00001", params = "{'変更受付番号';'半角数字8桁まで';'ご入力'}")
	private String henkouketsukeEndYmd;

	/**
	 * 受付日_変更受付日開始(uketsukeStartYmd)
	 */
	@CustomizeDateFormatString(pattern = "yyyyMMdd", message = "E00001", params = "{'受付日';'YYYYMMDD';'ご入力'}")
	private String uketsukeStartYmd;

	/**
	 * 受付日_変更受付日終了(uketsukeEndEnd)
	 */
	@CustomizeDateFormatString(pattern = "yyyyMMdd", message = "E00001", params = "{'受付日';'YYYYMMDD';'ご入力'}")
	private String uketsukeEndEnd;

	/**
	 * 連絡時間帯_指定なし(renrakuNone)
	 */
	private String renrakuNone;

	/**
	 * 連絡時間帯_午前中(renrakuAM)
	 */
	private String renrakuAM;

	/**
	 * 連絡時間帯_12_14(renraku12)
	 */
	private String renraku12;

	/**
	 * 連絡時間帯_14_17(renraku14)
	 */
	private String renraku14;

	/**
	 * 変更内容(changeType)
	 */
	private String[] changeType;

	/**
	 * 受付確認状況(receptionConfirmSituation)
	 */
	private String[] receptionConfirmSituation;

	/**
	 * 変更希望日_変更希望日開始(kibouStartYmd)
	 */
	@CustomizeDateFormatString(pattern = "yyyyMMdd", message = "E00001", params = "{'変更希望日';'YYYYMMDD';'ご入力'}")
	private String kibouStartYmd;

	/**
	 * 変更希望日_変更希望日終了(koboEndYmd)
	 */
	@CustomizeDateFormatString(pattern = "yyyyMMdd", message = "E00001", params = "{'変更希望日';'YYYYMMDD';'ご入力'}")
	private String koboEndYmd;

	/**
	 * ページ番号(pageNo)の取得
	 * 
	 * @return pageNo
	 */
	public int getPageNo() {
		return pageNo;
	}

	/**
	 * ページ番号(pageNo)の設定
	 * 
	 * @param pageNo
	 *            int
	 */
	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}

	/**
	 * ページ件数(lineNum)の取得
	 * 
	 * @return lineNum
	 */
	public int getLineNum() {
		return lineNum;
	}

	/**
	 * ページ件数(lineNum)の設定
	 * 
	 * @param lineNum
	 *            int
	 */
	public void setLineNum(int lineNum) {
		this.lineNum = lineNum;
	}

	/**
	 * rownoStartの取得
	 * 
	 * @return rownoStart
	 */
	public int getRownoStart() {
		return rownoStart;
	}

	/**
	 * rownoStartの設定
	 * 
	 * @param rownoStart
	 *            int
	 */
	public void setRownoStart(int rownoStart) {
		this.rownoStart = rownoStart;
	}

	/**
	 * rownoStartの取得
	 * 
	 * @return rownoEnd
	 */
	public int getRownoEnd() {
		return rownoEnd;
	}

	/**
	 * rownoEndの設定
	 * 
	 * @param rownoEnd
	 *            int
	 */
	public void setRownoEnd(int rownoEnd) {
		this.rownoEnd = rownoEnd;
	}

	/**
	 * 商品区分(shohinKbn)の取得
	 * 
	 * @return shohinKbn
	 */
	public String getShohinKbn() {
		return shohinKbn;
	}

	/**
	 * 商品区分(shohinKbn)の設定
	 * 
	 * @param shohinKbn
	 *            String
	 */
	public void setShohinKbn(String shohinKbn) {
		this.shohinKbn = shohinKbn;
	}

	/**
	 * 営業課店コード(eigyoKatenCd)の取得
	 * 
	 * @return eigyoKatenCd
	 */
	public String getEigyoKatenCd() {
		return eigyoKatenCd;
	}

	/**
	 * 営業課店コード(eigyoKatenCd)の設定
	 * 
	 * @param eigyoKatenCd
	 *            String
	 */
	public void setEigyoKatenCd(String eigyoKatenCd) {
		this.eigyoKatenCd = eigyoKatenCd;
	}

	/**
	 * 代理店コード(dairitenCd)の取得
	 * 
	 * @return dairitenCd
	 */
	public String[] getDairitenCd() {
		return dairitenCd;
	}

	/**
	 * 代理店コード(dairitenCd)の設定
	 * 
	 * @param dairitenCd
	 *            String[]
	 */
	public void setDairitenCd(String[] dairitenCd) {
		this.dairitenCd = dairitenCd;
	}

	/**
	 * 証券番号(policy)の取得
	 * 
	 * @return policy
	 */
	public String getPolicy() {
		return policy;
	}

	/**
	 * 証券番号(policy)の設定
	 * 
	 * @param policy
	 *            String
	 */
	public void setPolicy(String policy) {
		this.policy = policy;
	}

	/**
	 * 契約者（カナ）(keiyakuNameKana)の取得
	 * 
	 * @return keiyakuNameKana
	 */
	public String getKeiyakuNameKana() {
		return keiyakuNameKana;
	}

	/**
	 * 契約者（カナ）(keiyakuNameKana)の設定
	 * 
	 * @param keiyakuNameKana
	 *            String
	 */
	public void setKeiyakuNameKana(String keiyakuNameKana) {
		this.keiyakuNameKana = keiyakuNameKana;
	}

	/**
	 * 契約区分(agreeType)の取得
	 * 
	 * @return agreeType
	 */
	public String[] getAgreeType() {
		return agreeType;
	}

	/**
	 * 契約区分(agreeType)の設定
	 * 
	 * @param agreeType
	 *            String[]
	 */
	public void setAgreeType(String[] agreeType) {
		this.agreeType = agreeType;
	}

	/**
	 * 変更受付番号_変更受付番号開始(henkouketsukeStartYmd)の取得
	 * 
	 * @return henkouketsukeStartYmd
	 */
	public String getHenkouketsukeStartYmd() {
		return henkouketsukeStartYmd;
	}

	/**
	 * 変更受付番号_変更受付番号開始(henkouketsukeStartYmd)の設定
	 * 
	 * @param henkouketsukeStartYmd
	 *            String
	 */
	public void setHenkouketsukeStartYmd(String henkouketsukeStartYmd) {
		this.henkouketsukeStartYmd = henkouketsukeStartYmd;
	}

	/**
	 * 変更受付番号_変更受付番号終了(henkouketsukeEndYmd)の取得
	 * 
	 * @return henkouketsukeEndYmd
	 */
	public String getHenkouketsukeEndYmd() {
		return henkouketsukeEndYmd;
	}

	/**
	 * 変更受付番号_変更受付番号終了(henkouketsukeEndYmd)の設定
	 * 
	 * @param henkouketsukeEndYmd
	 *            String
	 */
	public void setHenkouketsukeEndYmd(String henkouketsukeEndYmd) {
		this.henkouketsukeEndYmd = henkouketsukeEndYmd;
	}

	/**
	 * 受付日_変更受付日開始(uketsukeStartYmd)の取得
	 * 
	 * @return uketsukeStartYmd
	 */
	public String getUketsukeStartYmd() {
		return uketsukeStartYmd;
	}

	/**
	 * 受付日_変更受付日開始(uketsukeStartYmd)の設定
	 * 
	 * @param uketsukeStartYmd
	 *            String
	 */
	public void setUketsukeStartYmd(String uketsukeStartYmd) {
		this.uketsukeStartYmd = uketsukeStartYmd;
	}

	/**
	 * 受付日_変更受付日終了(uketsukeEndEnd)の取得
	 * 
	 * @return uketsukeEndEnd
	 */
	public String getUketsukeEndEnd() {
		return uketsukeEndEnd;
	}

	/**
	 * 受付日_変更受付日終了(uketsukeEndEnd)の設定
	 * 
	 * @param uketsukeEndEnd
	 *            String
	 */
	public void setUketsukeEndEnd(String uketsukeEndEnd) {
		this.uketsukeEndEnd = uketsukeEndEnd;
	}

	/**
	 * 連絡時間帯_指定なし(renrakuNone)の取得
	 * 
	 * @return renrakuNone
	 */
	public String getRenrakuNone() {
		return renrakuNone;
	}

	/**
	 * 連絡時間帯_指定なし(renrakuNone)の設定
	 * 
	 * @param renrakuNone
	 *            String
	 */
	public void setRenrakuNone(String renrakuNone) {
		this.renrakuNone = renrakuNone;
	}

	/**
	 * 連絡時間帯_午前中(renrakuAM)の取得
	 * 
	 * @return renrakuAM
	 */
	public String getRenrakuAM() {
		return renrakuAM;
	}

	/**
	 * 連絡時間帯_午前中(renrakuAM)の設定
	 * 
	 * @param renrakuAM
	 *            String
	 */
	public void setRenrakuAM(String renrakuAM) {
		this.renrakuAM = renrakuAM;
	}

	/**
	 * 連絡時間帯_12_14(renraku12)の取得
	 * 
	 * @return renraku12
	 */
	public String getRenraku12() {
		return renraku12;
	}

	/**
	 * 連絡時間帯_12_14(renraku12)の設定
	 * 
	 * @param renraku12
	 *            String
	 */
	public void setRenraku12(String renraku12) {
		this.renraku12 = renraku12;
	}

	/**
	 * 連絡時間帯_14_17(renraku14)の取得
	 * 
	 * @return renraku14
	 */
	public String getRenraku14() {
		return renraku14;
	}

	/**
	 * 連絡時間帯_14_17(renraku14)の設定
	 * 
	 * @param renraku14
	 *            String
	 */
	public void setRenraku14(String renraku14) {
		this.renraku14 = renraku14;
	}

	/**
	 * 変更内容(changeType)の取得
	 * 
	 * @return changeType
	 */
	public String[] getChangeType() {
		return changeType;
	}

	/**
	 * 変更内容(changeType)の設定
	 * 
	 * @param changeType
	 *            String[]
	 */
	public void setChangeType(String[] changeType) {
		this.changeType = changeType;
	}

	/**
	 * 受付確認状況(receptionConfirmSituation)の取得
	 * 
	 * @return receptionConfirmSituation
	 */
	public String[] getReceptionConfirmSituation() {
		return receptionConfirmSituation;
	}

	/**
	 * 受付確認状況(receptionConfirmSituation)の設定
	 * 
	 * @param receptionConfirmSituation
	 *            String[]
	 */
	public void setReceptionConfirmSituation(String[] receptionConfirmSituation) {
		this.receptionConfirmSituation = receptionConfirmSituation;
	}

	/**
	 * 変更希望日_変更希望日開始(kibouStartYmd)の取得
	 * 
	 * @return kibouStartYmd
	 */
	public String getKibouStartYmd() {
		return kibouStartYmd;
	}

	/**
	 * 変更希望日_変更希望日開始(kibouStartYmd)の設定
	 * 
	 * @param kibouStartYmd
	 *            String
	 */
	public void setKibouStartYmd(String kibouStartYmd) {
		this.kibouStartYmd = kibouStartYmd;
	}

	/**
	 * 変更希望日_変更希望日終了(koboEndYmd)の取得
	 * 
	 * @return koboEndYmd
	 */
	public String getKoboEndYmd() {
		return koboEndYmd;
	}

	/**
	 * 変更希望日_変更希望日終了(koboEndYmd)の設定
	 * 
	 * @param koboEndYmd
	 *            String
	 */
	public void setKoboEndYmd(String koboEndYmd) {
		this.koboEndYmd = koboEndYmd;
	}

}
