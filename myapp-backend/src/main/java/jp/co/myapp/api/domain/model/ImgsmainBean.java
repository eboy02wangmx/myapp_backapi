package jp.co.myapp.api.domain.model;

import java.io.Serializable;

public class ImgsmainBean implements Serializable {

	private static final long serialVersionUID = 4242441195985113615L;

	private String pk_img_main;;

	private String fileName;

	private String location;

	private String thumb;

	public String getPk_img_main() {
		return pk_img_main;
	}

	public void setPk_img_main(String pk_img_main) {
		this.pk_img_main = pk_img_main;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getThumb() {
		return thumb;
	}

	public void setThumb(String thumb) {
		this.thumb = thumb;
	}

}
