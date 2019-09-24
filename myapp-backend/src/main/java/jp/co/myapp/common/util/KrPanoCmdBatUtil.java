package jp.co.myapp.common.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.apache.commons.io.FileUtils;

/**
 * KrPanoでVRフォルダを生成すること。
 *
 * @author orias
 */
public class KrPanoCmdBatUtil {

	public static void setKrpano(final String classesPath, final String path) throws Exception {
		String preFolder = path;
		File targetFile = new File(preFolder);
		if (!targetFile.exists()) {
			targetFile.mkdirs();
		}
		// windows
//		String ex = "krpanotools64.exe makepano -config=\\templates\\vtour-vr.config " + preFolder.substring(1) + "\\*";
		// linux
		String ex = "krpanotools makepano -config=templates/vtour-vr.config " + preFolder + "/*";
		Runtime runtime = Runtime.getRuntime();
		// windows
//		Process p = runtime.exec("cmd /c start " + classesPath.substring(1) + "tool/krpano1/" + ex);
		// linux
		Process p = runtime.exec("/opt/soft/krpano/" + ex);

		InputStream fis = p.getInputStream();
		InputStreamReader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
		String line = null;
		while ((line = br.readLine()) != null) {
			System.out.println(line);
		}

		File srcFile = new File(classesPath + "tour/vtourskin.xml");
		File destFile = new File(path + "/vtour/skin/vtourskin.xml");
		FileUtils.copyInputStreamToFile(new FileInputStream(srcFile), destFile);
	}

}