package jp.co.myapp.common.util;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.Objects;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.http.HttpServletRequest;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.MessageSource;
import org.springframework.context.NoSuchMessageException;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PropertiesLoaderUtils;
import org.springframework.util.StringUtils;

import jp.co.myapp.common.Constants;
import jp.co.myapp.common.ConstantsEnum;
import jp.co.myapp.common.ConstantsEnum.ENTRY_STATUS;
import jp.co.myapp.common.ConstantsEnum.ENTRY_TYPE;

public class MyUtils {

	private static final Logger logger = LoggerFactory.getLogger(MyUtils.class);

	private static String maxStartDate = null;

	/**
	 * Stringのemptyチェック
	 *
	 * @param str
	 * @return
	 */
	public static boolean isEmpty(Integer obj) {

		return obj == null;
	}

	/**
	 * Longのemptyチェック
	 *
	 * @param Long
	 * @return
	 */
	public static boolean isEmpty(Long obj) {
		return obj == null;
	}

	/**
	 * Stringのemptyチェック
	 *
	 * @param str
	 * @return
	 */
	public static boolean isEmpty(String str) {
		if (str == null) {
			return true;
		}
		return StringUtils.isEmpty(str.trim());
	}

	/**
	 * メッセージの内容を取得する
	 *
	 * @param id
	 *            String
	 * @param local
	 *            Locale
	 * @param params
	 *            String[]
	 * @return
	 */
	public static String getMessageDiscription(MessageSource messageSource, String id, Object[] args, Locale locale) {
		String discription = null;
		try {
			discription = messageSource.getMessage(id, args, locale);
		} catch (NoSuchMessageException ex) {
			logger.error(ex.toString());
			return id;
		}
		return discription;
	}

	/**
	 *
	 * @param str
	 * @return
	 */
	public static String[] getMsgParams(String str) {
		String[] params = null;
		if (str.startsWith("{") && str.endsWith("}")) {
			str = str.substring(1, str.length() - 1);
			params = str.split(";");
		}
		return params;
	}

	/**
	 *
	 * @param str
	 * @return
	 */
	public static boolean isMsgParamString(String str) {
		if (str.startsWith("'") && str.endsWith("'")) {
			return true;
		}
		return false;
	}

	/**
	 * StringからCharへ変更する
	 *
	 * @param str
	 * @return
	 */
	public static char changeToChar(String str) {
		return str.charAt(0);
	}

	public static String replaceDateStr(String str) {
		String result = str;
		if (!StringUtils.isEmpty(result)) {
			result = result.trim().replace("/", "").replace("-", "");
		}
		return result;
	}

	public static Date getSystemDate() {
		return Date.from(LocalDate.now().atStartOfDay(ZoneId.systemDefault()).toInstant());
	}

	public static Date getSystemDateTime() {
		return new Date();
	}

	public static Date getSystemDateTimeAfterDays(int afterDays) {
		Calendar nextCal = Calendar.getInstance();
		nextCal.setTime(getSystemDateTime());
		nextCal.add(Calendar.DAY_OF_MONTH, afterDays);
		return nextCal.getTime();
	}

	/**
	 * 最小保険始期日を取得
	 *
	 * @return
	 */
	public static DateTime getShikiMinDate(String status) {
		// 保険始期日最小値：システム日付の5日後を取得する。 ⇒ vsts2915 により5日に変更
		// ⇒vsts3850:ステータスが再アップ依頼の場合、保険始期日の16:00に変更
		DateTime dt = new DateTime(getSystemDate());
		if (ENTRY_STATUS.RE_UPLOAD.getId().equals(status)) {
			// ステータスが再アップ依頼の場合、16時までは当日、16時以降は翌日
			if (changeToString(getSystemDateTime(), Constants.TIME_FORMAT_HHMMSS).compareTo(Constants.CONS_TIME) > 0) {
				dt = dt.plusDays(1);
			}
			return dt;
		}
		if (dt.compareTo(Constants.DT_MIN_START_DATE.plusDays(-Constants.SHIKIBI_DIFF)) < 0) {
			dt = Constants.DT_MIN_START_DATE;
		} else {
			dt = dt.plusDays(Constants.SHIKIBI_DIFF);
			// 16時までは当日、16時以降は翌日
			if (changeToString(getSystemDateTime(), Constants.TIME_FORMAT_HHMMSS).compareTo(Constants.CONS_TIME) > 0) {
				dt = dt.plusDays(1);
			}
		}
		return dt;
	}

