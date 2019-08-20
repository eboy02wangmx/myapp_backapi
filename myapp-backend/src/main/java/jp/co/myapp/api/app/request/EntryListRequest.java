package jp.co.myapp.api.app.request;

import java.io.Serializable;

import jp.co.myapp.api.domain.validate.annotation.CustomizeDateFormatString;
import jp.co.myapp.api.domain.validate.annotation.CustomizeDateTimeLimitString;
import jp.co.myapp.api.domain.validate.annotation.CustomizeTypeSizeString;
import jp.co.myapp.api.domain.validate.annotation.CustomizeTypeSizeStringArrays;

public class EntryListRequest implements Serializable {

	private static final long serialVersionUID = 2222222L;

	/**
	 * 営業課店コード
	 */
	@CustomizeTypeSizeStringArrays(max = 4, regexp = "^[0-9]*$", message = "E00001", params = "{'営業課店';'半角数字4桁まで';'ご入力'}")
	private String[] salesCode;

	/** 
	 * 代理店コード
	 */
	@CustomizeTypeSizeStringArrays(max = 10, regexp = "^[0-9]*$", message = "E00001", params = "{'代理店';'半角数字10桁まで';'ご入力'}")
	private String[] agentCode;
	
	/** 
	 * 代理店コードSQL
	 */
	private String agentCodeSql;

	/**
	 * 証券番号
	 */
	@CustomizeTypeSizeString(max = 11, regexp = "^(\\s&&[^\\f\\n\\r\\t\\v])*|^[a-zA-Z0-9]+$", params = "{'証券番号';'半角文字11桁まで';'ご入力'}", message = "E00001")
	private String policyNo;

	/**
	 * 契約者氏名カナ
	 */
	@CustomizeTypeSizeString(max = 60, regexp = "^[\\u30A0-\\u30FF-\\u3000]+$", message = "E00001", params = "{'契約者氏名カナ';'全角カナ60桁まで';'ご入力'}")
	private String contractorNameKana;

	/**
	 * 申込日
	 */
	@CustomizeDateFormatString(pattern = "yyyyMMdd", message = "E00001", params = "{'申込日From';'日付';'ご入力'}")
	private String entryDateStart;

	/**
	 * 申込日
	 */
	@CustomizeDateFormatString(pattern = "yyyyMMdd", message = "E00001", params = "{'申込日To';'日付';'ご入力'}")
	private String entryDateEnd;

	/**
	 * 保険始期日
	 */
	@CustomizeDateFormatString(pattern = "yyyyMMdd", message = "E00001", params = "{'保険始期日From';'日付';'ご入力'}")
	private String startDateFrom;

	/**
	 * 保険始期日
	 */
	@CustomizeDateFormatString(pattern = "yyyyMMdd", message = "E00001", params = "{'保険始期日To';'日付';'ご入力'}")
	private String startDateTo;

	/**
	 * 申込区分
	 */
	private String[] entryType;

	/**
	 * 支払区分
	 */
	private String[] paymentType;

	/**
	 * 計上ステータス
	 */
	private String[] appropriationStatus;

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
	 * 商品区分(goodsType)
	 */
	private String goodsType;

	/**
	 * ユーザ権限(userAuthority)
	 */
	private String userAuthority;

	/**
	 * 火災保険支払方法(kasaiHoho)
	 */
	private String[] firePaymentMethod;

	/**
	 * 地震保険支払方法(jishinHoho)
	 */
	private String[] earthquakePaymentMethod;
	
	/**
	 * 火災保険支払方法検索用SQL文
	 */
	private String firePaymentMethodSql;

	/**
	 * 地震保険支払方法検索用SQL文
	 */
	private String earthquakePaymentMethodSql;

	/**
	 * 区分_ペーパーレス募集
	 */
	private String paperlessType;

	/**
	 * 営業課店コードの取得
	 * 
	 * @return salesCode
	 */
	public String[] getSalesCode() {
		return salesCode;
	}

	/**
	 * 営業課店コードの設定
	 * 
	 * @param salesCode
	 *            String
	 */
	public void setSalesCode(String[] salesCode) {
		this.salesCode = salesCode;
	}

	/**
	 * 代理店コードの取得
	 * 
	 * @return agentCode
	 */
	public String[] getAgentCode() {
		return agentCode;
	}

	/**
	 * 代理店コードの設定
	 * 
	 * @param agentCode
	 *            String
	 */
	public void setAgentCode(String[] agentCode) {
		this.agentCode = agentCode;
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

	/**
	 * 証券番号の取得
	 * 
	 * @return policyNo
	 */
	public String getPolicyNo() {
		return policyNo;
	}

	/**
	 * 証券番号の設定
	 * 
	 * @param policyNo
	 *            String
	 */
	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}

	/**
	 * 契約者氏名カナの取得
	 * 
	 * @return contractorNameKana
	 */
	public String getContractorNameKana() {
		return contractorNameKana;
	}

	/**
	 * 契約者氏名カナの設定
	 * 
	 * @param contractorNameKana
	 *            String
	 */
	public void setContractorNameKana(String contractorNameKana) {
		this.contractorNameKana = contractorNameKana;
	}

	/**
	 * 申込日の取得
	 * 
	 * @return entryDateStart
	 */
	public String getEntryDateStart() {
		return entryDateStart;
	}

	/**
	 * 申込日の設定
	 * 
	 * @param entryDateStart
	 *            String
	 */
	public void setEntryDateStart(String entryDateStart) {
		this.entryDateStart = entryDateStart;
	}

	/**
	 * 申込日の取得
	 * 
	 * @return entryDateEnd
	 */
	public String getEntryDateEnd() {
		return entryDateEnd;
	}

