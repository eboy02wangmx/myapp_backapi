package jp.co.myapp.common;

import java.util.Locale;

import org.joda.time.DateTime;

/*****************************************************************
*
*  変更履歴:
*                      訂正連絡一覧を追加    2019/02/18 BY 曲
*
*****************************************************************/
public class Constants {

    public static final boolean IS_DEVELOP = true; // 開発中モード
    public static final String DUMMY_OPENID = "test_openid"; // ダミーOPENID

    public static final String DEFAULT_ACCOUNT_CODE = "9302032";

    public static final String API_TIME_ZONE = "Asia/Tokyo";

    public static final String CODE_UTF_EIGHT = "UTF-8";

    public static final String LOGIN_KEY_AGENCY = "agency_code";
    public static final String SELF_AGENT_CODE = "selfAgentCode";
    public static final String LOGIN_KEY_ENTRY_TYPE = "entry_type";
    public static final String LOGIN_KEY_AGENT_CODE = "agent_code";
    public static final String SESSION_KEY_AGENT_CODE = "agent_code";
    public static final String LOGIN_KEY_PATTERN_CD = "pattern_code";
    public static final String SESSION_KEY_ENTRY_NO = "EntryNo";
    public static final String SESSION_KEY_CSRF_TOKEN = "csrf_token";
    public static final String DATE_FORMAT_YYYY = "yyyy";
    public static final String DATE_FORMAT_YYYYMMDD = "yyyyMMdd";
    public static final String DATE_FORMAT_YYYYMMDD_SPLIT = "yyyy/MM/dd";
    public static final String TIME_FORMAT_HHMMSS = "HHmmss";
    public static final String DATE_FORMAT_YYYYMMDD_HHMMSS = "yyyyMMdd HHmmss";
    public static final String DATE_FORMAT_YYYYMMDDHHMMSS = "yyyyMMddHHmmss";
    public static final String DATE_FORMAT_YYYYMMDD_HH_MM_SS_SSS = "yyyyMMdd HH:mm:ss.SSS";
    public static final String DATETIME_FORMAT_YYYYMMDD_HH_MM_SS_SSS = "yyyyMMddHHmmssSSS";
    public static final String DATE_FORMAT_YYYYMM = "yyyyMM";
    public static final String DATE_FORMAT_YYYYMMDD_JP = "yyyy年MM月dd日";
    public static final String DATE_FORMAT_YYYYMD_JP = "yyyy年M月d日";
    public static final String DATE_FORMAT_YYYYMM_JP = "yyyy年MM月";
    public static final String DATE_FORMAT_YYYYM_JP = "yyyy年M月";
    public static final String DATE_FORMAT_YYYYMD_HHMMSS_JP = "yyyy年M月d日 HH:mm:ss";
    public static final String DATE_FORMAT_YYYYMD_HHMM_JP = "yyyy年M月d日 HH時mm分";
    public static final String DATE_FORMAT_UUUUMMDD = "uuuuMMdd";
    public static final String TIME_FORMAT_HHHOUR = "HH時";
	public static final String DATE_FORMAT_GGGGYYYY_M_JP = "(GGGGyyyy)年M月";
	public static final Locale LOCALE_JP = new Locale("ja", "JP", "JP");

    public static final String YES_JP = "1";
    public static final String NO_JP = "2";
    public static final String NOTHING = "-";
    public static final String BLANK = "";

    // ファイルアップロード最大サイズ
    public static final int FILE_UPLOAD_MAX_SIZE = 5 * 1024 * 1024;
    public static final int THUMBNAIL_WIDTH = 256;
    public static final int THUMBNAIL_HEIGHT = 256;
    public static final String THUMBNAIL_SUFFIX = "PNG";

    // Config
    public static final String AGENT_INFO_MANAGE_FILE = "/AgentInfoManage.properties";
    public static final String SYSTEM_PROPERTIES_FILE = "/system.properties";

    // hhmmss 固定値「160000」
    public static final String CONS_TIME = "160000";

