package jp.co.myapp.api.domain.model;

import java.io.Serializable;
import java.util.List;

import jp.co.myapp.api.app.data.AbstractResultData;
import jp.co.myapp.util.StringUtil;

public class UserInfoBean extends AbstractResultData implements Serializable {

	private static final long serialVersionUID = -7752140496364907417L;

	private String planname;

	private String name;

	private String soshikime;

	private String address;

	private String tel;

	private String tantobusho;

	private String tantosha;

	private String mail;

	private String remail;

	private String keiyakuhi;

	private String keiyakushiki;

	private String keiyakushuki;

	public String getKeiyakushuki() {
		return keiyakushuki;
	}

	public void setKeiyakushuki(String keiyakushuki) {
		this.keiyakushuki = keiyakushuki;
	}

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

	public String getRemail() {
		if (!StringUtil.isNull(mail)) {
			remail = mail;
		}

		return remail;
	}

	public void setRemail(String remail) {
		this.remail = remail;
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

	private List<String> userplans;

	public List<String> getUserplans() {
		return userplans;
	}

	public void setUserplans(List<String> userplans) {
		this.userplans = userplans;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPlanname() {
		return planname;
	}

	public void setPlanname(String planname) {
		this.planname = planname;
	}

}