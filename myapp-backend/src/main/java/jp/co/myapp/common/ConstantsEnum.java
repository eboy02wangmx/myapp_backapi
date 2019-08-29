package jp.co.myapp.common;

import java.util.Arrays;

import org.springframework.util.StringUtils;

/*****************************************************************
*
*  変更履歴:
*                      契約登録情報追加      2018/11/13 BY 曲
*                      管理メンテナンス追加  2018/11/26 BY 辺
*                      訂正連絡一覧を追加    2019/02/18 BY 曲
*
*****************************************************************/
public class ConstantsEnum {

    /**
     * 画面
     */
    public static enum SCREEN_ID {
        G_NHA_002("Building", "建物情報画面"),
        G_NHA_003("InsuranceAmount", "保険金額画面"),
        G_NHA_005("Earthquake", "地震画面"),
        G_NHA_006("Estimate", "試算画面"),
        G_NHA_007("EntryInfo", "申込情報画面"),
        G_NHA_009("PaymentMethod", "支払方法画面"),
        G_NHA_010("ExaminationConfirmation", "内容確認画面"),
        G_NHA_011("EntryComplete", "申込完了画面"),
        G_NHA_012("EntryCreditCard", "申込依頼画面（クレカ）"),
        G_MG1_016("G-MG1-016", "訂正内容入力画面"),
        G_NHA_031("ExaminationUpload", "審査依頼画面"),
        G_NHA_032("ExaminationComplete", "審査依頼完了"),
        G_NHA_033("EntryConfirmation", "内容確認(審査後)");

        private String id;
        private String name;

