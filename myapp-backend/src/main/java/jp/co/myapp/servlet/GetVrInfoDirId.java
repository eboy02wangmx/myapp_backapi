package jp.co.myapp.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jp.co.myapp.util.JDBCUtil;
import jp.co.myapp.util.StringUtil;

public class GetVrInfoDirId extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public GetVrInfoDirId() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		StringBuilder result = new StringBuilder();
		String id = request.getParameter("id");
		if (!StringUtil.isNull(id)) {
			String dirId = getVrInfoDirId(id);
			if (!StringUtil.isNull(dirId)) {
				result.append(dirId);
			}
		}

		response.getWriter().append(result.toString());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	/*
	 * 根据物件信息Id，获取dirId。
	 */
	private String getVrInfoDirId(String id) {
		String dirId = null;
		try {
			if (!StringUtil.isNull(id)) {
				List<Object> params = new ArrayList<Object>();
				params.add(id);
				List<HashMap<String, Object>> list = JDBCUtil.getListHashMap(
						"select t1.dirId from innodb.vr_info t1 where t1.id = ?",
						params);
				if (list != null && list.size() > 0) {
					dirId = (String) list.get(0).get("dirid");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return dirId;
	}

}
