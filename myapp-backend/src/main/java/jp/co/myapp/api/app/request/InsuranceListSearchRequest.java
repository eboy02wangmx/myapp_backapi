package jp.co.myapp.api.app.request;

import java.io.Serializable;

import jp.co.myapp.api.domain.validate.annotation.CustomizeDateFormatString;
import jp.co.myapp.api.domain.validate.annotation.CustomizeDateTimeLimitString;
import jp.co.myapp.api.domain.validate.annotation.CustomizeTypeSizeString;
import jp.co.myapp.api.domain.validate.annotation.CustomizeTypeSizeStringArrays;

public class InsuranceListSearchRequest implements Serializable {
	
	private static final long serialVersionUID = -6161023824114095222L;

    /**
     * 表示件数(pageSize)
     */
    private Integer pageSize;

    /**
     * ページ番号(pageNo)
     */
    private Integer pageNo;

    /**
     * rownoStart(rownoStart)
     */
    private Integer rownoStart;

    /**
     * rownoEnd(rownoEnd)
     */
    private Integer rownoEnd;
    
    /**
     * 商品区分(goodsType)
     */
    private String goodsType;

    /**
     * 所属内務課コード(affiliationDepartmentCode)
     */
    private String affiliationDepartmentCode;    

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
     * 見積連番(entryNoFrom)
     */
    @CustomizeTypeSizeString(max = 6, regexp = "^(\\s&&[^\\f\\n\\r\\t\\v])*|^[a-zA-Z0-9]+$", message = "E00001", params = "{'見積連番開始';'半角文字6桁まで';'ご入力して'}")
    private String entryNoFrom;

    /**
     * 見積連番(entryNoTo)
     */
    @CustomizeTypeSizeString(max = 6, regexp = "^(\\s&&[^\\f\\n\\r\\t\\v])*|^[a-zA-Z0-9]+$", message = "E00001", params = "{'見積連番終了';'半角文字6桁まで';'ご入力して'}")
    private String entryNoTo;

    /**
     * 証券番号(policy)
     */
    @CustomizeTypeSizeString(max = 11, regexp = "^(\\s&&[^\\f\\n\\r\\t\\v])*|^[a-zA-Z0-9]+$", params = "{'証券番号';'半角文字11桁まで';'ご入力'}", message = "E00001")
    private String policy;

    /**
     * 保険始期日From(startDateFrom)
     */
    @CustomizeDateFormatString(pattern = "yyyyMMdd",  message = "E00001", params="{'保険始期日From';'日付';'ご入力して'}")
    @CustomizeDateTimeLimitString(min = "20190101", sysYearAfter = "1", message = "E00013", params="{'2019年1月1日';'翌年年末まで'}")
    private String startDateFrom;

    /**
     * 保険始期日To(startDateTo)
     */
    @CustomizeDateFormatString(pattern = "yyyyMMdd",  message = "E00001", params="{'保険始期日To';'日付';'ご入力して'}")
    @CustomizeDateTimeLimitString(min = "20190101",sysYearAfter = "1", message = "E00013", params="{'2019年1月1日';'翌年年末まで'}")
    private String startDateTo;
    
    /**
     * 申込依頼日From(reviewRequestDateFrom)
     */
    @CustomizeDateFormatString(pattern = "yyyyMMdd",  message = "E00001", params="{'申込依頼日From';'日付';'ご入力して'}")
    @CustomizeDateTimeLimitString(min = "20190101", sysYearAfter = "1", message = "E00013", params="{'2019年1月1日';'翌年年末まで'}")
    private String reviewRequestDateFrom;

    /**
     * 申込依頼日To(reviewRequestDateTo)
     */
    @CustomizeDateFormatString(pattern = "yyyyMMdd",  message = "E00001", params="{'申込依頼日To';'日付';'ご入力して'}")
    @CustomizeDateTimeLimitString(min = "20190101", sysYearAfter = "1", message = "E00013", params="{'2019年1月1日';'翌年年末まで'}")
    private String reviewRequestDateTo;

    /**
     * 契約者氏名カナ(contractorNameKana)
     */
    @CustomizeTypeSizeString(max = 60, regexp = "^[\\u30A0-\\u30FF-\\u3000]*$", message = "E00001", params = "{'契約者氏名カナ';'全角カナ60桁まで';'ご入力して'}")
    private String contractorNameKana;

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
     * 表示件数(pageSize)の取得
     * @return pageSize
     */
    public Integer getPageSize() {
        return pageSize;
    }
    /**
     * 表示件数(pageSize)の設定
     * @param pageSize Integer
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * ページ番号(pageNo)の取得
     * @return pageNo
     */
    public Integer getPageNo() {
        return pageNo;
    }
    /**
     * ページ番号(pageNo)の設定
     * @param pageNo Integer
     */
    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    /**
     * rownoStart(rownoStart)の取得
     * @return rownoStart
     */
    public Integer getRownoStart() {
        return rownoStart;
    }
    /**
     * rownoStart(rownoStart)の設定
     * @param rownoStart Integer
     */
    public void setRownoStart(Integer rownoStart) {
        this.rownoStart = rownoStart;
    }

