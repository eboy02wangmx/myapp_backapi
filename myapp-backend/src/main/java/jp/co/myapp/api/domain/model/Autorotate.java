package jp.co.myapp.api.domain.model;

import java.io.Serializable;

import org.apache.commons.lang3.StringUtils;

public class Autorotate implements Serializable {

	private static final long serialVersionUID = -6582609170553963203L;

	private String enabled = StringUtils.EMPTY;

	private String waitTime = StringUtils.EMPTY;

	private String accel = StringUtils.EMPTY;

	private String speed = StringUtils.EMPTY;

	private String horizon = StringUtils.EMPTY;

	public String getEnabled() {
		return enabled;
	}

	public void setEnabled(String enabled) {
		this.enabled = enabled;
	}

	public String getWaitTime() {
		return waitTime;
	}

	public void setWaitTime(String waitTime) {
		this.waitTime = waitTime;
	}

	public String getAccel() {
		return accel;
	}

	public void setAccel(String accel) {
		this.accel = accel;
	}

	public String getSpeed() {
		return speed;
	}

	public void setSpeed(String speed) {
		this.speed = speed;
	}

	public String getHorizon() {
		return horizon;
	}

	public void setHorizon(String horizon) {
		this.horizon = horizon;
	}
}