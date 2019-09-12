package jp.co.myapp.util;

import java.util.UUID;

public class UuidUtil {

	public static String get() {
		String uuid = UUID.randomUUID().toString();
		uuid = uuid.replace("-", "");

		return uuid;
	}

	public static void main(String[] args) {
		String uuid = get();
		System.out.println(uuid.length());
	}

}
