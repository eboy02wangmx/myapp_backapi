package jp.co.myapp.servlet;

import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import jp.co.myapp.util.FileUtil;
import jp.co.myapp.util.JDBCUtil;
import jp.co.myapp.util.UuidUtil;

@Controller
public class FileUpload {

	private static final String UPLOAD_DIRECTORY = "/static/cus/";

	@RequestMapping(value = "/fileUpload", method = { RequestMethod.POST })
	@ResponseBody
	public void fileupload(@RequestParam("file") MultipartFile[] files, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		StringBuilder result = new StringBuilder("[");
		if (files != null && files.length > 0) {
			for (int i = 0; i < files.length; i++) {
				MultipartFile file = files[i];
				if (!file.isEmpty()) {
					String fileName = file.getOriginalFilename();
					String suffix = "." + FileUtil.getSuffix(fileName);
					String fileId = UuidUtil.get();

					String uploadPath = request.getServletContext().getRealPath("./") + "/" + UPLOAD_DIRECTORY + fileId
							+ suffix;
					File destFile = new File(uploadPath);
					FileUtils.copyInputStreamToFile(file.getInputStream(), destFile);

					String relativePath = "/myapp-backend" + UPLOAD_DIRECTORY + fileId + suffix;
					String absolutelocation = request.getRequestURL().substring(0,
							request.getRequestURL().lastIndexOf("/")) + UPLOAD_DIRECTORY + fileId + suffix;

					Integer pk_media_res = addCusMediares("0", relativePath, absolutelocation,
							FileUtil.getFrist(fileName),
							suffix);

					result.append("{");
					result.append("    \"pk_media_res\":\"" + pk_media_res + "\",");
					result.append("    \"media_path\":\"" + relativePath + "\",");
					result.append("    \"absolutelocation\":\"" + absolutelocation + "\",");
					result.append("    \"media_name\":\"" + FileUtil.getFrist(fileName) + "\",");
					result.append("    \"media_suffix\":\"" + suffix + "\"");
					result.append("}");
					if (i < (files.length - 1)) {
						result.append(",");
					}
				}
			}
		}

		result.append("]");
		response.setCharacterEncoding("UTF-8");
		response.getWriter().append(result);
	}

	/*
	 * 添加客户素材。
	 */
	private Integer addCusMediares(String media_type, String media_path, String absolutelocation, String media_name,
			String media_suffix) {
		Integer pk = null;
		try {
			Connection conn = JDBCUtil.getConn();
			String sql = "insert into u_cus_mediares(media_type, media_path, absolutelocation, media_name, media_suffix) values(?, ?, ?, ?, ?)";
			PreparedStatement pst = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			pst.setObject(1, media_type);
			pst.setObject(2, media_path);
			pst.setObject(3, absolutelocation);
			pst.setObject(4, media_name);
			pst.setObject(5, media_suffix);
			pst.executeUpdate();
			ResultSet rs = pst.getGeneratedKeys();
			if (rs.next()) {
				pk = rs.getInt(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return pk;
	}

}
