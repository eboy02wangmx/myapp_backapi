package jp.co.myapp.api.app.request;

import java.io.Serializable;

public class RiyoRequest implements Serializable {

	private static final long serialVersionUID = 2222222L;

	private String riyoEff;

	public String getRiyoEff() {
		return riyoEff;
	}

	public void setRiyoEff(String riyoEff) {
		this.riyoEff = riyoEff;
	}


}
