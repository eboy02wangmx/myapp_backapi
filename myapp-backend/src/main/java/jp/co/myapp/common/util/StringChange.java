package jp.co.myapp.common.util;

public class StringChange {

	/**
	 * 全角文字内容をすべて半角文字内容に変換.
	 * @param string 変換対象情報を設定します.
	 * @return String 変換された内容が返されます.
	 */
	public static final String toSmall(String string) {
		return toSmall(false, string);
	}

	/**
	 * 全角文字内容をすべて半角文字内容に変換.
	 * @param mode [true]の場合HTML形式で変換します.
	 * @param string 変換対象情報を設定します.
	 * @return String 変換された内容が返されます.
	 */
	public static final String toSmall(boolean mode, String string) {
		if (string == null || string.length() <= 0) {
			return "";
		}
		StringBuilder buf = new StringBuilder();
		int len = string.length();
		for (int i = 0; i < len; i++) {
			buf.append(toSmallOne(mode, string.charAt(i)));
		}
		return buf.toString();
	}

	/**
	 * カナ全角を半角変換.
	 * @param string 変換対象の文字列を設定します.
	 * @return String 変換された文字列が返されます.
	 */
	public static final String toSmallJp(String string) {
		if (string == null || string.length() <= 0) {
			return "";
		}
		StringBuilder buf = new StringBuilder();
		int len = string.length();
		for (int i = 0; i < len; i++) {
			buf.append(toSmallJpOne(string, i));
		}
		return buf.toString();
	}

