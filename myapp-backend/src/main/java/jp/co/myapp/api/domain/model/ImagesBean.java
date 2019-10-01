package jp.co.myapp.api.domain.model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ImagesBean {

	private Integer id;

	private String filename;

	private Date create_time;

	private String createTimeDisplay;

	private String location;

	private String setsumei;

	private String filefullname;

	public String getSetsumei() {
		return setsumei;
	}

	public void setSetsumei(String setsumei) {
		this.setsumei = setsumei;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public Date getCreate_time() {
		return create_time;
	}

	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}

	public String getCreateTimeDisplay() {
		if (create_time != null) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			createTimeDisplay = sdf.format(create_time);
		}

		return createTimeDisplay;
	}

	public void setCreateTimeDisplay(String createTimeDisplay) {
		this.createTimeDisplay = createTimeDisplay;
	}

	public String getFilefullname() {
		return filefullname;
	}

	public void setFilefullname(String filefullname) {
		this.filefullname = filefullname;
	}

}
