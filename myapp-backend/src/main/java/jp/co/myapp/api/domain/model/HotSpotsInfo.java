package jp.co.myapp.api.domain.model;

import java.io.Serializable;

import org.apache.commons.lang3.StringUtils;

public class HotSpotsInfo implements Serializable {

	public String getAth() {
		return ath;
	}

	public void setAth(String ath) {
		this.ath = ath;
	}

	public String getAtv() {
		return atv;
	}

	public void setAtv(String atv) {
		this.atv = atv;
	}

	public String getLinkedscene() {
		return linkedscene;
	}

	public void setLinkedscene(String linkedscene) {
		this.linkedscene = linkedscene;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDive() {
		return dive;
	}

	public void setDive(String dive) {
		this.dive = dive;
	}

	private static final long serialVersionUID = 6054822113538722250L;

	private String ath = StringUtils.EMPTY;

	private String atv = StringUtils.EMPTY;

	private String linkedscene = StringUtils.EMPTY;

	private String name = StringUtils.EMPTY;

	private String style = StringUtils.EMPTY;

	private String title = StringUtils.EMPTY;

	private String dive = StringUtils.EMPTY;
}