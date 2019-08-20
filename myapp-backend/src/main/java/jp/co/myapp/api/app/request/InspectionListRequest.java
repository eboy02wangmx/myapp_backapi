package jp.co.myapp.api.app.request;

import java.io.Serializable;

import jp.co.myapp.api.domain.validate.annotation.CustomizeDateFormatString;
import jp.co.myapp.api.domain.validate.annotation.CustomizeTypeSizeString;
import jp.co.myapp.api.domain.validate.annotation.CustomizeTypeSizeStringArrays;

/**
 *
 *  変更履歴:
 *                 訂正連絡一覧を追加 2019/02/15 BY 曲
 *
 */
public class InspectionListRequest implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = -5075164299552722099L;

    /**
     * 商品区分(goodsType)
     */
    private String goodsType;

    /**
     * 営業課店コード(salesCode)
     */
    @CustomizeTypeSizeString(max = 4, regexp = "^[0-9]*$", message = "E00001", params = "{'営業課店';'半角数字4桁まで';'ご入力して'}")
    private String salesCode;

    /**
     * 訂正連絡一覧.営業課店コード(paperlessSalesCode)
     */
    @CustomizeTypeSizeStringArrays(max = 4, regexp = "^[0-9]*$", message = "E00001", params = "{'営業課店';'半角数字4桁まで';'ご入力して'}")
    private String[] paperlessSalesCode;

    /**
     * 代理店コード(agentCode)
     */
    @CustomizeTypeSizeStringArrays(max = 10, regexp = "^[0-9]*$", message = "E00001", params = "{'代理店';'半角数字10桁まで';'ご入力して'}")
    private String[] agentCode;
    
    /**
     * 代理店コードSql(agentCodeSql)
     */
    private String agentCodeSql;

    /**
     * 申込依頼NO(entryNo)
     */
    @CustomizeTypeSizeString(max = 6, regexp = "^(\\s&&[^\\f\\n\\r\\t\\v])*|^[a-zA-Z0-9]+$", message = "E00001", params = "{'申込依頼No.';'半角文字6桁まで';'ご入力して'}")
    private String entryNo;

    /**
     * 契約者氏名カナ(contractorNameKana)
     */
    @CustomizeTypeSizeString(max = 60, regexp = "^[\\u30A0-\\u30FF-\\u3000]*$", message = "E00001", params = "{'契約者氏名カナ';'全角カナ60桁まで';'ご入力して'}")
    private String contractorNameKana;

    /**
     * 申込依頼日From(reviewRequestDateFrom)
     */
    @CustomizeDateFormatString(pattern = "yyyyMMdd",  message = "E00001", params="{'申込依頼日From';'日付';'ご入力して'}")
    private String reviewRequestDateFrom;

    /**
     * 申込依頼日To(reviewRequestDateTo)
     */
    @CustomizeDateFormatString(pattern = "yyyyMMdd",  message = "E00001", params="{'申込依頼日To';'日付';'ご入力して'}")
    private String reviewRequestDateTo;

    /**
     * 保険始期日From(startDateFrom)
     */
    @CustomizeDateFormatString(pattern = "yyyyMMdd",  message = "E00001", params="{'保険始期日From';'日付';'ご入力して'}")
    private String startDateFrom;

    /**
     * 保険始期日To(startDateTo)
     */
    @CustomizeDateFormatString(pattern = "yyyyMMdd",  message = "E00001", params="{'保険始期日To';'日付';'ご入力して'}")
    private String startDateTo;

    /**
     * 区分(entryType)
     */
    private String[] entryType;

    /**
     * 集金方法(paymentType)
     */
    private String[] paymentType;

    /**
     * 火災保険払込方法(firePaymentMethod)
     */
    private String[] firePaymentMethod;

    /**
     * 地震保険払込方法(earthquakePaymentMethod)
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
     * ステータス(entryStatus)
     */
    private String[] entryStatus;

    /**
     * 見送り(escort)
     */
    private String[] escort;

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

    // 訂正連絡一覧を追加 2019/02/15 ADD START
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
    private String policy;

    // 訂正連絡一覧を追加 2019/02/15 ADD END

    /**
     * 口座振替(accountTransfer)
     */
    private String[] accountTransfer;

	/**
	 * 区分_ペーパーレス募集
	 */
	private String paperlessType;

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
     * 営業課店コード(salesCode)の取得
     * @return salesCode
     */
    public String getSalesCode() {
        return salesCode;
    }
    /**
     * 営業課店コード(salesCode)の設定
     * @param salesCode String
     */
    public void setSalesCode(String salesCode) {
        this.salesCode = salesCode;
    }

    /**
     * 訂正連絡一覧.営業課店コード(paperlessSalesCode)の取得
     * @return paperlessSalesCode
     */
    public String[] getPaperlessSalesCode() {
        return paperlessSalesCode;
    }
    /**
     * 訂正連絡一覧.営業課店コード(paperlessSalesCode)の設定
     * @param paperlessSalesCode String
     */
    public void setPaperlessSalesCode(String[] paperlessSalesCode) {
        this.paperlessSalesCode = paperlessSalesCode;
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
     * 申込依頼NO(entryNo)の取得
     * @return entryNo
     */
    public String getEntryNo() {
        return entryNo;
    }
    /**
     * 申込依頼NO(entryNo)の設定
     * @param entryNo String
     */
    public void setEntryNo(String entryNo) {
        this.entryNo = entryNo;
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
     * 区分(entryType)の取得
     * @return entryType
     */
    public String[] getEntryType() {
        return entryType;
    }
    /**
     * 区分(entryType)の設定
     * @param entryType String[]
     */
    public void setEntryType(String[] entryType) {
        this.entryType = entryType;
    }

    /**
     * 集金方法(paymentType)の取得
     * @return paymentType
     */
    public String[] getPaymentType() {
        return paymentType;
    }
    /**
     * 集金方法(paymentType)の設定
     * @param paymentType String[]
     */
    public void setPaymentType(String[] paymentType) {
        this.paymentType = paymentType;
    }

    /**
     * 火災保険払込方法(firePaymentMethod)の取得
     * @return firePaymentMethod
     */
    public String[] getFirePaymentMethod() {
        return firePaymentMethod;
    }
    /**
     * 火災保険払込方法(firePaymentMethod)の設定
     * @param firePaymentMethod String[]
     */
    public void setFirePaymentMethod(String[] firePaymentMethod) {
        this.firePaymentMethod = firePaymentMethod;
    }

    /**
     * 地震保険払込方法(earthquakePaymentMethod)の取得
     * @return earthquakePaymentMethod
     */
    public String[] getEarthquakePaymentMethod() {
        return earthquakePaymentMethod;
    }
    /**
     * 地震保険払込方法(earthquakePaymentMethod)の設定
     * @param earthquakePaymentMethod String[]
     */
    public void setEarthquakePaymentMethod(String[] earthquakePaymentMethod) {
        this.earthquakePaymentMethod = earthquakePaymentMethod;
    }

    /**
     * ステータス(entryStatus)の取得
     * @return entryStatus
     */
    public String[] getEntryStatus() {
        return entryStatus;
    }
    /**
     * ステータス(entryStatus)の設定
     * @param entryStatus String[]
     */
    public void setEntryStatus(String[] entryStatus) {
        this.entryStatus = entryStatus;
    }

    /**
     * 見送り(escort)の取得
     * @return escort
     */
    public String[] getEscort() {
        return escort;
    }
    /**
     * 見送り(escort)の設定
     * @param escort String[]
     */
    public void setEscort(String[] escort) {
        this.escort = escort;
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

    // 訂正連絡一覧を追加 2019/02/15 ADD START

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
    // 訂正連絡一覧を追加 2019/02/15 ADD END

    /**
     * 口座振替(accountTransfer)の設定
     *
     * @param accountTransfer String
     */
	public String[] getAccountTransfer() {
		return accountTransfer;
	}

    /**
     * 口座振替(accountTransfer)の設定
     *
     * @param accountTransfer String
     */
	public void setAccountTransfer(String[] accountTransfer) {
		this.accountTransfer = accountTransfer;
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
