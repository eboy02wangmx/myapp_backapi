package jp.co.myapp.common.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * KrPanoでVRフォルダを生成すること。
 *
 * @author orias
 */
public class KrPanoCmdBatUtil {

	private static final Logger log = LoggerFactory.getLogger(KrPanoCmdBatUtil.class);

	/**
	 * KrPanoでVRフォルダを生成することを行う。
	 *
	 * @param classesPath
	 *            クラスパス
	 * @param path
	 *            イメージの臨時フォルダー
	 * @param fileName
	 *            イメージの臨時フォルダー
	 * @throws Exception
	 */
	public static void setKrpano(final String classesPath, final String path, final String fileName) throws Exception {
		String preFolder = path;
		//		String postFolder = classesPath + "\\tour" + fileName;
		File targetFile = new File(preFolder);
		if (!targetFile.exists()) {
			targetFile.mkdirs();
		}
//		String ex = "krpanotools makepano -config=\\templates\\vtour-vr.config " + preFolder + "\\*";
		String ex = "krpanotools makepano -config=templates/vtour-vr.config " + preFolder + "/*";
		Runtime runtime = Runtime.getRuntime();
		boolean b = true;
		Process p = null;
		try {
//			p = runtime.exec("cmd /c start " + classesPath + "tool/krpano/" + ex);
			p = runtime.exec("/opt/soft/krpano/" + ex);
		} catch (Exception e) {
			e.printStackTrace();
			b = false;
		}
		if (b) {
			final InputStream is1 = p.getInputStream();
			final InputStream is2 = p.getErrorStream();
			new Thread() {
				public void run() {
					BufferedReader br1 = new BufferedReader(new InputStreamReader(is1));
					try {
						String line1 = null;
						while ((line1 = br1.readLine()) != null) {
							if (line1 != null) {
								log.info("=AA==========line1======" + line1);
							}
						}
					} catch (IOException e) {
						e.printStackTrace();
					} finally {
						try {
							is1.close();
							File srcFile = new File(classesPath + "tour/vtourskin.xml");
							File destFile = new File(path + "/vtour/skin/vtourskin.xml");
							FileUtils.copyInputStreamToFile(new FileInputStream(srcFile), destFile);
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
				}
			}.start();
			new Thread() {
				public void run() {
					BufferedReader br2 = new BufferedReader(new InputStreamReader(is2));
					try {
						String line2 = null;
						while ((line2 = br2.readLine()) != null) {
							if (line2 != null) {
								log.info("=AA==========line2======" + line2);
							}
						}
					} catch (IOException e) {
						e.printStackTrace();
					} finally {
						try {
							is2.close();
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
				}
			}.start();
			p.waitFor();
			p.destroy();
		} else {
			throw new Exception();
		}
	}

	/**
	 * フォルダをコピーすることを行う。
	 *
	 * @param oldPath
	 *            コピー元パス
	 * @param newPath
	 *            コピー先パス
	 * @return boolean
	 */
	private static boolean copyFolder(String oldPath, String newPath) {
		try {
			// フォルダ存在しない場合、新フォルダを作成する
			(new File(newPath)).mkdirs();
			File a = new File(oldPath);
			String[] file = a.list();
			File temp = null;
			for (int i = 0; i < file.length; i++) {
				if (oldPath.endsWith(File.separator)) {
					temp = new File(oldPath + file[i]);
				} else {
					temp = new File(oldPath + File.separator + file[i]);
				}

				if (temp.isFile()) {
					FileInputStream input = new FileInputStream(temp);
					FileOutputStream output = new FileOutputStream(newPath + "/" + (temp.getName()).toString());
					byte[] b = new byte[1024 * 5];
					int len;
					while ((len = input.read(b)) != -1) {
						output.write(b, 0, len);
					}
					output.flush();
					output.close();
					input.close();
				}
				// サブフォルダの場合
				if (temp.isDirectory()) {
					copyFolder(oldPath + "/" + file[i], newPath + "/" + file[i]);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	/**
	 * フォルダを削除することを行う。
	 *
	 * @param folderPath
	 */
	private static void delFolder(String folderPath) {
		try {
			// 全てファイルを削除する
			delAllFile(folderPath);
			String filePath = folderPath;
			filePath = filePath.toString();
			java.io.File myFilePath = new java.io.File(filePath);
			// 空白フォルダを削除する
			myFilePath.delete();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 全ファイルを削除することを行う。
	 *
	 * @param path
	 *            ファイルパス
	 * @return boolean
	 */
	private static boolean delAllFile(String path) {
		boolean flag = false;
		File file = new File(path);
		if (!file.exists()) {
			return flag;
		}
		if (!file.isDirectory()) {
			return flag;
		}
		String[] tempList = file.list();
		File temp = null;
		for (int i = 0; i < tempList.length; i++) {
			if (path.endsWith(File.separator)) {
				temp = new File(path + tempList[i]);
			} else {
				temp = new File(path + File.separator + tempList[i]);
			}
			if (temp.isFile()) {
				temp.delete();
			}
			if (temp.isDirectory()) {
				// フォルダの全てファイルを削除する
				delAllFile(path + "/" + tempList[i]);
				// フォルダを削除する
				delFolder(path + "/" + tempList[i]);
				flag = true;
			}
		}
		return flag;
	}
}