    // 最小値は2019/01/01
    public static final String MIN_START_DATE = "20190101";
    public static final DateTime DT_MIN_START_DATE = new DateTime("2019-01-01");

    public static final String CHECK_TURE = "1";

    public static final String NUMBER_0 = "0";
    public static final String ERROR_CD_0 = "0";

    // 全角ひらかなのREGEXP
    public static final String REGEXP_FULL_HIRAKANA = "^[\\u3040-\\u309F]+$";
    // 全角カタカナのREGEXP
    public static final String REGEXP_FULL_KATAKANA = "^[\\u30A0-\\u30FF]+$";
    // 全角のREGEXP
    public static final String REGEXP_FULL_JP_STRING = "^[^[\\u3040-\\u309F\\u30A0-\\u30FF\\u4e00-\\u9fa5\\uFF10-\\uFF19\\uFF21-\\uFF3A\\uFF41-\\uFF5A\\uFF01-\\uFF5E\\uFFE0-\\uFFE5]+$]+$";

    // 建物面積のREGEXP
    public static final String REGEXP_BUILDING_AREA = "^(([1-9][0-9]{0,4})|0)(\\.(\\d){1,3})?$";
    // 金額のREGEXP
    public static final String REGEXP_AMOUNT_REQUIRED = "^[0-9]+$";
    // 半角数字のREGEXP
    public static final String REGEXP_NUMBER_REQUIRED = "^[0-9]+$";
    // 半角英数字のREGEXP
    public static final String REGEXP_NUMBERASC_REQUIRED = "^[0-9a-zA-Z]+$";
    public static final String ANNOTATION_START_CUSTOMIZE = "Customize";

    public static final String KANRI_GAMEN_ID_START = "G-MG1-";

    public static final String ERROR_E00000 = "E00000";
    public static final String ERROR_E00001 = "E00001";
    public static final String ERROR_E00002 = "E00002";
    public static final String ERROR_E00003 = "E00003";
    public static final String ERROR_E00004 = "E00004";
    public static final String ERROR_E00005 = "E00005";
    public static final String ERROR_E00006 = "E00006";
    public static final String ERROR_E00007 = "E00007";
    public static final String ERROR_E00008 = "E00008";
    public static final String ERROR_E00009 = "E00009";
    public static final String ERROR_E00010 = "E00010";
    public static final String ERROR_E00011 = "E00011";
    public static final String ERROR_E00012 = "E00012";
    public static final String ERROR_E00013 = "E00013";
    public static final String ERROR_E00014 = "E00014";
    public static final String ERROR_E00015 = "E00015";
    public static final String ERROR_E00016 = "E00016";
    public static final String ERROR_E00017 = "E00017";
    public static final String ERROR_E00018 = "E00018";
    public static final String ERROR_E00019 = "E00019";
    public static final String ERROR_E00020 = "E00020";
    public static final String ERROR_E00021 = "E00021";
    public static final String ERROR_E00024 = "E00024";
    public static final String ERROR_E00026 = "E00026";
    public static final String ERROR_E00027 = "E00027";
    public static final String ERROR_E00038 = "E00038";
    public static final String ERROR_E00039 = "E00039";
    public static final String ERROR_E00040 = "E00040";
    public static final String ERROR_E00041 = "E00041";
    public static final String ERROR_E00042 = "E00042";
    public static final String ERROR_E00043 = "E00043";
    public static final String ERROR_E00044 = "E00044";
    public static final String ERROR_E00047 = "E00047";
    public static final String ERROR_E00048 = "E00048";
    public static final String ERROR_E00049 = "E00049";
    public static final String ERROR_E00050 = "E00050";
    public static final String ERROR_E00052 = "E00052";
    public static final String ERROR_E00053 = "E00053";
    public static final String ERROR_E00054 = "E00054";
    public static final String ERROR_E00055 = "E00055";
    public static final String ERROR_E00056 = "E00056";
    public static final String ERROR_E00057 = "E00057";
    public static final String ERROR_E00058 = "E00058";

