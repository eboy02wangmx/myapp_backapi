package jp.co.myapp.api.app.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import jp.co.myapp.api.app.data.error.ErrorInfoData;
import jp.co.myapp.api.app.request.UserRequest;
import jp.co.myapp.common.Constants;
import jp.co.myapp.common.ConstantsEnum.API_ID;
import jp.co.myapp.common.exception.CustomizeBadRequestException;
import jp.co.myapp.common.exception.CustomizeSystemErrorException;
import jp.co.myapp.common.util.MyStringUtils;
import jp.co.myapp.common.util.MyUtils;
import jp.co.myapp.common.util.ValidatorUtil;

/**
 * NHA_O_0004_入力チェック
 *
 * 変更履歴: 引き受け制限追加 2018/11/09 BY 辺 契約登録情報追加 2018/11/12 BY 曲 管理メンテナンス画面追加
 * 2018/11/26 BY 辺
 *
 */
@Controller
public class InputCheckController extends AbstractEntrySaveController {



	public InputCheckController() {
		super.setFunctionId(API_ID.NHA_O_0004.getId());
	}

	@Value("#{system.sig_key}")
	private String SIG_KEY;

	/**
	 * TOP画面_入力チェック
	 *
	 * @param locale
	 * @param params
	 * @throws CustomizeSystemErrorException
	 */
	@RequestMapping(value = "/api/topMenuCheck", method = { RequestMethod.POST })
	@ResponseBody
	public void topMenuCheck(Locale locale, @RequestBody UserRequest params)
			throws CustomizeBadRequestException, CustomizeSystemErrorException {

		List<ErrorInfoData> errLst = ValidatorUtil.validate(params, super.messageSource, locale);

		if (errLst != null && errLst.size() > 0) {
			throw new CustomizeBadRequestException(errLst);
		}
		// C-2-6はImpediment 1346によって削除します。

	}



	/**
	 * Errorメッセージ追加（同じ項目のメッセージは追加しない）
	 *
	 * @param lst
	 * @param ed
	 */
	private void addUniqueError(List<ErrorInfoData> lst, ErrorInfoData ed) {
		for (ErrorInfoData wEd : lst) {
			if (wEd.getMsgParams() != null && wEd.getMsgParams().length > 0 && ed.getMsgParams() != null
					&& ed.getMsgParams().length > 0 && wEd.getMsgParams()[0].equals(ed.getMsgParams()[0]))
				return;
		}
		lst.add(ed);
	}

	/**
	 * 日付の範囲をチェック
	 *
	 * @param chkVal
	 * @param min
	 * @param max
	 * @return
	 */
	private boolean chkDateLimit(Date chkVal, Date min, Date max) {
		if (chkVal == null) {
			return false;
		}

		if (min != null && chkVal.compareTo(min) < 0) {
			return false;
		}
		if (max != null && chkVal.compareTo(max) > 0) {
			return false;
		}
		return true;
	}

	/**
	 * 桁数チェックのみを行う。
	 *
	 * @param lst
	 * @param val
	 * @param len
	 * @param param
	 * @param paramNm
	 */
	private boolean addLengthError(List<ErrorInfoData> lst, String val, int len, String param, String... array) {
		String paramNm = "";
		if (array.length > 0) {
			paramNm = array[0];
		}
		String stateNm = len + "桁以内";
		if (array.length > 1 && !MyUtils.isEmpty(array[1])) {
			stateNm = array[1];
		}

		if (MyUtils.isEmpty(val)) {
		} else if (val.length() > len) {
			String[] msgParams = new String[] { paramNm, stateNm, "入力して" };
			lst.add(new ErrorInfoData(param, Constants.ERROR_E00001, msgParams));
			return false;
		}
		return false;
	}

