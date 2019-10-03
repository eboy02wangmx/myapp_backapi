package jp.co.myapp.api.domain.model;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class Contract {

	private Integer id;

	private String name;

	private Integer uploadNum;

	private BigDecimal money;

	private String moneyDisplay;

	private Integer pv;

	private Integer status;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getUploadNum() {
		return uploadNum;
	}

	public void setUploadNum(Integer uploadNum) {
		this.uploadNum = uploadNum;
	}

	public BigDecimal getMoney() {
		return money;
	}

	public void setMoney(BigDecimal money) {
		this.money = money;
	}

	public String getMoneyDisplay() {
		if (money != null) {
			DecimalFormat decimalFormat = new DecimalFormat("###,###");
			moneyDisplay = decimalFormat.format(money);
		}

		return moneyDisplay;
	}

	public void setMoneyDisplay(String moneyDisplay) {
		this.moneyDisplay = moneyDisplay;
	}

	public Integer getPv() {
		return pv;
	}

	public void setPv(Integer pv) {
		this.pv = pv;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

}
