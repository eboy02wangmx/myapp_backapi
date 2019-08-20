package jp.co.myapp.api.app.request;

import java.io.Serializable;

public class EntryDetailRequest implements Serializable {

	private static final long serialVersionUID = 2222222L;

	/**
	 * 証券番号
	 */
	private String policyNo;

	/**
	 * 商品区分(goodsType)
	 */
	private String goodsType;

	/**
	 * ユーザ権限(userAuthority)
	 */
	private String userAuthority;

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

}