        private SCREEN_ID(String id, String name) {
            this.setId(id);
            this.setName(name);
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    /**
     * 画面
     */
    public static enum GAMEN_ID {
        G_NHA_002("Building", "建物情報画面"),
        G_NHA_003("InsuranceAmount", "保険金額画面"),
        G_NHA_005("Earthquake", "地震画面"),
        G_NHA_006("Estimate", "試算画面"),
        G_NHA_007("EntryInfo", "申込情報画面"),
        G_NHA_009("PaymentMethod", "支払方法画面"),
        G_NHA_010("ExaminationConfirmation", "内容確認画面"),
        G_NHA_011("EntryComplete", "申込完了画面"),
        G_NHA_012("EntryCreditCard", "申込依頼画面"),
        G_NHA_030("Estimated", "見積書表示画面"),
        G_NHA_031("ExaminationUpload", "審査依頼画面"),
        G_NHA_032("ExaminationComplete", "審査依頼完了画面"),
        G_NHA_033("EntryConfirmation", "内容確認画面審査後画面"),
        //訂正項目選択追加  2019/02/22  ADD  START
        G_MG1_108("EditDataOption", "訂正項目選択画面");
        //訂正項目選択追加  2019/02/22  ADD  END

        private String id;
        private String name;

        private GAMEN_ID(String id, String name) {
            this.setId(id);
            this.setName(name);
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    /**
     * 画面
     */
    public static enum API_ID {
        NHA_O_0001("NHA_O_0001", "ログインAPI"),
        NHA_O_0002("NHA_O_0002", "試算"),
        NHA_O_0003("NHA_O_0003", "見積書作成"),
        NHA_O_0004("NHA_O_0004", "入力チェック"),
        NHA_O_0007("NHA_O_0007", "保険料確認"),
        NHA_O_0008("NHA_O_0008", "申込依頼 "),
        NHA_O_0009("NHA_O_0009", "申込登録"),
        NHA_O_0010("NHA_O_0010", "ファイルアップロード"),
        NHA_O_0012("NHA_O_0012", "審査依頼処理"),
        NHA_O_0013("NHA_O_0013", "申込依頼番号再通知処理（機能分割）"),
        NHA_O_0014("NHA_O_0014", "採番"),
        NHA_O_0015("NHA_O_0015", "Config"),
        NHA_O_0016("NHA_O_0016", "申込一時保存建物情報"),
        NHA_O_0017("NHA_O_0017", "申込一時保存保険金額"),
        NHA_O_0018("NHA_O_0018", "申込一時保存地震"),
        NHA_O_0019("NHA_O_0019", "申込一時保存試算"),
        NHA_O_0020("NHA_O_0020", "申込一時保存申込情報"),
        NHA_O_0021("NHA_O_0021", "申込一時保存内容確認"),
        NHA_O_0022("NHA_O_0022", "申込一時保存審査依頼"),
        NHA_O_0023("NHA_O_0023", "申込一時保存内容確認審査後"),
        NHA_O_0024("NHA_O_0024", "申込一時保存申込依頼"),
        NHA_O_0025("NHA_O_0025", "評価額計算"),
        NHA_O_0026("NHA_O_0026", "住所検索"),
        NHA_O_0027("NHA_O_0027", "楽天ログイン遷移"),
        NHA_O_0028("NHA_O_0028", "一時保存連携"),
        NHA_O_0029("NHA_O_0029", "代理店特約取得"),
        NHA_O_0030("NHA_O_0030", "代理店分担入力"),
        NHA_O_0031("NHA_O_0031", "代理店募集人ID検索"),
        NHA_O_0032("NHA_O_0032", "明記物件明細入力"),
        NHA_O_0033("NHA_O_0033", "申込依頼口振"),
        NHA_O_0035("NHA_O_0035", "明記物件明細取得"),
        NHA_O_0036("NHA_O_0036", "申込一時保存他契約情報"),
        NHA_O_0038("NHA_O_0038", "代理店コード絞り"),
        NHA_O_0039("NHA_O_0039", "引受制限判定"),
        NHA_O_0040("NHA_O_0040", "お知らせ情報検索"),
        NHA_O_0041("NHA_O_0041", "見積連番検索"),
        NHA_O_0042("NHA_O_0042", "申込一時保存口座情報"),
    	NHA_O_0110("NHA_O_0042", "申込一時保存口座情報");
        private String id;
        private String name;

        private API_ID(String id, String name) {
            this.setId(id);
            this.setName(name);
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    /**
     * 文書種類区分
     */
    public static enum FILEINFO_TYPE {
        FILEINFOBEF("3", "物件確認"),
        FILEINFOAFT("2", "耐火性能"),
        FILEINFOALL("1", "地震保険割引");

        private String id;
        private String name;

        private FILEINFO_TYPE(String id, String name) {
            this.setId(id);
            this.setName(name);
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    /**
     * 削除区分設定
     */
    public static enum DELETE_TYPE {
        DELETETYPEBEF("1", "削除済"),
        DELETETYPEAFT("2", "空白");

        private String id;
        private String name;

        private DELETE_TYPE(String id, String name) {
            this.setId(id);
            this.setName(name);
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    /**
     * 点検実施区分
     */
    public static enum INSPECTION_TYPE {
        INSPECTIONTYPEBEF("1", "点検前"),
        INSPECTIONTYPEAFT("2", "点検後");

        private String id;
        private String name;

        private INSPECTION_TYPE(String id, String name) {
            this.setId(id);
            this.setName(name);
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    /**
     * 選択プラン
     */
    public static enum SELECT_PLAN {
        ADVANCE_PLAN("1", "おすすめプラン"),
        FREE_PLAN("2", "フリープラン");

        private String id;
        private String name;

        private SELECT_PLAN(String id, String name) {
            this.setId(id);
            this.setName(name);
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        /**
         * 名称取得
         */
        public static String getNameByCode(String id) {
            String name = "";
            if (!StringUtils.isEmpty(id)) {
                for (SELECT_PLAN enumValue : values()) {
                    if (enumValue.getId().equals(id)) {
                        name = enumValue.getName();
                        break;
                    }
                }
            }
            return name;
        }
    }

    /**
     * 処理区分
     */
    public static enum PROCESSING_TYPE {
        INSPECTION_UPDATE("1", "点検共通情報更新"),
        INPUT_CHECK("2", "入力チェック"),
        CORRECTION_UPDATE("3", "訂正内容更新"),
        CORRECTION_UPDATE_SHOP("4", "訂正内容更新_代理店"),
        INPUT_SHOP_CHECK("5", "入力チェック(代理店)");

        private String id;
        private String name;

        private PROCESSING_TYPE(String id, String name) {
            this.setId(id);
            this.setName(name);
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    /**
     * 商品区分
     */
    public static enum GOODS_TYPE {
        HOMEASSIST("1", "ホームアシスト","ホームアシスト\r\n（家庭総合保険）"),
        ASAP("6", "ASAP","個人用自動車保険");

        private String id;
        private String name;
        private String displayName;

        private GOODS_TYPE(String id, String name, String displayName) {
            this.setId(id);
            this.setName(name);
            this.setDisplayName(displayName);
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDisplayName() {
            return displayName;
        }

        public void setDisplayName(String displayName) {
            this.displayName = displayName;
        }
    }

    /**
     * 申込区分
     */
    public static enum ENTRY_TYPE {
        INTERNET("1", "インターネット契約"),
        PAPERLESS("2", "ペーパレス募集");

        private String id;
        private String name;

        private ENTRY_TYPE(String id, String name) {
            this.setId(id);
            this.setName(name);
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    /**
     * 申込ステータス
     */
    public static enum ENTRY_STATUS {
        ENTRY_START("0", "試算開始"),
        ENTRY_ING("1", "一時保存済"),
        INSPECTION_REQUEST("2", "点検依頼"),
        RE_UPLOAD("3", "再アップ依頼中"),
        CORRECTION_CONFIRM("4", "訂正確認中"),
        INSPECTION_FINISH("5", "点検完了"),
        ENTRY_FINISH("6", "申込完了"),
        INSPECTION_FINISH_SECOND("7", "二次点検完了"),
        HOKEN_INSPECTION("8","保険会社点検");

        private String id;
        private String name;

        private ENTRY_STATUS(String id, String name) {
            this.setId(id);
            this.setName(name);
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    /**
     * 見送り
     */
    public static enum REJECT_FLG {
        BLANK("0", ""),
        APOLOGIZE("1", "謝絶等"),
        CUSTOMER_CONVENIENCE("2", "お客さま都合");;

        private String id;
        private String name;

        private REJECT_FLG(String id, String name) {
            this.setId(id);
            this.setName(name);
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    /**
     * 計上ステータス
     */
    public static enum APPROPRIATION_STATUS {
        APPROPRIATION_WAIT("1", "計上待ち"),
        APPROPRIATION_FINISH("2", "計上済"),
        APPROPRIATION_CANCEL("9", "計上取消");

        private String id;
        private String name;

        private APPROPRIATION_STATUS(String id, String name) {
            this.setId(id);
            this.setName(name);
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    /**
     * 支払区分
     */
    public static enum PAY_TYPE {
        COLLECT("1", "集金"),
        ACCOUNT("2", "口座振替"),
        CREDIT("3", "クレジットカード");

        private String id;
        private String name;

        private PAY_TYPE(String id, String name) {
            this.setId(id);
            this.setName(name);
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        /**
         * 名称取得
         */
        public static String getNameByCode(String id) {
            String name = "";
            if (!StringUtils.isEmpty(id)) {
                for (PAY_TYPE enumValue : values()) {
                    if (enumValue.getId().equals(id)) {
                        name = enumValue.getName();
                        break;
                    }
                }
            }
            return name;
        }
    }

    /**
     * 契約者性別
     */
    public static enum CONTRACTOR_SEX {
        MALE("1", "男性"),
        FEMALE("2", "女性");

        private String id;
        private String name;

        private CONTRACTOR_SEX(String id, String name) {
            this.setId(id);
            this.setName(name);
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        /**
         * 名称取得
         */
        public static String getNameByCode(String id) {
            String name = "";
            if (!StringUtils.isEmpty(id)) {
                for (CONTRACTOR_SEX enumValue : values()) {
                    if (enumValue.getId().equals(id)) {
                        name = enumValue.getName();
                        break;
                    }
                }
            }
            return name;
        }
    }

    /**
     * 建物構造
     */
    public static enum BUILDING_STRUCTURE {
        CONCRETE_FRAME("1", "コンクリート造"),
        CONCRETE_BLOCK_FRAME("2", "コンクリートブロック造"),
        BRICK_FRAME("3", "れんが造"),
        STONE_FRAME("4", "石造"),
        STEEL_FRAME("5", "鉄骨造"),
        OTHER("6", "その他");

        private String id;
        private String name;

        private BUILDING_STRUCTURE(String id, String name) {
            this.setId(id);
            this.setName(name);
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        /**
         * 建物構造 名称取得
         */
        public static String getReasonName(String id) {
            String reasonName = "";
            if (!StringUtils.isEmpty(id)) {
                for (BUILDING_STRUCTURE enumValue : values()) {
                    if (enumValue.getId().equals(id)) {
                        reasonName = enumValue.getName();
                        break;
                    }
                }
            }
            return reasonName;
        }
    }

    /**
     * 鉄骨造建物種類詳細
     */
    public static enum STEEL_BUILDING_TYPE {
        TYPE_FIRE("1", "耐火建築物"),
        TYPE_STRUCTURE("2", "耐火構造建築物"),
        TYPE_STEEL("3", "鉄骨造");

        private String id;
        private String name;

        private STEEL_BUILDING_TYPE(String id, String name) {
            this.setId(id);
            this.setName(name);
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        /**
         * 鉄骨造建物種類詳細名称取得
         */
        public static String getReasonName(String id) {
            String reasonName = "";
            if (!StringUtils.isEmpty(id)) {
                for (STEEL_BUILDING_TYPE enumValue : values()) {
                    if (enumValue.getId().equals(id)) {
                        reasonName = enumValue.getName();
                        break;
                    }
                }
            }
            return reasonName;
        }
    }

    /**
     * その他建物種類詳細
     */
    public static enum OTHER_BUILDING_TYPE {
        TYPE_FIRE("1", "耐火建築物"),
        TYPE_STRUCTURE("2", "耐火構造建築物"),
        TYPE_QUASI("3", "準耐火建築物"),
        TYPE_MINISTRY("4", "省令準耐火建物"),
        TYPE_SPECIFIC("5", "特定避難時間倒壊等防止建築物"),
        TYPE_OTHER("6", "その他");

        private String id;
        private String name;

        private OTHER_BUILDING_TYPE(String id, String name) {
            this.setId(id);
            this.setName(name);
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        /**
         * その他建物種類詳細名称取得
         */
        public static String getReasonName(String id) {
            String reasonName = "";
            if (!StringUtils.isEmpty(id)) {
                for (OTHER_BUILDING_TYPE enumValue : values()) {
                    if (enumValue.getId().equals(id)) {
                        reasonName = enumValue.getName();
                        break;
                    }
                }
            }
            return reasonName;
        }
    }

    /**
     * 構造級別
     */
    public static enum STRUCTURE_GRADE {
        GRADE_REASON_T("T", "T構造"),
        GRADE_REASON_H("H", "H構造"),
        GRADE_REASON_M("M", "M構造");

        private String id;
        private String name;

        private STRUCTURE_GRADE(String id, String name) {
            this.setId(id);
            this.setName(name);
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        /**
         * 構造級別名称取得
         */
        public static String getReasonName(String id) {
            String reasonName = "";
            if (!StringUtils.isEmpty(id)) {
                for (STRUCTURE_GRADE enumValue : values()) {
                    if (enumValue.getId().equals(id)) {
                        reasonName = enumValue.getName();
                        break;
                    }
                }
            }
            return reasonName;
        }
    }

    /**
     * 建物建築年月
     */
    public static enum BUILDING_BUILDING_DATE {
        UNKNOWN("0", "不明");

        private String id;
        private String name;

        private BUILDING_BUILDING_DATE(String id, String name) {
            this.setId(id);
            this.setName(name);
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    /**
     * マンション評価基準
     */
    public static enum APARTMENT_CLASSIFICATION {
        OVER_COAT("1", "上塗基準"),
        WALL_CORE("2", "壁芯基準"),
    	COMM("3","専有＋共用");

        private String id;
        private String name;

        private APARTMENT_CLASSIFICATION(String id, String name) {
            this.setId(id);
            this.setName(name);
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    /**
     * 新築時の建築価額通知有無
     */
    public static enum NEW_BUILDING_VALUE_KNOWN {
        UNDERSTAND("1", "分かる"),
        NOT_UNDERSTAND("2", "分からない"),
    	OTHER("3", "その他");

        private String id;
        private String name;

        private NEW_BUILDING_VALUE_KNOWN(String id, String name) {
            this.setId(id);
            this.setName(name);
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    /**
     * 地震保険割引確認
     */
    public static enum EARTHQUAKE_DISCOUNT {
        WITHOUT_DISCOUNT("1", "書類提出できない（建築年割引無）"),
        ISOLATION_DISCOUNT("2", "免震建築物割引"),
        GRADE_DISCOUNT("3", "耐震等級割引"),
        DIAGNOSIS_DISCOUNT("4", "耐震診断割引"),
        YEAR_DISCOUNT("5", "書類提出できない（建築年割引有）");

        private String id;
        private String name;

        private EARTHQUAKE_DISCOUNT(String id, String name) {
            this.setId(id);
            this.setName(name);
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        // 訂正連絡一覧を追加 2019/02/18 ADD START
        /**
         * 名称取得
         */
        public static String getNameByCode(String id) {
            String name = "";
            if (!StringUtils.isEmpty(id)) {
                for (EARTHQUAKE_DISCOUNT enumValue : values()) {
                    if (enumValue.getId().equals(id)) {
                        name = enumValue.getName();
                        break;
                    }
                }
            }
            return name;
        }
        // 訂正連絡一覧を追加 2019/02/18 ADD END
    }
	/**
	 * 地震保険割引確認
	 */
	public static enum EARTHQUAKE_DISCOUNT_CONFIRM {
		WITHOUT_DISCOUNT("1", "建築年割引無"),
		ISOLATION_DISCOUNT("2", "免震建築物割引"),
		GRADE_DISCOUNT("3", "耐震等級割引"),
		DIAGNOSIS_DISCOUNT("4", "耐震診断割引"),
		YEAR_DISCOUNT("5", "建築年割引");

		private String id;
		private String name;

		private EARTHQUAKE_DISCOUNT_CONFIRM(String id, String name) {
			this.setId(id);
			this.setName(name);
		}

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		/**
		 * 地震保険割引名称取得
		 */
		public static String getName(String id) {
			String reasonName = "";
			if (!StringUtils.isEmpty(id)) {
				for (EARTHQUAKE_DISCOUNT_CONFIRM enumValue : values()) {
					if (enumValue.getId().equals(id)) {
						reasonName = enumValue.getName();
						break;
					}
				}
			}
			return reasonName;
		}

	}
    /**
     * 地震保険割引確認:点検理由(地震保険)
     */
    public static enum CONFIRM_EARTHQUAKE_DISCOUNT {
        WITHOUT_DISCOUNT("1", "割引なし"),
        ISOLATION_DISCOUNT("2", "免震建築物割引"),
        GRADE_DISCOUNT("3", "耐震等級割引"),
        DIAGNOSIS_DISCOUNT("4", "耐震診断割引"),
        YEAR_DISCOUNT("5", "建築年割引");

        private String id;
        private String name;

        private CONFIRM_EARTHQUAKE_DISCOUNT(String id, String name) {
            this.setId(id);
            this.setName(name);
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        /**
         * 地震保険割引確認取得
         */
        public static String getReasonName(String id) {
            String reasonName = WITHOUT_DISCOUNT.getName();
            if (!StringUtils.isEmpty(id)) {
                for (CONFIRM_EARTHQUAKE_DISCOUNT enumValue : values()) {
                    if (enumValue.getId().equals(id)) {
                        reasonName = enumValue.getName();
                        break;
                    }
                }
            }
            return reasonName;
        }
    }

    /**
     * 耐震等級割引等級
     */
    public static enum SEISMIC_GRADE_DISCOUNT_GRADE {
        GRADE_ONE("1", "等級1"),
        GRADE_TWO("2", "等級2"),
        GRADE_THREE("3", "等級3");

        private String id;
        private String name;

        private SEISMIC_GRADE_DISCOUNT_GRADE(String id, String name) {
            this.setId(id);
            this.setName(name);
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        /**
         * 地震保険割引確認取得
         */
        public static String getReasonName(String id) {
            String reasonName = "";
            if (!StringUtils.isEmpty(id)) {
                for (SEISMIC_GRADE_DISCOUNT_GRADE enumValue : values()) {
                    if (enumValue.getId().equals(id)) {
                        reasonName = enumValue.getName();
                        break;
                    }
                }
            }
            return reasonName;
        }
    }

    /**
     * 地震自動継続
     */
    public static enum EARTHQUAKE_AUTOMATIC_CONTINUATION {
        AUTOMATIC("1", "自動継続");

        private String id;
        private String name;

        private EARTHQUAKE_AUTOMATIC_CONTINUATION(String id, String name) {
            this.setId(id);
            this.setName(name);
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    /**
     * 確認済み
     */
    public static enum CONFIRMED {
        CONFIRMED("1", "確認済み");

        private String id;
        private String name;

        private CONFIRMED(String id, String name) {
            this.setId(id);
            this.setName(name);
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    /**
     * 1:含む、2:含まない
     */
    public static enum INCLUD {
        YES("1", "含む"),
        NO("2", "含まない");

        private String id;
        private String name;

        private INCLUD(String id, String name) {
            this.setId(id);
            this.setName(name);
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    /**
     * 1:あり、2:なし
     */
    public static enum WITH_WITHOUT {
        WITH("1", "あり"),
        WITHOUT("2", "なし");

        private String id;
        private String name;

        private WITH_WITHOUT(String id, String name) {
            this.setId(id);
            this.setName(name);
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public boolean eq (String value) {
            return this.id.equals(value);
        }
    }

    /**
     * 含む
     */
    public static enum INCLUD_NOTINCLUD {
        INCLUD("1", "含む"),
        NOTINCLUD("2", "含まない");

        private String id;
        private String name;

        private INCLUD_NOTINCLUD(String id, String name) {
            this.setId(id);
            this.setName(name);
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    /**
     * 支払方法
     */
    public static enum PAYMENT_METHOD {
        TEMPORARY("1", "一時払"),
        LUMPSUM("2", "一般分割"),
        ANNUAL("5", "長期年払");

        private String id;
        private String name;

        private PAYMENT_METHOD(String id, String name) {
            this.setId(id);
            this.setName(name);
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        /**
         * 名称取得
         */
        public static String getNameByCode(String id) {
            String name = "";
            if (!StringUtils.isEmpty(id)) {
                for (PAYMENT_METHOD enumValue : values()) {
                    if (enumValue.getId().equals(id)) {
                        name = enumValue.getName();
                        break;
                    }
                }
            }
            return name;
        }

        /**
         * 期間から支払方法を取得する。
         * 一時払または一括払い
         * @param terms
         */
        public static PAYMENT_METHOD method(Integer terms) {

            if(Integer.valueOf(1).equals(terms)) {
                return PAYMENT_METHOD.TEMPORARY;
            } else if (Integer.valueOf(2).equals(terms)){
                return PAYMENT_METHOD.LUMPSUM;
            } else if (Integer.valueOf(5).equals(terms)) {
                return PAYMENT_METHOD.ANNUAL;
            }
            return PAYMENT_METHOD.TEMPORARY;
        }
    }

    /**
     * 災害時諸費用支払限度額
     */
    public static enum DISASTER_EXPENSES_LIMITED {
        FIVE_MILLION("1", "500万"),
        ONE_MILLION("2", "100万"),
        TWO_MILLION("3", "200万"),
        THREE_MILLION("4", "300万"),
        FOUR_MILLION("5", "400万");

        private String id;
        private String name;

        private DISASTER_EXPENSES_LIMITED(String id, String name) {
            this.setId(id);
            this.setName(name);
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public static String getReasonName(String id) {
            String reasonName = "";
            if (!StringUtils.isEmpty(id)) {
                for (DISASTER_EXPENSES_LIMITED enumValue : values()) {
                    if (enumValue.getId().equals(id)) {
                        reasonName = enumValue.getName();
                        break;
                    }
                }
            }
            return reasonName;
        }

        public boolean eq (Long value) {
            return Long.valueOf(this.id).equals(value);
        }
    }

    /**
     * おすすめプラン災害時諸費用支払限度額
     */
    public static enum ADVANCE_DISASTER_EXPENSES_LIMITED {
        FIVE_MILLION("1", "500万");

        private String id;
        private String name;

        private ADVANCE_DISASTER_EXPENSES_LIMITED(String id, String name) {
            this.setId(id);
            this.setName(name);
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    /**
     * 同意する
     */
    public static enum AGREE_WITH {
        AGREE_WITH("1", "同意する");

        private String id;
        private String name;

        private AGREE_WITH(String id, String name) {
            this.setId(id);
            this.setName(name);
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    /**
     * 確認書類提出方法
     */
    public static enum DOCUMENTS_CONFIRM_METHOD {
        UPLOAD("1", "写真アップロード"),
        MAIL("2", "郵送");

        private String id;
        private String name;

        private DOCUMENTS_CONFIRM_METHOD(String id, String name) {
            this.setId(id);
            this.setName(name);
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    /**
     * 削除フラグ
     */
    public static enum DELETED_FLG {
        UNDELETE("0", Constants.BLANK),
        DELETED("1", "削除済");

        private String id;
        private String name;

        private DELETED_FLG(String id, String name) {
            this.setId(id);
            this.setName(name);
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    /**
     * 削除フラグ
     */
    public static enum DEL_FLG {
        EFFECTIVENESS("0", "有効"),
        DELETED("1", "削除済");

        private String id;
        private String name;

        private DEL_FLG(String id, String name) {
            this.setId(id);
            this.setName(name);
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    /**
     * ファイル種類
     */
    public static enum FILE_TYPE {
        TYPE_EARTHQUAKE("1", "地震保険割引確認資料"),
        TYPE_FIRE_RESISTANCE("2", "耐火性能確認資料"),
        TYPE_PROPERTY_CONFIRM("3", "物件確認資料"),
        // 訂正連絡一覧を追加 2019/02/18 ADD START
        TYPE_ACCOUNT_TRANSFER("4","口座振替"),
        TYPE_SHITIKE_SET("5","質権設定");
        // 訂正連絡一覧を追加 2019/02/18 ADD END

        private String id;
        private String name;

        private FILE_TYPE(String id, String name) {
            this.setId(id);
            this.setName(name);
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
        // 訂正連絡一覧を追加 2019/02/18 ADD START
        /**
         * 名称取得
         */
        public static String getNameByCode(String id) {
            String name = "";
            if (!StringUtils.isEmpty(id)) {
                for (FILE_TYPE enumValue : values()) {
                    if (enumValue.getId().equals(id)) {
                        name = enumValue.getName();
                        break;
                    }
                }
            }
            return name;
        }
        // 訂正連絡一覧を追加 2019/02/18 ADD END
    }

    // 訂正連絡一覧を追加 2019/02/18 ADD START
    /**
     * ファイルステータス
     */
    public static enum FILE_STATUS {
        STATUS_MITENKEN("0", "未点検(未到着)"),
        STATUS_TENKENZUMI("1", "点検済"),
        STATUS_SAIUPIRAI("2", "再アップ依頼"),
        STATUS_SEISEIAI("3","訂正あり"),
        STATUS_JYURYOUZUMI("4","受領済"),
        STATUS_FUYOU("9","不要");

        private String id;
        private String name;

        private FILE_STATUS(String id, String name) {
            this.setId(id);
            this.setName(name);
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        /**
         * 名称取得
         */
        public static String getNameByCode(String id) {
            String name = "";
            if (!StringUtils.isEmpty(id)) {
                for (FILE_STATUS enumValue : values()) {
                    if (enumValue.getId().equals(id)) {
                        name = enumValue.getName();
                        break;
                    }
                }
            }
            return name;
        }
    }
    // 訂正連絡一覧を追加 2019/02/18 ADD END

    /**
     * 文書種類
     */
    public static enum DOC_TYPE {
        BUILDING_CONFIRM("01", "建築確認申請書"),
        INSURANCE_POLICY("02", "保険証券等");

        private String id;
        private String name;

        private DOC_TYPE(String id, String name) {
            this.setId(id);
            this.setName(name);
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    /**
     * シーケンス区分
     */
    public static enum SEQUENCE_TYPE {
        E01("お申込依頼No._HA_NET_審査前"),
        E02("お申込依頼No._HA_NET_審査後"),
        E03("見積連番_HA_PAPERLESS"),
        E04("お申込依頼No._ASAP"),
        P01("証券番号_HAネット申込"),
        P02("証券番号_HAペーパレス"),
        P03("証券番号_ASAPネット申込"),
        P04("証券番号_ASAPペーパレス"),
        M01("変更受付番号"),
        S01("SMBC請求番号")
        ;

        private String name;

        private SEQUENCE_TYPE(String name) {
            this.setName(name);
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    /**
     * 処理モード
     */
    public static enum MODE {
        SCREEN("1", "出力データ取得(画面表示用)"),
        PDF_MAIL("2", "PDF作成/メール送信"),
        DOWNLOAD("3", "PDF作成/ダウンロード");

        private String id;
        private String name;

        private MODE(String id, String name) {
            this.setId(id);
            this.setName(name);
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    /**
     * 保険加入有無
     */
    public static enum WITH_INSURANCE {
        YES("1", "加入する"),
		NO("2", "加入しない"),
        NONE("", "加入しない");

        private String id;
        private String name;

        private WITH_INSURANCE(String id, String name) {
            this.setId(id);
            this.setName(name);
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    /**
     * 建物形態
     */
    public static enum BUILDING_FROM {
        ONE("1", "一戸建て"),
        APARTMENT("2", "マンション・アパート"),
        APARTMENTONE("3", "マンション・アパート（一棟）");

        private String id;
        private String name;

        private BUILDING_FROM(String id, String name) {
            this.setId(id);
            this.setName(name);
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        // 訂正連絡一覧を追加 2019/02/18 ADD START
        /**
         * 名称取得
         */
        public static String getNameByCode(String id) {
            String name = "";
            if (!StringUtils.isEmpty(id)) {
                for (BUILDING_FROM enumValue : values()) {
                    if (enumValue.getId().equals(id)) {
                        name = enumValue.getName();
                        break;
                    }
                }
            }
            return name;
        }
        // 訂正連絡一覧を追加 2019/02/18 ADD END
    }

    /**
     * 建物所有関係
     */
    public static enum BUILDING_OWNERSHIP {
        OWNER("1", "所有"),
        LEASE("2", "賃貸");

        private String id;
        private String name;

        private BUILDING_OWNERSHIP(String id, String name) {
            this.setId(id);
            this.setName(name);
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public static String getBuildingOwnershipName(String id) {
            String name = "";
            for (BUILDING_OWNERSHIP enumValue : values()) {
                if (enumValue.getId().equals(id)) {
                    name = enumValue.getName();
                    break;
                }
            }
            return name;
        }
    }

    /**
     * 点検理由
     */
    public static enum INSPECTION_REASON {
        PROPERTY_CONFIRM("物件確認"),
        FIRER_ESISTANCE("耐火性能"),
        EARTHQUAKE("地震保険割引"),
        PROPERTY_CONFIRM_FIRER_ESISTANCE("物件確認・耐火性能"),
        PROPERTY_CONFIRM_EARTHQUAKE("物件確認・地震保険割引"),
        PROPERTY_CONFIRM_FIRER_ESISTANCE_EARTHQUAKE("物件確認・耐火性能・地震保険割引");

        private String name;

        private INSPECTION_REASON(String name) {
            this.setName(name);
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    /**
     * 点検理由(物件確認)
     */
    public static enum INSPECTION_REASON_PROPERTY_CONFIRM {
        REASON_FILE_TYPE_ONE("1", "地震保険割引確認資料"),
        REASON_FILE_TYPE_TWO("2", "耐火性能確認資料"),
        REASON_FILE_TYPE_THREE("3", "物件確認資料");


        private String id;
        private String name;

        private INSPECTION_REASON_PROPERTY_CONFIRM(String id, String name) {
            this.setId(id);
            this.setName(name);
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        /**
         * 点検理由(物件確認)取得
         *
         * @param ファイル種類
         * @return 点検理由(物件確認)
         */
        public static String getReasonName(String fileType) {

            String reasonName = "";
            for (INSPECTION_REASON_PROPERTY_CONFIRM enumValue : values()) {
                if (enumValue.getId().equals(fileType)) {
                    reasonName = enumValue.getName();
                    break;
                }
            }
            return reasonName;
        }
    }

    /**
     * 点検理由(物件確認)
     */
    public static enum INSPECTION_PROPERTY_CONFIRM {
        REASON_FILE_TYPE_ONE("1", "物件確認"),
        REASON_FILE_TYPE_TWO("2", "物件確認"),
        REASON_FILE_TYPE_THREE("3", "物件確認");


        private String id;
        private String name;

        private INSPECTION_PROPERTY_CONFIRM(String id, String name) {
            this.setId(id);
            this.setName(name);
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        /**
         * 点検理由(物件確認)取得
         *
         * @param ファイル種類
         * @return 点検理由(物件確認)
         */
        public static String getReasonName(String fileType) {

            String reasonName = "";
            for (INSPECTION_PROPERTY_CONFIRM enumValue : values()) {
                if (enumValue.getId().equals(fileType)) {
                    reasonName = enumValue.getName();
                    break;
                }
            }
            return reasonName;
        }
    }


    /**
     *
     */
    public static enum SPOUSE {
        YES("1", "有り"),
        NO("2", "無し");

        private String id;
        private String name;

        private SPOUSE(String id, String name) {
            this.setId(id);
            this.setName(name);
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public static String getReasonName(String id) {
            String reasonName = "";
            if (!StringUtils.isEmpty(id)) {
                for (SPOUSE enumValue : values()) {
                    if (enumValue.getId().equals(id)) {
                        reasonName = enumValue.getName();
                        break;
                    }
                }
            }
            return reasonName;
        }
    }

    /**
     * カード会社
     */
    public static enum CARD_COMPANY {
        VISA("1", "VISA"),
        MASTER("2", "MASTER"),
        DINERS("3", "Diners"),
        JCB("4", "JCB"),
        AMERICAN_EXPRESS("5", "American Express");

        private String id;
        private String name;

        private CARD_COMPANY(String id, String name) {
            this.setId(id);
            this.setName(name);
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        /**
         * カード会社
         */
        public static String getReasonName(String id) {
            String reasonName = "";
            if (!StringUtils.isEmpty(id)) {
                for (CARD_COMPANY enumValue : values()) {
                    if (enumValue.getId().equals(id)) {
                        reasonName = enumValue.getName();
                        break;
                    }
                }
            }
            return reasonName;
        }
    }

    /**
     * 性別
     */
    public static enum Gender {
        MAN("1", "男"),
        WOMAN("2", "女");

        private String id;
        private String name;

        private Gender(String id, String name) {
            this.setId(id);
            this.setName(name);
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public static String getReasonName(String id) {
            String reasonName = "";
            if (!StringUtils.isEmpty(id)) {
                for (Gender enumValue : values()) {
                    if (enumValue.getId().equals(id)) {
                        reasonName = enumValue.getName();
                        break;
                    }
                }
            }
            return reasonName;
        }
    }

    /**
     * 被保険者同異
     */
    public static enum CONTRACTOR_IDENTICAL {
        SAME("1", "同じ"),
        DIFFERENT("2", "異なる");

        private String id;
        private String name;

        private CONTRACTOR_IDENTICAL(String id, String name) {
            this.setId(id);
            this.setName(name);
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public static String getReasonName(String id) {
            String reasonName = "";
            if (!StringUtils.isEmpty(id)) {
                for (CONTRACTOR_IDENTICAL enumValue : values()) {
                    if (enumValue.getId().equals(id)) {
                        reasonName = enumValue.getName();
                        break;
                    }
                }
            }
            return reasonName;
        }
    }

    /**
     * 保険対象住所同異
     */
    public static enum ADDRESS_IDENTICAL {
        SAME("1", "同じ"),
        DIFFERENT("2", "異なる");

        private String id;
        private String name;

        private ADDRESS_IDENTICAL(String id, String name) {
            this.setId(id);
            this.setName(name);
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public static String getReasonName(String id) {
            String reasonName = "";
            if (!StringUtils.isEmpty(id)) {
                for (ADDRESS_IDENTICAL enumValue : values()) {
                    if (enumValue.getId().equals(id)) {
                        reasonName = enumValue.getName();
                        break;
                    }
                }
            }
            return reasonName;
        }
    }

    /**
     * 地震保険確認
     */
    public static enum COFIRM_EARTHQUAKE {
        EARTHQUAKE("0", "地震保険申込無し"),
        BUILDING("1", "建物セット無し"),
        HOUSEHOLD("2", "家財セット無し"),
        EARTHQUAKEENTRY("3", "地震保険申込有り");

        private String id;
        private String name;

        private COFIRM_EARTHQUAKE(String id, String name) {
            this.setId(id);
            this.setName(name);
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public static String getReasonName(String id) {
            String reasonName = "";
            if (!StringUtils.isEmpty(id)) {
                for (COFIRM_EARTHQUAKE enumValue : values()) {
                    if (enumValue.getId().equals(id)) {
                        reasonName = enumValue.getName();
                        break;
                    }
                }
            }
            return reasonName;
        }
    }

    /**
     * ファイル形式
     */
    public static enum FILE_UPLOAD_TYPE {
        JPG("FFD8", "image/jpeg"),
        PNG("PNG", "image/png"),
        HEIC("HEIC", "image/jpeg"), //変換後
        PDF("PDF", "application/pdf");

        private String id;
        private String contentType;

        private FILE_UPLOAD_TYPE(String id, String contentType) {
            this.setId(id);
            this.setContentType(contentType);
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getContentType() {
            return contentType;
        }

        public void setContentType(String contentType) {
            this.contentType = contentType;
        }
    }

    /**
     * SVFテンプレートのファイルの種類
     */
    public static enum SVF_FORM_MODE {
        XML("xml", 4),
        FRM("frm", 5);

        private String suffix;
        private int mode;

        private SVF_FORM_MODE(String suffix, int mode) {
            this.suffix = suffix;
            this.mode = mode;
        }

        public String getSuffix() {
            return suffix;
        }

        public void setSuffix(String suffix) {
            this.suffix = suffix;
        }

        public int getMode() {
            return mode;
        }

        public void setMode(int mode) {
            this.mode = mode;
        }
    }


    /**
     * 支払限度額
     */
    public static enum SAIGAI_LIMIT {
        ONE("1", 500),
        TWO("2", 100),
        THREE("3", 200),
        FOUR("4", 300),
        FIVE("5", 400);

        private String id;
        private Integer money;

        private SAIGAI_LIMIT(String id, Integer money) {
            this.id = id;
            this.money = money;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public Integer getMoney() {
            return money;
        }

        public void setMoney(Integer money) {
            this.money = money;
        }
    }

    /**
     * 用法
     */
    public static enum YOHO {
        PRIVATE("01", "専用住宅"),
        COMMON("02", "共同住宅"),
        COMBINED("03", "併用住宅"),
        PRIVATESHOP("04", "専用店舗"),
        WORKSHOP("05", "作業場"),
        FACTORY("06", "工場"),
        WAREHOUSE("07", "倉庫"),
        OFFICE("08", "事務所"),
        OTHER("99", "その他"),
        ;

        private String id;
        private String name;

        private YOHO(String id, String name) {
            this.setId(id);
            this.setName(name);
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public static String getReasonName(String id) {
            String reasonName = "";
            if (!StringUtils.isEmpty(id)) {
                for (YOHO enumValue : values()) {
                    if (enumValue.getId().equals(id)) {
                        reasonName = enumValue.getName();
                        break;
                    }
                }
            }
            return reasonName;
        }
    }

    /**
     * 用法
     */
    public static enum BULIDING_YOHO {
        PRIVATE("01", "専用住宅"),
        COMMON("02", "共同住宅"),
    	COMMON_3("03","併用住宅");

        private String id;
        private String name;

        private BULIDING_YOHO(String id, String name) {
            this.setId(id);
            this.setName(name);
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    /**
     * 無/有
     */
    public static enum HAVENO {
        NO("0", "無"),
        YES("1", "有");

        private String id;
        private String name;

        private HAVENO(String id, String name) {
            this.setId(id);
            this.setName(name);
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public static String getReasonName(String id) {
            String reasonName = "";
            if (!StringUtils.isEmpty(id)) {
                for (HAVENO enumValue : values()) {
                    if (enumValue.getId().equals(id)) {
                        reasonName = enumValue.getName();
                        break;
                    }
                }
            }
            return reasonName;
        }
    }

    /**
     * 1：区分所有
     * 2：１棟所有
     */
    public static enum SHOYU_KUBUN {
        APLIT("1", "区分所有"),
        ALL("2", "１棟所有");

        private String id;
        private String name;

        private SHOYU_KUBUN(String id, String name) {
            this.setId(id);
            this.setName(name);
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public static String getReasonName(String id) {
            String reasonName = "";
            if (!StringUtils.isEmpty(id)) {
                for (SHOYU_KUBUN enumValue : values()) {
                    if (enumValue.getId().equals(id)) {
                        reasonName = enumValue.getName();
                        break;
                    }
                }
            }
            return reasonName;
        }
    }

    /**
     * 1：千円単位
     * 2：万円単位
     * 3：10万円単位
     * 4：100万円単位
     */
    public static enum HYOKAGAKU_UNIT {
        U1("1", "千円単位"),
        U2("2", "万円単位"),
        U3("3", "10万円単位"),
        U4("4", "100万円単位");

        private String id;
        private String name;

        private HYOKAGAKU_UNIT(String id, String name) {
            this.setId(id);
            this.setName(name);
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public static String getReasonName(String id) {
            String reasonName = "";
            if (!StringUtils.isEmpty(id)) {
                for (HYOKAGAKU_UNIT enumValue : values()) {
                    if (enumValue.getId().equals(id)) {
                        reasonName = enumValue.getName();
                        break;
                    }
                }
            }
            return reasonName;
        }
    }

    /**
     * 保険の対象
     * 1：建物のみ
     * 2：家財のみ
     * 3：建物・家財
     */
    public static enum HOKEN_TAISHO {
        BUILDING("1", "建物のみ"),
        HOUSEHOLD("2", "家財のみ"),
        BOTH("3", "建物・家財");

        private String id;
        private String name;

        private HOKEN_TAISHO(String id, String name) {
            this.setId(id);
            this.setName(name);
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public static String getReasonName(String id) {
            String reasonName = "";
            if (!StringUtils.isEmpty(id)) {
                for (HOKEN_TAISHO enumValue : values()) {
                    if (enumValue.getId().equals(id)) {
                        reasonName = enumValue.getName();
                        break;
                    }
                }
            }
            return reasonName;
        }
    }

    /**
     * 1：高層
     * 2：中層
     */
    public static enum STRATUM {
        HIGH("1", "高層"),
        MIDDLE("2", "中層");

        private String id;
        private String name;

        private STRATUM(String id, String name) {
            this.setId(id);
            this.setName(name);
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public static String getReasonName(String id) {
            String reasonName = "";
            if (!StringUtils.isEmpty(id)) {
                for (STRATUM enumValue : values()) {
                    if (enumValue.getId().equals(id)) {
                        reasonName = enumValue.getName();
                        break;
                    }
                }
            }
            return reasonName;
        }
    }

    /**
     * 所在地
     *
     */
    public static enum LOCATION {
        L01("01","北海道"),
        L02("02","青森県"),
        L03("03","岩手県"),
        L04("04","宮城県"),
        L10("10","秋田県"),
        L11("11","山形県"),
        L12("12","福島県"),
        L20("20","茨城県"),
        L21("21","栃木県"),
        L22("22","群馬県"),
        L23("23","埼玉県"),
        L24("24","千葉県"),
        L25("25","東京都"),
        L26("26","神奈川県"),
        L30("30","新潟県"),
        L31("31","富山県"),
        L32("32","石川県"),
        L33("33","福井県"),
        L34("34","山梨県"),
        L40("40","長野県"),
        L41("41","岐阜県"),
        L42("42","静岡県"),
        L43("43","愛知県"),
        L44("44","三重県"),
        L50("50","滋賀県"),
        L57("57","京都府"),
        L58("58","大阪府"),
        L59("59","兵庫県"),
        L60("60","奈良県"),
        L61("61","和歌山県"),
        L62("62","鳥取県"),
        L63("63","島根県"),
        L64("64","岡山県"),
        L70("70","広島県"),
        L71("71","山口県"),
        L72("72","徳島県"),
        L73("73","香川県"),
        L74("74","愛媛県"),
        L80("80","高知県"),
        L81("81","福岡県"),
        L82("82","佐賀県"),
        L83("83","長崎県"),
        L84("84","熊本県"),
        L90("90","大分県"),
        L91("91","宮崎県"),
        L92("92","鹿児島県"),
        L93("93","沖縄県");

        private String id;
        private String name;

        private LOCATION(String id, String name) {
            this.setId(id);
            this.setName(name);
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        /**
         * 都道府県コード→名称変換
         * @param id
         * @return
         */
        public static String getLocationName(String id) {
            String name = "";
            for (LOCATION enumValue : values()) {
                if (enumValue.getId().equals(id)) {
                    name = enumValue.getName();
                    break;
                }
            }
            return name;
        }
    }

    /**
     * 有無
     */
    public static enum YESORNO {
        YES("1", "有"),
        NO("0", "無");

        private String id;
        private String name;

        private YESORNO(String id, String name) {
            this.setId(id);
            this.setName(name);
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public static String getReasonName(String id) {
            String reasonName = "";
            if (!StringUtils.isEmpty(id)) {
                for (YESORNO enumValue : values()) {
                    if (enumValue.getId().equals(id)) {
                        reasonName = enumValue.getName();
                        break;
                    }
                }
            }
            return reasonName;
        }
    }

    /**
     * マンション評価基準
     */
    public static enum MANSION_CLASSIFICATION {
        ONE("1", "壁芯"),
        TWO("2", "上塗"),
        THREE("3", "専有＋共用");

        private String id;
        private String name;

        private MANSION_CLASSIFICATION(String id, String name) {
            this.setId(id);
            this.setName(name);
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }


    /**
     * 火災保険支払方法
     */
    public static enum KAZAI_PAYMENTMETHOD {
        ONE("1", "一時払"),
        TWO("2", "一般分割"),
        FIVE("5", "年払");

        private String id;
        private String name;

        private KAZAI_PAYMENTMETHOD(String id, String name) {
            this.setId(id);
            this.setName(name);
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    /**
     * 払込方法
     */
    public static enum PAYMENTMETHOD {
        COLLECTIVE("100", "一括払"),
        DIVISION("312", "一般１２分割１２回払"),
        COLLECTIONCOLLECTIVE("501", "集団扱一括払"),
        COLLECTIONDIVISION("512", "集団扱１２分割払"),
        GROUPCOLLECTIVE("401", "団体扱一括払"),
        GROUPDIVISION("412", "団体扱１２分割払"),
        LARGEDIVISION4("604", "大口４分割等間隔払"),
        LARGEDIVISION6("606", "大口６分割等間隔払"),
        LARGEDIVISION12("612", "大口１２分割順月払"),
        LONGCOLLECTIVE("201", "長期一括払"),
        COLLECTIONLONGCOLLECTIVE("700", "住宅ローン集団長期一括"),
        LONGANNUALPAYMENT("200", "長期年払");

        private String id;
        private String name;

        private PAYMENTMETHOD(String id, String name) {
            this.setId(id);
            this.setName(name);
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public static String getReasonName(String id) {
            String reasonName = "";
            if (!StringUtils.isEmpty(id)) {
                for (PAYMENTMETHOD enumValue : values()) {
                    if (enumValue.getId().equals(id)) {
                        reasonName = enumValue.getName();
                        break;
                    }
                }
            }
            return reasonName;
        }
    }

    /**
     * 払込方法
     */
    public static enum AMOUNT {
        ZERO(0L, "0千円"),
        TWO(2L, "2千円"),
        THREE(3L, "3千円"),
        FIVE(5L, "5千円"),
        TEN(10L, "10千円"),
        THIRTY(30L, "30千円"),
        FIFTY(50L, "50千円"),
        SEVENTY(70L, "70千円"),
        ONEHUNDRED(100L, "100千円"),
        ONEHUNDREDANDFIFTY(150L, "150千円"),
        TWOHUNDRED(200L, "200千円"),
        THREEHUNDRED(300L, "300千円"),
        FOURHUNDRED(400L, "400千円"),
        FIVEHUNDRED(500L, "500千円"),
        ONETHOUSAND(1000L, "1000千円"),
        TWOTHOUSAND(2000L, "2000千円"),
        THREETHOUSAND(3000L, "3000千円"),
        FOURTHOUSAND(4000L, "4000千円"),
        FIVETHOUSAND(5000L, "5000千円"),
        TENTHOUSAND(10000L, "1000万"),
        FIFTYTHOUSAND(50000L, "5000万");

        private Long id;
        private String name;

        private AMOUNT(Long id, String name) {
            this.setId(id);
            this.setName(name);
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public static String getReasonName(Long id) {
            String reasonName = "";
            if (!StringUtils.isEmpty(id)) {
                for (AMOUNT enumValue : values()) {
                    if (enumValue.getId().equals(id)) {
                        reasonName = enumValue.getName();
                        break;
                    }
                }
            }
            return reasonName;
        }

        public boolean eq (Long value) {
            return Long.valueOf(this.id).equals(value);
        }
    }

    public static enum KEIYAKU_JOKYO {
        YUKO("1","有効"),
        KAIYAKU("2","解約"),
        KAIJO("3","解除"),
        RISAI("4","罹災失効"),
        SEISAN("5","清算失効"),
        MANKI("8","満期"),
        TORIKESI("9","取消")
        ;
        private String id;
        private String name;

        private KEIYAKU_JOKYO(String id,String name) {
            this.setId(id);
            this.setName(name);
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
        /**
         * 名称取得
         */
        public static String getNameByCode(String id) {
            String name = "";
            if (!StringUtils.isEmpty(id)) {
                for (KEIYAKU_JOKYO enumValue : values()) {
                    if (enumValue.getId().equals(id)) {
                        name = enumValue.getName();
                        break;
                    }
                }
            }
            return name;
        }
    }

    /**
     * 点検理由取得
     *
     * @param 鉄骨造建物種類詳細
     * @param その他建物種類詳細
     * @param 地震保険割引確認
     * @return 点検理由
     */
    public static String getInspectionReason(String kozoTekkotsu, String kozoOther, String kakuninShorui) {

        String reasonName = "";

        if (STEEL_BUILDING_TYPE.TYPE_FIRE.getId().equals(kozoTekkotsu)
                || STEEL_BUILDING_TYPE.TYPE_STRUCTURE.getId().equals(kozoTekkotsu)
                || OTHER_BUILDING_TYPE.TYPE_FIRE.getId().equals(kozoOther)
                || OTHER_BUILDING_TYPE.TYPE_STRUCTURE.getId().equals(kozoOther)
                || OTHER_BUILDING_TYPE.TYPE_QUASI.getId().equals(kozoOther)
                || OTHER_BUILDING_TYPE.TYPE_MINISTRY.getId().equals(kozoOther)
                || OTHER_BUILDING_TYPE.TYPE_SPECIFIC.getId().equals(kozoOther)) {
            // 鉄骨造建物種類詳細 1:耐火建築物 2:耐火構造建築物
            // その他建物種類詳細 1:耐火建築物 2:耐火構造建築物 3:準耐火建築物 4:省令準耐火建物 5:特定避難時間倒壊等防止建築物

            if (CONFIRM_EARTHQUAKE_DISCOUNT.ISOLATION_DISCOUNT.getId().equals(kakuninShorui)
                    || CONFIRM_EARTHQUAKE_DISCOUNT.GRADE_DISCOUNT.getId().equals(kakuninShorui)
                    || CONFIRM_EARTHQUAKE_DISCOUNT.DIAGNOSIS_DISCOUNT.getId().equals(kakuninShorui)
                    || CONFIRM_EARTHQUAKE_DISCOUNT.YEAR_DISCOUNT.getId().equals(kakuninShorui)) {
                // 震保険割引確認 2:免震建築物割引 3:耐震等級割引 4:耐震診断割引 5:建築年割引

                reasonName = INSPECTION_REASON.PROPERTY_CONFIRM_FIRER_ESISTANCE_EARTHQUAKE.getName();
            } else {
                // 地震保険割引確認　 1:割引なしと上記以外
                reasonName = INSPECTION_REASON.PROPERTY_CONFIRM_FIRER_ESISTANCE.getName();
            }
        } else {
            if (CONFIRM_EARTHQUAKE_DISCOUNT.ISOLATION_DISCOUNT.getId().equals(kakuninShorui)
                    || CONFIRM_EARTHQUAKE_DISCOUNT.GRADE_DISCOUNT.getId().equals(kakuninShorui)
                    || CONFIRM_EARTHQUAKE_DISCOUNT.DIAGNOSIS_DISCOUNT.getId().equals(kakuninShorui)
                    || CONFIRM_EARTHQUAKE_DISCOUNT.YEAR_DISCOUNT.getId().equals(kakuninShorui)) {
                // 地震保険割引確認 2:免震建築物割引 3:耐震等級割引 4:耐震診断割引 5:建築年割引

                reasonName = INSPECTION_REASON.PROPERTY_CONFIRM_EARTHQUAKE.getName();
            } else {
                // 地震保険割引確認　 1:割引なしと上記以外
                reasonName = INSPECTION_REASON.PROPERTY_CONFIRM.getName();
            }
        }
        return reasonName;
    }

    /**
     * 点検理由(耐火性能)取得
     *
     * @param 鉄骨造建物種類詳細
     * @param その他建物種類詳細
     * @param 構造級別
     * @return 点検理由(耐火性能)
     */
    public static String getInspectionReasonFireResistance(String kozoTekkotsu, String kozoOther, String grade) {

        // 構造級別取得
        String reasonName = "";

        // 鉄骨造建物種類詳細
        if (STEEL_BUILDING_TYPE.TYPE_FIRE.getId().equals(kozoTekkotsu)) {
            reasonName = STEEL_BUILDING_TYPE.TYPE_FIRE.getName();
        } else if (STEEL_BUILDING_TYPE.TYPE_STRUCTURE.getId().equals(kozoTekkotsu)) {
            reasonName = STEEL_BUILDING_TYPE.TYPE_STRUCTURE.getName();
        }

        // その他建物種類詳細
        if (StringUtils.isEmpty(reasonName)) {
            if (OTHER_BUILDING_TYPE.TYPE_FIRE.getId().equals(kozoOther)) {
                reasonName = OTHER_BUILDING_TYPE.TYPE_FIRE.getName();
            } else if (OTHER_BUILDING_TYPE.TYPE_STRUCTURE.getId().equals(kozoOther)) {
                reasonName = OTHER_BUILDING_TYPE.TYPE_STRUCTURE.getName();
            } else if (OTHER_BUILDING_TYPE.TYPE_QUASI.getId().equals(kozoOther)) {
                reasonName = OTHER_BUILDING_TYPE.TYPE_QUASI.getName();
            } else if (OTHER_BUILDING_TYPE.TYPE_MINISTRY.getId().equals(kozoOther)) {
                reasonName = OTHER_BUILDING_TYPE.TYPE_MINISTRY.getName();
            } else if (OTHER_BUILDING_TYPE.TYPE_SPECIFIC.getId().equals(kozoOther)) {
                reasonName = OTHER_BUILDING_TYPE.TYPE_SPECIFIC.getName();
            }
        }

        // 構造級別 + 鉄骨造建物種類詳細(or その他建物種類詳細)
        if (!StringUtils.isEmpty(reasonName) ) {
            reasonName = STRUCTURE_GRADE.getReasonName(grade) + "(" + reasonName + ")";
        }
        return reasonName;
    }

    /**
     * 点検理由(地震保険)取得
     *
     * @param 地震保険割引確認
     * @param 耐震等級割引等級
     * @return 点検理由(地震保険)
     */
    public static String getInspectionReasonEarthquake(String kakuninShorui, String taishin) {

        // 地震保険割引確認取得
        String reasonName  = CONFIRM_EARTHQUAKE_DISCOUNT.getReasonName(kakuninShorui);

        // 耐震等級割引等級取得
        String reasonNameGrade  = SEISMIC_GRADE_DISCOUNT_GRADE.getReasonName(taishin);

        // 地震保険割引確認 + 耐震等級割引等級
        if (!StringUtils.isEmpty(reasonNameGrade) ) {
            reasonName = reasonName + "(" + reasonNameGrade + ")";
        }
        return reasonName;
    }

    /**
     * 点検画像種類取得
     *
     * @param ファイル種類
     * @param 文書種類
     * @param 鉄骨造建物種類詳細
     * @param その他建物種類詳細
     * @param 地震保険割引確認
     * @param ヒアリングエリア
     * @return 点検画像種類
     */
    public static String getInspectionImageType(String fileType,String docType,String kozoTekkotsu, String kozoOther,String kakuninShorui, String kisaiUmu) {

        String reasonName = "";

        if (FILE_TYPE.TYPE_EARTHQUAKE.getId().equals(fileType)) {
            //ファイル種類 1:地震保険割引確認

            reasonName = INSPECTION_REASON.EARTHQUAKE.getName();
        } else if (FILE_TYPE.TYPE_FIRE_RESISTANCE.getId().equals(fileType)) {
            // ファイル種類 2:耐火性能確認

            reasonName = INSPECTION_REASON.FIRER_ESISTANCE.getName();
        } else if (FILE_TYPE.TYPE_PROPERTY_CONFIRM.getId().equals(fileType)) {
            // ファイル種類 3:物件確認

            reasonName = INSPECTION_REASON.PROPERTY_CONFIRM.getName();
            if (DOC_TYPE.BUILDING_CONFIRM.getId().equals(docType)) {
                // 文書種類 01:建築確認申請書

                if (STEEL_BUILDING_TYPE.TYPE_FIRE.getId().equals(kozoTekkotsu)
                        || STEEL_BUILDING_TYPE.TYPE_STRUCTURE.getId().equals(kozoTekkotsu)
                        || OTHER_BUILDING_TYPE.TYPE_FIRE.getId().equals(kozoOther)
                        || OTHER_BUILDING_TYPE.TYPE_STRUCTURE.getId().equals(kozoOther)
                        || OTHER_BUILDING_TYPE.TYPE_QUASI.getId().equals(kozoOther)
                        || OTHER_BUILDING_TYPE.TYPE_SPECIFIC.getId().equals(kozoOther)) {
                    // 鉄骨造建物種類詳細 1:耐火建築物 2:耐火構造建築物
                    // その他建物種類詳細 1:耐火建築物 2:耐火構造建築物 3:準耐火建築物  5:特定避難時間倒壊等防止建築物

                    reasonName = INSPECTION_REASON.PROPERTY_CONFIRM_FIRER_ESISTANCE.getName();
                }
            } else if (DOC_TYPE.INSURANCE_POLICY.getId().equals(docType)) {
                // 文書種類 02:保険証券等

                if (STEEL_BUILDING_TYPE.TYPE_FIRE.getId().equals(kozoTekkotsu)
                        || STEEL_BUILDING_TYPE.TYPE_STRUCTURE.getId().equals(kozoTekkotsu)
                        || OTHER_BUILDING_TYPE.TYPE_FIRE.getId().equals(kozoOther)
                        || OTHER_BUILDING_TYPE.TYPE_STRUCTURE.getId().equals(kozoOther)
                        || OTHER_BUILDING_TYPE.TYPE_QUASI.getId().equals(kozoOther)
                        || OTHER_BUILDING_TYPE.TYPE_MINISTRY.getId().equals(kozoOther)
                        || OTHER_BUILDING_TYPE.TYPE_SPECIFIC.getId().equals(kozoOther)) {
                    // 鉄骨造建物種類詳細 1:耐火建築物 2:耐火構造建築物
                    // その他建物種類詳細 1:耐火建築物 2:耐火構造建築物 3:準耐火建築物 4:省令準耐火建物 5:特定避難時間倒壊等防止建築物

                    reasonName = INSPECTION_REASON.PROPERTY_CONFIRM_FIRER_ESISTANCE.getName();
                    if ((CONFIRM_EARTHQUAKE_DISCOUNT.ISOLATION_DISCOUNT.getId().equals(kakuninShorui)
                            || CONFIRM_EARTHQUAKE_DISCOUNT.GRADE_DISCOUNT.getId().equals(kakuninShorui)
                            || CONFIRM_EARTHQUAKE_DISCOUNT.DIAGNOSIS_DISCOUNT.getId().equals(kakuninShorui)
                            || CONFIRM_EARTHQUAKE_DISCOUNT.YEAR_DISCOUNT.getId().equals(kakuninShorui))
                            && "1".equals(kisaiUmu)) {
                        // 地震保険割引確認  2:免震建築物割引 3:耐震等級割引 4:耐震診断割引 5:書類提出できない（建築年割引有）
                        // ヒアリングエリア 1:はい

                        reasonName = INSPECTION_REASON.PROPERTY_CONFIRM_FIRER_ESISTANCE_EARTHQUAKE.getName();
                    }
                } else if ((CONFIRM_EARTHQUAKE_DISCOUNT.ISOLATION_DISCOUNT.getId().equals(kakuninShorui)
                        || CONFIRM_EARTHQUAKE_DISCOUNT.GRADE_DISCOUNT.getId().equals(kakuninShorui)
                        || CONFIRM_EARTHQUAKE_DISCOUNT.DIAGNOSIS_DISCOUNT.getId().equals(kakuninShorui)
                        || CONFIRM_EARTHQUAKE_DISCOUNT.YEAR_DISCOUNT.getId().equals(kakuninShorui))
                        && "1".equals(kisaiUmu)) {
                    // 地震保険割引確認  2:免震建築物割引 3:耐震等級割引 4:耐震診断割引 5:書類提出できない（建築年割引有）
                    // ヒアリングエリア 1:はい

                    reasonName = INSPECTION_REASON.PROPERTY_CONFIRM_EARTHQUAKE.getName();
                }
            }
        }

        return reasonName;
    }

    /**
     * enum名称取得
     *
     * @param enumId
     * @return enumName
     */
    public static String getEnumName(Class<?> clazz, String id, boolean unFindRetrunEmpty) {
        String enumName = "";
        if (clazz.isEnum()) {
            try {
                Object[] arr = clazz.getEnumConstants();
                for (Object entity : arr) {
                    Object idObject = clazz.getMethod("getId", new Class[] {}).invoke(entity, new Object[] {});
					if (idObject != null && ((idObject.toString() == "" && id == "") || idObject.toString().equals(id))) {
                        enumName = clazz.getMethod("getName", new Class[] {}).invoke(entity, new Object[] {}).toString();
                        unFindRetrunEmpty = true;
                        break;
                    }
                }
            } catch (Exception ex) {
                enumName = id;
            }
            // ないの場合、idに戻る
            if (!unFindRetrunEmpty) {
                enumName = id;
            }
        }
        return enumName;
    }

    public static enum BUILDING_STRUCTURE_REPLICA {
        CONCRETE_FRAME("01", "コンクリート造"),
        CONCRETE_BLOCK_FRAME("02", "コンクリートブロック造"),
        BRICK_FRAME("03","れんが造"),
        STONE_FRAME("04", "石造"),
        STEEL_FRAME("05", "鉄骨造"),
        FIREPROOF_FRAME("07", "耐火建築物"),
        SEMI_FIREPROOF_FRAME("08", "準耐火建築物"),
        MINISTERIAL_ORDINANCE_SEMI_FIREPROOF_FRAME("09", "省令準耐火建築物"),
        OTHER("10", "その他"),
        SEMI_FIREPROOF_CONSTRUCTION_FRAME("81", "耐火構造建築物"),
        SPECIFIC_EVACUATION_TIME_COLLAPCE_PREVENTION("82", "特定避難時間倒壊等防止建築物");

        private String id;
        private String name;

        private BUILDING_STRUCTURE_REPLICA(String id, String name) {
            this.setId(id);
            this.setName(name);
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        /**
         * 名称取得
         */
        public static String getNameByCode(String id) {
            String name = "";
            if (!StringUtils.isEmpty(id)) {
                for (BUILDING_STRUCTURE_REPLICA enumValue : values()) {
                    if (enumValue.getId().equals(id)) {
                        name = enumValue.getName();
                        break;
                    }
                }
            }
            return name;
        }
    }

    /**
     * 契約状況
     */
    public static enum KEIYAKU_KJUSHO {

        VALID("1", "有効"),
        CANCELLATION("2", "解約 "),
        RELEASE("3", "解除"),
        R_REVOCATION("4", "罹災失効"),
        S_REVOCATION("5","清算失効 "),
        MATURITY("8", "満期"),
        CANCEL("9", "取消");

        private String id;
        private String name;

        private KEIYAKU_KJUSHO(String id, String name) {
            this.setId(id);
            this.setName(name);
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        /**
         * 名称取得
         */
        public static String getNameByCode(String id) {
            String name = "";
            if (!StringUtils.isEmpty(id)) {
                for (KEIYAKU_KJUSHO enumValue : values()) {
                    if (enumValue.getId().equals(id)) {
                        name = enumValue.getName();
                        break;
                    }
                }
            }
            return name;
        }
    }

    /**
     * 特約
     */
    public static enum TOKUYAKU {

        TOKU_A0("A0", "オールリスク補償"),
        TOKU_A1("A1", "支払限度額特約"),
        TOKU_A2("A2", "免責金額特約"),
        TOKU_A3("A3", "追加物件自動補償特約"),
        TOKU_A4("A4", "風・雹・雪災危険補償対象外特約"),
        TOKU_A5("A5", "水災危険補償対象外特約"),
        TOKU_A6("A6", "臨時費用保険金補償対象外特約"),
        TOKU_A7("A7", "地震火災費用保険金補償対象外特約"),
        TOKU_A8("A8", "個人賠償責任保険包括契約に関する特約"),
        TOKU_A9("A9", "火災・落雷・破裂または爆発危険のみ補償特約"),
        TOKU_B0("B0", "ビジネス総合補償特約"),
        TOKU_B1("B1", "建物付帯機械設備包括契約特約"),
        TOKU_B2("B2", "ビジネス総合補償特約（水災危険補償対象外型）"),
        TOKU_C1("C1", "保険金額調整等に関する特約"),
        TOKU_C2("C2", "テロ危険補償対象外特約"),
        TOKU_C3("C3", "保険料確定特約（企業総合保険用）"),
        TOKU_C4("C4", "保険料確定特約（企業費用・利益総合保険用）"),
        TOKU_D1("D1", "破汚損特約（建物・免責金額５千円）"),
        TOKU_D2("D2", "破汚損特約（家財・限度額３０万円免責金額５千円）"),
        TOKU_D3("D3", "破汚損特約（家財・限度額５０万円免責金額５千円）"),
        TOKU_D4("D4", "破汚損特約（家財・限度額３０万円免責金額１０千円）"),
        TOKU_D5("D5", "破汚損特約（家財・限度額５０万円免責金額１０千円）"),
        TOKU_D6("D6", "破汚損特約（免責金額１０万円家財限度額５０万円）"),
        TOKU_D7("D7", "破汚損特約（免責金額５万円家財限度額５０万円）"),
        TOKU_D8("D8", "破汚損特約（免責金額３万円家財限度額５０万円）"),
        TOKU_D9("D9", "破汚損特約（免責金額１０万円家財限度額３０万円）"),
        TOKU_DA("DA", "破汚損特約（免責金額５万円家財限度額３０万円）"),
        TOKU_DB("DB", "破汚損特約（免責金額３万円家財限度額３０万円）"),
        TOKU_DC("DC", "破汚損特約（免責金額１０万円）"),
        TOKU_DD("DD", "破汚損特約（免責金額５万円）"),
        TOKU_DE("DE", "破汚損特約（免責金額３万円）"),
        TOKU_E1("E1", "初回保険料の口座振替に関する特約（純新規用）"),
        TOKU_E2("E2", "初回保険料の口座振替に関する特約（既存口振用）"),
        TOKU_E3("E3", "初回保険料の口座振替に関する特約"),
        TOKU_F1("F1", "破損・汚損損害等補償特約"),
        TOKU_F2("F2", "水災危険補償特約"),
        TOKU_F3("F3", "設備損害補償特約"),
        TOKU_F4("F4", "施設賠償責任補償特約"),
        TOKU_F5("F5", "個人賠償責任保険包括契約に関する特約"),
        TOKU_Y2("Y2", "日付変更に関連する損害等補償対象外"),
        TOKU_01("01", "団体扱に関する特約"),
        TOKU_02("02", "保険料分割払特約（一般）"),
        TOKU_03("03", "長期保険保険料一括払特約"),
        TOKU_04("04", "長期保険保険料年払特約"),
        TOKU_05("05", "保険料分割払特約（大口）"),
        TOKU_06("06", "長期保険保険料払込特約（地震保険用）"),
        TOKU_07("07", "自動継続特約（地震保険用）"),
        TOKU_08("08", "動物特約"),
        TOKU_09("09", "植物特約"),
        TOKU_10("10", "新価保険特約"),
        TOKU_11("11", "積立型追加特約"),
        TOKU_12("12", "特殊包括契約に関する特約"),
        TOKU_13("13", "保険金の支払に関する特約（免責金額）"),
        TOKU_14("14", "火気禁止特約"),
        TOKU_15("15", "作業変更条項"),
        TOKU_16("16", "先物契約特約"),
        TOKU_17("17", "作業条項"),
        TOKU_18("18", "ボイラ等破裂・爆発損害補償対象外特約"),
        TOKU_19("19", "電気的事故補償特約"),
        TOKU_20("20", "共用部分担保"),
        TOKU_21("21", "火災通知保険特約（基本方式）"),
        TOKU_22("22", "火災通知保険特約（第２方式）"),
        TOKU_23("23", "火災通知保険特約（第３方式）"),
        TOKU_24("24", "火災通知保険特約（第４方式）"),
        TOKU_25("25", "火災通知保険特約（下請包括方式）"),
        TOKU_26("26", "火災通知保険特約（貯油所方式）"),
        TOKU_27("27", "通知保険（油槽所特殊方式）"),
        TOKU_28("28", "火災通知保険特約（自社・下請構内包括方式）"),
        TOKU_29("29", "抵当権者特約"),
        TOKU_30("30", "価額協定保険特約（建物新価，家財時価用）"),
        TOKU_31("31", "価額協定保険特約（建物新価，家財新価用）"),
        TOKU_32("32", "ガラス損害補償特約"),
        TOKU_33("33", "個人賠償責任補償特約"),
        TOKU_34("34", "店舗賠償責任補償特約"),
        TOKU_35("35", "店舗賠居住無"),
        TOKU_36("36", "借家人賠償責任補償特約"),
        TOKU_37("37", "消火設備条項"),
        TOKU_38("38", "車両敷地外危険補償対象外特約"),
        TOKU_39("39", "車両敷地外危険補償特約"),
        TOKU_40("40", "電車損害補償特約"),
        TOKU_41("41", "総括契約に関する特約"),
        TOKU_42("42", "個人賠償責任保険支払限度額変更特約（３０００万円）"),
        TOKU_43("43", "借家人賠償責任不担保特約"),
        TOKU_44("44", "個人賠償責任不担保特約"),
        TOKU_45("45", "危険品条項（普通）"),
        TOKU_46("46", "危険品条項（Ａ級）"),
        TOKU_47("47", "危険品条項（Ｂ級）"),
        TOKU_48("48", "交通傷害担保特約"),
        TOKU_49("49", "フィラメント風災・雹災危険補償対象外特約"),
        TOKU_50("50", "スプリンクラー不時放水危険補償特約"),
        TOKU_51("51", "冷凍（冷蔵）損害補償対象外特約"),
        TOKU_52("52", "冷凍（冷蔵）損害補償特約"),
        TOKU_53("53", "電気的事故補償特約（一般用）"),
        TOKU_54("54", "小損害補償対象外追加特約"),
        TOKU_55("55", "給排水設備不時放水危険補償特約"),
        TOKU_56("56", "家賃補償特約"),
        TOKU_57("57", "敷地外利益補償特約"),
        TOKU_58("58", "てん補期間の終期に関する特約"),
        TOKU_59("59", "利益保険特約"),
        TOKU_60("60", "営業継続費用特約"),
        TOKU_61("61", "火災保険倉庫特約（第１方式）"),
        TOKU_62("62", "火災保険倉庫特約（第２方式）"),
        TOKU_63("63", "火災保険倉庫特約（第２方式：単一制限額方式）"),
        TOKU_64("64", "火災保険倉庫特約（第２方式：包括制限額方式）"),
        TOKU_65("65", "長期特約切替サイン"),
        TOKU_66("66", "修理費用補償特約（支払限度額１００万円）"),
        TOKU_67("67", "火災保険倉庫特約（第２方式：包括通知方式）"),
        TOKU_68("68", "火災保険倉庫特約（第２方式：単一通知方式）"),
        TOKU_69("69", "修理費用補償特約（支払限度額３００万円）"),
        TOKU_70("70", "総合危険担保特約"),
        TOKU_71("71", "風災危険補償特約"),
        TOKU_72("72", "水災危険補償特約"),
        TOKU_73("73", "風水災危険補償特約"),
        TOKU_74("74", "地震危険補償特約（縮小支払方式）"),
        TOKU_76("76", "雪災危険補償特約"),
        TOKU_77("77", "漏出危険補償特約"),
        TOKU_78("78", "地震衝撃危険補償対象外特約"),
        TOKU_79("79", "噴火危険補償特約"),
        TOKU_80("80", "付保割合条件付実損払特約"),
        TOKU_81("81", "風災および雹災危険補償特約"),
        TOKU_82("82", "雹災危険補償対象外特約"),
        TOKU_83("83", "風災および雹災危険補償対象外特約"),
        TOKU_84("84", "除雪作業担保特約"),
        TOKU_85("85", "破壊行為危険・騒擾および労働争議危険補償特約"),
        TOKU_86("86", "実損払と新価が競合"),
        TOKU_87("87", "地震破裂爆発危険補償特約"),
        TOKU_88("88", "地震水災危険補償特約"),
        TOKU_89("89", "地震危険補償特約（支払限度額方式）"),
        TOKU_90("90", "森林作業危険担保特約"),
        TOKU_92("92", "航空機および車両危険補償特約"),
        TOKU_93("93", "騒擾および労働争議・航空機および車両補償特約"),
        TOKU_94("94", "破壊行為危険補償特約"),
        TOKU_95("95", "トランクルーム拡張危険担保特約"),
        TOKU_96("96", "緊急停止損害補償特約"),
        TOKU_97("97", "保険契約の継続に関する特約"),
        TOKU_98("98", "借家人賠責支払限度額変更"),
        TOKU_99("99", "その他危険総合担保特約"),
        TOKU_G1("G1", "建替費用補償特約"),
        TOKU_G2("G2", "敷地内構築物修復費用補償特約"),
        TOKU_G3("G3", "共用部分修理費用補償特約"),
        TOKU_G4("G4", "防犯対策費用補償特約"),
        TOKU_G5("G5", "バリアフリー改造等費用補償特約"),
        TOKU_G6("G6", "持ち出し家財補償特約"),
        TOKU_G7("G7", "引越し中の損害補償特約"),
        TOKU_G8("G8", "類焼損害補償特約"),
        TOKU_G9("G9", "類焼傷害担保特約"),
        TOKU_H0("H0", "風災等支払方法変更特約（フランチャイズ型３万円）"),
        TOKU_H1("H1", "風災等支払方法変更特約（フランチャイズ型５万円）"),
        TOKU_H2("H2", "風災等支払方法変更特約（フランチャイズ型１０万円）"),
        TOKU_H3("H3", "風災等支払方法変更特約（ディダクティブル型なし）"),
        TOKU_H4("H4", "風災等支払方法変更特約（ディダクティブル型３千円）"),
        TOKU_H5("H5", "風災等支払方法変更特約（ディダクティブル型５千円）"),
        TOKU_H6("H6", "風災等支払方法変更特約（ディダクティブル型１万円）"),
        TOKU_H7("H7", "風災等支払方法変更特約（ディダクティブル型３万円）"),
        TOKU_H8("H8", "風災等支払方法変更特約（ディダクティブル型５万円）"),
        TOKU_H9("H9", "風災等支払方法変更特約（ディダクティブル型１０万円"),
        TOKU_J1("J1", "水災支払方法変更特約"),
        TOKU_F8("F8", "風災等支払方法変更特約"),
        TOKU_F9("F9", "水災支払方法変更特約"),
        TOKU_75("75", "集団扱特約（住宅ローン利用者用）"),
        TOKU_K1("K1", "水濡れ原因調査費用補償特約"),
        TOKU_K2("K2", "賃貸住宅建物に関する特約"),
        TOKU_K3("K3", "法人等契約の被保険者に関する特約"),
        TOKU_EZ("EZ", "初回保険料の口座振替に関する特約"),
        TOKU_L1("L1", "長期保険保険料年払特約（地震保険用）"),
        TOKU_P4("P4", "漏水による建物管理賠償責任補償対象外特約"),
        // 以下コードを持たない特約
        TOKU_OTHER1("OTHER1","インターネット等による通信販売に関する特約"),
        TOKU_OTHER2("OTHER2","保険証券等の発行省略に関する特約"),
        TOKU_OTHER3("OTHER3","保険料クレジットカード払特約（登録方式）"),
        TOKU_OTHER4("OTHER4","火災等危険のみ補償特約"),
        TOKU_OTHER5("OTHER5","破損・汚損損害等補償対象外特約"),
        TOKU_OTHER6("OTHER6","災害時諸費用保険金補償対象外特約"),
        TOKU_OTHER7("OTHER7","災害時諸費用支払限度額変更特約（１００万円）"),
        TOKU_OTHER8("OTHER8","災害時諸費用支払限度額変更特約（２００万円）"),
        TOKU_OTHER9("OTHER9","災害時諸費用支払限度額変更特約（３００万円）"),
        TOKU_OTHER10("OTHER10","災害時諸費用支払限度額変更特約（４００万円）"),
        TOKU_OTHER11("OTHER11","雑危険補償対象外特約")

        ;

        private String id;
        private String name;

        private TOKUYAKU(String id, String name) {
            this.setId(id);
            this.setName(name);
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
        /**
         * 名称取得
         */
        public static String getNameByCode(String id) {
            String name = "";
            if (!StringUtils.isEmpty(id)) {
                for (TOKUYAKU enumValue : values()) {
                    if (enumValue.getId().equals(id)) {
                        name = enumValue.getName();
                        break;
                    }
                }
            }
            return name;
        }
    }

    /**
     * 割増引
     */
    public static enum WARIMASHIHIKI {
        WARI_01("01", "共同住宅割増"),
        WARI_02("02", "空地割引"),
        WARI_03("03", "動産割増Ａ級"),
        WARI_04("04", "動産割増Ｂ級"),
        WARI_05("05","動産割増Ｃ級"),
        WARI_06("06", "動産割増その他"),
        WARI_07("07", "建築割増"),
        WARI_08("08", "職業割増"),
        WARI_09("09","作業割増"),
        WARI_10("10", "作業危険割増"),
        WARI_11("11", "面積割増その他"),
        WARI_12("12", "階数割増"),
        WARI_13("13","階数割増"),
        WARI_14("14", "階数割増"),
        WARI_15("15", "階数割増"),
        WARI_16("16", "階数割増"),
        WARI_17("17", "階数割増"),
        WARI_18("18", "階数割増"),
        WARI_19("19", "階数割増"),
        WARI_20("20","階数割増"),
        WARI_21("21", "Ａ級危険品割増"),
        WARI_22("22", "Ｂ級危険品割増"),
        WARI_23("23", "特別危険品割増"),
        WARI_24("24", "修繕割増"),
        WARI_25("25", "調整割増１"),
        WARI_26("26",  "調整割増２"),
        WARI_27("27", "調整割増"),
        WARI_28("28",  "調整割引"),
        WARI_29("29", "修理危険補償割増"),
        WARI_30("30", "その他危険補償対象外割引"),
        WARI_31("31", "冷凍割増"),
        WARI_32("32", "ネオンサイン装置割増"),
        WARI_33("33", "車両割増（車両敷地外危険補償特約付：鉄道）"),
        WARI_34("34", "車両割増（車両敷地外危険補償特約付：その他）"),
        WARI_35("35", "地下貯油タンク動産割増"),
        WARI_36("36", "地下ＬＰガス動産割増"),
        WARI_37("37", "スプリンクラー割増"),
        WARI_38("38", "競馬場割増"),
        WARI_39("39", "映画撮影場用法割増"),
        WARI_40("40", "国際見本市用法割増"),
        WARI_41("41", "混造建物"),
        WARI_42("42", "複合用途建物"),
        WARI_43("43", "特定割引"),
        WARI_44("44", "博覧会所在物件用法割増"),
        WARI_45("45", "電車確認料率"),
        WARI_46("46", "一部高危険用法平均料率"),
        WARI_47("47", "公有物件割引（公有）"),
        WARI_48("48", "公有物件割引（準公有）"),
        WARI_49("49", "公有物件割引（社会福祉）"),
        WARI_50("50", "その他危険補償割引"),
        WARI_51("51", "てん補期間の終期の割引"),
        WARI_52("52", "防火戸割引"),
        WARI_53("53", "特級建物割引"),
        WARI_54("54", "大口団体割引"),
        WARI_55("55", "映画撮影場室地割引"),
        WARI_56("56", "省令準耐火構造に関する料率"),
        WARI_58("58", "オール電化割引"),
        WARI_59("59", "自動車契約者割引"),
        WARI_60("60", "規模別割引"),
        WARI_61("61", "消火設備割引（スプリンクラー）"),
        WARI_62("62", "消火設備割引（屋外消火栓甲）"),
        WARI_63("63", "消火設備割引（屋外消火栓乙）"),
        WARI_64("64", "消火設備割引（屋内消火栓）"),
        WARI_65("65", "消火設備割引（消防ポンプ）"),
        WARI_66("66", "消火設備割引（泡）"),
        WARI_67("67", "消火設備割引（水噴霧）自動消火"),
        WARI_68("68", "消火設備割引（水噴霧）自動消火"),
        WARI_69("69", "消火設備割引（水噴霧）手動消火"),
        WARI_70("70", "消火設備割引（水噴霧）手動消火"),
        WARI_71("71", "消火設備割引（不活性ガス）自動"),
        WARI_72("72", "消火設備割引（不活性ガス）手動"),
        WARI_73("73", "消火設備割引（ハロゲン化物）自動"),
        WARI_74("74", "消火設備割引（ハロゲン化物）手動"),
        WARI_75("75", "消火設備割引（粉末）自動"),
        WARI_76("76", "消火設備割引（粉末）手動"),
        WARI_77("77", "消火設備割引（自火報）"),
        WARI_78("78", "消火設備割引（その他）"),
        WARI_79("79", "住宅用防災機器割引"),
        WARI_80("80", "住宅用防災機器割引"),
        WARI_81("81", "免責金額設定割引（免責５００万）"),
        WARI_82("82", "免責金額設定割引（免責１０００万）"),
        WARI_83("83", "免責金額設定割引（免責３０００万）"),
        WARI_84("84", "免責金額設定割引（免責５０００万）"),
        WARI_85("85", "免責金額設定割引（免責１億）"),
        WARI_86("86", "電気的事故割増（電気事業者用）"),
        WARI_87("87", "電気的事故割増（Ｂ）事業者用"),
        WARI_88("88", "電気的事故割増（一般契約者用）"),
        WARI_89("89", "電気的事故割増（Ｂ）一般用"),
        WARI_90("90", "建築係数"),
        WARI_91("91", "特殊包括割引"),
        WARI_92("92", "工場物件地区割増"),
        WARI_93("93", "団体扱保険料一括払割引"),
        WARI_94("94", "債務者団体割引"),
        WARI_95("95", "耐火性能割引"),
        WARI_96("96", "複数敷地内特殊包括割引"),
        WARI_97("97", "準耐火性能割引"),
        WARI_98("98", "動産割増"),
        WARI_99("99", "廃止済割引コード"),
        WARI_A0("A0", "ＲＭ割引（ＲＳ種別１）"),
        WARI_A1("A1", "ＲＭ割引（ＲＳ種別２）"),
        WARI_A2("A2", "ＲＭ割引（ＲＳ種別３）"),
        WARI_B0("B0", "規模別割引５％"),
        WARI_B1("B1", "規模別割引１０％"),
        WARI_B2("B2", "規模別割引１５％");
         private String id;
        private String name;

        private WARIMASHIHIKI(String id, String name) {
            this.setId(id);
            this.setName(name);
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        /**
         * 名称取得
         */
        public static String getNameByCode(String id) {
            String name = "";
            if (!StringUtils.isEmpty(id)) {
                for (WARIMASHIHIKI enumValue : values()) {
                    if (enumValue.getId().equals(id)) {
                        name = enumValue.getName();
                        break;
                    }
                }
            }
            return name;
        }
    }

    /**
     * 変更区分
     */
    public static enum CHANGE_KBN {
        TRANSFER("1", "異動"),
        CANCELLATION("2", "解約"),
        MAILADDRESS("3", "メールアドレス"),
        CREDIT("4", "クレジットカード");

        private String id;
        private String name;

        private CHANGE_KBN(String id, String name) {
            this.setId(id);
            this.setName(name);
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        /**
         * 日本語名称からEnumを取得する（stream利用）
         *
         * @param code
         * @return
         */
        public static CHANGE_KBN getCode(String code) {
            return Arrays.stream(CHANGE_KBN.values())
                    .filter(data -> data.getId().equals(code))
                    .findFirst()
                    .orElse(null);
        }
    }

    /**
     * 契約区分
     */
    public static enum KEIYAKU_KBN {
        INTERNET("1", "インターネット"),
        PAPERLESS("2", "ペーパーレス");

        private String id;
        private String name;

        private KEIYAKU_KBN(String id, String name) {
            this.setId(id);
            this.setName(name);
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    /**
     * データ取得タイプ
     */
    public static enum DATA_TYPE {
        ENTRY_DTL("1", "契約内容詳細"), ENTRY_CONFIRMATION("2", "契約内容確認書"), CHANGE_INPUT("3", "変更内容入力"),
        CHANGE_MAIL("4", "メールアドレス変更入力、クレジットカード変更入力");

        private String id;
        private String name;

        private DATA_TYPE(String id, String name) {
            this.setId(id);
            this.setName(name);
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    /**
     * 参照先区分
     */
    public static enum REF_KBN {
        REPLICA("1", "契約レプリカ"), ENTRY("2", "申込管理");

        private String id;
        private String name;

        private REF_KBN(String id, String name) {
            this.setId(id);
            this.setName(name);
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static enum CONTACT_TYPE {

        WIDE("1", "ワイド"), BASIC("2", "ベーシック"), ECONOMY("3", "エコノミー"), FREE("4", "フリープラン");

        private String id;
        private String name;

        private CONTACT_TYPE(String id, String name) {
            this.setId(id);
            this.setName(name);
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        /**
         * 名称取得
         */
        public static String getNameByCode(String id) {
            String name = "";
            if (!StringUtils.isEmpty(id)) {
                for (CONTACT_TYPE enumValue : values()) {
                    if (enumValue.getId().equals(id)) {
                        name = enumValue.getName();
                        break;
                    }
                }
            }
            return name;
        }
    }

    /**
     * 支払方法
     */
    public static enum PAYMENT {
        TEMPORARY("1", "一時払"),
        LUMPSUM("2", "月払"),
        LARGESPLIT("3", "大口分割"),
        ORGANIZATION("4", "団体扱"),
        YEARPAYMENT("5","年払"),
        ORGANIZATIONCONTRACT("7", "団体契約"),
        GROUP("8", "集団扱");

        private String id;
        private String name;

        private PAYMENT(String id, String name) {
            this.setId(id);
            this.setName(name);
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
        /**
         * 名称取得
         */
        public static String getNameByCode(String id) {
            String name = "";
            if (!StringUtils.isEmpty(id)) {
                for (PAYMENT enumValue : values()) {
                    if (enumValue.getId().equals(id)) {
                        name = enumValue.getName();
                        break;
                    }
                }
            }
            return name;
        }
    }

    /**
     * 地震保険有無
     */
    public static enum JISHIN_HOKEN_UMU {
        ARI("1"),
        NASHI("0");

        private String id;

        private JISHIN_HOKEN_UMU(String id) {
            this.setId(id);
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }
    }

    /**
     * OFF_ON
     */
    public static enum OFF_ON {
        OFF("0", "OFF"),
        ON("1", "ON");

        private String id;
        private String name;

        private OFF_ON(String id, String name) {
            this.setId(id);
            this.setName(name);
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    /**
     * 連絡時間帯（午前）
     */
    public static enum CONTACTTIMEZONE_MORNING {
        ZERO("0", Constants.BLANK),
        MORNING("1", "午前");

        private String id;
        private String name;

        private CONTACTTIMEZONE_MORNING(String id, String name) {
            this.setId(id);
            this.setName(name);
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    /**
     * 連絡時間帯（12時-14時）
     */
    public static enum CONTACTTIMEZONE_NOON {
        ZERO("0", Constants.BLANK),
        NOON("1", "12時-14時");

        private String id;
        private String name;

        private CONTACTTIMEZONE_NOON(String id, String name) {
            this.setId(id);
            this.setName(name);
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    /**
     * 連絡時間帯（14時-17時）
     */
    public static enum CONTACTTIMEZONE_AFTERNOOON {
        ZERO("0", Constants.BLANK),
        AFTERNOOON("1", "14時-17時");

        private String id;
        private String name;

        private CONTACTTIMEZONE_AFTERNOOON(String id, String name) {
            this.setId(id);
            this.setName(name);
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    /**
     * 連絡時間帯（指定なし）
     */
    public static enum CONTACTTIMEZONE_NONE {
        ZERO("0", Constants.BLANK),
        NONE("1", "指定なし");

        private String id;
        private String name;

        private CONTACTTIMEZONE_NONE(String id, String name) {
            this.setId(id);
            this.setName(name);
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    /**
     * つなぎ先
     */
    public static enum CONTACT_CODE {
        HOME("1", "自宅 "),
        TEL("2", "携帯電話"),
        COMPANY("3", "会社"),
        OTHER("4", "その他");

        private String id;
        private String name;

        private CONTACT_CODE(String id, String name) {
            this.setId(id);
            this.setName(name);
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    /**
     * 契約内容の変更事由
     * 事由6は未使用
     */
    public static enum HENKOU_JIYUU {
        JIYUU_1("契約者情報の変更"),
        JIYUU_2("建物情報の変更"),
        JIYUU_3("ご契約プランの変更"),
        JIYUU_4("被保険者情報の変更"),
        JIYUU_5("契約の解約"),
        JIYUU_6("");

        private String name;

        private HENKOU_JIYUU(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

        public String getName(String juyuuFlg) {

            // 各事由フラグに "1" が設定されているものは、変更事由を返却し、そうでないものはブランクを返却
            if (Constants.HENKOU_JIYUU_FLG_TRUE.equals(juyuuFlg)) {
                return this.name;
            } else {
                return "";
            }
        }
    }

    /**
     * 評価法区分
     */
    public static enum METHOD_TYPE {
        CONCEPTUAL("1", "概念法"),
        ACQUISITION("2", "取得年次法"),
        OTHER("9", "その他評価法");

        private String id;
        private String name;

        private METHOD_TYPE(String id, String name) {
            this.setId(id);
            this.setName(name);
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
    /**
     * 契約区分
     */
    public static enum AGREE_TYPE {
        INDIVIDUAL("1", "個人契約"),
        CORPORATION("2", "法人契約");

        private String id;
        private String name;

        private AGREE_TYPE(String id, String name) {
            this.setId(id);
            this.setName(name);
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    /**
     * プロモーションメール送信フラグ
     *
     * 1：はい
     * 2：いいえ
     */
    public static enum YESNO {
        YES("1", "はい"),
        NO("2", "いいえ");

        private String id;
        private String name;

        private YESNO(String id, String name) {
            this.setId(id);
            this.setName(name);
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    /**
     * 所在地
     *
     */
    public static enum CORPORATE_CODE {
        C01("01", "株式会社"),
        C02("02", "有限会社"),
        C03("03", "合名会社"),
        C04("04", "合資会社"),
        C05("05", "相互会社"),
        C06("06", "信用金庫"),
        C07("07", "社団法人"),
        C08("08", "財団法人"),
        C09("09", "福祉法人"),
        C10("10", "宗教法人"),
        C11("11", "事務所"),
        C12("12", "医療法人"),
        C13("13", "学校法人"),
        C14("14", "協業組合"),
        C15("15", "組合"),
        C16("16", "協同組合"),
        C17("17", "共済組合"),
        C18("18", "労働組合"),
        C19("19", "企業組合"),
        C20("20", "健康保険組合"),
        C21("21", "信用組合"),
        C22("22", "社会福祉法人"),
        C23("23", "法人会"),
        C24("24", "管理組合");

        private String id;
        private String name;

        private CORPORATE_CODE(String id, String name) {
            this.setId(id);
            this.setName(name);
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

    }

    /**
     * 保険の対象区分
     */
    public static enum INSURANCE_OBJECT_TYPE {
        HOUSEHOLD("1", "家財"),
        EQUIPMENT("2", "設備・什器等");

        private String id;
        private String name;

        private INSURANCE_OBJECT_TYPE(String id, String name) {
            this.setId(id);
            this.setName(name);
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    /**
     * 保険会社
     */
    public static enum INSURANCE_COMPANY {
        myapp("1", "楽天損保"),
        WITHOUT("2", "楽天損保以外");

        private String id;
        private String name;

        private INSURANCE_COMPANY(String id, String name) {
            this.setId(id);
            this.setName(name);
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    /**
     * 銀行区分
     */
    public static enum BANK_TYPE {
        POST_EXCEPT(1, "郵貯以外"),
        POST(2, "郵貯");

        private Integer id;
        private String name;

        private BANK_TYPE(Integer id, String name) {
            this.setId(id);
            this.setName(name);
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
	}

    /**
     * 銀行区分COMMEN
     */
    public static enum BANK_TYPE_COMMEN {
        POST_EXCEPT(1, "ゆうちょ銀行以外"),
        POST(2, "ゆうちょ銀行");

        private Integer id;
        private String name;

        private BANK_TYPE_COMMEN(Integer id, String name) {
            this.setId(id);
            this.setName(name);
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
	}

	/**
	 * 振替済通知
	 */
	public static enum TRANSFERED_NOTICE {
		NOTICED("1", "あり"),
		NOT_NOTICED("2", "なし");

		private String id;
		private String name;

		private TRANSFERED_NOTICE(String id, String name) {
			this.setId(id);
			this.setName(name);
		}

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
	}

	/**
	 * 振替済通知COMMEN
	 */
	public static enum TRANSFERED_NOTICE_COMMEN {
		NOTICED("1", "要"),
		NOT_NOTICED("2", "不要");

		private String id;
		private String name;

		private TRANSFERED_NOTICE_COMMEN(String id, String name) {
			this.setId(id);
			this.setName(name);
		}

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
	}

	/**
	 * 科目
	 */
	public static enum SUBJECT_CLASSIFICATION {
		GENERAL("1", "普通"),
		PRESENT("2", "当座");

		private String id;
		private String name;

		private SUBJECT_CLASSIFICATION(String id, String name) {
			this.setId(id);
			this.setName(name);
		}

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
	}
	/**
	 * 職作業 2019/02/28計算BUG対応
	 */
	public static enum JOBWORK {
		JOBWORK_232("232","喫茶店、レストラン"),
		JOBWORK_233("233","バー、ナイトクラブ"),
		JOBWORK_511("511","ホテル、旅館"),
		JOBWORK_519("519","独身寮、厚生寮（その他宿泊施設）"),
		JOBWORK_400("400","事務所"),
		JOBWORK_896("896","短期空家（準住宅）"),
		JOBWORK_450("450","学校、各種学校"),
		JOBWORK_471("471","神社、仏閣"),
		JOBWORK_479("479","教会、修道院（その他宗教施設）"),
		JOBWORK_501("501","病院、診療所"),
		JOBWORK_509("509","骨つぎ、あんま（その他医療施設）"),
		JOBWORK_481("481","老人福祉・介護施設"),
		JOBWORK_482("482","託児所、児童養護施設（その他福祉・介護施設）"),
		JOBWORK_570("570","理容室、美容室"),
		JOBWORK_204("204","コンビニエンスストア"),
		JOBWORK_300("300","洋服販売（繊維製品販売）"),
		JOBWORK_390("390","日用品雑貨、花販売（その他販売）"),
		JOBWORK_340("340","自動車、金物販売（金属機械器具販売）"),
		JOBWORK_370("370","書籍、文房具販売"),
		JOBWORK_380("380","薬品販売");

		private String id;
		private String name;

		private JOBWORK(String id, String name) {
			this.setId(id);
			this.setName(name);
		}

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public static String getCodeByValue(String id) {
			String code = "";
	        if (!StringUtils.isEmpty(id)) {
	            for (JOBWORK enumValue : values()) {
	                if (enumValue.getId().equals(id)) {
	                    code = enumValue.getId();
	                    break;
	                }
	            }
	        }
	        return code;
		}
		/**
         * 名称取得
         */
        public static String getNameByCode(String id) {
            String name = "";
            if (!StringUtils.isEmpty(id)) {
                for (JOBWORK enumValue : values()) {
                    if (enumValue.getId().equals(id)) {
                        name = enumValue.getName();
                        break;
                    }
                }
            }
            return name;
        }
	}

	/**
	 * 保険の対象区分
	 */
	public static enum INSURANCE_TYPE {
		TYPE_1("1", "家財"),
		TYPE_2("2", "設備・什器等");

		private String id;
		private String name;

		private INSURANCE_TYPE(String id, String name) {
			this.setId(id);
			this.setName(name);
		}

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
	}

	/**
	 * 明記物件区分
	 */
	public static enum EXPLICIT_PROPERTY_TYPE {
		TYPE_1("1", "貴金属、宝玉、宝石"),
		TYPE_2("2", "書画、骨董、彫刻物等"),
		TYPE_3("3", "稿本、設計書等");

		private String id;
		private String name;

		private EXPLICIT_PROPERTY_TYPE(String id, String name) {
			this.setId(id);
			this.setName(name);
		}

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
	}
}
