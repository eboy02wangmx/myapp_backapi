package jp.co.myapp.api.app.controller;

import java.io.File;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import jp.co.myapp.api.domain.model.ImgsmainBean;
import jp.co.myapp.api.domain.service.file.FileService;
import jp.co.myapp.common.util.KrPanoCmdBatUtil;

/**
 * VR生成用イメージのアップロード処理
 *
 * @author orias
 *
 */
@Controller
public class UploadController extends AbstractApiController {

    private static final Logger logger = LoggerFactory.getLogger(UploadController.class);

    @Inject
    FileService fileService;

    /**
     * ファイルアップロード処理
     *
     * @param request
     *            HttpServletRequest
     * @param response
     *            HttpServletResponse
     * @throws Exception
     */
    @RequestMapping(value = "/api/imageUpload", method = { RequestMethod.POST })
    @ResponseBody
    public void fileupload(HttpServletRequest request, HttpServletResponse response) throws Exception {
        logger.info("NHA_O_0010" + " 処理開始");

        Part part = request.getPart("file");
        String file = request.getParameter("fileName");
        String fileName = part.getSubmittedFileName();

        String classesPath = this.getClass().getResource("/").getPath().replaceFirst("/", "").replaceAll("WEB-INF/classes/", "");
        String path = classesPath + file;

        Path outputDir = Paths.get(path);
        if (!Files.exists(outputDir)) {
            Files.createDirectory(outputDir);
        }

        // ファイルが重複している場合409を返す
        if (Files.exists(outputDir.resolve(fileName))) {
            response.sendError(HttpServletResponse.SC_CONFLICT, "ファイル名が重複しています");
            return;
        }

        try (InputStream is = part.getInputStream()) {
            Files.copy(is, outputDir.resolve(fileName));
        } catch (Exception e) {
            logger.error(e.getMessage());
        }

        // KrPano生成
        KrPanoCmdBatUtil.setKrpano(classesPath, path, file);

        File panos = new File(classesPath + "\\tour\\" + file + "\\panos\\");

        File[] panosList = panos.listFiles();

		fileService.deleteImgsWorks(fileName);

		for (int i = 0; i < panosList.length; i++) {
			if (panosList[i].isDirectory()) {
				String[] folderArrays = panosList[i].getName().split(".");

				ImgsmainBean imgsmainBean = new ImgsmainBean();
				imgsmainBean.setFileName(folderArrays[0]);
				imgsmainBean.setLocation("\\tour\\" + file + "\\panos\\" + "preview.jpg");
				imgsmainBean.setThumb("\\tour\\" + file + "\\panos\\" + "thumb.jpg");
				fileService.insertImgsmain(imgsmainBean);

				fileService.insertImgsWorks(imgsmainBean.getPk_img_main(), fileName);

			}
		}

        response.setCharacterEncoding("utf-8");
        response.setContentType("application/json");

        logger.info("NHA_O_0010" + " POST処理完了");
    }
}
