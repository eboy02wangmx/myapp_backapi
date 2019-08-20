package jp.co.myapp.common.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EntryAccountLog {

	private static final Logger logger = LoggerFactory.getLogger(EntryAccountLog.class);

	public static void out(String message) {

		// I00020　アカウントコード{0} 申込依頼No.{1}
		logger.info(message);

	}


}
