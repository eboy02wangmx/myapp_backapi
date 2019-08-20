package jp.co.myapp.api.app.request;

import java.io.Serializable;

import jp.co.myapp.api.domain.validate.annotation.CustomizeTypeSizeStringArrays;

public class InsuranceListRequest implements Serializable {
	private static final long serialVersionUID = -6161023824114095222L;
	/**
	 * ページ番号
	 */
	private Integer pageNo;
	/**
	 * ページ件数
	 */
	private Integer recCount;
	/**
	 * 営業課店コード(salesCode)
	 */
	@CustomizeTypeSizeStringArrays(max = 4, regexp = "^[0-9]*$", message = "E00001", params = "{'営業課店';'半角数字4桁まで';'ご入力して'}")
	private String[] salesCode;
	/**
	 * 代理店コード(agentCode)
	 */
	@CustomizeTypeSizeStringArrays(max = 10, regexp = "^[0-9]*$", message = "E00001", params = "{'代理店';'半角数字10桁まで';'ご入力して'}")
	private String[] agentCode;
	
	/**
     * 代理店コードSQL(agentCodeSql)
     */
    private String agentCodeSql;
    
	/**
	 * 申込依頼No_From
	 */
	private String entry_noFrom;
	/**
	 * 申込依頼No_To
	 */
	private String entry_noTo;
	/**
	 * 証券番号
	 */
	private String policy;
	/**
	 * 保険始期日_From
	 */
	private String shiki_dateFrom;
	/**
	 * 保険始期日_To
	 */
	private String shiki_dateTo;
	/**
	 * 申込依頼日_From
	 */
	private String check_dateFrom;
	/**
	 * 申込依頼日_To
	 */
	private String check_dateTo;
	/**
	 * 契約者氏名カナ
	 */
	private String name_keiyaku_k;

	/**
	 * 区分_ペーパーレス募集
	 */
	private String paperlessType;

	/**
	 * 区分_ペーパーレス募集(paperlessType)の取得
	 * 
	 * @return paperlessType
	 */
	public String getPaperlessType() {
		return paperlessType;
	}

	/**
	 * 区分_ペーパーレス募集(paperlessType)の取得
	 * 
	 * @return paperlessType
	 */
	public void setPaperlessType(String paperlessType) {
		this.paperlessType = paperlessType;
	}

	/**
	 * ページ番号を取得する。
	 * 
	 * @return pageNo
	 */
	public Integer getPageNo() {
		return pageNo;
	}

	/**
	 * ページ番号を設定する。
	 * 
	 * @param pageNoInteger
	 */
	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
	}

	/**
	 * ページ件数を取得する。
	 * 
	 * @return recCount
	 */
	public Integer getRecCount() {
		return recCount;
	}

	/**
	 * ページ件数を設定する。
	 * 
	 * @param recCountInteger
	 */
	public void setRecCount(Integer recCount) {
		this.recCount = recCount;
	}

	/**
	 * 営業課店コード(salesCode)の取得
	 * 
	 * @return salesCode
	 */
	public String[] getSalesCode() {
		return salesCode;
	}

	/**
	 * 営業課店コード(salesCode)の設定
	 * 
	 * @param salesCode
	 *            String
	 */
	public void setSalesCode(String[] salesCode) {
		this.salesCode = salesCode;
	}

	/**
	 * 代理店コード(agentCode)の取得
	 * 
	 * @return agentCode
	 */
	public String[] getAgentCode() {
		return agentCode;
	}

	/**
	 * 代理店コード(agentCode)の設定
	 * 
	 * @param agentCode
	 *            String[]
	 */
	public void setAgentCode(String[] agentCode) {
		this.agentCode = agentCode;
	}

	/**
	 * 申込依頼No_Fromを取得する。
	 * 
	 * @return entry_noFrom
	 */
	public String getEntry_noFrom() {
		return entry_noFrom;
	}

	/**
	 * 申込依頼No_Fromを設定する。
	 * 
	 * @param entry_noFromString
	 */
	public void setEntry_noFrom(String entry_noFrom) {
		this.entry_noFrom = entry_noFrom;
	}

	/**
	 * 申込依頼No_Toを取得する。
	 * 
	 * @return entry_noTo
	 */
	public String getEntry_noTo() {
		return entry_noTo;
	}

	/**
	 * 申込依頼No_Toを設定する。
	 * 
	 * @param entry_noToString
	 */
	public void setEntry_noTo(String entry_noTo) {
		this.entry_noTo = entry_noTo;
	}

	/**
	 * 証券番号を取得する。
	 * 
	 * @return policy
	 */
	public String getPolicy() {
		return policy;
	}

	/**
	 * 証券番号を設定する。
	 * 
	 * @param policyString
	 */
	public void setPolicy(String policy) {
		this.policy = policy;
	}

	/**
	 * 保険始期日_Fromを取得する。
	 * 
	 * @return shiki_dateFrom
	 */
	public String getShiki_dateFrom() {
		return shiki_dateFrom;
	}

	/**
	 * 保険始期日_Fromを設定する。
	 * 
	 * @param shiki_dateFromString
	 */
	public void setShiki_dateFrom(String shiki_dateFrom) {
		this.shiki_dateFrom = shiki_dateFrom;
	}

	/**
	 * 保険始期日_Toを取得する。
	 * 
	 * @return shiki_dateTo
	 */
	public String getShiki_dateTo() {
		return shiki_dateTo;
	}

	/**
	 * 保険始期日_Toを設定する。
	 * 
	 * @param shiki_dateToString
	 */
	public void setShiki_dateTo(String shiki_dateTo) {
		this.shiki_dateTo = shiki_dateTo;
	}

	/**
	 * 申込依頼日_Fromを取得する。
	 * 
	 * @return check_dateFrom
	 */
	public String getCheck_dateFrom() {
		return check_dateFrom;
	}

	/**
	 * 申込依頼日_Fromを設定する。
	 * 
	 * @param check_dateFromString
	 */
	public void setCheck_dateFrom(String check_dateFrom) {
		this.check_dateFrom = check_dateFrom;
	}

	/**
	 * 申込依頼日_Toを取得する。
	 * 
	 * @return check_dateTo
	 */
	public String getCheck_dateTo() {
		return check_dateTo;
	}

	/**
	 * 申込依頼日_Toを設定する。
	 * 
	 * @param check_dateToString
	 */
	public void setCheck_dateTo(String check_dateTo) {
		this.check_dateTo = check_dateTo;
	}

	/**
	 * 契約者氏名カナを取得する。
	 * 
	 * @return name_keiyaku_k
	 */
	public String getName_keiyaku_k() {
		return name_keiyaku_k;
	}

	/**
	 * 契約者氏名カナを設定する。
	 * 
	 * @param name_keiyaku_kString
	 */
	public void setName_keiyaku_k(String name_keiyaku_k) {
		this.name_keiyaku_k = name_keiyaku_k;
	}

	/**
	 * agentCodeSqlの取得
	 * 
	 * @return agentCodeSql
	 */
	public String getAgentCodeSql() {
		return agentCodeSql;
	}

	/**
	 * agentCodeSqlの取得
	 * 
	 * @return agentCodeSql
	 */
	public void setAgentCodeSql(String agentCodeSql) {
		this.agentCodeSql = agentCodeSql;
	}
}
