package jp.co.myapp.common.util;

import java.math.BigDecimal;
import java.text.DecimalFormat;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.myapp.common.Constants;

/**
 * 独自文字列操作
 */
public class MyStringUtils {
	@SuppressWarnings("unused")
	private static final Logger logger = LoggerFactory.getLogger(MyStringUtils.class);

	private static final char[] HANKAKU_KATAKANA = { '｡', '｢', '｣', '､', '･', 'ｦ', 'ｧ', 'ｨ', 'ｩ', 'ｪ', 'ｫ', 'ｬ', 'ｭ',
			'ｮ', 'ｯ', 'ｰ', 'ｱ', 'ｲ', 'ｳ', 'ｴ', 'ｵ', 'ｶ', 'ｷ', 'ｸ', 'ｹ', 'ｺ', 'ｻ', 'ｼ', 'ｽ', 'ｾ', 'ｿ', 'ﾀ', 'ﾁ', 'ﾂ',
			'ﾃ', 'ﾄ', 'ﾅ', 'ﾆ', 'ﾇ', 'ﾈ', 'ﾉ', 'ﾊ', 'ﾋ', 'ﾌ', 'ﾍ', 'ﾎ', 'ﾏ', 'ﾐ', 'ﾑ', 'ﾒ', 'ﾓ', 'ﾔ', 'ﾕ', 'ﾖ', 'ﾗ',
			'ﾘ', 'ﾙ', 'ﾚ', 'ﾛ', 'ﾜ', 'ﾝ', 'ﾞ', 'ﾟ', ' ', '\\', '(', ')', '!', '#', '$', '%', '&', '-', '+', '=', '~',
			'^', '"', '\'', '*', ';', ':', '/', '?', '@', '<', '>' };
	private static final char[] ZENKAKU_KATAKANA = { '。', '「', '」', '、', '・', 'ヲ', 'ァ', 'ィ', 'ゥ', 'ェ', 'ォ', 'ャ', 'ュ',
			'ョ', 'ッ', 'ー', 'ア', 'イ', 'ウ', 'エ', 'オ', 'カ', 'キ', 'ク', 'ケ', 'コ', 'サ', 'シ', 'ス', 'セ', 'ソ', 'タ', 'チ', 'ツ',
			'テ', 'ト', 'ナ', 'ニ', 'ヌ', 'ネ', 'ノ', 'ハ', 'ヒ', 'フ', 'ヘ', 'ホ', 'マ', 'ミ', 'ム', 'メ', 'モ', 'ヤ', 'ユ', 'ヨ', 'ラ',
			'リ', 'ル', 'レ', 'ロ', 'ワ', 'ン', '゛', '゜', '　', '￥', '（', '）', '！', '＃', '＄', '％', '＆', 'ー', '＋', '＝', '～',
			'＾', '”', '’', '＊', '；', '：', '／', '？', '＠', '＜', '＞' };
	private static final char[] ZENKAKU_KATAKANA_OTHER = { 'ガ', 'ギ', 'グ', 'ゲ', 'ゴ', 'ザ', 'ジ', 'ズ', 'ゼ', 'ゾ', 'ダ', 'ヂ',
			'ヅ', 'デ', 'ド', 'バ', 'ビ', 'ブ', 'ベ', 'ボ', 'パ', 'ピ', 'プ', 'ペ', 'ポ', 'ヴ' };
	private static final char[] ZENKAKU_NUMBER = { '０', '１', '２', '３', '４', '５', '６', '７', '８', '９' };
	private static final char[] ZENKAKU_ALPHA = { 'ａ', 'ｂ', 'ｃ', 'ｄ', 'ｅ', 'ｆ', 'ｇ', 'ｈ', 'ｉ', 'ｊ', 'ｋ', 'ｌ', 'ｍ', 'ｎ',
			'ｏ', 'ｐ', 'ｑ', 'ｒ', 'ｓ', 'ｔ', 'ｕ', 'ｖ', 'ｗ', 'ｘ', 'ｙ', 'ｚ', 'Ａ', 'Ｂ', 'Ｃ', 'Ｄ', 'Ｅ', 'Ｆ', 'Ｇ', 'Ｈ', 'Ｉ',
			'Ｊ', 'Ｋ', 'Ｌ', 'Ｍ', 'Ｎ', 'Ｏ', 'Ｐ', 'Ｑ', 'Ｒ', 'Ｓ', 'Ｔ', 'Ｕ', 'Ｖ', 'Ｗ', 'Ｘ', 'Ｙ', 'Ｚ' };
	private static final char HANKAKU_KATAKANA_FIRST_CHAR = HANKAKU_KATAKANA[0];
	private static final char HANKAKU_KATAKANA_LAST_CHAR = HANKAKU_KATAKANA[HANKAKU_KATAKANA.length - 1];

