package jp.co.myapp.common.util;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class SendAPUtils {

	private static final Logger logger = LoggerFactory.getLogger(SendAPUtils.class);
	
	/**
	 * 評価額計算AP
	 * @param url
	 * @param timeout
	 * @param postBody
	 * @return
	 * @throws IOException
	 */
	public static String sendHaEvaluation(String url, int timeout, String postBody) throws IOException {
		OkHttpClient client = new OkHttpClient.Builder().
		        readTimeout(timeout, TimeUnit.SECONDS).
		        build();

	    logger.debug("AP.url:" + url);
	    logger.debug("AP.postBody:" + postBody);
	    
	    Request request = new Request.Builder()
	            .url(url)
	            .post(okhttp3.RequestBody.create(MediaType.parse("application/xml; charset=utf-8"), postBody))
	            .build();
	    
	    Response response = client.newCall(request).execute();

	    String xmlStr = null;
	    if (response.isSuccessful()) {
	    	xmlStr = response.body().string();
	    }
	    
	    logger.debug("AP.response.isSuccessful():" + response.isSuccessful());
	    logger.debug("AP.xmlStr:" + xmlStr);
	    
	    return xmlStr;
	}
	
}