	/**
	 * 最大保険始期日を取得
	 *
	 * @return
	 */
	public static DateTime getShikiMaxDate() {
		// 保険始期日最大値：3ヶ月後の末日を取得する。
		DateTime dt = new DateTime(getSystemDate());
		dt = dt.plusMonths(3).dayOfMonth().withMaximumValue();

		// vsts3659 始期日の最大をsystem.propertiesから取得(propertiesファイルは起動後の初回実行時のみread)
		if (maxStartDate == null) {
			maxStartDate = "";
			try {
				Resource resource = new ClassPathResource(Constants.SYSTEM_PROPERTIES_FILE);
				Properties props = PropertiesLoaderUtils.loadProperties(resource);
				maxStartDate = props.getProperty("max_start_date");
			} catch (IOException e) {
				logger.warn(e.getMessage());
			}
		}
		if (!StringUtils.isEmpty(maxStartDate)) {
			DateTime limitDate = new DateTime(maxStartDate);
			if (dt.compareTo(limitDate) > 0)
				dt = limitDate;

		}
		return dt;
	}

	public static String changeToString(Date date, String patten) {
		if (date == null) {
			return "";
		}
		DateTime dt = new DateTime(date);
		return dt.toString(patten);
	}

	public static Date changeToDate(String date, String patten) {
		DateTime dt = DateTime.parse(date, DateTimeFormat.forPattern(patten));
		return dt.toDate();
	}

	public static Date plusDays(Date date, int day) {
		DateTime dt = new DateTime(date);
		return dt.plusDays(day).toDate();
	}

	public static Date plusMonths(Date date, int month) {
		DateTime dt = new DateTime(date);
		return dt.plusMonths(month).toDate();
	}

	public static Date plusYears(Date date, int year) {
		DateTime dt = new DateTime(date);
		return dt.plusYears(year).toDate();
	}

	public static Date getMonthLastDay(Date date) {
		DateTime dateTime = new DateTime(date);
		return dateTime.dayOfMonth().withMaximumValue().toDate();
	}

	/**
	 * Stringが正しく入力されることをチェックする
	 *
	 * @param str
	 * @param regEx
	 * @return
	 */
	public static boolean chkStringByPatten(String str, String regEx) {
		if (StringUtils.isEmpty(str)) {
			// チェックしない
			return true;
		}

		return str.matches(regEx);
	}

	public static String toStringOrEmpty(Object val) {
		if (Objects.isNull(val)) {
			return "";
		}
		return val.toString();
	}

	public static String toString(Object val) {
		if (Objects.isNull(val)) {
			return null;
		}
		return val.toString();
	}

	public static Integer parseInteger(String val) {
		if (MyUtils.isEmpty(val)) {
			return null;
		}
		return Integer.parseInt(val);
	}

	public static Long parseLong(String val) {
		if (MyUtils.isEmpty(val)) {
			return null;
		}
		return Long.parseLong(val);
	}

	public static int parseInt(String val) {
		Integer result = parseInteger(val);
		if (result == null) {
			result = 0;
		}
		return result;
	}

	public static long parseTolong(Long val) {
		Long result = val;
		if (result == null) {
			result = 0L;
		}
		return result;
	}

	public static boolean isLocalhost(HttpServletRequest request) {
		try {
			String thisUrl = request.getRequestURL().toString();
			thisUrl = thisUrl.substring(0, thisUrl.lastIndexOf("/"));
			return (thisUrl.contains("localhost") || thisUrl.contains("192.168."));
		} catch (Exception e) {
			return false;
		}
	}

	/**
	 * システム日付
	 *
	 * @return
	 */
	public static String getSystemDateString() {
		Date idoDate = MyUtils.getSystemDateTime();
		SimpleDateFormat sdf = new SimpleDateFormat(Constants.DATE_FORMAT_YYYYMD_JP);
		String idoDateStr = sdf.format(idoDate);
		return idoDateStr;
	}

	/**
	 * システム日時
	 *
	 * @return
	 */
	public static String getSystemDatetimeString() {
		Date idoDate = MyUtils.getSystemDateTime();
		SimpleDateFormat sdf = new SimpleDateFormat(Constants.DATE_FORMAT_YYYYMMDD_HH_MM_SS_SSS);
		String idoDateStr = sdf.format(idoDate);
		return idoDateStr;
	}

