package jp.co.myapp.common.exception;

import java.util.Arrays;
import java.util.List;

import jp.co.myapp.api.app.data.error.ErrorInfoData;

@SuppressWarnings("serial")
public class CustomizeBadRequestException extends Exception {
	private List<ErrorInfoData> errorlist;

	public CustomizeBadRequestException(ErrorInfoData... errors) {
		this.errorlist = Arrays.asList(errors);
	}

	public CustomizeBadRequestException(List<ErrorInfoData> errorlist) {
		this.errorlist = errorlist;
	}
	
	public List<ErrorInfoData> getErrorList() {
		return errorlist;
	}
}
