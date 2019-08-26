package jp.co.myapp.common.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

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
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import jp.co.myapp.api.app.controller.LoginController;
import jp.co.myapp.common.exception.CustomizeSystemErrorException;

/**
 * KrPanoでVRフォルダを生成すること。
 *
 * @author orias
 */
public class KrPanoCmdBatUtil {

    private static final Logger log = LoggerFactory.getLogger(KrPanoCmdBatUtil.class);

    public static void main(String[] args) throws CustomizeSystemErrorException {

        String token = "22a854f3-c4de-45af-a2dc-5bdd781fe403";
        String title = "2";
        try {
            setKrpano(token, title);
        } catch (Exception e) {
            throw new CustomizeSystemErrorException();
        }
    }

    /**
     * KrPanoでVRフォルダを生成することを行う。
     *
     * @param token
     *            イメージの臨時フォールだ名
     * @param title
     *            イメージのサブフォールだ名
     * @throws Exception
     */
    public static void setKrpano(final String token, final String title) throws Exception {

    	LoginController login = new LoginController();
        String path = login.getClass().getResource("/").getPath();
        path = path.substring(1, path.indexOf("classes")) + "uploads";

        String preFolder = path + "\\pre\\" + token + "\\" + title;
        String postFolder = path + "\\post\\" + token + "\\" + title + "\\vtour";
        File targetFile = new File(preFolder);
        if (!targetFile.exists()) {
            targetFile.mkdirs();
        }
        String ex = "krpanotools64.exe makepano -config=\\templates\\vtour-multires.config " + preFolder + "\\*.jpg";
        Runtime runtime = Runtime.getRuntime();
        boolean b = true;
        Process p = null;
        try {
            p = runtime.exec("cmd /c start C:\\krpano\\" + ex);
        } catch (Exception e) {
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
                            // Postフォルダをクリアする
                            delFolder(postFolder);
                            // フォルダのコピーを行う
                            boolean isSuccess = copyFolder(preFolder + "\\vtour", postFolder);
                            // コピー成功の場合
                            if (isSuccess) {
                                // 臨時フォルダを削除する
                                delFolder(preFolder + "\\vtour");
                            }
                            // XML修正
                            updateXML(postFolder);
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

    /**
     * tour.xmlファイルの修正処理を行う。
     */
    private static void updateXML(String xmlpath)
    {
      try
      {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = dbf.newDocumentBuilder();
        File file = new File(xmlpath + "\\tour.xml");
        Document document = builder.parse(file);

        Element root = document.getDocumentElement();

        NodeList list = root.getElementsByTagName("action");
        for (int i=0; i < list.getLength() ; i++)
        {
            Node element = list.item(i);
            String nodeValue = element.getFirstChild().getNodeValue().replaceAll("\r\n", "").replaceAll("\n", "").replaceAll("\t", "") + "js('onready');";
            element.setTextContent(nodeValue);
        }

        createxml(file, document);

      } catch(Exception e)
      {
        e.printStackTrace();
      }
    }

    /**
     * XMLの作成処理を行う。
     *
     * @param file
     * @param document
     * @return
     */
    private static boolean createxml(File file, Document document){
      Transformer transformer = null;
      try
      {
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        transformer = transformerFactory.newTransformer();
      } catch (TransformerConfigurationException e)
      {
        e.printStackTrace();
        return false;
      }
      transformer.setOutputProperty("indent", "yes");
      transformer.setOutputProperty("encoding", "UTF-8");

      try
      {
        transformer.transform(new DOMSource(document), new StreamResult(file));
      } catch (TransformerException e)
      {
        e.printStackTrace();
        return false;
      }

      return true;
    }
}