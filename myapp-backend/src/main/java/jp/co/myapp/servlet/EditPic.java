package jp.co.myapp.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
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

public class EditPic extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public EditPic() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		StringBuilder result = new StringBuilder();

		String act = request.getParameter("act");
		if (!StringUtil.isNull(act) && "initPano".equals(act)) {
			String view_uuid = request.getParameter("view_uuid");
			if (!StringUtil.isNull(view_uuid)) {
				HashMap<String, Object> vrInfo = getVrInfo(view_uuid);
				if (vrInfo == null) {
					throw new RuntimeException("vrInfo not exists");
				} else {
					result.append("{");
					result.append("    \"pk_works_main\" : \"" + view_uuid + "\", ");
					result.append("    \"name\" : \"" + vrInfo.get("bukenme") + "\", ");
					result.append("    \"tour_guide\" : {\"points\":[]}, ");
					result.append("    \"scenechoose\": \"1\",");
					result.append("    \"autorotate\": \"1\",");
					result.append("    \"special_effects\": {");
					result.append("        \"effectSettings\": [");

					List<HashMap<String, Object>> list = getImgsMainList(view_uuid);
					if (list != null && list.size() > 0) {
						for (int i = 0; i < list.size(); i++) {
							HashMap<String, Object> record = list.get(i);
							result.append("{\"sceneName\":\"scene_" + record.get("view_uuid") + "\"}");
							if (i < (list.size() - 1)) {
								result.append(",");
							}
						}
					}

					result.append("        ]");
					result.append("    },");
					result.append("    \"scene_group\" : {");
					result.append("        \"sceneGroups\" : [{");
					result.append("            \"iconType\":\"system\",");
					result.append("            \"imgPath\":\"/myapp-backend/static/images/skin1/vr-btn-scene.png\",");
					result.append("            \"groupName\":\"初期シーン設定\",");
					result.append("            \"scenes\":[");

					if (list != null && list.size() > 0) {
						for (int i = 0; i < list.size(); i++) {
							HashMap<String, Object> record = list.get(i);
							result.append("{");
							result.append("\"sceneName\":\"scene_" + record.get("view_uuid") + "\",");
							result.append("\"sceneTitle\":\"" + record.get("filename") + "\",");
							result.append("\"imgPath\":\"" + record.get("thumb_path") + "\"");
							result.append("}");
							if (i < (list.size() - 1)) {
								result.append(",");
							}
						}
					}

					result.append("            ]");
					result.append("        }]");
					result.append("    },");

					String hotspot = "{}";
					String sand_table = "{\"sandTables\":[]}";
					HashMap<String, Object> panoConfig = getPanoConfig(view_uuid);
					if (panoConfig != null) {
						if (panoConfig.get("hotspot") != null) {
							hotspot = (String) panoConfig.get("hotspot");
						}
						if (panoConfig.get("sand_table") != null) {
							sand_table = (String) panoConfig.get("sand_table");
						}
					}

					result.append("    \"hotspot\" : ");
					result.append(hotspot);
					result.append(",");
					result.append("    \"sand_table\" : ");
					result.append(sand_table);
					result.append("}");
				}
			}
		} else {
			String param = HttpUtil.getStreamParameter(request);
			if (!StringUtil.isNull(param)) {
				act = JsonUtil.getStringValue(param, "act");
				if ("update_init".equals(act)) { // pano修改页面初始化的场合。
					String pk_works_main = JsonUtil.getStringValue(param, "pid");
					if (!StringUtil.isNull(pk_works_main)) {
						result.append("{");
						result.append("    \"worksmain\" : {}, ");
						result.append("    \"atlasmain\" : {}, ");
						result.append("    \"tag_list\" : [], ");
						result.append("    \"tags\" : [], ");
						result.append("    \"imgsmain\": [");

						List<HashMap<String, Object>> list = getImgsMainList(pk_works_main);
						if (list != null && list.size() > 0) {
							for (int i = 0; i < list.size(); i++) {
								HashMap<String, Object> record = list.get(i);
								result.append("{");
								result.append("        \"pk_img_main\": \"" + record.get("pk_img_main") + "\",");
								result.append("        \"filename\": \"" + record.get("filename") + "\",");
								result.append("        \"location\": \"" + record.get("location") + "\",");
								result.append("        \"thumb_path\": \"" + record.get("thumb_path") + "\",");
								result.append("        \"view_uuid\": \"" + record.get("filename") + "\"");
								if (i < (list.size() - 1)) {
									result.append("},");
								} else {
									result.append("}");
								}
							}
						}

						result.append("],");
						result.append("    \"panoConfig\": {");

						result.append("    \"special_effects\": {");
						result.append("        \"effectSettings\": [");

						if (list != null && list.size() > 0) {
							for (int i = 0; i < list.size(); i++) {
								HashMap<String, Object> record = list.get(i);
								result.append("{\"sceneName\":\"scene_" + record.get("view_uuid") + "\"}");
								if (i < (list.size() - 1)) {
									result.append(",");
								}
							}
						}

						result.append("        ]");
						result.append("    },");

						String hotspot = "{}";
						String sand_table = "{\"sandTables\":[]}";
						HashMap<String, Object> panoConfig = getPanoConfig(pk_works_main);
						if (panoConfig != null) {
							if (panoConfig.get("hotspot") != null) {
								hotspot = (String) panoConfig.get("hotspot");
							}
							if (panoConfig.get("sand_table") != null) {
								sand_table = (String) panoConfig.get("sand_table");
							}
						}

						result.append("        \"hotspot\" : ");
						result.append(hotspot);
						result.append(",");
						result.append("        \"sand_table\" : ");
						result.append(sand_table);
						result.append("    }");
						result.append("}");
					}
				} else if ("save_panosetting".equals(act)) { // 保存pano配置信息的场合。
					String pk_works_main = (String) JsonUtil.getStringValue(param, "pk_works_main");
					if (!StringUtil.isNull(pk_works_main)) {
						removePanoConfig(pk_works_main);

						String hotspot = (String) JsonUtil.getStringValue(param, "hotspot");
						String sand_table = (String) JsonUtil.getStringValue(param, "sand_table");
						addPanoConfig(pk_works_main, hotspot, sand_table);
					}

					result.append("{\"flag\" : true}");
				}
			}
		}

		response.getWriter().append(result.toString());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	/*
	 * 根据Id，获取物件信息。
	 */
	private HashMap<String, Object> getVrInfo(String id) {
		HashMap<String, Object> vrInfo = null;
		try {

			if (!StringUtil.isNull(id)) {
				List<Object> params = new ArrayList<Object>();
				params.add(id);
				List<HashMap<String, Object>> list = JDBCUtil.getListHashMap(
						"select t1.bukenme from innodb.vr_info t1 where t1.id = ?",
						params);
				if (list != null && list.size() > 0) {
					vrInfo = list.get(0);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return vrInfo;
	}

	/*
	 * 根据物件Id，获取场景信息列表。
	 */
	private List<HashMap<String, Object>> getImgsMainList(String pk_works_main) {
		List<HashMap<String, Object>> imgsMainList = null;
		try {
			if (!StringUtil.isNull(pk_works_main)) {
				List<Object> params = new ArrayList<Object>();
				params.add(pk_works_main);
				imgsMainList = JDBCUtil.getListHashMap(
						"select t1.pk_img_main, t1.filename, t1.location, t1.thumb_path, t1.view_uuid from innodb.u_imgsmain t1 inner join u_imgs_works t2 on t1.pk_img_main = t2.pk_img_main where t2.pk_works_main = ?",
						params);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return imgsMainList;
	}

	/*
	 * 删除pano配置。
	 */
	private void removePanoConfig(String pk_works_main) {
		try {
			List<Object> params = new ArrayList<Object>();
			params.add(pk_works_main);
			JDBCUtil.updateRecord("delete from u_pano_config where pk_works_main = ?",
					params);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/*
	 * 添加pano配置。
	 */
	private void addPanoConfig(String pk_works_main, String hotspot, String sand_table) {
		try {
			List<Object> params = new ArrayList<Object>();
			params.add(pk_works_main);
			params.add(hotspot);
			params.add(sand_table);
			JDBCUtil.updateRecord(
					"insert into u_pano_config(pk_works_main, hotspot, sand_table) values(?, ?, ?)",
					params);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/*
	 * 根据物件Id，获取pano配置。
	 */
	private HashMap<String, Object> getPanoConfig(String pk_works_main) {
		HashMap<String, Object> panoConfig = null;
		try {
			if (!StringUtil.isNull(pk_works_main)) {
				List<Object> params = new ArrayList<Object>();
				params.add(pk_works_main);
				List<HashMap<String, Object>> list = JDBCUtil.getListHashMap(
						"select t1.hotspot, t1.sand_table from innodb.u_pano_config t1 where t1.pk_works_main = ?",
						params);
				if (list != null && list.size() > 0) {
					panoConfig = list.get(0);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return panoConfig;
	}

}
