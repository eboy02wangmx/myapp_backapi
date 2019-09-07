package jp.co.myapp.api.app.request;

import java.io.Serializable;

public class AlbumCreateRequest implements Serializable {

	private static final long serialVersionUID = 2222222L;

	private String userid;

	private String bukenme;

	private String sakusehi;

	private String koushinhi;

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getBukenme() {
		return bukenme;
	}

	public void setBukenme(String bukenme) {
		this.bukenme = bukenme;
	}

	public String getSakusehi() {
		return sakusehi;
	}

	public void setSakusehi(String sakusehi) {
		this.sakusehi = sakusehi;
	}

	public String getKoushinhi() {
		return koushinhi;
	}

	public void setKoushinhi(String koushinhi) {
		this.koushinhi = koushinhi;
	}

}
