package jp.co.myapp.common.util;

import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class CryptUtil {

	/**
	 * AES256暗号化
	 * @param passwd
	 * @param message
	 * @return
	 */
	public static String encrypt(String passwd, String message) {
		try {
			byte[] key = passwd.getBytes();
			MessageDigest sha = MessageDigest.getInstance("SHA-256");
			key = sha.digest(key);
			key = Arrays.copyOf(key, 32);
			SecretKeySpec keyObj = new SecretKeySpec(key, "AES");
			IvParameterSpec ivObj = new IvParameterSpec(Arrays.copyOf(key, 16));
			Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
			cipher.init(Cipher.ENCRYPT_MODE, keyObj, ivObj);
			byte[] byteCipherText = cipher.doFinal(message.getBytes());
			return Base64.getEncoder().encodeToString(byteCipherText);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	/**
	 * AES256復号化
	 * @param passwd
	 * @param cryptText
	 * @return
	 */
	public static String decrypt(String passwd, String cryptText) {
		try {
			byte[] key = passwd.getBytes();
			MessageDigest sha = MessageDigest.getInstance("SHA-256");
			key = sha.digest(key);
			key = Arrays.copyOf(key, 32);
			SecretKeySpec keyObj = new SecretKeySpec(key, "AES");
			IvParameterSpec ivObj = new IvParameterSpec(Arrays.copyOf(key, 16));
			Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
			cipher.init(Cipher.DECRYPT_MODE, keyObj, ivObj);
			byte[] cipherBytes = Base64.getDecoder().decode(cryptText);
			byte[] byteDecryptedText = cipher.doFinal(cipherBytes);
			return new String(byteDecryptedText);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}