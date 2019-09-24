package jp.co.myapp.api.domain.model;

import java.util.List;

public class Riyo {

	private RiyoHead head;

	private List<RiyoBody> bodyList;

	public RiyoHead getHead() {
		return head;
	}

	public void setHead(RiyoHead head) {
		this.head = head;
	}

	public List<RiyoBody> getBodyList() {
		return bodyList;
	}

	public void setBodyList(List<RiyoBody> bodyList) {
		this.bodyList = bodyList;
	}

}
