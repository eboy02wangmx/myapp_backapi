package jp.co.myapp.util;

public class FileUtil {

	public static String getFrist(String fileName) {
		String first = null;
		if (!StringUtil.isNull(fileName)) {
			first = fileName.substring(0, fileName.lastIndexOf("."));
		}

		return first;
	}

	public static String getSuffix(String fileName) {
		String suffix = null;
		if (!StringUtil.isNull(fileName)) {
			suffix = fileName.substring(fileName.lastIndexOf(".") + 1);
		}

		return suffix;
	}

}