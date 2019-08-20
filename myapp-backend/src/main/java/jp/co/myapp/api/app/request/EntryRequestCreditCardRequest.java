package jp.co.myapp.api.app.request;

import java.io.Serializable;

@SuppressWarnings("serial")
public class EntryRequestCreditCardRequest implements Serializable {

	/**
	 * 保険始期日(startDate)
	 */
	private String startDate;
	
	/**
	 * カード会社(cardCompany)
	 */
	private String cardCompany;

	/**
	 * クレジットカード番号1(creditCardNumber1)
	 */
	private String creditCardNumber1;

	/**
	 * クレジットカード番号2(creditCardNumber2)
	 */
	private String creditCardNumber2;

	/**
	 * クレジットカード番号3(creditCardNumber3)
	 */
	private String creditCardNumber3;

	/**
	 * クレジットカード番号4(creditCardNumber4)
	 */
	private String creditCardNumber4;

	/**
	 * クレジットカード有効期限(creditCardExpirationDate)
	 */
	private String creditCardExpirationDate;


	/**
	 * 保険始期日(startDate)の取得
	 * @return startDate
	 */
	public String getStartDate() {
	    return startDate;
	}

	/**
	 * 保険始期日(startDate)の設定
	 * @param startDate String
	 */
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	
	/**
	 * カード会社(cardCompany)の取得
	 * @return cardCompany
	 */
	public String getCardCompany() {
	    return this.cardCompany;
	}
	/**
	 * カード会社(cardCompany)の設定
	 * @param cardCompany String
	 */
	public void setCardCompany(String cardCompany) {
	    this.cardCompany = cardCompany;
	}

	/**
	 * クレジットカード番号1(creditCardNumber1)の取得
	 * @return creditCardNumber1
	 */
	public String getCreditCardNumber1() {
	    return this.creditCardNumber1;
	}
	/**
	 * クレジットカード番号(creditCardNumber1)の設定
	 * @param creditCardNumber1 String
	 */
	public void setCreditCardNumber1(String creditCardNumber1) {
	    this.creditCardNumber1 = creditCardNumber1;
	}

	/**
	 * クレジットカード番号2(creditCardNumber2)の取得
	 * @return creditCardNumber2
	 */
	public String getCreditCardNumber2() {
	    return this.creditCardNumber2;
	}
	/**
	 * クレジットカード番号(creditCardNumber2)の設定
	 * @param creditCardNumber2 String
	 */
	public void setCreditCardNumber2(String creditCardNumber2) {
	    this.creditCardNumber2 = creditCardNumber2;
	}

	/**
	 * クレジットカード番号3(creditCardNumber3)の取得
	 * @return creditCardNumber3
	 */
	public String getCreditCardNumber3() {
	    return this.creditCardNumber3;
	}
	/**
	 * クレジットカード番号(creditCardNumber3)の設定
	 * @param creditCardNumber3 String
	 */
	public void setCreditCardNumber3(String creditCardNumber3) {
	    this.creditCardNumber3 = creditCardNumber3;
	}

	/**
	 * クレジットカード番号4(creditCardNumber4)の取得
	 * @return creditCardNumber4
	 */
	public String getCreditCardNumber4() {
	    return this.creditCardNumber4;
	}
	/**
	 * クレジットカード番号(creditCardNumber4)の設定
	 * @param creditCardNumber4 String
	 */
	public void setCreditCardNumber4(String creditCardNumber4) {
	    this.creditCardNumber4 = creditCardNumber4;
	}

	/**
	 * クレジットカード有効期限(creditCardExpirationDate)の取得
	 * @return creditCardExpirationDate
	 */
	public String getCreditCardExpirationDate() {
	    return this.creditCardExpirationDate;
	}
	/**
	 * クレジットカード有効期限(creditCardExpirationDate)の設定
	 * @param creditCardExpirationDate String
	 */
	public void setCreditCardExpirationDate(String creditCardExpirationDate) {
	    this.creditCardExpirationDate = creditCardExpirationDate;
	}

}
