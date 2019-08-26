package jp.co.myapp.api.domain.model;

import java.io.Serializable;

import org.apache.commons.lang3.StringUtils;

public class PreviewInfo implements Serializable {

	private static final long serialVersionUID = 2680383059322813759L;

	private String type = StringUtils.EMPTY;

	private String url = StringUtils.EMPTY;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
}
