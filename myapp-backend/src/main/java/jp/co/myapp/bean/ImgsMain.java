package jp.co.myapp.bean;

import jp.co.myapp.util.StringUtil;

/**
 * 场景。
 * 表名：u_imgsmain
 */
public class ImgsMain {

	// 主键。
	private Integer pk_img_main;

	// 名称。
	private String filename;

	// 预览图片路径。
	private String location;

	// 缩略图路径
	private String thumb_path;

	// 场景唯一标识符。
	private String view_uuid;

	public Integer getPk_img_main() {
		return pk_img_main;
	}

	public void setPk_img_main(Integer pk_img_main) {
		this.pk_img_main = pk_img_main;
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getThumb_path() {
		return thumb_path;
	}

	public void setThumb_path(String thumb_path) {
		this.thumb_path = thumb_path;
	}

	public String getView_uuid() {
		if (!StringUtil.isNull(filename)) {
			view_uuid = filename;
		}

		return view_uuid;
	}

	public void setView_uuid(String view_uuid) {
		this.view_uuid = view_uuid;
	}

}
