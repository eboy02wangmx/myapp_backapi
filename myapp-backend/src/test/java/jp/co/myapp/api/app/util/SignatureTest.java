package jp.co.myapp.api.app.util;

import static org.junit.Assert.*;

import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

import org.junit.Test;

import jp.co.smbcfs.station.sdk.commons.codec.binary.Base64;

public class SignatureTest {

	@Test
	public void test() throws Exception {

		SecretKey sk = new SecretKeySpec("PQj6bdqH9Z&".getBytes(), "HmacSHA1");
		String base = "GET&https%3A%2F%2Fapi.id.myapp.co.jp%2Fopenid%2Foauth%2Faccesstoken&oauth_consumer_key%3Dmyapp%26oauth_nonce%3D1537112100%26oauth_signature_method%3DHMAC-SHA1%26oauth_timestamp%3D1537112100%26oauth_token%3D1e21e949261f4fd94d24264e88caa5a3%26oauth_version%3D1.0";

		Mac mac = Mac.getInstance("HmacSHA1");
		mac.init(sk);
		byte[] result = mac.doFinal(base.getBytes("UTF-8"));

		String enc = new String(Base64.encodeBase64(result));


		assertEquals("Fja6XZ5d2GE9JXZNiXvzdGyt5zw=", enc);

	}

}
