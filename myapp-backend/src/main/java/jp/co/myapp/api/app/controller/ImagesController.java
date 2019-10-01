package jp.co.myapp.api.app.controller;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
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

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.FileUtils;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import jp.co.myapp.api.domain.model.AlbumBean;
import jp.co.myapp.api.domain.model.ImagesBean;
import jp.co.myapp.api.domain.service.album.AlbumService;
import jp.co.myapp.api.domain.service.images.ImagesService;
import jp.co.myapp.common.util.KrPanoCmdBatUtil;
import jp.co.myapp.util.FileUtil;
import jp.co.myapp.util.JDBCUtil;
import jp.co.myapp.util.StringUtil;
import jp.co.myapp.util.UuidUtil;

@Controller
@RequestMapping(value = "/api/images")
public class ImagesController {

	@Inject
	AlbumService albumService;

	@Inject
	ImagesService service;

	@RequestMapping(method = { RequestMethod.POST })
	@ResponseBody
	public List<ImagesBean> search(@RequestBody Map<String, String> param) {
		List<ImagesBean> images = null;
		if (param != null && param.containsKey("vrInfoId")) {
			String vrInfoId = param.get("vrInfoId");
			if (!StringUtil.isNull(vrInfoId)) {
				images = service.search(Integer.valueOf(vrInfoId));
			}
		}

		return images;
	}

	@RequestMapping(value = "/remove", method = { RequestMethod.POST })
	@ResponseBody
	public List<ImagesBean> remove(HttpServletRequest request,
			HttpServletResponse response, @RequestBody Map<String, String> param) throws Exception {
		List<ImagesBean> images = null;
		String id = param.get("id");
		String vrInfoId = param.get("vrInfoId");
		if (!StringUtil.isNull(id) && !StringUtil.isNull(vrInfoId)) {
			AlbumBean album = albumService.get(Integer.valueOf(vrInfoId));
			ImagesBean image = service.get(Integer.valueOf(id));
			if (album != null && image != null) {
				String classesPath = "/" + this.getClass().getResource("/").getPath().replaceFirst("/", "")
						.replaceAll("WEB-INF/classes/", "");
				String oldDirId = album.getDirId();
				String newDirId = UuidUtil.get();

				// 1.创建pano目录。
				String panoDirPath = classesPath + "tour/" + newDirId;
				File panoDir = new File(panoDirPath);
				if (!panoDir.exists()) {
					panoDir.mkdir();
				}

				// 2.删除文件。
				File fileFolder = new File(classesPath + "tour/" + oldDirId);
				if (fileFolder != null && fileFolder.isDirectory()) {
					File[] files = fileFolder.listFiles();
					if (files != null && files.length > 0) {
						for (int i = 0; i < files.length; i++) {
							File file = files[i];
							if (file.isDirectory() || file.getName().equals(image.getFilefullname())) {
								deleteFile(file);
							}
						}
					}
				}

				// 3.复制物件原有场景文件列表。
				Date now = new Date();
				Integer picNum = 0;
				List<Map<String, Object>> imgs = new ArrayList<Map<String, Object>>();
				if (!StringUtil.isNull(oldDirId)) {
					File srcFileFolder = new File(classesPath + "tour/" + oldDirId);
					if (srcFileFolder.exists()) {
						File[] srcFiles = srcFileFolder.listFiles();
						if (srcFiles != null && srcFiles.length > 0) {
							for (int i = 0; i < srcFiles.length; i++) {
								File srcFile = srcFiles[i];
								if (srcFile.isFile()) {
									File destFile = new File(panoDirPath + "/" + srcFile.getName());
									FileUtils.copyInputStreamToFile(new FileInputStream(srcFile), destFile);
									picNum++;
									String fileName = destFile.getName();
									String location = request.getRequestURL().substring(0,
											request.getRequestURL().lastIndexOf("/api")) + "/tour/" + newDirId + "/"
											+ fileName;
									String thumb_path = "/myapp-backend/tour/" + newDirId + "/" + fileName;

									Map<String, Object> img = new HashMap<String, Object>();
									img.put("filename", FileUtil.getFrist(fileName));
									img.put("location", location);
									img.put("thumb_path", thumb_path);
									img.put("view_uuid", FileUtil.getFrist(fileName));
									img.put("create_time", now);
									img.put("filefullname", fileName);
									imgs.add(img);
								}
							}
						}
					}
				}

				// 4.生成Pano。
				KrPanoCmdBatUtil.setKrpano(classesPath, panoDirPath);

				// 5.更新物件目录Id，图片数量。
				updateVrInfo(Integer.valueOf(vrInfoId), newDirId, picNum);

				// 6.更新物件场景信息。
				updateVrInfoImgs(Integer.valueOf(vrInfoId), imgs);

				images = service.search(Integer.valueOf(vrInfoId));
			}
		}

		return images;
	}

	@RequestMapping(value = "/{id}", method = { RequestMethod.GET })
	@ResponseBody
	public ResponseEntity<byte[]> download(@PathVariable("id") Integer id) throws Exception {
		ResponseEntity<byte[]> result = null;
		if (id != null) {
			ImagesBean image = service.get(id);
			if (image != null && !StringUtil.isNull(image.getFilefullname())
					&& !StringUtil.isNull(image.getLocation())) {
				URL url = new URL(image.getLocation());
				HttpURLConnection conn = (HttpURLConnection) url.openConnection();
				conn.setRequestMethod("GET");
				conn.setConnectTimeout(5 * 1000);
				InputStream inStream = conn.getInputStream();
				byte[] data = readInputStream(inStream);

				HttpHeaders headers = new HttpHeaders();
				headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
				headers.setContentDispositionFormData("attachment",
						URLEncoder.encode(image.getFilefullname(), "utf-8"));
				result = new ResponseEntity<byte[]>(data,
						headers, HttpStatus.CREATED);
			}
		}

		return result;
	}

	public static byte[] readInputStream(InputStream inStream) throws Exception {
		ByteArrayOutputStream outStream = new ByteArrayOutputStream();
		byte[] buffer = new byte[1024];
		int len = 0;
		while ((len = inStream.read(buffer)) != -1) {
			outStream.write(buffer, 0, len);
		}
		inStream.close();
		return outStream.toByteArray();
	}

	private static boolean deleteFile(File file) {
		if (file.isDirectory()) {
			String[] children = file.list();
			for (int i = 0; i < children.length; i++) {
				boolean success = deleteFile(new File(file, children[i]));
				if (!success) {
					return false;
				}
			}
		}

		return file.delete();
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
						String sql = "insert into u_imgsmain(filename, location, thumb_path, view_uuid, create_time, filefullname) values(?,?,?,?,?,?)";
						PreparedStatement pst = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
						pst.setObject(1, img.get("filename"));
						pst.setObject(2, img.get("location"));
						pst.setObject(3, img.get("thumb_path"));
						pst.setObject(4, img.get("view_uuid"));
						pst.setObject(5, img.get("create_time"));
						pst.setObject(6, img.get("filefullname"));
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

}