	/**
	 * 生年月日必須チェックと桁数チェックを行う。（自動保存の場合） 手動保存の場合は桁数チェックのみを行う
	 *
	 * @param lst
	 * @param val
	 * @param len
	 * @param param
	 * @param paramNm
	 */
	private boolean birthdayNoEmptyLengthError(List<ErrorInfoData> lst, String val, int len, String param,
			boolean isAuto, String... array) {
		if (isAuto) {
			String paramNm = "";
			if (array.length > 0) {
				paramNm = array[0];
			}
			String stateNm = len + "桁以内";
			if (array.length > 1 && !MyUtils.isEmpty(array[1])) {
				stateNm = array[1];
			}

			if (MyUtils.isEmpty(val)) {
				// 必須エラー
				String[] msgParams = new String[] { paramNm, "入力して" };
				ErrorInfoData ed = new ErrorInfoData(param, Constants.ERROR_E00002, msgParams);
				addUniqueError(lst, ed);
				return false;
			} else if (val.length() > len) {
				// 桁数エラー
				String[] msgParams = new String[] { paramNm, stateNm, "入力して" };
				ErrorInfoData ed = new ErrorInfoData(param, Constants.ERROR_E00001, msgParams);
				addUniqueError(lst, ed);
				return false;
			} else {
				String month = StringUtils.substring(val, 4, 6);
				String date = StringUtils.substring(val, 6, 8);
				if ((Constants.CHECK_BIR).equals(month) || (Constants.CHECK_BIR).equals(date)) {
					// 必須エラー
					String[] msgParams = new String[] { paramNm, "入力して" };
					ErrorInfoData ed = new ErrorInfoData(param, Constants.ERROR_E00002, msgParams);
					addUniqueError(lst, ed);
					return false;
				}
			}
			return true;
		} else {
			String paramNm = "";
			if (array.length > 0) {
				paramNm = array[0];
			}
			String stateNm = len + "桁以内";
			if (array.length > 1 && !MyUtils.isEmpty(array[1])) {
				stateNm = array[1];
			}

			if (MyUtils.isEmpty(val)) {
			} else if (val.length() > len) {
				String[] msgParams = new String[] { paramNm, stateNm, "入力して" };
				lst.add(new ErrorInfoData(param, Constants.ERROR_E00001, msgParams));
				return false;
			}
			return false;
		}
	}

	/**
	 * 必須チェックと桁数チェックを行う。（自動保存の場合） 手動保存の場合は桁数チェックのみを行う
	 *
	 * @param lst
	 * @param val
	 * @param len
	 * @param param
	 * @param paramNm
	 */
	private boolean addNoEmptyLengthError(List<ErrorInfoData> lst, String val, int len, String param, boolean isAuto,
			String... array) {
		if (isAuto) {
			return addNoEmptyLengthError(lst, val, len, param, array);
		} else {
			return addLengthError(lst, val, len, param, array);
		}
	}

	private boolean addNoEmptyLengthError(List<ErrorInfoData> lst, String val, Integer len, String param,
			String... array) {
		String paramNm = "";
		if (array.length > 0) {
			paramNm = array[0];
		}

		String strEvent = "入力して";
		String stateNm = "";
		if (len == null) {
			strEvent = "選択して";
		} else {
			stateNm = len + "桁以内";
			if (array.length > 1 && !MyUtils.isEmpty(array[1])) {
				stateNm = array[1];
			}
		}

		if (MyUtils.isEmpty(val)) {
			// 必須エラー
			String[] msgParams = new String[] { paramNm, strEvent };
			ErrorInfoData ed = new ErrorInfoData(param, Constants.ERROR_E00002, msgParams);
			addUniqueError(lst, ed);
			return false;
		} else if (len != null && val.length() > len) {
			// 桁数エラー
			String[] msgParams = new String[] { paramNm, stateNm, strEvent };
			ErrorInfoData ed = new ErrorInfoData(param, Constants.ERROR_E00001, msgParams);
			addUniqueError(lst, ed);
			return false;
		}
		return true;
	}

	private boolean addNoEmptyError(List<ErrorInfoData> lst, String val, String param, boolean isAuto,
			String... array) {
		if (isAuto) {
			String paramNm = "";
			if (array.length > 0) {
				paramNm = array[0];
			}

			if (MyUtils.isEmpty(val)) {
				// 必須エラー
				String[] msgParams = new String[] { paramNm, "入力して" };
				ErrorInfoData ed = new ErrorInfoData(param, Constants.ERROR_E00002, msgParams);
				addUniqueError(lst, ed);
				return false;
			}
		}
		return true;
	}

