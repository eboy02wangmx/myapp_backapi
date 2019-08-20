package jp.co.myapp.api.app.request;

import java.io.Serializable;

import jp.co.myapp.api.domain.validate.annotation.CustomizeNoEmpty;
import jp.co.myapp.api.domain.validate.annotation.CustomizeTypeSizeString;


@SuppressWarnings("serial")
public class EntrySaveTempRequest implements Serializable {

    /**
     * 申込依頼No(entry_no)
     */
    @CustomizeNoEmpty(message="E00002", params="{entryNo.label;input.event}")
    @CustomizeTypeSizeString(max=6, regexp="", message="E00001", params="{entryNo.label;entryNo.type;input.event}")
    private String entryNo;

    /**
     * メールアドレス(mail)
     */
    @CustomizeNoEmpty(message="E00002", params="{mail.label;input.event}")
    @CustomizeTypeSizeString(max=254, regexp="", message="E00001", params="{mail.label;mail.type;input.event}")
    private String mail;
    
    /**
     * 申込区分(entryType)
     */
    @CustomizeNoEmpty(message="E00002", params="{entryType.label;input.event}")
    private String entryType;

    /**
     * 代理店コード(agentCode)
     */
//    @CustomizeNoEmpty(message="E00002", params="{agentCode.label;input.event}")
    private String agentCode;
    
	/**
	* 商品区分(goods_type)
	*/
	@CustomizeTypeSizeString(max = 1, regexp = "", message = "E00001", params = "{goodsType.label;max.1;enter.event}")
	private String goodsType;

	/**
	* システム時間
	*/
	@CustomizeTypeSizeString(max = 21, regexp = "", message = "E00001", params = "{systemDate.label;max.21;enter.event}")
	private String systemDate;

    /**
     * 申込依頼No(entry_no)の取得
     * @return entryNo
     */
    public String getEntryNo() {
        return entryNo;
    }
    /**
     * 申込依頼No(entry_no)の設定
     * @param entryNo String
     */
    public void setEntryNo(String entryNo) {
        this.entryNo = entryNo;
    }

    /**
     * メールアドレス(mail)の取得
     * @return mail
     */
    public String getMail() {
        return mail;
    }
    /**
     * メールアドレス(mail)の設定
     * @param mail String
     */
    public void setMail(String mail) {
        this.mail = mail;
    }

    /**
     * 商品区分(goods_type)の取得
     * @return goodsType
     */
    public String getGoodsType() {
        return goodsType;
    }
    /**
     * 商品区分(goods_type)の設定
     * @param goodsType String
     */
    public void setGoodsType(String goodsType) {
        this.goodsType = goodsType;
    }

    /**
     * システム時間の取得
     * @return systemDate
     */
    public String getSystemDate() {
        return systemDate;
    }
    /**
     * システム時間の設定
     * @param systemDate String
     */
    public void setSystemDate(String systemDate) {
        this.systemDate = systemDate;
    }
	public String getEntryType() {
		return entryType;
	}
	public void setEntryType(String entryType) {
		this.entryType = entryType;
	}
	public String getAgentCode() {
		return agentCode;
	}
	public void setAgentCode(String agentCode) {
		this.agentCode = agentCode;
	}

}
