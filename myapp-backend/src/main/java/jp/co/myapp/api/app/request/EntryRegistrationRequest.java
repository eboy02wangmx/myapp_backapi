package jp.co.myapp.api.app.request;

import java.io.Serializable;

import jp.co.myapp.api.domain.validate.annotation.CustomizeNoEmpty;
import jp.co.myapp.api.domain.validate.annotation.CustomizeTypeSizeString;


@SuppressWarnings("serial")
public class EntryRegistrationRequest implements Serializable {

    /**
     * 商品区分(goods_type)
     */
    private String goodsType;
    
    /**
     * 申込依頼No(entry_no)
     */
    @CustomizeTypeSizeString(max=6, regexp="", message="E00001", params="{entryNo.label;entryNo.type;input.event}")
    private String entryNo;

	/**
	 * 証券番号(policyNo)
	 */
    @CustomizeNoEmpty(message="E00002", params="{policy.label;input.event}")
	@CustomizeTypeSizeString(max = 11, regexp = "^[a-zA-Z0-9]*$", params = "{policy.label;policy.type;input.event}", message = "E00001")
	private String policyNo;


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
	 * 証券番号(policyNo)の取得
	 * 
	 * @return policyNo
	 */
	public String getPolicyNo() {
		return policyNo;
	}

	/**
	 * 証券番(policyNo)号の設定
	 * 
	 * @param policyNo
	 *            String
	 */
	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}

}
