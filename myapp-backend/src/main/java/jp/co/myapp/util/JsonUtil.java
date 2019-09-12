package jp.co.myapp.util;

import com.alibaba.fastjson.JSONObject;

public class JsonUtil {

	public static String getStringValue(String json, String key) {
		String value = null;
		if (!StringUtil.isNull(json)) {
			if (JSONObject.isValidObject(json)) {
				JSONObject jsonObj = JSONObject.parseObject(json);
				if (jsonObj.containsKey(key)) {
					value = jsonObj.getString(key);
				}
			}
		}

		return value;
	}

}