    /**
     * rownoEnd(rownoEnd)の取得
     * @return rownoEnd
     */
    public Integer getRownoEnd() {
        return rownoEnd;
    }
    /**
     * rownoEnd(rownoEnd)の設定
     * @param rownoEnd Integer
     */
    public void setRownoEnd(Integer rownoEnd) {
        this.rownoEnd = rownoEnd;
    }

    /**
     * 商品区分(goodsType)の取得
     * @return goodsType
     */
    public String getGoodsType() {
        return goodsType;
    }
    /**
     * 商品区分(goodsType)の設定
     * @param goodsType String
     */
    public void setGoodsType(String goodsType) {
        this.goodsType = goodsType;
    }

    /**
     * 所属内務課コード(affiliationDepartmentCode)の取得
     * @return affiliationDepartmentCode
     */
    public String getAffiliationDepartmentCode() {
        return affiliationDepartmentCode;
    }
    /**
     * 所属内務課コード(affiliationDepartmentCode)の設定
     * @param affiliationDepartmentCode String
     */
    public void setAffiliationDepartmentCode(String affiliationDepartmentCode) {
        this.affiliationDepartmentCode = affiliationDepartmentCode;
    }

    /**
     * 営業課店コード(salesCode)の取得
     * @return salesCode
     */
    public String[] getSalesCode() {
        return salesCode;
    }
    /**
     * 営業課店コード(salesCode)の設定
     * @param salesCode String
     */
    public void setSalesCode(String[] salesCode) {
        this.salesCode = salesCode;
    }

    /**
     * 代理店コード(agentCode)の取得
     * @return agentCode
     */
    public String[] getAgentCode() {
        return agentCode;
    }
    /**
     * 代理店コード(agentCode)の設定
     * @param agentCode String[]
     */
    public void setAgentCode(String[] agentCode) {
        this.agentCode = agentCode;
    }
    
    /**
     * 見積連番開始(entryNoFrom)の取得
     *
     * @return entryNoFrom
     */
    public String getEntryNoFrom() {
        return entryNoFrom;
    }

    /**
     * 見積連番開始(entryNoFrom)の設定
     *
     * @param entryNoFrom String
     */
    public void setEntryNoFrom(String entryNoFrom) {
        this.entryNoFrom = entryNoFrom;
    }

    /**
     * 見積連番終了(entryNoTo)の取得
     *
     * @return entryNoTo
     */
    public String getEntryNoTo() {
        return entryNoTo;
    }

    /**
     * 見積連番終了(entryNoTo)の設定
     *
     * @param entryNoTo String
     */
    public void setEntryNoTo(String entryNoTo) {
        this.entryNoTo = entryNoTo;
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
     * @param policy String
     */
    public void setPolicy(String policy) {
        this.policy = policy;
    }

    /**
     * 保険始期日From(startDateFrom)の取得
     * @return startDateFrom
     */
    public String getStartDateFrom() {
        return startDateFrom;
    }
    /**
     * 保険始期日From(startDateFrom)の設定
     * @param startDateFrom String
     */
    public void setStartDateFrom(String startDateFrom) {
        this.startDateFrom = startDateFrom;
    }

    /**
     * 保険始期日To(startDateTo)の取得
     * @return startDateTo
     */
    public String getStartDateTo() {
        return startDateTo;
    }
    /**
     * 保険始期日To(startDateTo)の設定
     * @param startDateTo String
     */
    public void setStartDateTo(String startDateTo) {
        this.startDateTo = startDateTo;
    }

    /**
     * 申込依頼日From(reviewRequestDateFrom)の取得
     * @return reviewRequestDateFrom
     */
    public String getReviewRequestDateFrom() {
        return reviewRequestDateFrom;
    }
    /**
     * 申込依頼日From(reviewRequestDateFrom)の設定
     * @param reviewRequestDateFrom String
     */
    public void setReviewRequestDateFrom(String reviewRequestDateFrom) {
        this.reviewRequestDateFrom = reviewRequestDateFrom;
    }

    /**
     * 申込依頼日To(reviewRequestDateTo)の取得
     * @return reviewRequestDateTo
     */
    public String getReviewRequestDateTo() {
        return reviewRequestDateTo;
    }
    /**
     * 申込依頼日To(reviewRequestDateTo)の設定
     * @param reviewRequestDateTo String
     */
    public void setReviewRequestDateTo(String reviewRequestDateTo) {
        this.reviewRequestDateTo = reviewRequestDateTo;
    }

    /**
     * 契約者氏名カナ(contractorNameKana)の取得
     * @return contractorNameKana
     */
    public String getContractorNameKana() {
        return contractorNameKana;
    }
    /**
     * 契約者氏名カナ(contractorNameKana)の設定
     * @param contractorNameKana String
     */
    public void setContractorNameKana(String contractorNameKana) {
        this.contractorNameKana = contractorNameKana;
    }
}