	/**
	 * 全角文字を半角文字に変更.
	 */
	private static final String toSmallOne(boolean mode, char code) {
		switch (code) {
		case 'ァ':
			return "ｧ";
		case 'ィ':
			return "ｨ";
		case 'ゥ':
			return "ｩ";
		case 'ェ':
			return "ｪ";
		case 'ォ':
			return "ｫ";
		case 'ャ':
			return "ｬ";
		case 'ュ':
			return "ｭ";
		case 'ョ':
			return "ｮ";
		case 'ッ':
			return "ｯ";
		case 'ー':
			return "-";
		case 'ア':
			return "ｱ";
		case 'イ':
			return "ｲ";
		case 'ウ':
			return "ｳ";
		case 'エ':
			return "ｴ";
		case 'オ':
			return "ｵ";
		case 'カ':
			return "ｶ";
		case 'キ':
			return "ｷ";
		case 'ク':
			return "ｸ";
		case 'ケ':
			return "ｹ";
		case 'コ':
			return "ｺ";
		case 'サ':
			return "ｻ";
		case 'シ':
			return "ｼ";
		case 'ス':
			return "ｽ";
		case 'セ':
			return "ｾ";
		case 'ソ':
			return "ｿ";
		case 'タ':
			return "ﾀ";
		case 'チ':
			return "ﾁ";
		case 'ツ':
			return "ﾂ";
		case 'テ':
			return "ﾃ";
		case 'ト':
			return "ﾄ";
		case 'ナ':
			return "ﾅ";
		case 'ニ':
			return "ﾆ";
		case 'ヌ':
			return "ﾇ";
		case 'ネ':
			return "ﾈ";
		case 'ノ':
			return "ﾉ";
		case 'ハ':
			return "ﾊ";
		case 'ヒ':
			return "ﾋ";
		case 'フ':
			return "ﾌ";
		case 'ヘ':
			return "ﾍ";
		case 'ホ':
			return "ﾎ";
		case 'マ':
			return "ﾏ";
		case 'ミ':
			return "ﾐ";
		case 'ム':
			return "ﾑ";
		case 'メ':
			return "ﾒ";
		case 'モ':
			return "ﾓ";
		case 'ヤ':
			return "ﾔ";
		case 'ユ':
			return "ﾕ";
		case 'ヨ':
			return "ﾖ";
		case 'ラ':
			return "ﾗ";
		case 'リ':
			return "ﾘ";
		case 'ル':
			return "ﾙ";
		case 'レ':
			return "ﾚ";
		case 'ロ':
			return "ﾛ";
		case 'ワ':
			return "ﾜ";
		case 'ヲ':
			return "ｦ";
		case 'ン':
			return "ﾝ";
		case 'ガ':
			return "ｶﾞ";
		case 'ギ':
			return "ｷﾞ";
		case 'グ':
			return "ｸﾞ";
		case 'ゲ':
			return "ｹﾞ";
		case 'ゴ':
			return "ｺﾞ";
		case 'ザ':
			return "ｻﾞ";
		case 'ジ':
			return "ｼﾞ";
		case 'ズ':
			return "ｽﾞ";
		case 'ゼ':
			return "ｾﾞ";
		case 'ゾ':
			return "ｿﾞ";
		case 'ダ':
			return "ﾀﾞ";
		case 'ヂ':
			return "ﾁﾞ";
		case 'ヅ':
			return "ﾂﾞ";
		case 'デ':
			return "ﾃﾞ";
		case 'ド':
			return "ﾄﾞ";
		case 'パ':
			return "ﾊﾟ";
		case 'ピ':
			return "ﾋﾟ";
		case 'プ':
			return "ﾌﾟ";
		case 'ペ':
			return "ﾍﾟ";
		case 'ポ':
			return "ﾎﾟ";
		case 'バ':
			return "ﾊﾞ";
		case 'ビ':
			return "ﾋﾞ";
		case 'ブ':
			return "ﾌﾞ";
		case 'ベ':
			return "ﾍﾞ";
		case 'ボ':
			return "ﾎﾞ";
		case 'ヴ':
			return "ｳﾞ";
		case '！':
			return "!";
		case '”':
			return (mode) ? "&quot;" : "\"";
		case '＃':
			return "#";
		case '＄':
			return "$";
		case '￥':
			return "\\";
		case '％':
			return "%";
		case '＆':
			return "&";
		case '’':
			return "\'";
		case '（':
			return "(";
		case '）':
			return ")";
		case '＊':
			return "*";
		case '＋':
			return "+";
		case '，':
			return ",";
		case '－':
			return "-";
		case '．':
			return ".";
		case '／':
			return "/";
		case '０':
			return "0";
		case '１':
			return "1";
		case '２':
			return "2";
		case '３':
			return "3";
		case '４':
			return "4";
		case '５':
			return "5";
		case '６':
			return "6";
		case '７':
			return "7";
		case '８':
			return "8";
		case '９':
			return "9";
		case '：':
			return ":";
		case '；':
			return ";";
		case '＜':
			return (mode) ? "&lt;" : "<";
		case '＝':
			return "=";
		case '＞':
			return (mode) ? "&gt;" : ">";
		case '？':
			return "?";
		case '＠':
			return "@";
		case 'Ａ':
			return "A";
		case 'Ｂ':
			return "B";
		case 'Ｃ':
			return "C";
		case 'Ｄ':
			return "D";
		case 'Ｅ':
			return "E";
		case 'Ｆ':
			return "F";
		case 'Ｇ':
			return "G";
		case 'Ｈ':
			return "H";
		case 'Ｉ':
			return "I";
		case 'Ｊ':
			return "J";
		case 'Ｋ':
			return "K";
		case 'Ｌ':
			return "L";
		case 'Ｍ':
			return "M";
		case 'Ｎ':
			return "N";
		case 'Ｏ':
			return "O";
		case 'Ｐ':
			return "P";
		case 'Ｑ':
			return "Q";
		case 'Ｒ':
			return "R";
		case 'Ｓ':
			return "S";
		case 'Ｔ':
			return "T";
		case 'Ｕ':
			return "U";
		case 'Ｖ':
			return "V";
		case 'Ｗ':
			return "W";
		case 'Ｘ':
			return "X";
		case 'Ｙ':
			return "Y";
		case 'Ｚ':
			return "Z";
		case '＾':
			return "^";
		case '＿':
			return "_";
		case '―':
			return "-";
		case '‘':
			return "`";
		case 'ａ':
			return "a";
		case 'ｂ':
			return "b";
		case 'ｃ':
			return "c";
		case 'ｄ':
			return "d";
		case 'ｅ':
			return "e";
		case 'ｆ':
			return "f";
		case 'ｇ':
			return "g";
		case 'ｈ':
			return "h";
		case 'ｉ':
			return "i";
		case 'ｊ':
			return "j";
		case 'ｋ':
			return "k";
		case 'ｌ':
			return "l";
		case 'ｍ':
			return "m";
		case 'ｎ':
			return "n";
		case 'ｏ':
			return "o";
		case 'ｐ':
			return "p";
		case 'ｑ':
			return "q";
		case 'ｒ':
			return "r";
		case 'ｓ':
			return "s";
		case 'ｔ':
			return "t";
		case 'ｕ':
			return "u";
		case 'ｖ':
			return "v";
		case 'ｗ':
			return "w";
		case 'ｘ':
			return "x";
		case 'ｙ':
			return "y";
		case 'ｚ':
			return "z";
		case '｛':
			return "{";
		case '｜':
			return "|";
		case '｝':
			return "}";
		case '。':
			return "｡";
		case '「':
			return "｢";
		case '」':
			return "｣";
		case '、':
			return "､";
		case '・':
			return "･";
		case '　':
			return (mode) ? "&nbsp;" : " ";
		}
		return new String(new char[] { code });
	}

