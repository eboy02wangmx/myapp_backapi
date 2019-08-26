package jp.co.myapp.api.domain.model;

import java.io.Serializable;
import java.util.List;

public class SceneInfo implements Serializable {

	private static final long serialVersionUID = -2644457814728715339L;

	private String index;

	private String name;

	private String title;

	private String lat;

	private String lng;

	private String heading;

	private String thumburl;

	private String onstart;

	private String welcomeFlag;

	private String hlookat;

	private String vlookat;

	private String fov;

	private String fovtype;

	private String maxpixelzoom;

	private String fovmin;

	private String fovmax;

	private String limitview;

	private List<HotSpotsInfo> hotSpots;

	private Autorotate autorotate;

	private PreviewInfo preview;

	public String getIndex() {
		return index;
	}

	public void setIndex(String index) {
		this.index = index;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getLat() {
		return lat;
	}

	public void setLat(String lat) {
		this.lat = lat;
	}

	public String getLng() {
		return lng;
	}

	public void setLng(String lng) {
		this.lng = lng;
	}

	public String getHeading() {
		return heading;
	}

	public void setHeading(String heading) {
		this.heading = heading;
	}

	public String getThumburl() {
		return thumburl;
	}

	public void setThumburl(String thumburl) {
		this.thumburl = thumburl;
	}

	public String getOnstart() {
		return onstart;
	}

	public void setOnstart(String onstart) {
		this.onstart = onstart;
	}

	public String getWelcomeFlag() {
		return welcomeFlag;
	}

	public void setWelcomeFlag(String welcomeFlag) {
		this.welcomeFlag = welcomeFlag;
	}

	public String getHlookat() {
		return hlookat;
	}

	public void setHlookat(String hlookat) {
		this.hlookat = hlookat;
	}

	public String getVlookat() {
		return vlookat;
	}

	public void setVlookat(String vlookat) {
		this.vlookat = vlookat;
	}

	public String getFov() {
		return fov;
	}

	public void setFov(String fov) {
		this.fov = fov;
	}

	public String getFovtype() {
		return fovtype;
	}

	public void setFovtype(String fovtype) {
		this.fovtype = fovtype;
	}

	public String getMaxpixelzoom() {
		return maxpixelzoom;
	}

	public void setMaxpixelzoom(String maxpixelzoom) {
		this.maxpixelzoom = maxpixelzoom;
	}

	public String getFovmin() {
		return fovmin;
	}

	public void setFovmin(String fovmin) {
		this.fovmin = fovmin;
	}

	public String getFovmax() {
		return fovmax;
	}

	public void setFovmax(String fovmax) {
		this.fovmax = fovmax;
	}

	public String getLimitview() {
		return limitview;
	}

	public void setLimitview(String limitview) {
		this.limitview = limitview;
	}

	public List<HotSpotsInfo> getHotSpots() {
		return hotSpots;
	}

	public void setHotSpots(List<HotSpotsInfo> hotSpots) {
		this.hotSpots = hotSpots;
	}

	public Autorotate getAutorotate() {
		return autorotate;
	}

	public void setAutorotate(Autorotate autorotate) {
		this.autorotate = autorotate;
	}

	public PreviewInfo getPreview() {
		return preview;
	}

	public void setPreview(PreviewInfo preview) {
		this.preview = preview;
	}
}