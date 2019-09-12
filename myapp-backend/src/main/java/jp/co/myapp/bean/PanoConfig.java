package jp.co.myapp.bean;

/**
 * pano配置。
 * 表名：u_pano_config
 */
public class PanoConfig {

	private Integer pk_pano_config;

	private String pk_works_main;

	private String sand_table;

	private String hotspot;

	public Integer getPk_pano_config() {
		return pk_pano_config;
	}

	public void setPk_pano_config(Integer pk_pano_config) {
		this.pk_pano_config = pk_pano_config;
	}

	public String getPk_works_main() {
		return pk_works_main;
	}

	public void setPk_works_main(String pk_works_main) {
		this.pk_works_main = pk_works_main;
	}

	public String getSand_table() {
		return sand_table;
	}

	public void setSand_table(String sand_table) {
		this.sand_table = sand_table;
	}

	public String getHotspot() {
		return hotspot;
	}

	public void setHotspot(String hotspot) {
		this.hotspot = hotspot;
	}

}