	/**
	 * 文字列が全角カタカナかどうかチェック 漢字以外であること：カタカナ、アルファベット、記号、数字
	 * 
	 * @param s 変換前文字列
	 * @return 変換後文字列
	 */
	public static boolean isZenKana(String s) {
		if (StringUtils.isEmpty(s))
			return true;

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (isContain(ZENKAKU_KATAKANA, c))
				continue;

			if (isContain(ZENKAKU_KATAKANA_OTHER, c))
				continue;

			if (isContain(ZENKAKU_NUMBER, c))
				continue;

			if (isContain(ZENKAKU_ALPHA, c))
				continue;

			return false;
		}
		return true;
	}

	/**
	 * 含んでいるかどうか
	 * 
	 * @param chars
	 * @param c
	 * @return
	 */
	private static boolean isContain(char[] chars, char c) {
		for (int ii = 0; ii < chars.length; ii++) {
			if (c == chars[ii]) {
				return true;
			}
		}

		return false;
	}

	/**
	 * 文字列中の半角カタカナを全角カタカナに変換します。
	 * 
	 * @param s 変換前文字列
	 * @return 変換後文字列
	 */
	public static String toBigJp(String s) {
		String wStr = "";
		if (s == null) {
			return null;
		} else if (s.length() == 0) {
			return s;
		} else if (s.length() == 1) {
			wStr = hankakuKatakanaToZenkakuKatakana(s.charAt(0)) + "";
		} else {
			StringBuffer sb = new StringBuffer(s);
			int i = 0;
			for (i = 0; i < sb.length() - 1; i++) {
				char originalChar1 = sb.charAt(i);
				char originalChar2 = sb.charAt(i + 1);
				char margedChar = mergeChar(originalChar1, originalChar2);
				if (margedChar != originalChar1) {
					sb.setCharAt(i, margedChar);
					sb.deleteCharAt(i + 1);
				} else {
					char convertedChar = hankakuKatakanaToZenkakuKatakana(originalChar1);
					if (convertedChar != originalChar1) {
						sb.setCharAt(i, convertedChar);
					}
				}
			}
			if (i < sb.length()) {
				char originalChar1 = sb.charAt(i);
				char convertedChar = hankakuKatakanaToZenkakuKatakana(originalChar1);
				if (convertedChar != originalChar1) {
					sb.setCharAt(i, convertedChar);
				}
			}
			wStr = sb.toString();
		}

		// vsts2837 文字化け対応
		wStr = wStr.replaceAll("－", "ー");

		return hankakuToZenkaku(wStr);
	}

	/**
	 * 2文字目が濁点・半濁点で、1文字目に加えることができる場合は、合成した文字を返します。 合成ができないときは、c1を返します。
	 * 
	 * @param c1 変換前の1文字目
	 * @param c2 変換前の2文字目
	 * @return 変換後の文字
	 */
	public static char mergeChar(char c1, char c2) {
		if (c2 == 'ﾞ') {
			if ("ｶｷｸｹｺｻｼｽｾｿﾀﾁﾂﾃﾄﾊﾋﾌﾍﾎ".indexOf(c1) > 0) {
				switch (c1) {
				case 'ｶ':
					return 'ガ';
				case 'ｷ':
					return 'ギ';
				case 'ｸ':
					return 'グ';
				case 'ｹ':
					return 'ゲ';
				case 'ｺ':
					return 'ゴ';
				case 'ｻ':
					return 'ザ';
				case 'ｼ':
					return 'ジ';
				case 'ｽ':
					return 'ズ';
				case 'ｾ':
					return 'ゼ';
				case 'ｿ':
					return 'ゾ';
				case 'ﾀ':
					return 'ダ';
				case 'ﾁ':
					return 'ヂ';
				case 'ﾂ':
					return 'ヅ';
				case 'ﾃ':
					return 'デ';
				case 'ﾄ':
					return 'ド';
				case 'ﾊ':
					return 'バ';
				case 'ﾋ':
					return 'ビ';
				case 'ﾌ':
					return 'ブ';
				case 'ﾍ':
					return 'ベ';
				case 'ﾎ':
					return 'ボ';
				}
			}
		} else if (c2 == 'ﾟ') {
			if ("ﾊﾋﾌﾍﾎ".indexOf(c1) > 0) {
				switch (c1) {
				case 'ﾊ':
					return 'パ';
				case 'ﾋ':
					return 'ピ';
				case 'ﾌ':
					return 'プ';
				case 'ﾍ':
					return 'ペ';
				case 'ﾎ':
					return 'ポ';
				}
			}
		}
		return c1;
	}

	/**
	 * 半角カタカナから全角カタカナへ変換します。
	 * 
	 * @param c 変換前の文字
	 * @return 変換後の文字
	 */
	public static char hankakuKatakanaToZenkakuKatakana(char c) {
		if (c >= HANKAKU_KATAKANA_FIRST_CHAR && c <= HANKAKU_KATAKANA_LAST_CHAR) {
			return ZENKAKU_KATAKANA[c - HANKAKU_KATAKANA_FIRST_CHAR];
		} else {
			for (int i = 0; i < HANKAKU_KATAKANA.length; i++) {
				if (c == HANKAKU_KATAKANA[i]) {
					return ZENKAKU_KATAKANA[i];
				}
			}
			return c;
		}
	}

	/**
	 * 半角英数から全角英数へ変換します。
	 * 
	 * @param c 変換前の文字
	 * @return 変換後の文字
	 */
	private static String hankakuToZenkaku(String value) {
		StringBuilder sb = new StringBuilder(value);
		for (int i = 0; i < sb.length(); i++) {
			int c = (int) sb.charAt(i);
			if ((c >= 0x30 && c <= 0x39) || (c >= 0x41 && c <= 0x5A) || (c >= 0x61 && c <= 0x7A)) {
				sb.setCharAt(i, (char) (c + 0xFEE0));
			}
		}
		return sb.toString();
	}

	/**
	 * 万円 -> 万円
	 * 
	 * @param money
	 * @return
	 */
	public static String convertMoneyNoCalc(Integer money) {
		if (money == null || new Integer(0).equals(money))
			return Constants.NOTHING;

		DecimalFormat formatter = new DecimalFormat("#,###万円");
		return formatter.format(money.intValue());
	}
	public static String convertMoneyNoCalc(Long money) {
		if (money == null || new Long(0).equals(money))
			return Constants.NOTHING;

		DecimalFormat formatter = new DecimalFormat("#,###万円");
		return formatter.format(money.intValue());
	}
	public static String convertMoneyNoCalc(String money) {
		if (!NumberUtils.isNumber(money))
			return Constants.NOTHING;

		DecimalFormat formatter = new DecimalFormat("#,###万円");
		return formatter.format(Integer.valueOf(money));
	}

	/**
	 * 千円 -> 万円
	 * 
	 * @param money
	 * @return
	 */
	public static String convertMoney(Integer money) {
		if (money == null || new Integer(0).equals(money))
			return Constants.NOTHING;

		BigDecimal m = new BigDecimal(money).divide(new BigDecimal(10));
		DecimalFormat formatter = new DecimalFormat("#,###.#万円");
		return formatter.format(m);
	}

	public static String convertMoney(Long money) {
		if (money == null || new Long(0).equals(money))
			return Constants.NOTHING;

		BigDecimal m = new BigDecimal(money).divide(new BigDecimal(10));
		DecimalFormat formatter = new DecimalFormat("#,###.#万円");
		return formatter.format(m);
	}

	public static String convertMoney(String money) {
		if (!NumberUtils.isNumber(money))
			return Constants.NOTHING;

		BigDecimal m = new BigDecimal(money).divide(new BigDecimal(10));
		DecimalFormat formatter = new DecimalFormat("#,###.#万円");
		return formatter.format(m);
	}

	public static String convertMoney(String money, String... def) {
		if (!NumberUtils.isNumber(money)) {
			if (def != null && def.length != 0)
				return def[0];
			return Constants.NOTHING;
		}

		BigDecimal m = new BigDecimal(money).divide(new BigDecimal(10));
		DecimalFormat formatter = null;
		formatter = new DecimalFormat("#,###.#万円");
		return formatter.format(m);
	}

	/**
	 * 円
	 * 
	 * @param money
	 * @return
	 */
	public static String setMoney(Integer money) {
		if (money == null || new Integer(0).equals(money))
			return Constants.NOTHING;

		BigDecimal m = new BigDecimal(money);
		DecimalFormat formatter = new DecimalFormat("#,###.#円");
		return formatter.format(m);
	}
	public static String setMoney(Long money) {
		if (money == null || new Long(0).equals(money))
			return Constants.NOTHING;

		BigDecimal m = new BigDecimal(money);
		DecimalFormat formatter = new DecimalFormat("#,###.#円");
		return formatter.format(m);
	}
	public static String setMoney(String money, String... def) {
		if (!NumberUtils.isNumber(money)) {
			if (def != null && def.length != 0)
				return def[0];
			return Constants.NOTHING;
		}
		BigDecimal m = new BigDecimal(money);
		DecimalFormat formatter = new DecimalFormat("#,###.#円");
		return formatter.format(m);
	}

	/**
	 * 面積
	 * 
	 * @param area
	 * @return
	 */
	public static String convertArea(BigDecimal area) {
		if (area == null)
			return Constants.BLANK;

		DecimalFormat formatter = new DecimalFormat("###,###,##0.000㎡");
		return formatter.format(area);
	}

	public static String convertArea(String area) {
		if (!NumberUtils.isNumber(area))
			return Constants.BLANK;

		DecimalFormat formatter = new DecimalFormat("###,###,##0.000㎡");
		return formatter.format(area);
	}
}
