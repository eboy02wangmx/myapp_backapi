package jp.co.myapp.bean;

/**
 * 物件场景。
 * 表名：u_imgs_works
 */
public class ImgsWorks {

	private Integer id;

	private Integer pk_works_main;

	private Integer pk_img_main;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getPk_works_main() {
		return pk_works_main;
	}

	public void setPk_works_main(Integer pk_works_main) {
		this.pk_works_main = pk_works_main;
	}

	public Integer getPk_img_main() {
		return pk_img_main;
	}

	public void setPk_img_main(Integer pk_img_main) {
		this.pk_img_main = pk_img_main;
	}

}