    //契約登録情報追加  2018/11/13  ADD  START
    public static final String ERROR_E00059 = "E00059";
    public static final String ERROR_E00060 = "E00060";
    public static final String ERROR_E00061 = "E00061";
    public static final String ERROR_E00062 = "E00062";
    public static final String ERROR_E00063 = "E00063";
    public static final String ERROR_E00064 = "E00064";
    public static final String ERROR_E00065 = "E00065";
    public static final String ERROR_E00066 = "E00066";
    //契約登録情報追加  2018/11/13  ADD  END

    //管理画面訂正画面チェック追加　ADD　START
    public static final String ERROR_E00067 = "E00067";
    public static final String ERROR_E00068 = "E00068";
    public static final String ERROR_E00069 = "E00069";
    public static final String ERROR_E00070 = "E00070";
    // 20190529 Release 管理画面訂正画面 メッセージ変更
    public static final String ERROR_E00073 = "E00073";
    // 管理画面訂正画面チェック追加　ADD　END
    public static final String ERROR_E00071 = "E00071";
    public static final String ERROR_E00072 = "E00072";
    public static final String ERROR_E00101 = "E00101";
    public static final String ERROR_I00001 = "I00001";
    public static final String ERROR_I00002 = "I00002";
    public static final String ERROR_I00003 = "I00003";
    public static final String ERROR_I00004 = "I00004";
    public static final String ERROR_I00020 = "I00020";

    public static final String ERROR_W00001 = "W00001";
    public static final String ERROR_W00002 = "W00002";
    public static final String ERROR_W00003 = "W00003";
	public static final String ERROR_W00006 = "W00006";
	public static final String ERROR_E00110 = "E00110";

    // 点検実施区分 点検前
    public static final String[] INSPECTIONTYPEBEF = new String[] { "1", "2", "3" };
    // 点検実施区分 点検後
    public static final String[] INSPECTIONTYPEAFT = new String[] { "4", "5", "6", "7" };
    // 点検実施区分 ALL
    public static final String[] INSPECTIONTYPEALL = new String[] { "1", "2", "3", "4", "5", "6", "7" };

    // Session情報に”RefEntryNo”
    public static final String REF_ENTRY_NO = "RefEntryNo";

    // Session情報に”REF_SCREEN_ID”
    public static final String REF_SCREEN_ID = "RefScreenID";

    // Session情報に”REF_ACTION”
    public static final String REF_ACTION = "RefAction";

    public static final String REF_SEC_KEY = "tVSRqY8Q7PyhvVYy";

    // Session情報に”REF”
    public static final String REF = "Ref";

    // Session情報に”REF”
    public static final String MYTOKEN = "myToken";

    // Session情報に”EntryNo”
    public static final String OPERATION_ENTRY_NO = "OperationEntryNo";

    // セッションに申込区分
    public static final String OPERATION_ENTRY_TYPE = "OperationEntryType";
    // セッションに保険始期日を格納する
    public static final String OPERATION_START_DATE = "OperationStartDate";


    // 見積書
    /** メールタイトル */
    public static String ESTIMATE_MAIL_TITLE = "【楽天損保】お見積書の送付";
    /** メールTemplate */
    public static String ESTIMATE_MAIL_TEMPLATE = "estimation-create.ftl";

    /** セッションからOpenIDを取得するためのキー. */
    public static final String OPEN_ID = "openId";

    /** ログ出力文字列 開始 */
    public static final String START = "開始";

    /** ログ出力文字列 終了 */
    public static final String END = "終了";

    /** 採番用シーケンス */
    public static final String SQL_M01 = "acceptance_seq";

    public static final String PATTERN_CD = "PATTERN_CD";

