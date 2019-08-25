package jp.co.myapp.api.app.controller;

import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * VR生成用イメージのアップロード処理
 *
 * @author orias
 *
 */
@Controller
public class UploadController extends AbstractApiController {

    private static final Logger logger = LoggerFactory.getLogger(UploadController.class);

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
        String fileName = part.getSubmittedFileName();

        LoginController lc = new LoginController();
        String path = lc.getClass().getResource("/").getPath();
        path = path.substring(1, path.indexOf("classes")) + "uploads";

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

        response.setCharacterEncoding("utf-8");
        response.setContentType("application/json");

        logger.info("NHA_O_0010" + " POST処理完了");
    }
}
