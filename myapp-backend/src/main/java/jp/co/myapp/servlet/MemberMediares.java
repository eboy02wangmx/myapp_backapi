package jp.co.myapp.servlet;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jp.co.myapp.util.HttpUtil;
import jp.co.myapp.util.JDBCUtil;
import jp.co.myapp.util.JsonUtil;
import jp.co.myapp.util.StringUtil;

public class MemberMediares extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public MemberMediares() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		StringBuilder result = new StringBuilder("[");
		String param = HttpUtil.getStreamParameter(request);
		if (!StringUtil.isNull(param)) {
			String type = JsonUtil.getStringValue(param, "type");
			if (!StringUtil.isNull(type)) {
				if ("system".equals(type)) {
					List<HashMap<String, Object>> defMediares = getDefMediares();
					if (defMediares != null && defMediares.size() > 0) {
						for (int i = 0; i < defMediares.size(); i++) {
							HashMap<String, Object> defMediare = defMediares.get(i);
							result.append("{");
							result.append("\"pk_defmedia_main\" : \"" + defMediare.get("pk_defmedia_main") + "\",");
							result.append("\"absolutelocation\" : \"" + defMediare.get("absolutelocation") + "\",");
							result.append("\"flag_del\" : \"" + defMediare.get("flag_del") + "\",");
							result.append("\"suffix\" : \"" + defMediare.get("suffix") + "\",");
							result.append("\"thumb_path\" : \"" + defMediare.get("thumb_path") + "\",");
							result.append("\"title\" : \"" + defMediare.get("title") + "\",");
							result.append("\"type\" : \"" + defMediare.get("type") + "\"");
							result.append("}");
							if (i < (defMediares.size() - 1)) {
								result.append(",");
							}
						}
					}
				} else if ("custom".equals(type)) {
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
				}
			}
		}

		result.append("]");
		response.setCharacterEncoding("UTF-8");
		response.getWriter().append(result);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	/*
	 * 获取系统默认图片素材。
	 */
	private List<HashMap<String, Object>> getDefMediares() {
		List<HashMap<String, Object>> defMediares = null;
		try {
			defMediares = JDBCUtil.getListHashMap(
					"select * from innodb.u_def_mediares t1 where t1.flag_del = 0", null);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return defMediares;
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
