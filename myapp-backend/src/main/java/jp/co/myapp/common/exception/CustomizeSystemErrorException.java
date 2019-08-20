package jp.co.myapp.common.exception;

import java.util.ArrayList;
import java.util.List;

import jp.co.myapp.api.app.data.error.ErrorInfoData;

@SuppressWarnings("serial")
public class CustomizeSystemErrorException extends Exception {
	private List<ErrorInfoData> errorlist;

	public CustomizeSystemErrorException() {
	}
	
	public CustomizeSystemErrorException(ErrorInfoData data) {
		// 500の場合、パラメータ名がありません
		data.setParam(null);
		
		errorlist = new ArrayList<ErrorInfoData>();
		errorlist.add(data);
	}

	public List<ErrorInfoData> getErrorList() {
		return errorlist;
	}
}
