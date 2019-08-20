package jp.co.myapp.api.app.request;

import java.io.Serializable;

import jp.co.myapp.api.domain.validate.annotation.CustomizeMailString;
import jp.co.myapp.api.domain.validate.annotation.CustomizeNoNull;
import jp.co.myapp.api.domain.validate.annotation.CustomizeTypeSizeString;

public class EntryNoRenotificationRequest implements Serializable {

	private static final long serialVersionUID = -3265839323589085471L;

	/**
	 * 商品区分(goodsType)
	 */
	private String goodsType;

	/**
	 * メールアドレス
	 */
    @CustomizeNoNull(message="E00002", params="{mail.label;enter.event}")
    @CustomizeTypeSizeString(max=254, regexp="", message="E00001", params="{mail.label;mail.size;enter.event}")
    @CustomizeMailString(message="E00002", params="{mail.label;correct.enter.event}")
	private String mail;

	/**
	 * メールアドレスを取得
	 * 
	 * @return メールアドレス
	 */
	public String getMail() {
		return mail;
	}

	/**
	 * メールアドレスを設定
	 * 
	 * @param mail
	 *            メールアドレス
	 */
	public void setMail(String mail) {
		this.mail = mail;
	}

	/**
	 * @return the goodsType
	 */
	public String getGoodsType() {
		return goodsType;
	}

	/**
	 * @param goodsType the goodsType to set
	 */
	public void setGoodsType(String goodsType) {
		this.goodsType = goodsType;
	}

}
