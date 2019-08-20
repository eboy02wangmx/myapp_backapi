package jp.co.myapp.api.app.request;

import java.io.Serializable;

import jp.co.myapp.api.domain.validate.annotation.CustomizeDateFormatString;
import jp.co.myapp.api.domain.validate.annotation.CustomizeDateTimeLimitString;
import jp.co.myapp.api.domain.validate.annotation.CustomizeTypeSizeString;
import jp.co.myapp.api.domain.validate.annotation.CustomizeTypeSizeStringArrays;

public class EntryTempSaveSearchRequest implements Serializable {

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
	 * 代理店コード
	 */
	private String agentCodeSql;

	/**
	 * 申込依頼№(entryNo)
	 */
	@CustomizeTypeSizeString(max = 6, regexp = "^(\\s&&[^\\f\\n\\r\\t\\v])*|^[a-zA-Z0-9]+$", message = "E00001", params = "{'申込依頼No.';'半角文字6桁まで';'ご入力'}")
	private String entryNo;

	/**
	 * 契約者氏名カナ
	 */
	@CustomizeTypeSizeString(max = 60, regexp = "^[\\u30A0-\\u30FF-\\u3000]+$", message = "E00001", params = "{'契約者氏名カナ';'全角カナ60桁まで';'ご入力'}")
	private String contractorNameKana;

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
	 * 火災保険支払方法(firePaymentMethod)
	 */
	private String[] firePaymentMethod;

	/**
	 * 地震保険支払方法(earthquakePaymentMethod)
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
	 * 削除区分
	 */
	private String[] deleteFlag;

	/**
	 * 見送り
	 */
	private String[] escort;

	/**
	 * 削除区分設定
	 */
	private String deleteType;

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
	 * 申込ステータス(state)
	 */
	private String[] entryStatus;

	/**
	 * 点検実施区分(inspectionType)
	 */
	private String[] inspectionType;

	/**
	 * 見積連番開始
	 */
	@CustomizeTypeSizeString(max = 6, regexp = "^(\\s&&[^\\f\\n\\r\\t\\v])*|^[a-zA-Z0-9]+$", message = "E00001", params = "{'見積連番開始';'半角文字6桁まで';'ご入力して'}")
	private String quotationSerialFrom;

	/**
	 * 見積連番終了
	 */
	@CustomizeTypeSizeString(max = 6, regexp = "^(\\s&&[^\\f\\n\\r\\t\\v])*|^[a-zA-Z0-9]+$", message = "E00001", params = "{'見積連番終了';'半角文字6桁まで';'ご入力して'}")
	private String quotationSerialTo;

	/**
	 * 登録日(更新日)開始
	 */
	@CustomizeDateFormatString(pattern = "yyyyMMdd", message = "E00001", params = "{'登録日(更新日)From';'日付';'ご入力'}")
	private String createDateFrom;

	/**
	 * 登録日(更新日)終了
	 */
	@CustomizeDateFormatString(pattern = "yyyyMMdd", message = "E00001", params = "{'登録日(更新日)From';'日付';'ご入力'}")
	private String createDateTo;

	/**
	 * 証券番号
	 */
	@CustomizeTypeSizeString(max = 11, regexp = "^(\\s&&[^\\f\\n\\r\\t\\v])*|^[a-zA-Z0-9]+$", params = "{'証券番号';'半角文字11桁まで';'ご入力'}", message = "E00001")
	private String policyNo;

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
	 * @param startDateTo
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
	 * 地震保険支払方法(firePaymentMethod)の取得
	 * 
	 * @return firePaymentMethod
	 */
	public String[] getFirePaymentMethod() {
		return firePaymentMethod;
	}

	/**
	 * 地震保険支払方法(firePaymentMethod)の取得
	 * 
	 * @return firePaymentMethod
	 */
	public void setFirePaymentMethod(String[] firePaymentMethod) {
		this.firePaymentMethod = firePaymentMethod;
	}

	/**
	 * 火災保険支払方法(earthquakePaymentMethod)の取得
	 * 
	 * @return earthquakePaymentMethod
	 */
	public String[] getEarthquakePaymentMethod() {
		return earthquakePaymentMethod;
	}