    /////////////////// 定数 ////////////////////////
    /** 含む */
    public static final String INCUDE = "含む";
    /** 含まない */
    public static final String NOT_INCUDE = "含まない";
    /** ハイフン */
    public static final String HYPHEN = "-";
    /** 始期終期時間 */
    public static final String START_END_TIME = "午後4時";
    /** 半角スペース */
    public static final String HALF_SPACE = " ";
    /** から */
    public static final String FROM = "から";
    /** まで */
    public static final String TO = "まで";
    /** 年間 */
    public static final String YEAR = "年間";
    /** 契約者に同じ */
    public static final String SAME_CONTRACTOR = "契約者に同じ";
    /** 契約者住所に同じ */
    public static final String SAME_ADDRESS = "契約者住所に同じ";
    /** 自動継続 */
    public static final String AUTOMATIC_CONTINUATION = "（自動継続）";
    /** 地震保険なし */
    public static final String NOT_JISHIN_HOKEN = "（地震保険なし）";
    /** 自動継続コード（地震保険要） */
    public static final String AUTOMATIC_CONTINUATION_CODE = "07";
    /** 特約なし */
    public static final String TOKUYAKU_NASHI = "2";
    /** 特約あり */
    public static final String TOKUYAKU_ARI = "1";
    /** 含むフラグFALSE */
    public static final String INCUDE_FLG_FALSE = "2";
    /** 含むフラグTRUE */
    public static final String INCUDE_FLG_TRUE = "1";
    /** 代理店フラグTRUE */
    public static final String DAIRITEN_FLG_TRUE = "2";
    /** 一戸建て */
    public static final String DETACHED_HOUSE = "1戸";
    /** 100% */
    public static final String TEN_PERCENT = "100";
    /** 保障されます */
    public static final String GUARANTEE = "○ 補償されます";
    /** 保障されません */
    public static final String NOT_GUARANTEE = "× 補償されません";
    /** ○ */
    public static final String CIRCLE = "○";
    // 訂正連絡一覧を追加 2019/02/18 ADD START
    /** × */
    public static final String BATU = "×";
    // 訂正連絡一覧を追加 2019/02/18 ADD END
    /** 免震建築物割引コード値 */
    public static final String ISOLATED_BUILDING_DISCOUNT_CD = "2";
    /** 免震等級割引コード値 */
    public static final String SEISMIC_GRADE_DISCOUNT_CD = "3";
    /** 耐震診断割引コード値 */
    public static final String SEISMIC_DIAGNOSTIC_DISCOUNT_CD = "4";
    /** 建築年割引コード値 */
    public static final String YEARLY_DISCOUNT_CD = "5";
    /** 地上 */
    public static final String GROUND = "地上";
    /** 地下 */
    public static final String UNDERGROUND = "地下";
    /** 階 */
    public static final String FLOOR = "階";
    /** インターネット等による通信販売に関する特約 */
    public static final String MAIL_ORDER_CONCERN_SPECIAL_CONTRACT = "OTHER1";
    /** 保険証券等の発行省略に関する特約 */
    public static final String INSURANCE_POLICY_OMISSION = "OTHER2";
    /** 国内無制限 */
    public static final String UNLIMITED_DOMESTIC = "○ 国内無制限（海外1億円）";
    /** 類焼損害補償特約 支払限度額 */
    public static final String TOKKU_RUI_LIMIT = "○ 1億円";
    /** 300万円 */
    public static final String THREE_MILLION_YEN = "○ 300万円";
    /** 職作業コード専用住宅 */
    public static final String SHOKSA_CD_PRIVATE_RESIDENCE = "010";
    /** 特約コード（33） */
    public static final String TOKU_CODE_33 = "33";
    /** 特約コード（G8） */
    public static final String TOKU_CODE_G8 = "G8";
    /** 特約1 */
    public static final int TOKU_1 = 1;
    /** 特約2 */
    public static final int TOKU_2 = 2;
    /** 特約3 */
    public static final int TOKU_3 = 3;
    /** 特約4 */
    public static final int TOKU_4 = 4;
    /** 特約5 */
    public static final int TOKU_5 = 5;
    /** 特約6 */
    public static final int TOKU_6 = 6;
    /** 特約7 */
    public static final int TOKU_7 = 7;
    /** 特約8 */
    public static final int TOKU_8 = 8;
    /** 特約9 */
    public static final int TOKU_9 = 9;
    /** 特約10 */
    public static final int TOKU_10 = 10;
    /** 特約11 */
    public static final int TOKU_11 = 11;
    /** 特約12 */
    public static final int TOKU_12 = 12;
    /** 特約13 */
    public static final int TOKU_13 = 13;
    /** 特約14 */
    public static final int TOKU_14 = 14;
    /** 特約15 */
    public static final int TOKU_15 = 15;
    /** 特約16 */
    public static final int TOKU_16 = 16;
    /** 特約17 */
    public static final int TOKU_17 = 17;
    /** 特約18 */
    public static final int TOKU_18 = 18;
    /** 特約19 */
    public static final int TOKU_19 = 19;
    /** 特約20 */
    public static final int TOKU_20 = 20;
    /** 割増引1 */
    public static final int WAWRI_1 = 1;
    /** 割増引2 */
    public static final int WAWRI_2 = 2;
    /** 割増引3 */
    public static final int WAWRI_3 = 3;
    /** 割増引4 */
    public static final int WAWRI_4 = 4;
    /** 割増引5 */
    public static final int WAWRI_5 = 5;
    /** 割増引6 */
    public static final int WAWRI_6 = 6;
    /** 割増引7 */
    public static final int WAWRI_7 = 7;
    /** 割増引8 */
    public static final int WAWRI_8 = 8;
    /** 割増引9 */
    public static final int WAWRI_9 = 9;
    /** 割増引10 */
    public static final int WAWRI_10 = 10;
    /** 割増引11 */
    public static final int WAWRI_11 = 11;
    /** 割増引12 */
    public static final int WAWRI_12 = 12;
    /** 郵便番号ハイフン */
    public static final int POSTAL_CODE_HYPHEN_POSITION = 3;
    /** 参照先区分（契約レプリカ） */
    public static final String REF_KBN_REPL = "1";
    /** 参照先区分（申込管理） */
    public static final String REF_KBN_ENTRY = "2";
    /** 商品区分（HA） */
    public static final String SHOUHIN_KBN_HA = "1";
    /** 商品区分（ASAP） */
    public static final String SHOUHIN_KBN_ASAP = "6";
    /** データ取得タイプ(契約内容詳細) */
    public static final String DATA_TYPE_ENTRY_DTL = "1";
    /** データ取得タイプ(契約内容確認書) */
    public static final String DATA_TYPE_ENTRY_CONFIRMATION = "2";
    /** データ取得タイプ(変更内容入力) */
    public static final String DATA_TYPE_CHANGE_INPUT = "3";
    /** データ取得タイプ(メールアドレス変更) */
    public static final String DATA_TYPE_CHANGE_MAIL = "4";
    /** 1年 */
    public static final int ONE_YEAR = 1;
    /** 5年 */
    public static final int FIVE_YEAR = 5;
    /** 保険期間区分1 */
    public static final String HOKEN_KIKAN_KBN_ONE = "1";
    /** 保険期間区分2 */
    public static final String HOKEN_KIKAN_KBN_TWO = "2";
    /** 保険期間区分3 */
    public static final String HOKEN_KIKAN_KBN_THREE = "3";
    /** 郵便番号桁数 */
    public static final int POSTAL_CODE_LEN = 7;
    /** 地震保険あり */
    public static final String JISHIN_HOKEN_ARI = "1";
    /** 地震保険なし */
    public static final String JISHIN_HOKEN_NASHI = "0";
    /** 補償あり */
    public static final String HOSHO_ARI = "1";

