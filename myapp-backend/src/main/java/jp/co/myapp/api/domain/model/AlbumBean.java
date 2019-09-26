package jp.co.myapp.api.domain.model;

import jp.co.myapp.util.StringUtil;

public class AlbumBean {

	private Integer id;

	private String filename;

	private String bukenme;

	private String userid;

	private String yukokbn;

	private String shokusha;

	private String sakusehi;

	private String koushinhi;

	private String picnum;

	private String customid;

	private String panoPreviewUrl;

	private String domain;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCustomid() {
		return customid;
	}

	public void setCustomid(String customid) {
		this.customid = customid;
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public String getBukenme() {
		return bukenme;
	}

	public void setBukenme(String bukenme) {
		this.bukenme = bukenme;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getYukokbn() {
		return yukokbn;
	}

	public void setYukokbn(String yukokbn) {
		this.yukokbn = yukokbn;
	}

	public String getShokusha() {
		return shokusha;
	}

	public void setShokusha(String shokusha) {
		this.shokusha = shokusha;
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

	public String getPicnum() {
		return picnum;
	}

	public void setPicnum(String picnum) {
		this.picnum = picnum;
	}

	public String getPanoPreviewUrl() {
		return panoPreviewUrl;
	}

	public void setPanoPreviewUrl(String panoPreviewUrl) {
		this.panoPreviewUrl = panoPreviewUrl;
	}

	public String getDomain() {
		if (StringUtil.isNull(domain)) {
			domain = "制限なし";
		}

		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

}