	/**
	 * 申込日の設定
	 * 
	 * @param entryDateEnd
	 *            String
	 */
	public void setEntryDateEnd(String entryDateEnd) {
		this.entryDateEnd = entryDateEnd;
	}

	/**
	 * 保険始期日の取得
	 * 
	 * @return startDateFrom
	 */
	public String getStartDateFrom() {
		return startDateFrom;
	}

	/**
	 * 保険始期日の設定
	 * 
	 * @param startDateFrom
	 *            String
	 */
	public void setStartDateFrom(String startDateFrom) {
		this.startDateFrom = startDateFrom;
	}

	/**
	 * 保険始期日の取得
	 * 
	 * @return startDateTo
	 */
	public String getStartDateTo() {
		return startDateTo;
	}

	/**
	 * 保険始期日の設定
	 * 
	 * @param shikiDateTo
	 *            String
	 */
	public void setStartDateTo(String startDateTo) {
		this.startDateTo = startDateTo;
	}

	/**
	 * 申込区分の取得
	 * 
	 * @return entryType
	 */
	public String[] getEntryType() {
		return entryType;
	}

	/**
	 * 申込区分の設定
	 * 
	 * @param entryType
	 *            String
	 */
	public void setEntryType(String[] entryType) {
		this.entryType = entryType;
	}

	/**
	 * 支払区分の取得
	 * 
	 * @return paymentType
	 */
	public String[] getPaymentType() {
		return paymentType;
	}

	/**
	 * 支払区分の設定
	 * 
	 * @param paymentType
	 *            String
	 */
	public void setPaymentType(String[] paymentType) {
		this.paymentType = paymentType;
	}

	/**
	 * 計上ステータスの取得
	 * 
	 * @return appropriationStatus
	 */
	public String[] getAppropriationStatus() {
		return appropriationStatus;
	}

	/**
	 * 計上ステータスの設定
	 * 
	 * @param appropriationStatus
	 *            String
	 */
	public void setAppropriationStatus(String[] appropriationStatus) {
		this.appropriationStatus = appropriationStatus;
	}

	/**
	 * pageSizeの取得
	 * 
	 * @return pageSize
	 */
	public int getPageSize() {
		return pageSize;
	}

	/**
	 * pageSizeの設定
	 * 
	 * @param pageSize
	 *            int
	 */
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	/**
	 * currentPageの取得
	 * 
	 * @return currentPage
	 */
	public int getCurrentPage() {
		return currentPage;
	}

	/**
	 * currentPageの設定
	 * 
	 * @param currentPage
	 *            int
	 */
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
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
	 * 商品区分(goodsType)の取得
	 * 
	 * @return goodsType
	 */
	public String getGoodsType() {
		return goodsType;
	}

	/**
	 * 商品区分(goodsType)の設定
	 * 
	 * @param goodsType
	 *            String
	 */
	public void setGoodsType(String goodsType) {
		this.goodsType = goodsType;
	}

	/**
	 * ユーザ権限(userAuthority)の取得
	 * 
	 * @return userAuthority
	 */
	public String getUserAuthority() {
		return userAuthority;
	}

	/**
	 * ユーザ権限(userAuthority)の設定
	 * 
	 * @param userAuthority
	 *            String
	 */
	public void setUserAuthority(String userAuthority) {
		this.userAuthority = userAuthority;
	}

	/**
	 * 地震保険支払方法(earthquakePaymentMethod)の取得
	 * 
	 * @return earthquakePaymentMethod
	 */
	public String[] getEarthquakePaymentMethod() {
		return earthquakePaymentMethod;
	}

	/**
	 * 地震保険支払方法(earthquakePaymentMethod)の取得
	 * 
	 * @return earthquakePaymentMethod
	 */
	public void setEarthquakePaymentMethod(String[] earthquakePaymentMethod) {
		this.earthquakePaymentMethod = earthquakePaymentMethod;
	}

	/**
	 * 火災保険支払方法(firePaymentMethod)の取得
	 * 
	 * @return firePaymentMethod
	 */
	public String[] getFirePaymentMethod() {
		return firePaymentMethod;
	}

	/**
	 * 火災保険支払方法(firePaymentMethod)の取得
	 * 
	 * @return firePaymentMethod
	 */
	public void setFirePaymentMethod(String[] firePaymentMethod) {
		this.firePaymentMethod = firePaymentMethod;
	}
	
	/**
	 * 火災保険支払方法検索用SQL(firePaymentMethodSql)の取得
	 * 
	 * @return firePaymentMethodSql
	 */
	public String getFirePaymentMethodSql() {
		return firePaymentMethodSql;
	}

	/**
	 * 火災保険支払方法検索用SQL(firePaymentMethodSql)の取得
	 * 
	 * @return firePaymentMethodSql
	 */
	public void setFirePaymentMethodSql(String firePaymentMethodSql) {
		this.firePaymentMethodSql = firePaymentMethodSql;
	}

	/**
	 * 地震保険支払方法検索用SQL(earthquakePaymentMethodSql)の取得
	 * 
	 * @return earthquakePaymentMethodSql
	 */
	public String getEarthquakePaymentMethodSql() {
		return earthquakePaymentMethodSql;
	}

	/**
	 * 地震保険支払方法検索用SQL(earthquakePaymentMethodSql)の取得
	 * 
	 * @return earthquakePaymentMethodSql
	 */
	public void setEarthquakePaymentMethodSql(String earthquakePaymentMethodSql) {
		this.earthquakePaymentMethodSql = earthquakePaymentMethodSql;
	}

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

}