	/**
	 * (カナ)全角から半角変換
	 */
	private static final String toSmallJpOne(String str, int index) {
		char code = str.charAt(index);
		switch (code) {
		case 'ァ':
			return "ｧ";
		case 'ィ':
			return "ｨ";
		case 'ゥ':
			return "ｩ";
		case 'ェ':
			return "ｪ";
		case 'ォ':
			return "ｫ";
		case 'ャ':
			return "ｬ";
		case 'ュ':
			return "ｭ";
		case 'ョ':
			return "ｮ";
		case 'ッ':
			return "ｯ";
		case 'ー':
			return "-";
		case 'ア':
			return "ｱ";
		case 'イ':
			return "ｲ";
		case 'ウ':
			return "ｳ";
		case 'エ':
			return "ｴ";
		case 'オ':
			return "ｵ";
		case 'カ':
			return "ｶ";
		case 'キ':
			return "ｷ";
		case 'ク':
			return "ｸ";
		case 'ケ':
			return "ｹ";
		case 'コ':
			return "ｺ";
		case 'サ':
			return "ｻ";
		case 'シ':
			return "ｼ";
		case 'ス':
			return "ｽ";
		case 'セ':
			return "ｾ";
		case 'ソ':
			return "ｿ";
		case 'タ':
			return "ﾀ";
		case 'チ':
			return "ﾁ";
		case 'ツ':
			return "ﾂ";
		case 'テ':
			return "ﾃ";
		case 'ト':
			return "ﾄ";
		case 'ナ':
			return "ﾅ";
		case 'ニ':
			return "ﾆ";
		case 'ヌ':
			return "ﾇ";
		case 'ネ':
			return "ﾈ";
		case 'ノ':
			return "ﾉ";
		case 'ハ':
			return "ﾊ";
		case 'ヒ':
			return "ﾋ";
		case 'フ':
			return "ﾌ";
		case 'ヘ':
			return "ﾍ";
		case 'ホ':
			return "ﾎ";
		case 'マ':
			return "ﾏ";
		case 'ミ':
			return "ﾐ";
		case 'ム':
			return "ﾑ";
		case 'メ':
			return "ﾒ";
		case 'モ':
			return "ﾓ";
		case 'ヤ':
			return "ﾔ";
		case 'ユ':
			return "ﾕ";
		case 'ヨ':
			return "ﾖ";
		case 'ラ':
			return "ﾗ";
		case 'リ':
			return "ﾘ";
		case 'ル':
			return "ﾙ";
		case 'レ':
			return "ﾚ";
		case 'ロ':
			return "ﾛ";
		case 'ワ':
			return "ﾜ";
		case 'ヲ':
			return "ｦ";
		case 'ン':
			return "ﾝ";
		case 'ガ':
			return "ｶﾞ";
		case 'ギ':
			return "ｷﾞ";
		case 'グ':
			return "ｸﾞ";
		case 'ゲ':
			return "ｹﾞ";
		case 'ゴ':
			return "ｺﾞ";
		case 'ザ':
			return "ｻﾞ";
		case 'ジ':
			return "ｼﾞ";
		case 'ズ':
			return "ｽﾞ";
		case 'ゼ':
			return "ｾﾞ";
		case 'ゾ':
			return "ｿﾞ";
		case 'ダ':
			return "ﾀﾞ";
		case 'ヂ':
			return "ﾁﾞ";
		case 'ヅ':
			return "ﾂﾞ";
		case 'デ':
			return "ﾃﾞ";
		case 'ド':
			return "ﾄﾞ";
		case 'パ':
			return "ﾊﾟ";
		case 'ピ':
			return "ﾋﾟ";
		case 'プ':
			return "ﾌﾟ";
		case 'ペ':
			return "ﾍﾟ";
		case 'ポ':
			return "ﾎﾟ";
		case 'バ':
			return "ﾊﾞ";
		case 'ビ':
			return "ﾋﾞ";
		case 'ブ':
			return "ﾌﾞ";
		case 'ベ':
			return "ﾍﾞ";
		case 'ボ':
			return "ﾎﾞ";
		case 'ヴ':
			return "ｳﾞ";
		}
		return str.substring(index, index + 1);
	}
}