package jp.co.myapp.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;

public class HttpUtil {

	public static String getStreamParameter(HttpServletRequest request)
			throws UnsupportedEncodingException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(request.getInputStream(), "utf-8"));
		StringBuffer buffer = new StringBuffer("");
		String temp;
		while ((temp = br.readLine()) != null) {
			buffer.append(temp);
		}
		br.close();

		return buffer.toString();
	}

}
