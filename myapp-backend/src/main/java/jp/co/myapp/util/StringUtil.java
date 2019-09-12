package jp.co.myapp.util;

public class StringUtil {

	public static boolean isNull(String str) {
		boolean result = true;
		if (str != null && !"".equals(str.trim())) {
			result = false;
		}

		return result;
	}

}
