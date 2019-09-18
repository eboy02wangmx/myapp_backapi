package jp.co.myapp.api.app.request;

import java.io.Serializable;

public class AlbumRequest implements Serializable {

	private static final long serialVersionUID = 2222222L;

	private String userid;

	private String filename;

	private String create_time;

	private String location;

	private String setsumei;

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getSetsumei() {
		return setsumei;
	}

	public void setSetsumei(String setsumei) {
		this.setsumei = setsumei;
	}

	public String getCreate_time() {
		return create_time;
	}

	public void setCreate_time(String create_time) {
		this.create_time = create_time;
	}

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