    /** 文字列フォーマット */
    public static final String STRING_FORMAT_COMMA = "#,###.##";
    public static final String STRING_FORMAT_COMMA_DECIMAL = "#,##0.000";
    /** 10 */
    public static final int DIVIDE_10 = 10;
    /** 1000 */
    public static final int DIVIDE_1000 = 1000;
    /** 万円単位 */
    public static final String MAN_YEN = "万円";
    /** 保険料クレジットカード払特約（登録方式）の判定値 */
    public static final String CREDIT_TOKUYAKU_TRUE = "192";
    /** 保険料クレジットカード払特約（登録方式） */
    public static final String CREDIT_TOKUYAKU = "OTHER3";
    /** パーセント */
    public static final String PERCENT = "%";
    /** 地震保険有無フラグFALSE */
    public static final String JISHINHOKEN_UMU_FLG_FALSE = "0";
    /** 地震保険有無フラグTRUE */
    public static final String JISHINHOKEN_UMU_FLG_TRUE = "1";
    /** 面積フラグTRUE */
    public static final String MENSEKI_FLG_TRUE = "1";
    /** 変更事由フラグ */
    public static final String HENKOU_JIYUU_FLG_TRUE = "1";
    /** 始期日指定値（システム日付との差） */
    public static final int SHIKIBI_DIFF = 0; // ⇒ vsts2915 により5日に変更
    ////////////////////////////////

