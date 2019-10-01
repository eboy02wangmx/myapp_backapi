package jp.co.myapp.api.app.controller;

import java.io.File;
import java.io.IOException;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.apache.commons.io.FileUtils;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.csvreader.CsvWriter;

import jp.co.myapp.api.domain.model.Riyo;
import jp.co.myapp.api.domain.model.RiyoBody;
import jp.co.myapp.api.domain.model.RiyoHead;
import jp.co.myapp.api.domain.service.album.RiyoService;
import jp.co.myapp.util.StringUtil;
import jp.co.myapp.util.UuidUtil;

@Controller
@RequestMapping(value = "/api/riyo")
public class RiyoController {

	@Inject
	RiyoService riyoService;

	@RequestMapping(method = { RequestMethod.POST })
	@ResponseBody
	public List<Riyo> search(@RequestBody Map<String, String> params) {
		List<Riyo> riyoList = null;
		if (params != null && params.containsKey("userId")) {
			String userId = params.get("userId");
			if (!StringUtil.isNull(userId)) {
				riyoList = riyoService.search(userId);
			}
		}

		return riyoList;
	}

	@RequestMapping(value = "/download", method = { RequestMethod.GET })
	public ResponseEntity<byte[]> download(String userId) throws IOException {
		ResponseEntity<byte[]> result = null;
		if (!StringUtil.isNull(userId)) {
			String fileName = UuidUtil.get() + ".csv";
			String filePath = "/file/riyo/";
			String fileFullPath = filePath + fileName;

			File fileDir = new File(filePath);
			if (!fileDir.exists()) {
				fileDir.mkdirs();
			}
			File file = new File(fileFullPath);
			if (!file.exists()) {
				file.createNewFile();
			}

			List<Riyo> riyoList = riyoService.search(userId);
			WriteCsv(fileFullPath, riyoList);

			HttpHeaders headers = new HttpHeaders();
			headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
			headers.setContentDispositionFormData("attachment", URLEncoder.encode("利用状況データ.csv", "utf-8"));
			result = new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(new File(fileFullPath)),
					headers, HttpStatus.CREATED);
		}

		return result;
	}

	private void WriteCsv(String filePath, List<Riyo> riyoList) throws IOException {
		CsvWriter csvWriter = new CsvWriter(filePath, ',', Charset.forName("SJIS"));
		if (riyoList != null && riyoList.size() > 0) {
			for (int i = 0; i < riyoList.size(); i++) {
				Riyo riyo = riyoList.get(i);
				if (riyo != null) {
					String[] row1 = new String[10];
					row1[0] = "組織ID";
					row1[1] = "組織名";
					row1[2] = "契約プラン";
					row1[3] = "登録可能画像数";
					row1[4] = "登録済み画像数";
					row1[5] = "アルバム名";
					row1[6] = "作成者";
					row1[7] = "作成日時";
					row1[8] = "更新日時";
					row1[9] = "画像数";
					csvWriter.writeRecord(row1);

					RiyoHead head = riyo.getHead();
					List<RiyoBody> bodyList = riyo.getBodyList();
					if (head != null) {
						if (bodyList != null && bodyList.size() > 0) {
							for (int j = 0; j < bodyList.size(); j++) {
								RiyoBody body = bodyList.get(j);
								if (body != null) {
									String[] row2 = new String[10];
									row2[0] = StringUtil.isNull(head.getCustomid()) ? "" : head.getCustomid();
									row2[1] = StringUtil.isNull(head.getSoshikime()) ? "" : head.getSoshikime();
									row2[2] = StringUtil.isNull(head.getContractName()) ? "" : head.getContractName();
									row2[3] = head.getContractUploadNum() == null ? ""
											: String.valueOf(head.getContractUploadNum());
									row2[4] = head.getContractUploadedNum() == null ? ""
											: String.valueOf(head.getContractUploadedNum());
									row2[5] = body.getVrInfoName();
									row2[6] = body.getUserid();
									row2[7] = body.getSakusehiDisplay();
									row2[8] = body.getKoushinhiDisplay();
									row2[9] = body.getPicnum();
									csvWriter.writeRecord(row2);
								}
							}
						} else {
							String[] row2 = new String[10];
							row2[0] = StringUtil.isNull(head.getCustomid()) ? "" : head.getCustomid();
							row2[1] = StringUtil.isNull(head.getSoshikime()) ? "" : head.getSoshikime();
							row2[2] = StringUtil.isNull(head.getContractName()) ? "" : head.getContractName();
							row2[3] = head.getContractUploadNum() == null ? ""
									: String.valueOf(head.getContractUploadNum());
							row2[4] = head.getContractUploadedNum() == null ? ""
									: String.valueOf(head.getContractUploadedNum());
							csvWriter.writeRecord(row2);
						}
					}
					csvWriter.writeRecord(new String[10]);
				}
			}
		}
		csvWriter.close();
	}

}
