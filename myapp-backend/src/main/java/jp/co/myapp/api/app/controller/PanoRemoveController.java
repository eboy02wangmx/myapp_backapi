package jp.co.myapp.api.app.controller;

import java.io.File;
import java.io.FileInputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import jp.co.myapp.common.util.KrPanoCmdBatUtil;
import jp.co.myapp.util.FileUtil;
import jp.co.myapp.util.JDBCUtil;
import jp.co.myapp.util.StringUtil;
import jp.co.myapp.util.UuidUtil;

@Controller
public class PanoRemoveController extends AbstractApiController {

	@RequestMapping(value = "/api/panoRemove", method = { RequestMethod.POST })
	@ResponseBody
	public void fileupload(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String paramVrInfoId = request.getParameter("vrInfoId");
		String parampkImgMain = request.getParameter("pk_img_main");
		if (!StringUtil.isNull(paramVrInfoId) && !StringUtil.isNull(parampkImgMain)) {
			Integer vrInfoId = Integer.valueOf(paramVrInfoId);
			Integer pkImgMain = Integer.valueOf(parampkImgMain);

			String vrInfoDirId = getVrInfoDirId(vrInfoId);
			if (!StringUtil.isNull(vrInfoDirId)) {
				// 1.获取场景图片，并复制至新文件夹。
				String classesPath = this.getClass().getResource("/").getPath().replaceFirst("/", "")
						.replaceAll("WEB-INF/classes/", "");
				String dirId = UuidUtil.get();
				String destFileFolder = classesPath + "tour/" + dirId;
				Path destFilePath = Paths.get(destFileFolder);
				if (!Files.exists(destFilePath)) {
					Files.createDirectory(destFilePath);
				}

				String imgsFileFullName = getImgsFileFullName(pkImgMain);

				File srcFileFolder = new File(classesPath + "tour/" + vrInfoDirId);
				if (srcFileFolder.exists()) {
					File[] srcFiles = srcFileFolder.listFiles();
					if (srcFiles != null && srcFiles.length > 0) {
						for (int i = 0; i < srcFiles.length; i++) {
							File srcFile = srcFiles[i];
							if (srcFile.isFile() && !srcFile.getName().equals(imgsFileFullName)) {
								File destFile = new File(destFileFolder + "/" + srcFile.getName());
								FileUtils.copyInputStreamToFile(new FileInputStream(srcFile), destFile);
							}
						}
					}
				}

				// 2.重新生成Pano。
				KrPanoCmdBatUtil.setKrpano(classesPath, destFileFolder, "");

				Date now = new Date();
				Integer picNum = 0;
				List<Map<String, Object>> imgs = new ArrayList<Map<String, Object>>();
				File panoFolder = new File(destFileFolder);
				if (panoFolder.exists()) {
					File[] panoFiles = panoFolder.listFiles();
					if (panoFiles != null && panoFiles.length > 0) {
						for (int i = 0; i < panoFiles.length; i++) {
							File panoFile = panoFiles[i];
							if (panoFile.isFile()) {
								picNum++;
								String fileName = panoFile.getName();
								String location = request.getRequestURL().substring(0,
										request.getRequestURL().lastIndexOf("/api")) + "/tour/" + dirId + "/"
										+ fileName;
								String thumb_path = "/myapp-backend/tour/" + dirId + "/" + fileName;

								Map<String, Object> img = new HashMap<String, Object>();
								img.put("filename", FileUtil.getFrist(fileName));
								img.put("location", location);
								img.put("thumb_path", thumb_path);
								img.put("view_uuid", FileUtil.getFrist(fileName));
								img.put("create_time", now);
								imgs.add(img);
							}
						}
					}
				}

				// 3.更新物件目录Id，图片数量。
				updateVrInfo(vrInfoId, dirId, picNum);

				// 4.更新物件场景信息。
				updateVrInfoImgs(vrInfoId, imgs);

				// 5.清空Pano配置信息。
				deletePanoConfig(vrInfoId);
			}
		}
	}

	/**
	 * 获取物件目录Id。
	 */
	private String getVrInfoDirId(Integer vrInfoId) {
		String dirId = null;
		try {
			List<Object> params = new ArrayList<Object>();
			params.add(vrInfoId);

			List<HashMap<String, Object>> list = JDBCUtil.getListHashMap(
					"select dirId from vr_info where id = ?", params);
			if (list != null && list.size() > 0) {
				dirId = (String) list.get(0).get("dirid");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return dirId;
	}

	/**
	 * 根据场景Id，获取其全文件名。
	 */
	public String getImgsFileFullName(Integer pkImgMain) {
		String imgsFileFullName = null;
		try {
			List<Object> params = new ArrayList<Object>();
			params.add(pkImgMain);

			List<HashMap<String, Object>> list = JDBCUtil.getListHashMap(
					"select filefullname from u_imgsmain where pk_img_main = ?", params);
			if (list != null && list.size() > 0) {
				imgsFileFullName = (String) list.get(0).get("filefullname");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return imgsFileFullName;
	}

	/**
	 * 更新物件信息。
	 */
	private void updateVrInfo(Integer vrInfoId, String dirId, Integer picNum) {
		try {
			List<Object> params = new ArrayList<Object>();
			params.add(dirId);
			params.add(picNum);
			params.add(vrInfoId);
			JDBCUtil.updateRecord(
					"update vr_info set dirId = ?, picnum = ? where id = ?", params);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 更新物件场景信息。
	 */
	private void updateVrInfoImgs(Integer vrInfoId, List<Map<String, Object>> imgs) {
		try {
			List<Object> params = new ArrayList<Object>();
			params.add(vrInfoId);
			JDBCUtil.updateRecord(
					"delete from u_imgsmain where pk_img_main in (select pk_img_main from u_imgs_works where pk_works_main = ?)",
					params);
			JDBCUtil.updateRecord(
					"delete from u_imgs_works where pk_works_main = ?", params);

			if (imgs != null && imgs.size() > 0) {
				for (int i = 0; i < imgs.size(); i++) {
					Map<String, Object> img = imgs.get(i);
					try {
						Integer pk_img_main = null;
						Connection conn = JDBCUtil.getConn();
						String sql = "insert into u_imgsmain(filename, location, thumb_path, view_uuid, create_time) values(?,?,?,?,?)";
						PreparedStatement pst = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
						pst.setObject(1, img.get("filename"));
						pst.setObject(2, img.get("location"));
						pst.setObject(3, img.get("thumb_path"));
						pst.setObject(4, img.get("view_uuid"));
						pst.setObject(5, img.get("create_time"));
						pst.executeUpdate();
						ResultSet rs = pst.getGeneratedKeys();
						if (rs.next()) {
							pk_img_main = rs.getInt(1);
						}

						params = new ArrayList<Object>();
						params.add(pk_img_main);
						params.add(vrInfoId);
						JDBCUtil.updateRecord(
								"insert into u_imgs_works(pk_img_main, pk_works_main) values(?,?)", params);
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 清空物件Pano配置信息。
	 */
	private void deletePanoConfig(Integer vrInfoId) {
		try {
			List<Object> params = new ArrayList<Object>();
			params.add(vrInfoId);
			JDBCUtil.updateRecord(
					"delete from u_pano_config where pk_works_main = ?", params);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