    // 変更依頼受付登録_HA
    /** 登録電話番号 */
    public static final String TEL_SHURUI_1 = "1";
    /** 登録携帯番号 */
    public static final String TEL_SHURUI_2 = "2";
    /** 登録以外 */
    public static final String TEL_SHURUI_3 = "3";
    /** なし */
    public static final String NONE = "なし";
    /** 「契約者情報の変更」 */
    public static final String CHANGE_KEIYAKUSYA_INFO = "「契約者情報の変更」";
    /** 「建物情報の変更」 */
    public static final String CHANGE_TATEMONO_INFO = "「建物情報の変更」";
    /** 「ご契約プランの変更」 */
    public static final String CHANGE_PLAN_INFO = "「ご契約プランの変更」";
    /** 「被保険者情報の変更」 */
    public static final String CHANGE_HIHOKENSYA_INFO = "「被保険者情報の変更」";
    /** 「契約の解約」 */
    public static final String KAIYAKU_KEIYAKU = "「契約の解約」";
    /** 「ホームアシスト」 */
    public static final String HOMEASSIST = "ホームアシスト";
    /** 「午前」 */
    public static final String TIME_AM = "「午前中」";
    /** 「12時-14時」 */
    public static final String TIME_12_14 = "「12:00～14:00」";
    /** 「14時-17時」 */
    public static final String TIME_14_17 = "「14:00～17:00」";
    /** 「指定なし」 */
    public static final String UNSPECIFIED = "「指定なし」";

    /** 免震建築物割引(50％) */
    public static final String MENSHIN_KENCHIKU_WARI_50 = "免震建築物割引(50％)";
    /** 耐震等級割引(10％) */
    public static final String TAISHIN_TOKYU_WARI_10 = "耐震等級割引(10％)";
    /** 耐震等級割引(30％) */
    public static final String TAISHIN_TOKYU_WARI_30 = "耐震等級割引(30％)";
    /** 耐震等級割引(50％) */
    public static final String TAISHIN_TOKYU_WARI_50 = "耐震等級割引(50％)";
    /** 耐震診断割引(10％) */
    public static final String TAISHIN_SHINDAN_WARI_10 = "耐震診断割引(10％)";
    /** 建築年割引(10％) */
    public static final String KENCHIKU_NEN_WARI_10 = "建築年割引(10％)";

    /** SMBC_請求番号上5桁 */
    public static final String SMBC_SEIKYU_HEAD5 = "89106";

    //契約登録情報追加  2018/11/13  ADD  START
    public static final String PROC_START = " 処理開始";
    public static final String PROC_END = " 処理完了";
    public static final String HOKEN_SYURUI = "ホームアシスト（家庭総合保険）";
    public static final String HOMEMYPAGE_TOP_URL = "https://fire.myapp.co.jp/mypage/";
    //契約登録情報追加  2018/11/13  ADD  END

    // 生年月日が未入力check追加  2019/01/16
    public static final String CHECK_BIR = "00";

    /** 全戸数2 */
    public static final String ALL_UNITS_TWO = "2";

    /** 申込区分 1.インタネット */
    public static final String ENTRY_TYPE_INTERNET = "1";
    /** 申込区分 2.ペーパーレス */
    public static final String ENTRY_TYPE_PAPERLESS = "2";

    /*** 建築年月未明 **/
    public static final String BUILDING_DATE_UNKNOWN = "不明";

}
