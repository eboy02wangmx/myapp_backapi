package jp.co.myapp.api.app.request;

import java.io.Serializable;

public class UserCreateRequest implements Serializable {

	private static final long serialVersionUID = 2222222L;

	private String userid;

	private String name;

	private String password;

	private String customid;

	private String loginid;

	private String planname;

	private String soshikime;

	private String address;

	private String tel;

	private String tantobusho;

	private String tantosha;

	private String mail;

	private String keiyakuhi;

	private String keiyakushiki;

	private String keiyakushuki;

	public String getSoshikime() {
		return soshikime;
	}

	public void setSoshikime(String soshikime) {
		this.soshikime = soshikime;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getTantobusho() {
		return tantobusho;
	}

	public void setTantobusho(String tantobusho) {
		this.tantobusho = tantobusho;
	}

	public String getTantosha() {
		return tantosha;
	}

	public void setTantosha(String tantosha) {
		this.tantosha = tantosha;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getKeiyakuhi() {
		return keiyakuhi;
	}

	public void setKeiyakuhi(String keiyakuhi) {
		this.keiyakuhi = keiyakuhi;
	}

	public String getKeiyakushiki() {
		return keiyakushiki;
	}

	public void setKeiyakushiki(String keiyakushiki) {
		this.keiyakushiki = keiyakushiki;
	}

	public String getKeiyakushuki() {
		return keiyakushuki;
	}

	public void setKeiyakushuki(String keiyakushuki) {
		this.keiyakushuki = keiyakushuki;
	}

	public String getPlanname() {
		return planname;
	}

	public void setPlanname(String planname) {
		this.planname = planname;
	}

	public String getLoginid() {
		return loginid;
	}

	public void setLoginid(String loginid) {
		this.loginid = loginid;
	}

	public String getCustomid() {
		return customid;
	}

	public void setCustomid(String customid) {
		this.customid = customid;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
