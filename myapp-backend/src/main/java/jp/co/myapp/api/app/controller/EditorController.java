package jp.co.myapp.api.app.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

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
	 * @throws Exception
	 */
	@RequestMapping(value = "/api/editor", method = { RequestMethod.GET })
	@ResponseBody
	public void editor(HttpServletRequest request, HttpServletResponse response) throws Exception {
		logger.info("NHA_O_0012" + " 処理開始");

//		System.out.println(data);
//		System.out.println(request.getParameter("panoramicId"));
//		String panoramicId = request.getParameter("panoramicId");
//		panoramic = panoramicService.get(panoramicId);
//		System.out.println(request.getParameter("tourUrlIds"));
//		String tourUrlIds = request.getParameter("tourUrlIds");
//		String[] tourUrlIdsData = tourUrlIds.split(",");
//		JsonMapper ji = JsonMapper.getInstance();
//		List<KrpanoView> krpanoViewList = (List<KrpanoView>) ji.fromJson(data,
//				ji.createCollectionType(ArrayList.class, KrpanoView.class));
//
//		StringBuffer sb = new StringBuffer();
//		String viewCode = "";
//		sb.append("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\r\n");
//		sb.append("<krpano version=\"1.19\" title=\"Virtual Tour\">\r\n");
//		sb.append("<include url=\"%SWFPATH%/skin/vtourskin.xml?v=1.3\" />\r\n");
//
//		sb.append("<action name=\"startup\" autorun=\"onstart\">\r\n");
//		sb.append(
//				"if(startscene === null OR !scene[get(startscene)], copy(startscene,scene[0].name); );loadscene(get(startscene), null, MERGE);playsound(bgsnd, '', 0);if(startactions !== null, startactions() );js('onready');\r\n");
//		sb.append("</action>\r\n");
//		for (int i = 0; i < tourUrlIdsData.length; i++) {
//			String sceneName = tourUrlIdsData[i];
//			sb.append("<scene name=\"" + sceneName + "\" title=\"" + sceneName + "\" onstart=\"\" thumburl=\"panos/"
//					+ sceneName + "/thumb.jpg\" ");
//			for (int j = 0; j < krpanoViewList.size(); j++) {
//				KrpanoView kv = krpanoViewList.get(j);
//				if (kv.getName().equals(sceneName) && null != kv.getBgmusic()) {
//					String codeMusic = "bgmusic=\"" + kv.getBgmusic() + "\" ";
//					sb.append(codeMusic);
//					iMap.clear();
//					iMap.put("panoramicId", panoramic.getId());
//					iMap.put("tourUrl", sceneName);
//					PanoramicPicMusic panoramicPicMusic = panoramicPicMusicService.findByPanoramicIdAndTourUrl(iMap);
//					if (null == panoramicPicMusic) {
//						panoramicPicMusic = new PanoramicPicMusic();
//						panoramicPicMusic.setPanoramic(panoramic);
//						panoramicPicMusic.setTourUrl(sceneName);
//					}
//					panoramicPicMusic.setCode(codeMusic);
//					panoramicPicMusicService.save(panoramicPicMusic);
//					break;
//				}
//			}
//			sb.append("lat=\"\" lng=\"\" heading=\"\">\r\n");
//			for (int j = 0; j < krpanoViewList.size(); j++) {
//				KrpanoView kv = krpanoViewList.get(j);
//				// System.out.println(kv.getName());
//
//				if (kv.getName().equals(sceneName)) {
//					if (null != kv.getInitH() && null != kv.getInitV() && null != kv.getFov()) {
//						viewCode = "<view hlookat=\"" + kv.getInitH() + "\" vlookat=\"" + kv.getInitV()
//								+ "\" fovtype=\"MFOV\" fov=\"" + kv.getFov()
//								+ "\" fovmin=\"5\" fovmax=\"120\" vlookatmin=\"-90\" vlookatmax=\"90\" limitview=\"auto\"/>\r\n";
//						iMap.clear();
//						iMap.put("panoramicId", panoramic.getId());
//						iMap.put("tourUrl", sceneName);
//						PanoramicPicView panoramicPicView = panoramicPicViewService.findByPanoramicIdAndTourUrl(iMap);
//						panoramicPicView.setCode(viewCode);
//						panoramicPicViewService.save(panoramicPicView);
//					} else {
//						viewCode = "<view hlookat=\"0\" vlookat=\"0\" fovtype=\"MFOV\" fov=\"90\" fovmin=\"5\" fovmax=\"120\" vlookatmin=\"-90\" vlookatmax=\"90\" limitview=\"auto\"/>\r\n";
//					}
//					sb.append(viewCode);
//					break;
//				}
//			}
//
//			sb.append("<preview url=\"panos/" + sceneName + "/preview.jpg\" />\r\n");
//			sb.append("<image>\r\n");
//			sb.append("<cube url=\"panos/" + sceneName + "/pano_%s.jpg\" />\r\n");
//			sb.append("</image>\r\n");
//			for (int j = 0; j < krpanoViewList.size(); j++) {
//				KrpanoView kv = krpanoViewList.get(j);
//				if (kv.getName().equals(sceneName)) {
//					for (KrpanoHotspots hotspots : kv.getHotSpots()) {
//						if (hotspots.getName().indexOf("vrtooltip") != -1)
//							continue;
//						String codeHotspots = "<hotspot text=\"" + hotspots.getText() + "\" ath=\"" + hotspots.getAth()
//								+ "\" atv=\"" + hotspots.getAtv() + "\" linkedscene=\"" + hotspots.getLinkedscene()
//								+ "\" name=\"" + hotspots.getName() + "\" style=\"" + hotspots.getStyle() + "\" dive=\""
//								+ hotspots.isDive() + "\" onloaded=\"add_all_the_time_tooltip_for_VR()\"/>\r\n";
//						// sb.append(codeHotspots);
//						iMap.clear();
//						iMap.put("panoramicId", panoramic.getId());
//						iMap.put("tourUrl", sceneName);
//						iMap.put("name", hotspots.getName());
//						System.out.println(hotspots.getName());
//						PanoramicPicHotspots panoramicPicHotspots = panoramicPicHotspotsService
//								.findByPanoramicIdAndTourUrlAndName(iMap);
//						if (null == panoramicPicHotspots) {
//							panoramicPicHotspots = new PanoramicPicHotspots();
//							panoramicPicHotspots.setPanoramic(panoramic);
//							panoramicPicHotspots.setTourUrl(sceneName);
//							panoramicPicHotspots.setName(hotspots.getName());
//							panoramicPicHotspots.setLinkedscene(hotspots.getLinkedscene());
//						}
//						panoramicPicHotspots.setCode(codeHotspots);
//						panoramicPicHotspotsService.save(panoramicPicHotspots);
//					}
//					iMap.clear();
//					iMap.put("panoramicId", panoramic.getId());
//					iMap.put("tourUrl", sceneName);
//					List<PanoramicPicHotspots> panoramicPicHotspotsList = panoramicPicHotspotsService
//							.findListByPanoramicIdAndTourUrl(iMap);
//					for (int k = 0; k < panoramicPicHotspotsList.size(); k++) {
//						PanoramicPicHotspots hotspots = panoramicPicHotspotsList.get(k);
//						sb.append(hotspots.getCode());
//						System.out.println(hotspots.getCode());
//					}
//				}
//			}
//			sb.append("</scene>\r\n");
//		}
//		sb.append("</krpano>\r\n");
//
//		String path = request.getSession().getServletContext().getRealPath("krpano");
//		String pathAll = path + "\\tour" + panoramic.getTourUrl() + ".xml.jsp";
//		FileUtils.createFile(pathAll);
//		File f = new File(pathAll);
//		// if(!f.exists()){
//		// f.mkdirs();
//		// }
//		try {
//			FileOutputStream fos = new FileOutputStream(pathAll);
//			fos.write(new byte[] { (byte) 0xEF, (byte) 0xBB, (byte) 0xBF });
//			OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
//			BufferedWriter bw = new BufferedWriter(osw);
//			bw.close();
//		} catch (IOException e) {
//			System.out.println(e.toString());
//		}
//		FileUtils.writeStringToFile(f, sb.toString(), "UTF-8", true);
//
//		panoramic = panoramicService.get(panoramicId);
//		panoramic.setTourFlag("1");
//		panoramicService.save(panoramic);
//
//		response.setContentType("text/html;charset=utf-8");
//		PrintWriter pw = response.getWriter();
//		String mess = "保存成功";
//		pw.write(URLDecoder.decode(mess, "utf-8"));
//		pw.flush();
//		pw.close();
	}
}
