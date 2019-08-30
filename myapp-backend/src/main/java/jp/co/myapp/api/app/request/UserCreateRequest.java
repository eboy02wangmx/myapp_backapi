package jp.co.myapp.api.app.request;

import java.io.Serializable;

public class UserCreateRequest implements Serializable {

	private static final long serialVersionUID = 2222222L;

	private String userid;

	private String furiganase;

	private String furiganame;

	private String kanjise;

	private String kanjime;

	private String password;

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


}