	/**
	 * equals
	 *
	 * @param o1
	 * @param o2
	 * @return
	 */
	public static boolean isEquals(Object o1, Object o2) {
		if (o1 == null && o2 == null) {
			return true;
		} else if (o1 == null && o2 != null) {
			return false;
		} else if (o1 != null && o2 == null) {
			return false;
		}
		return o1.equals(o2);
	}

	/**
	 * ペーパレスのときのみチェック
	 *
	 * @param entryType
	 * @return
	 */
	public static boolean isPaperless(String entryType) {
		if (ENTRY_TYPE.PAPERLESS.getId().equals(entryType)) {
			return true;
		}
		return false;
	}

	public static boolean checkIsDate(String str, String pattern) {
		boolean result = true;
		if (StringUtils.isEmpty(str)) {
			return result;
		}

		SimpleDateFormat df = new SimpleDateFormat(pattern);

		try {
			df.setLenient(false);
			df.parse(MyUtils.replaceDateStr(str));
		} catch (ParseException e) {
			result = false;
		}

		return result;
	}

	public static boolean checkByPattern(String str, String regEx) {
		boolean result = true;
		if (StringUtils.isEmpty(str)) {
			return result;
		}

		return checkByPatternExistEmpty(str, regEx);
	}

	public static boolean checkByPatternExistEmpty(String str, String regEx) {
		if (str == null) {
			return false;
		}

		if (!StringUtils.isEmpty(regEx)) {
			Pattern pattern = Pattern.compile(regEx);
			Matcher matcher = pattern.matcher(str);
			return matcher.matches();
		}

		return true;
	}

	/**
	 * AgentからAcountを逆引きする
	 *
	 * @param agentCd
	 * @throws IOException
	 */
	public static String getAcountOfAgent(String agentCd) throws IOException {

		Resource resource = new ClassPathResource(Constants.AGENT_INFO_MANAGE_FILE);
		Properties props = PropertiesLoaderUtils.loadProperties(resource);

		for (Iterator<?> i = props.keySet().iterator(); i.hasNext();) {
			String key = (String) i.next();
			String val = props.getProperty(key);
			if (val.equals(agentCd)) {
				return key;
			}
		}

		return "";
	}

	/**
	 * 日付文字列をYYYY(GGGGyyyy)年M月にフォーマットします。
	 *
	 * @param dateStr
	 * @param fromatDate
	 * @return フォーマット日付文字列
	 */
	public static String changeToDateStrJP(String dateStr, String fromatDate) {

		String strDate = Constants.BLANK;
		if (isEmpty(dateStr)) {
			return strDate;
		}
		int year = Integer.valueOf(dateStr.substring(0, 4));
		String yearStr = dateStr.substring(0, 4);
		String month = Integer.valueOf(dateStr.substring(4, 6)) + "月";
		if (dateStr.compareTo("201904") > 0) {
			strDate = yearStr + "(令和" + (year - 2018) + ")年" + month;
		} else {
			if (yearStr.compareTo("1989") > 0 && yearStr.compareTo("2020") < 0) {
				return yearStr + "(平成" + (year - 1988) + ")年" + month;
			} else if (yearStr.compareTo("1989") == 0) {
				return yearStr + "(平成元)年" + month;
			} else if (yearStr.compareTo("1926") > 0 && yearStr.compareTo("1989") < 0) {
				return yearStr + "(昭和" + (year - 1925) + ")年" + month;
			} else if (yearStr.compareTo("1926") == 0) {
				return yearStr + "(昭和元)年" + month;
			} else if (yearStr.compareTo("1912") > 0 && yearStr.compareTo("1926") < 0) {
				return yearStr + "(大正" + (year - 1911) + ")年" + month;
			} else if (yearStr.compareTo("1912") == 0) {
				return yearStr + "(大正元)年" + month;
			} else {
				return Constants.BLANK;
			}
		}
		// try {
		// Date dt = MyUtils.changeToDate(dateStr, fromatDate);
		// Locale locale = Constants.LOCALE_JP;
		// DateFormat japaneseFormat = new
		// SimpleDateFormat(Constants.DATE_FORMAT_GGGGYYYY_M_JP, locale);
		// strDate = changeToString(dt, Constants.DATE_FORMAT_YYYY) +
		// japaneseFormat.format(dt);
		// } catch (Exception ex) {
		// strDate = Constants.BLANK;
		// }
		return strDate;
	}