	/**
	 * カナチェックを行う
	 *
	 * @param lst
	 * @param val
	 * @param param
	 * @param paramNm
	 * @return
	 */
	private boolean addZenKanaError(List<ErrorInfoData> lst, String val, String param, String paramNm) {
		String zenVal = MyStringUtils.toBigJp(val);
		if (!MyStringUtils.isZenKana(zenVal)) {
			String[] msgParams = new String[] { paramNm, "カタカナ", "入力して" };
			ErrorInfoData ed = new ErrorInfoData(param, Constants.ERROR_E00001, msgParams);
			addUniqueError(lst, ed);
			return false;
		}

		return true;
	}

	/**
	 * 電話番号チェック(自動保存は全チェック、手動保存は桁数チェックのみを行う)
	 *
	 * @param lst
	 * @param kubun
	 * @param tel1
	 * @param tel2
	 * @param tel3
	 */
	private void checkTelNo(List<ErrorInfoData> lst, int kubun, String tel1, String tel2, String tel3, boolean isAuto) {
		String[] paramIds;
		String telName;
		if (kubun == 1) {
			paramIds = new String[] { "contractorTelArea", "contractorTelCity", "contractorTelNo" };
			telName = "電話番号（自宅）";
		} else {
			paramIds = new String[] { "contractorTel2Area", "contractorTel2City", "contractorTel2No" };
			telName = "電話番号（携帯）";
		}

		String firstEmptyId = null;
		firstEmptyId = this.checkTolLen(lst, paramIds[0], telName + "ー市外", tel1, 6, firstEmptyId);
		firstEmptyId = this.checkTolLen(lst, paramIds[1], telName + "ー市内", tel2, 4, firstEmptyId);
		firstEmptyId = this.checkTolLen(lst, paramIds[2], telName + "ー加入番号", tel3, 4, firstEmptyId);

		if (null != tel1) {
			tel1 = StringUtils.trim(tel1).replaceAll("　", "");
		}
		if (null != tel2) {
			tel2 = StringUtils.trim(tel2).replaceAll("　", "");
		}
		if (null != tel3) {
			tel3 = StringUtils.trim(tel3).replaceAll("　", "");
		}

		if ((!MyUtils.isEmpty(tel1) || !MyUtils.isEmpty(tel2) || !MyUtils.isEmpty(tel3))
				&& (MyUtils.isEmpty(tel1) || MyUtils.isEmpty(tel2) || MyUtils.isEmpty(tel3))) {
			String[] msgParams = new String[] { telName, "入力して" };
			if (isAuto)
				lst.add(new ErrorInfoData(firstEmptyId, Constants.ERROR_E00002, msgParams));
		}

		// vsts2978 半角数字チェック
		if (StringUtils.isNotEmpty(tel1) && StringUtils.isNotEmpty(tel2) && StringUtils.isNotEmpty(tel3)) {
			if (!tel1.matches(Constants.REGEXP_NUMBER_REQUIRED) || !tel2.matches(Constants.REGEXP_NUMBER_REQUIRED)
					|| !tel3.matches(Constants.REGEXP_NUMBER_REQUIRED)) {
				String[] msgParams = new String[] { telName, "半角数字", "入力して" };
				lst.add(new ErrorInfoData("telNo" + kubun, Constants.ERROR_E00001, msgParams));
			}
		}
	}

	/**
	 * 最大桁数チェック
	 *
	 * @param lst
	 * @param paramId
	 * @param paramNm
	 * @param val
	 * @param len
	 * @param firstEmptyId
	 * @return
	 */
	private String checkTolLen(List<ErrorInfoData> lst, String paramId, String paramNm, String val, int len,
			String firstEmptyId) {
		if (MyUtils.isEmpty(val)) {
			if (MyUtils.isEmpty(firstEmptyId)) {
				firstEmptyId = paramId;
			}
		} else if (val.length() > len) {
			String stateNm = len + "桁";
			String[] msgParams = new String[] { paramNm, stateNm, "入力して" };
			lst.add(new ErrorInfoData(paramId, Constants.ERROR_E00001, msgParams));
		}
		return firstEmptyId;
	}

