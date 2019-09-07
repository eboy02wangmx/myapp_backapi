package jp.co.myapp.api.app.request;

import java.io.Serializable;

public class AlbumRequest implements Serializable {

	private static final long serialVersionUID = 2222222L;

	private String userid;

	private String filename;

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

}