	/**
	 * 火災保険支払方法(earthquakePaymentMethod)の取得
	 * 
	 * @return earthquakePaymentMethod
	 */
	public void setEarthquakePaymentMethod(String[] earthquakePaymentMethod) {
		this.earthquakePaymentMethod = earthquakePaymentMethod;
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
	 * @return the entryNo
	 */
	public String getEntryNo() {
		return entryNo;
	}

	/**
	 * @param entryNo
	 *            the entryNo to set
	 */
	public void setEntryNo(String entryNo) {
		this.entryNo = entryNo;
	}

	/**
	 * @return the deleteFlag
	 */
	public String[] getDeleteFlag() {
		return deleteFlag;
	}

	/**
	 * @param deleteFlag
	 *            the deleteFlag to set
	 */
	public void setDeleteFlag(String[] deleteFlag) {
		this.deleteFlag = deleteFlag;
	}

	/**
	 * @return the escort
	 */
	public String[] getEscort() {
		return escort;
	}

	/**
	 * @param escort
	 *            the escort to set
	 */
	public void setEscort(String[] escort) {
		this.escort = escort;
	}

	/**
	 * @return the entryStatus
	 */
	public String[] getEntryStatus() {
		return entryStatus;
	}

	/**
	 * @param entryStatus
	 *            the entryStatus to set
	 */
	public void setEntryStatus(String[] entryStatus) {
		this.entryStatus = entryStatus;
	}

	/**
	 * @return the inspectionType
	 */
	public String[] getInspectionType() {
		return inspectionType;
	}

	/**
	 * @param inspectionType
	 *            the inspectionType to set
	 */
	public void setInspectionType(String[] inspectionType) {
		this.inspectionType = inspectionType;
	}

	/**
	 * @return the deleteType
	 */
	public String getDeleteType() {
		return deleteType;
	}

	/**
	 * @param deleteType
	 *            the deleteType to set
	 */
	public void setDeleteType(String deleteType) {
		this.deleteType = deleteType;
	}

	/**
	 * 見積連番開始(quotationSerialFrom)の取得
	 * 
	 * @return quotationSerialFrom
	 */
	public String getQuotationSerialFrom() {
		return quotationSerialFrom;
	}

	/**
	 * 見積連番開始(quotationSerialFrom)の取得
	 * 
	 * @return quotationSerialFrom
	 */
	public void setQuotationSerialFrom(String quotationSerialFrom) {
		this.quotationSerialFrom = quotationSerialFrom;
	}

	/**
	 * 見積連番終了(quotationSerialTo)の取得
	 * 
	 * @return quotationSerialTo
	 */
	public String getQuotationSerialTo() {
		return quotationSerialTo;
	}

	/**
	 * 見積連番終了(quotationSerialTo)の取得
	 * 
	 * @return quotationSerialTo
	 */
	public void setQuotationSerialTo(String quotationSerialTo) {
		this.quotationSerialTo = quotationSerialTo;
	}

	/**
	 * 登録日(更新日)開始(createDateFrom)の取得
	 * 
	 * @return createDateFrom
	 */
	public String getCreateDateFrom() {
		return createDateFrom;
	}

	/**
	 * 登録日(更新日)開始(createDateFrom)の取得
	 * 
	 * @return createDateFrom
	 */
	public void setCreateDateFrom(String createDateFrom) {
		this.createDateFrom = createDateFrom;
	}

	/**
	 * 登録日(更新日)終了(createDateTo)の取得
	 * 
	 * @return createDateTo
	 */
	public String getCreateDateTo() {
		return createDateTo;
	}

	/**
	 * 登録日(更新日)終了(createDateTo)の取得
	 * 
	 * @return createDateTo
	 */
	public void setCreateDateTo(String createDateTo) {
		this.createDateTo = createDateTo;
	}

	/**
	 * 証券番号(policyNo)の取得
	 * 
	 * @return policyNo
	 */
	public String getPolicyNo() {
		return policyNo;
	}

	/**
	 * 証券番号(policyNo)の取得
	 * 
	 * @return policyNo
	 */
	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
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
