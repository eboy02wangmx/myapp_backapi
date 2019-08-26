package jp.co.myapp.api.app.controller;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import jp.co.myapp.api.domain.model.Autorotate;
import jp.co.myapp.api.domain.model.HotSpotsInfo;
import jp.co.myapp.api.domain.model.PreviewInfo;
import jp.co.myapp.api.domain.model.SceneInfo;
import jp.co.myapp.common.exception.CustomizeSystemErrorException;

/**
 * tour.xmlファイルの編集処理
 *
 * @author orias
 *
 */
@Controller
public class EditorController extends AbstractApiController {

	private static final Logger logger = LoggerFactory.getLogger(EditorController.class);

	/**
	 * ファイルアップロード処理
	 *
	 * @param request
	 *            HttpServletRequest
	 * @param response
	 *            HttpServletResponse
	 * @throws IOException
	 * @throws Exception
	 */
	@RequestMapping(value = "/api/editor", method = { RequestMethod.POST })
	@ResponseBody
//	public void editor(HttpServletRequest request, HttpServletResponse response, @RequestBody String data,
			// @RequestBody String userId, @RequestBody String recordId) throws CustomizeSystemErrorException, IOException {
	public void editor(HttpServletRequest request, HttpServletResponse response, @RequestBody String data) throws CustomizeSystemErrorException, IOException {
		logger.info("NHA_O_0012" + " 処理開始");

		ObjectMapper jsonMapper = new ObjectMapper();

		List<SceneInfo> listSceneInfo = new ArrayList<SceneInfo>();
		try {
			listSceneInfo = jsonMapper.readValue(data, new TypeReference<List<SceneInfo>>() {});
		} catch (IOException e) {
			e.printStackTrace();
		}

		EditorController editor = new EditorController();
		String path = editor.getClass().getResource("/").getPath();
		path = path.substring(1, path.indexOf("classes")) + "uploads";

		// TODO
		// String xmlpath = path + "\\post\\" + userId + "\\" + recordId + "\\vtour";
		String xmlpath = path + "\\post\\" + "22a854f3-c4de-45af-a2dc-5bdd781fe403" + "\\" + "2" + "\\vtour";

		updateXML(xmlpath, listSceneInfo);

		response.setContentType("application/json; charset=utf8");
        response.setCharacterEncoding("utf8");
        PrintWriter out = response.getWriter();

        out.print("{}");

	}

	/**
	 * tour.xmlファイルの修正処理を行う。
	 *
	 * @param xmlpath
	 * @param listSceneInfo
	 * @throws CustomizeSystemErrorException
	 */
	private void updateXML(String xmlpath, List<SceneInfo> listSceneInfo) throws CustomizeSystemErrorException {
		try {
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = dbf.newDocumentBuilder();
			File file = new File(xmlpath + "\\tour.xml");
			Document document = builder.parse(file);

			Element root = document.getDocumentElement();

			NodeList nodeList = root.getElementsByTagName("scene");

			for (int i = 0; i < nodeList.getLength(); i++) {
				Element element = (Element) nodeList.item(i);
				String sceneName = element.getAttribute("name");

				for (SceneInfo sceneInfo : listSceneInfo) {
					String name = sceneInfo.getName();
					PreviewInfo previewInfo = sceneInfo.getPreview();
					Autorotate autorotate = sceneInfo.getAutorotate();
					List<HotSpotsInfo> hotSpotsInfo = sceneInfo.getHotSpots();

					if (!name.isEmpty() && name.equals(sceneName)) {
						setElement(element, "heading", sceneInfo.getHeading());
						setElement(element, "lat", sceneInfo.getLat());
						setElement(element, "lng", sceneInfo.getLng());
						setElement(element, "onstart", sceneInfo.getOnstart());
						setElement(element, "thumburl", sceneInfo.getThumburl());
						setElement(element, "title", sceneInfo.getTitle());

						NodeList viewList = element.getElementsByTagName("view");
						for (int j = 0; j < viewList.getLength(); j++) {
							Element viewElement = (Element) viewList.item(j);

							setElement(viewElement, "fov", sceneInfo.getFov());
							setElement(viewElement, "fovmax", sceneInfo.getFovmax());
							setElement(viewElement, "fovmin", sceneInfo.getFovmin());
							setElement(viewElement, "fovtype", sceneInfo.getFovtype());
							setElement(viewElement, "hlookat", sceneInfo.getHlookat());
							setElement(viewElement, "limitview", sceneInfo.getLimitview());
							setElement(viewElement, "maxpixelzoom", sceneInfo.getMaxpixelzoom());
							setElement(viewElement, "vlookat", sceneInfo.getVlookat());
						}

						if (previewInfo != null) {
							NodeList previewList = element.getElementsByTagName("preview");
							for (int j = 0; j < previewList.getLength(); j++) {
								Element previewElement = (Element) previewList.item(j);

								setElement(previewElement, "type", previewInfo.getType());
								setElement(previewElement, "url", previewInfo.getUrl());
							}
						}

						if (autorotate != null) {
							NodeList autorotateList = element.getElementsByTagName("autorotate");
							for (int j = 0; j < autorotateList.getLength(); j++) {
								Element autorotateElement = (Element) autorotateList.item(j);

								setElement(autorotateElement, "enabled", autorotate.getEnabled());
								setElement(autorotateElement, "waittime", autorotate.getWaitTime());
								setElement(autorotateElement, "accel", autorotate.getAccel());
								setElement(autorotateElement, "speed", autorotate.getSpeed());
								setElement(autorotateElement, "horizon", autorotate.getHorizon());
							}
						}

						if (hotSpotsInfo != null) {
							NodeList hotspotList = element.getElementsByTagName("hotspot");

							for (int j = 0; j < hotspotList.getLength(); j++) {
								element.removeChild(hotspotList.item(j));
							}
							for (HotSpotsInfo hotSpots : hotSpotsInfo) {
								Element newElement = document.createElement("hotspot");
								setElement(newElement, "ath", hotSpots.getAth());
								setElement(newElement, "atv", hotSpots.getAtv());
								setElement(newElement, "linkedscene", hotSpots.getLinkedscene());
								setElement(newElement, "name", hotSpots.getName());
								setElement(newElement, "style", hotSpots.getStyle());
								setElement(newElement, "dive", hotSpots.getDive());
								element.appendChild(newElement);
							}
						}
					}
				}
			}
			createxml(file, document);

		} catch (Exception e) {
			throw new CustomizeSystemErrorException();
		}
	}

	/**
	 * エレメントの設定処理を行う。
	 *
	 * @param element
	 * @param key
	 * @param value
	 */
	private void setElement(Element element, String key, String value) {
		if (value != null) {
			element.setAttribute(key, value);
		}
	}

	/**
	 * XMLの作成処理を行う。
	 *
	 * @param file
	 * @param document
	 * @return
	 */
	private boolean createxml(File file, Document document) {
		Transformer transformer = null;
		try {
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			transformer = transformerFactory.newTransformer();
		} catch (TransformerConfigurationException e) {
			e.printStackTrace();
			return false;
		}
		transformer.setOutputProperty("indent", "yes");
		transformer.setOutputProperty("encoding", "UTF-8");

		try {
			transformer.transform(new DOMSource(document), new StreamResult(file));
		} catch (TransformerException e) {
			e.printStackTrace();
			return false;
		}

		return true;
	}
}
