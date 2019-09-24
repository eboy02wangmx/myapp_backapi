package jp.co.myapp.api.domain.model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class RiyoBody {

	private String vrInfoName;

	private String userid;

	private Date sakusehi;

	private String sakusehiDisplay;

	private Date koushinhi;

	private String koushinhiDisplay;

	private String picnum;

	public String getVrInfoName() {
		return vrInfoName;
	}

	public void setVrInfoName(String vrInfoName) {
		this.vrInfoName = vrInfoName;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public Date getSakusehi() {
		return sakusehi;
	}

	public void setSakusehi(Date sakusehi) {
		this.sakusehi = sakusehi;
	}

	public String getSakusehiDisplay() {
		if (sakusehi != null) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			sakusehiDisplay = sdf.format(sakusehi);
		}

		return sakusehiDisplay;
	}

	public void setSakusehiDisplay(String sakusehiDisplay) {
		this.sakusehiDisplay = sakusehiDisplay;
	}

	public Date getKoushinhi() {
		return koushinhi;
	}

	public void setKoushinhi(Date koushinhi) {
		this.koushinhi = koushinhi;
	}

	public String getKoushinhiDisplay() {
		if (koushinhi != null) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			koushinhiDisplay = sdf.format(koushinhi);
		}

		return koushinhiDisplay;
	}

	public void setKoushinhiDisplay(String koushinhiDisplay) {
		this.koushinhiDisplay = koushinhiDisplay;
	}

	public String getPicnum() {
		return picnum;
	}

	public void setPicnum(String picnum) {
		this.picnum = picnum;
	}

}
