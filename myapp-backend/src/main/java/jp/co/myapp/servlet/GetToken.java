package jp.co.myapp.servlet;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jp.co.myapp.util.JDBCUtil;

public class GetToken extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public GetToken() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		StringBuilder result = new StringBuilder("{");
		result.append("    \"medias\":[");
		List<HashMap<String, Object>> cusMediares = getCusMediares();
		if (cusMediares != null && cusMediares.size() > 0) {
			for (int i = 0; i < cusMediares.size(); i++) {
				HashMap<String, Object> cusMediare = cusMediares.get(i);
				result.append("{");
				result.append("\"pk_media_res\" : \"" + cusMediare.get("pk_media_res") + "\",");
				result.append("\"media_path\" : \"" + cusMediare.get("media_path") + "\",");
				result.append("\"absolutelocation\" : \"" + cusMediare.get("absolutelocation") + "\",");
				result.append("\"media_suffix\" : \"" + cusMediare.get("media_suffix") + "\",");
				result.append("\"media_name\" : \"" + cusMediare.get("media_name") + "\",");
				result.append("\"media_type\" : \"0\"");
				result.append("}");
				if (i < (cusMediares.size() - 1)) {
					result.append(",");
				}
			}
		}
		result.append("    ]");
		result.append("}");

		response.setCharacterEncoding("UTF-8");
		response.getWriter().append(result);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	/*
	 * 获取用户图片素材。
	 */
	private List<HashMap<String, Object>> getCusMediares() {
		List<HashMap<String, Object>> cusMediares = null;
		try {
			cusMediares = JDBCUtil.getListHashMap(
					"select * from innodb.u_cus_mediares t1 where t1.media_type = 0", null);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return cusMediares;
	}

}
