package jp.co.myapp.api.domain.model;

import java.io.Serializable;

import jp.co.myapp.api.app.data.AbstractResultData;

public class UserKanriBean extends AbstractResultData implements Serializable {
	public String getSoshikiid() {
		return soshikiid;
	}

	public void setSoshikiid(String soshikiid) {
		this.soshikiid = soshikiid;
	}

	private static final long serialVersionUID = -8103595080889462692L;

	//アカウントID
	private String userid;

    //権限 1=カスタム    2 =一般ユーザー
	private String kengen;

    //状態
	private String yukokbn;

   //システム登録日付
	private String systemdate;

   //所有アルバム数
	private String albumNum;

   //所有画像数
	private String picnum;

	private String flag;

	private String soshikiid;

	private String soshikime;

	public String getSoshikime() {
		return soshikime;
	}

	public void setSoshikime(String soshikime) {
		this.soshikime = soshikime;
	}

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getKengen() {
		return kengen;
	}

	public void setKengen(String kengen) {
		this.kengen = kengen;
	}

	public String getYukokbn() {
		return yukokbn;
	}

	public void setYukokbn(String yukokbn) {
		this.yukokbn = yukokbn;
	}

	public String getSystemdate() {
		return systemdate;
	}

	public void setSystemdate(String systemdate) {
		this.systemdate = systemdate;
	}

	public String getAlbumNum() {
		return albumNum;
	}

	public void setAlbumNum(String albumNum) {
		this.albumNum = albumNum;
	}

	public String getPicnum() {
		return picnum;
	}

	public void setPicnum(String picnum) {
		this.picnum = picnum;
	}


}