	/**
	 * 金額の範囲をチェック
	 *
	 * @param val
	 * @param lower
	 * @param upper
	 * @return
	 */
	private boolean chkAmountLimit(Long val, Long lower, Long upper) {
		if (val == null) {
			return false;
		}

		if (lower != null && val.compareTo(lower) < 0) {
			return false;
		}

		if (upper != null && val.compareTo(upper) > 0) {
			return false;
		}

		return true;
	}


	// 契約登録情報追加 2018/11/12 ADD START
	/**
	 * 日付の妥当性チェック
	 *
	 * @param lst
	 *            エラー情報
	 * @param str
	 *            チェック内容
	 * @param format
	 *            フォーマット
	 * @param param
	 *            項目
	 * @param array
	 *            メッセージ内容
	 * @return
	 */
	private boolean chkDate(List<ErrorInfoData> lst, String str, String format, String param, String... array) {

		String paramNm = "";

		if (array.length > 0) {
			paramNm = array[0];
		}

		if (MyUtils.isEmpty(str) || MyUtils.isEmpty(format)) {

			String[] msgParams = new String[] { paramNm, "正しく入力して" };
			ErrorInfoData ed = new ErrorInfoData(param, Constants.ERROR_E00002, msgParams);
			addUniqueError(lst, ed);
			return false;
		}

		try {
			SimpleDateFormat sdf = new SimpleDateFormat(format);
			sdf.setLenient(false);
			sdf.parse(str);

			return true;

		} catch (ParseException e) {

			String[] msgParams = new String[] { paramNm, "正しく入力して" };
			ErrorInfoData ed = new ErrorInfoData(param, Constants.ERROR_E00002, msgParams);
			addUniqueError(lst, ed);
			return false;
		}
	}

	/**
	 * 仮名文字全角・半角数字チェック
	 *
	 * @chkKubun チェック区分
	 * @param lst
	 *            エラー情報
	 * @param str
	 *            チェック内容
	 * @param param
	 *            項目
	 * @param array
	 *            メッセージ内容
	 * @return
	 */
	private boolean chkFormat(String chkKubun, List<ErrorInfoData> lst, String str, String param, String... array) {

		boolean result = false;

		String paramNm = "";

		if (MyUtils.isEmpty(str)) {
			return false;
		}

		if (array.length > 0) {
			paramNm = array[0];
		}

		// 仮名文字全角チェック
		if ("zenkauKana".equals(chkKubun) && str.matches(Constants.REGEXP_FULL_KATAKANA)) {
			result = true;
		}
		// 半角数字チェック
		if ("hankakusuji".equals(chkKubun) && str.matches(Constants.REGEXP_AMOUNT_REQUIRED)) {
			result = true;
		}
		// 半角数字チェック
		if ("PATTERN_CD".equals(chkKubun) && str.matches(Constants.REGEXP_NUMBERASC_REQUIRED)) {
			result = true;
		}
		// 半角数字チェック
		if ("HIKANJI2_BNT_WARI_FROM".equals(chkKubun) && str.matches(Constants.REGEXP_BUILDING_AREA)) {
			result = true;
		}
		if ("HIKANJI1_BNT_WARI_FROM".equals(chkKubun) && str.matches(Constants.REGEXP_BUILDING_AREA)) {
			result = true;
		}
		if (!result) {
			String[] msgParams = new String[] { paramNm, array[1] };
			ErrorInfoData ed = new ErrorInfoData(param, Constants.ERROR_E00002, msgParams);
			addUniqueError(lst, ed);
		}
		return result;
	}


	public String toCapital(String string) {
		return toCapital(false, string);
	}

	public String toCapital(boolean mode, String string) {
		if (string == null || string.length() <= 0) {
			return "";
		}
		StringBuilder buf = new StringBuilder();
		int len = string.length();
		for (int i = 0; i < len; i++) {
			buf.append(toCapitalOne(mode, string.charAt(i)));
		}
		return buf.toString();
	}