	/**
	 * 火災保険支払方法検索用SQLを作成
	 *
	 * @param firePaymentMethod
	 */
	public static String createFirePaymentMethodSql(String[] firePaymentMethod) {

		StringBuffer searchSql = new StringBuffer(Constants.BLANK);
		if (null != firePaymentMethod) {
			for (String searchMethod : firePaymentMethod) {
				if ("11".equals(searchMethod)) {
					// 火災保険払込方法_一時払:火災保険払込方法＝１ かつ、火災保険期間＝１
					searchSql.append(" OR ( kasai_hoho = '").append(ConstantsEnum.PAYMENT_METHOD.TEMPORARY.getId())
							.append("' AND kasai_hkikan = ").append(Constants.ONE_YEAR).append(" )");
				} else if ("12".equals(searchMethod)) {
					// (火災保険払込方法_長期一括払:火災保険払込方法＝１ OR 2)、火災保険期間＞１
					searchSql.append(" OR (( kasai_hoho = '").append(ConstantsEnum.PAYMENT_METHOD.TEMPORARY.getId())
							.append("' OR kasai_hoho = '").append(ConstantsEnum.PAYMENT_METHOD.LUMPSUM.getId())
							.append("') AND kasai_hkikan > ").append(Constants.ONE_YEAR).append(" )");
				} else if (ConstantsEnum.PAYMENT_METHOD.LUMPSUM.getId().equals(searchMethod)) {
					// 火災保険払込方法_一般分割:火災保険支払方法＝２ かつ、保険期間＝１
					searchSql.append("' OR ( kasai_hoho = '").append(ConstantsEnum.PAYMENT_METHOD.LUMPSUM.getId())
							.append("' AND kasai_hkikan = ").append(Constants.ONE_YEAR).append(" )");
				} else if (ConstantsEnum.PAYMENT_METHOD.ANNUAL.getId().equals(searchMethod)) {
					// 火災保険払込方法_長期年払:火災保険支払方法＝５
					searchSql.append("' OR kasai_hoho = '").append(ConstantsEnum.PAYMENT_METHOD.ANNUAL.getId())
							.append("' )");
				}
			}
		}

		if (searchSql.length() > 0) {
			searchSql.insert(0, "( 1 = 2").append(")");
		}
		return searchSql.toString();
	}

	/**
	 * 火災保険支払方法表示用名称
	 *
	 * @param paymentType
	 * @param fireTerm
	 * @param firePaymentMethod
	 */
	public static String getFirePaymentMethodName(String paymentType, Integer fireTerm, String firePaymentMethod) {

		String showName = Constants.BLANK;

		if (ConstantsEnum.PAYMENT_METHOD.TEMPORARY.getId().equals(firePaymentMethod) && fireTerm != null
				&& fireTerm == Constants.ONE_YEAR) {
			// 火災保険払込方法_一時払:火災保険払込方法＝1 かつ、火災保険期間＝１
			showName = "一時払";
		} else if ((ConstantsEnum.PAYMENT_METHOD.TEMPORARY.getId().equals(firePaymentMethod)
				|| ConstantsEnum.PAYMENT_METHOD.LUMPSUM.getId().equals(firePaymentMethod)) && fireTerm != null
				&& fireTerm > Constants.ONE_YEAR) {
			// 火災保険払込方法_長期一括払:火災保険払込方法＝1 OR 2、 かつ火災保険期間＞１
			showName = "長期一括払";
		} else if (ConstantsEnum.PAYMENT_METHOD.LUMPSUM.getId().equals(firePaymentMethod) && fireTerm != null
				&& fireTerm == Constants.ONE_YEAR) {
			// 火災保険払込方法_一般分割:火災保険支払方法＝２かつ、保険期間＝１
			showName = "一般分割";
		} else if (ConstantsEnum.PAYMENT_METHOD.ANNUAL.getId().equals(firePaymentMethod)) {
			// 火災保険払込方法_長期年払:火災保険支払方法＝５
			showName = "長期年払";
		}
		return showName;
	}

