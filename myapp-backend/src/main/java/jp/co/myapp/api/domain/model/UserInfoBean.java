package jp.co.myapp.api.domain.model;

import java.io.Serializable;

import jp.co.myapp.api.app.data.AbstractResultData;

public class UserInfoBean extends AbstractResultData implements Serializable {

	private static final long serialVersionUID = -7752140496364907417L;
	/**
	 * 氏名カナ_姓
	 */
	private String furiganase;
	/**
	 * 氏名カナ_名
	 */
	private String furiganame;
	/**
	 * 氏名漢字_姓
	 */
	private String kanjise;
	/**
	 * 氏名漢字_名
	 */
	private String kanjime;

	public String getFuriganase() {
		return furiganase;
	}

	public void setFuriganase(String furiganase) {
		this.furiganase = furiganase;
	}

	public String getFuriganame() {
		return furiganame;
	}

	public void setFuriganame(String furiganame) {
		this.furiganame = furiganame;
	}

	public String getKanjise() {
		return kanjise;
	}

	public void setKanjise(String kanjise) {
		this.kanjise = kanjise;
	}

	public String getKanjime() {
		return kanjime;
	}

	public void setKanjime(String kanjime) {
		this.kanjime = kanjime;
	}
}