	private String toCapitalOne(boolean mode, char code) {
		switch (code) {
		case 'ぁ':
			return "あ";
		case 'ぃ':
			return "い";
		case 'ぅ':
			return "う";
		case 'ぇ':
			return "え";
		case 'ぉ':
			return "お";
		case 'っ':
			return "つ";
		case 'ゃ':
			return "や";
		case 'ゅ':
			return "ゆ";
		case 'ょ':
			return "よ";
		case 'ゎ':
			return "わ";
		case 'ァ':
			return "ア";
		case 'ィ':
			return "イ";
		case 'ゥ':
			return "ウ";
		case 'ェ':
			return "エ";
		case 'ォ':
			return "オ";
		case 'ヵ':
			return "カ";
		case 'ヶ':
			return "ケ";
		case 'ッ':
			return "ツ";
		case 'ャ':
			return "ヤ";
		case 'ュ':
			return "ユ";
		case 'ョ':
			return "ヨ";
		case 'ヮ':
			return "ワ";
		}
		return new String(new char[] { code });
	}

	/**
	 * 使用可能文字チェック
	 *
	 * @param string
	 * @return boolean
	 */
	private boolean isExist(char code) {
		switch (code) {
		case '0':
			return true;
		case '1':
			return true;
		case '2':
			return true;
		case '3':
			return true;
		case '4':
			return true;
		case '5':
			return true;
		case '6':
			return true;
		case '7':
			return true;
		case '8':
			return true;
		case '9':
			return true;
		case 'A':
			return true;
		case 'B':
			return true;
		case 'C':
			return true;
		case 'D':
			return true;
		case 'E':
			return true;
		case 'F':
			return true;
		case 'G':
			return true;
		case 'H':
			return true;
		case 'I':
			return true;
		case 'J':
			return true;
		case 'K':
			return true;
		case 'L':
			return true;
		case 'M':
			return true;
		case 'N':
			return true;
		case 'O':
			return true;
		case 'P':
			return true;
		case 'Q':
			return true;
		case 'R':
			return true;
		case 'S':
			return true;
		case 'T':
			return true;
		case 'U':
			return true;
		case 'V':
			return true;
		case 'W':
			return true;
		case 'X':
			return true;
		case 'Y':
			return true;
		case 'Z':
			return true;
		case 'ｱ':
			return true;
		case 'ｲ':
			return true;
		case 'ｳ':
			return true;
		case 'ｴ':
			return true;
		case 'ｵ':
			return true;
		case 'ｶ':
			return true;
		case 'ｷ':
			return true;
		case 'ｸ':
			return true;
		case 'ｹ':
			return true;
		case 'ｺ':
			return true;
		case 'ｻ':
			return true;
		case 'ｼ':
			return true;
		case 'ｽ':
			return true;
		case 'ｾ':
			return true;
		case 'ｿ':
			return true;
		case 'ﾀ':
			return true;
		case 'ﾁ':
			return true;
		case 'ﾂ':
			return true;
		case 'ﾃ':
			return true;
		case 'ﾄ':
			return true;
		case 'ﾅ':
			return true;
		case 'ﾆ':
			return true;
		case 'ﾇ':
			return true;
		case 'ﾈ':
			return true;
		case 'ﾉ':
			return true;
		case 'ﾊ':
			return true;
		case 'ﾋ':
			return true;
		case 'ﾌ':
			return true;
		case 'ﾍ':
			return true;
		case 'ﾎ':
			return true;
		case 'ﾏ':
			return true;
		case 'ﾐ':
			return true;
		case 'ﾑ':
			return true;
		case 'ﾒ':
			return true;
		case 'ﾓ':
			return true;
		case 'ﾔ':
			return true;
		case 'ﾕ':
			return true;
		case 'ﾖ':
			return true;
		case 'ﾗ':
			return true;
		case 'ﾘ':
			return true;
		case 'ﾙ':
			return true;
		case 'ﾚ':
			return true;
		case 'ﾛ':
			return true;
		case 'ﾜ':
			return true;
		case 'ﾝ':
			return true;
		case 'ﾞ':
			return true;
		case 'ﾟ':
			return true;
		case '(':
			return true;
		case ')':
			return true;
		case '｢':
			return true;
		case '｣':
			return true;
		case '/':
			return true;
		case '-':
			return true;
		case '.':
			return true;
		case '\\':
			return true;
		case ' ':
			return true;
		}
		return false;
	}
}