	/**
	 * 地震保険払込方法表示用名称
	 *
	 * @param earthquakePaymentMethod
	 */
	public static String createEarthquakePaymentMethodSql(String[] earthquakePaymentMethod) {

		StringBuffer searchSql = new StringBuffer(Constants.BLANK);
		if (null != earthquakePaymentMethod) {
			for (String searchMethod : earthquakePaymentMethod) {
				if ("11".equals(searchMethod)) {
					// 地震保険払込方法_一時払:地震保険払込方法＝1 かつ、地震保険期間＝１
					searchSql.append(" OR ( jishin_hoho = '").append(ConstantsEnum.PAYMENT_METHOD.TEMPORARY.getId())
							.append("' AND jishin_hkikan = ").append(Constants.ONE_YEAR).append(" )");
				} else if ("12".equals(searchMethod)) {
					// 地震保険払込方法_長期一括払:地震保険払込方法＝1 OR 2 かつ、地震保険期間＞１
					searchSql.append(" OR (( jishin_hoho = '").append(ConstantsEnum.PAYMENT_METHOD.TEMPORARY.getId())
							.append("' OR jishin_hoho = '").append(ConstantsEnum.PAYMENT_METHOD.LUMPSUM.getId())
							.append("') AND jishin_hkikan > ").append(Constants.ONE_YEAR).append(" )");
				} else if (ConstantsEnum.PAYMENT_METHOD.LUMPSUM.getId().equals(searchMethod)) {
					// 地震保険払込方法_一般分割:地震保険支払方法＝２ かつ、保険期間＝１
					searchSql.append("' OR ( jishin_hoho = '").append(ConstantsEnum.PAYMENT_METHOD.LUMPSUM.getId())
							.append("' AND jishin_hkikan = ").append(Constants.ONE_YEAR).append(" )");
				} else if (ConstantsEnum.PAYMENT_METHOD.ANNUAL.getId().equals(searchMethod)) {
					// 地震保険払込方法_長期年払:地震保険支払方法＝５
					searchSql.append("' OR jishin_hoho = '").append(ConstantsEnum.PAYMENT_METHOD.ANNUAL.getId())
							.append("' )");
				}
			}
		}

		if (searchSql.length() > 0) {
			searchSql.insert(0, "( 1 = 2").append(" )");
		}
		return searchSql.toString();
	}

	/**
	 * 地震保険払込方法表示用名称
	 *
	 * @param paymentType
	 * @param earthquakeTerm
	 * @param earthquakePaymentMethod
	 */
	public static String getEarthquakePaymentMethodName(String paymentType, Integer earthquakeTerm,
			String earthquakePaymentMethod) {

		String showName = Constants.BLANK;

		if (ConstantsEnum.PAYMENT_METHOD.TEMPORARY.getId().equals(earthquakePaymentMethod) && earthquakeTerm != null
				&& earthquakeTerm == Constants.ONE_YEAR) {
			// 地震保険払込方法_一時払:地震保険払込方法＝1 かつ、地震保険期間＝１
			showName = "一時払";
		} else if ((ConstantsEnum.PAYMENT_METHOD.TEMPORARY.getId().equals(earthquakePaymentMethod)
				|| ConstantsEnum.PAYMENT_METHOD.LUMPSUM.getId().equals(earthquakePaymentMethod))
				&& earthquakeTerm != null && earthquakeTerm > Constants.ONE_YEAR) {
			// 地震保険払込方法_長期一括払:地震保険払込方法＝1 OR 2)、かつ、地震保険期間＞１
			showName = "長期一括払";
		} else if (ConstantsEnum.PAYMENT_METHOD.LUMPSUM.getId().equals(earthquakePaymentMethod)
				&& earthquakeTerm != null && earthquakeTerm == Constants.ONE_YEAR) {
			// 地震保険払込方法_一般分割:地震保険支払方法＝２ かつ、保険期間＝１
			showName = "一般分割";
		} else if (ConstantsEnum.PAYMENT_METHOD.ANNUAL.getId().equals(earthquakePaymentMethod)) {
			// 地震保険払込方法_長期年払:地震保険支払方法＝５
			showName = "長期年払";
		}
		return showName;
	}

	/**
	 * 火災保険支払方法表示用名称CSV用
	 *
	 * @param paymentType
	 * @param fireTerm
	 * @param firePaymentMethod
	 */
	public static String getFirePaymentMethodNameCSV(String paymentType) {

		String showName = Constants.BLANK;

		if (ConstantsEnum.KAZAI_PAYMENTMETHOD.ONE.getId().equals(paymentType)
				|| ConstantsEnum.KAZAI_PAYMENTMETHOD.FIVE.getId().equals(paymentType)) {
			// 火災保険払込方法1 5 「年払・一時払」
			showName = "年払・一時払";
		} else if (ConstantsEnum.KAZAI_PAYMENTMETHOD.TWO.getId().equals(paymentType)) {
			// 火災保険払込方法 2 「月払」
			showName = "月払";
		}
		return showName;
	}
}
