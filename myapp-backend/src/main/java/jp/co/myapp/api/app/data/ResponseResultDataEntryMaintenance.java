package jp.co.myapp.api.app.data;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import jp.co.myapp.api.app.request.MaintenanceRequest;
@JsonInclude(Include.NON_NULL)
public class ResponseResultDataEntryMaintenance<E> extends AbstractResultData {
	private Integer count;

	private MaintenanceRequest params;

	private List<E> list;

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public MaintenanceRequest getParams() {
		return params;
	}

	public void setParams(MaintenanceRequest params) {
		this.params = params;
	}

	public List<E> getList() {
		return list;
	}

	public void setList(List<E> list) {
		this.list = list;
	}

}
