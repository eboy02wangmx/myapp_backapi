package jp.co.myapp.api.app.util;

import static org.junit.Assert.*;

import org.junit.Test;

import jp.co.myapp.common.util.CryptUtil;

public class CryptTest {

	@Test
	public void test() {

		String message = "ZZZ000,crypt@pactera.com";
		String key = "https://myid.myapp.co.jp/openid/user/9Whpri7nzC2SulpKTnGlWg=";

		String enc = CryptUtil.encrypt(key, message);

		String desc = CryptUtil.decrypt(key, enc);

		assertEquals(message, desc);

	}

}
