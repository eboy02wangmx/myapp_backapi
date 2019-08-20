truncate table FILE_INFO;
insert into FILE_INFO (FILE_ID, FILE_TYPE, CONTENT_TYPE, DOC_TYPE, FILE_STATUS, FILE_INFO, KISAI_UMU, IMAGE_CATCH_FLG, THUMBNAIL, FILE_UP_FLG, DEADLINE_RESPONSES_DATE, RESPONSE_DAY, SHINSA_FINISHED_DATE, SHINSA_ID, SHINSA_NAME, UPD_PROC_ID, UPD_DATE, ADD_PROC_ID, ADD_DATE) values ('1', '1', '3', '1', '1', null, '1', null, null, null, null, null, null, null, null, null, '18-12-12 12:12:12.012', '1', '18-12-12 12:12:12.012');
insert into FILE_INFO (FILE_ID, FILE_TYPE, CONTENT_TYPE, DOC_TYPE, FILE_STATUS, FILE_INFO, KISAI_UMU, IMAGE_CATCH_FLG, THUMBNAIL, FILE_UP_FLG, DEADLINE_RESPONSES_DATE, RESPONSE_DAY, SHINSA_FINISHED_DATE, SHINSA_ID, SHINSA_NAME, UPD_PROC_ID, UPD_DATE, ADD_PROC_ID, ADD_DATE) values ('2', '2', '3', '1', '1', null, '1', null, null, null, null, null, null, null, null, null, '18-12-12 12:12:12.012', '1', '18-12-12 12:12:12.012');

truncate table ENTRY_HA_TEMP;
insert into ENTRY_HA_TEMP (ENTRY_NO, SERIAL, POLICY, MAIL, OPEN_ID, STATE, REJECT_FLG, GAMEN_ID, ENTRY_TYPE, PAYMENT_TYPE, NAME_KEIYAKU, NAME_KEIYAKU_K, YUBIN_KEIYAKU, JUSHO_CODE_KEIYAKU, JUSHO_KEIYAKU, JUSHO_KEIYAKU_FREE, JUSHO_KEIYAKU_K, JUSHO_KEIYAKU_K_FREE, TEL_KEIYAKU_AREA, TEL_KEIYAKU_CITY, TEL_KEIYAKU_NUMBER, TEL_KEIYAKU2_AREA, TEL_KEIYAKU2_CITY, TEL_KEIYAKU2_NUMBER, MAIL_KEIYAKU, MAIL_KEIYAKU_CONFIRM, MAIL_SEND_FLG, SEIBETSU_KEIYAKU, BIRTHDAY_KEIYAKU, KEIYAKU_HIHO_ONAJI, NAME_HIHO, NAME_HIHO_K, KOJIN_BAISHO_ONAJI, NAME_BAISHO_KOJIN, NAME_BAISHO_KOJIN_K, SYAKUYA_BAISHO_ONAJI, NAME_BAISHO_SYAKUYA, NAME_BAISHO_SYAKUYA_K, NAME_BAISHO_KANRI, NAME_BAISHO_KANRI_K, SHIKI_DATE, SHIKI_JIKAN, KASAI_SHUKI_DATE, KASAI_SHUKI_JIKAN, JISHIN_SHUKI_DATE, JISHIN_SHUKI_JIKAN, TATE_SHOYU, TATE_KEITAI, KAISU_CHIJO, KAISU_CHIKA, KAISU_KYOJU, TATE_KOZO, KOZO_TEKKOTSU, KOZO_OTHER, CONST_CHK, GRADE, SHOZAI, KENCHIKU_YM_SEIREKI, AREA, DOC_CHK, TATE_KANYU, JYULON_RIYO, HYOKAGAKU_FUMEI, KYOTEI_GAKU, MON_GAKU, SHINCHIKU_GAKU, HYOKA_KIJUN, KAZAI_KANYU, SETAI_NENREI, KODOMO_NINZU, HAIGUSHA, DOKYO_NINZU, TATE_HYOKA_GAKU_LOW, TATE_HYOKA_GAKU_UP, KAZAI_HYOKA_GAKU_LOW, KAZAI_HYOKA_GAKU_UP, TATE_JISHIN_KANYU, KAZAI_JISHIN_KANYU, KAKUNIN_SHORUI, JISHIN_WARIBIKIRITSU, TAISHIN, TAISHIN_DATE, BUILT_DATE_CHK, WARIBIKI_CHK, INC_KISO, INC_TATAMI, INC_MONHEI, INC_SHAKO, INC_KYOYO, KASAI_HKIKAN, JISHIN_HKIKAN, JISHIN_JIDOKEIZOKU, KASAI_HOHO, JISHIN_HOHO, SENTAKU_PLAN, O_FIRE_HOSHO, O_FUSAI_HOSHO, O_FUSAI_GAKU, O_SUISAI_HOSHO, O_TONAN_HOSHO, O_HASON_HOSHO, O_HASON_FUTAN, O_HASON_LIMIT, O_JISHIN_HOSHO_TATE, O_JISHIN_HOSHO_KAZAI, O_SAIGAI_HOSHO, O_SAIGAI_LIMIT, O_HIYO_HOSHO, O_TOKU_KOJINBAISHO, O_TOKU_SHAKUYABAISHO, O_TOKU_SHAKUYABAISHO_LIMIT, O_TOKU_TATEBAISHO, O_TOKU_TATEBAISHO_LIMIT, O_TOKU_MIZUNUREHOSHO, O_TOKU_ROSUI_TAISHOGAI, O_TOKU_RUISHO, O_TOKU_TATEKAE, O_TOKU_KYOYO, O_TOKU_BOHAN, O_TOKU_MOCHIDASHI, O_TOKU_HIKKOSHI, O_TOKU_FUSAI_SHIHARAI, O_TOKU_SUISAI_SHIHARAI, O_TOKU_HOJIN_KEIYAKU, O_TOKU_KASAI_NOMI, O_TOKU_SUISAI_TAISHOGAI, O_TOKU_ZATU_TAISHOGAI, F_FIRE_HOSHO, F_FUSAI_HOSHO, F_FUSAI_GAKU, F_SUISAI_HOSHO, F_TONAN_HOSHO, F_HASON_HOSHO, F_HASON_FUTAN, F_HASON_LIMIT, F_JISHIN_HOSHO_TATE, F_JISHIN_HOSHO_KAZAI, F_SAIGAI_HOSHO, F_SAIGAI_LIMIT, F_HIYO_HOSHO, F_TOKU_KOJINBAISHO, F_TOKU_SHAKUYABAISHO, F_TOKU_SHAKUYABAISHF_LIMIT, F_TOKU_TATEBAISHO, F_TOKU_TATEBAISHF_LIMIT, F_TOKU_MIZUNUREHOSHO, F_TOKU_ROSUI_TAISHOGAI, F_TOKU_RUISHO, F_TOKU_TATEKAE, F_TOKU_KYOYO, F_TOKU_BOHAN, F_TOKU_MOCHIDASHI, F_TOKU_HIKKOSHI, F_TOKU_FUSAI_SHIHARAI, F_TOKU_SUISAI_SHIHARAI, F_TOKU_HOJIN_KEIYAKU, F_TOKU_KASAI_NOMI, F_TOKU_SUISAI_TAISHOGAI, F_TOKU_ZATU_TAISHOGAI, GAKU_KASAI_TATE, GAKU_KASAI_KAZAI, GAKU_JISHIN_TATE, GAKU_JISHIN_TATE_LOW, GAKU_JISHIN_TATE_UP, GAKU_JISHIN_KAZAI, GAKU_JISHIN_KAZAI_LOW, GAKU_JISHIN_KAZAI_UP, O_HRYO_KASAI_TATE, O_HRYO_KASAI_KAZAI, O_HRYO_KASAI, O_HRYO_JISHIN_TATE, O_HRYO_JISHIN_KAZAI, O_HRYO_JISHIN, O_HRYO_KOJINBAI, O_HRYO_SHAKUYABAI, O_HRYO_RUISHO, O_HRYO_NENGAKU, O_HRYO_SHOKAI, O_HRYO, F_HRYO_KASAI_TATE, F_HRYO_KASAI_KAZAI, F_HRYO_KASAI, F_HRYO_JISHIN_TATE, F_HRYO_JISHIN_KAZAI, F_HRYO_JISHIN, F_HRYO_KOJINBAI, F_HRYO_SHAKUYABAI, F_HRYO_RUISHO, F_HRYO_NENGAKU, F_HRYO_SHOKAI, F_HRYO, JUSHO_ONAJI, YUBIN_HOKEN, JUSHO_CODE_HOKEN, JUSHO_HOKEN, JUSHO_HOKEN_FREE, JUSHO_HOKEN_K, JUSHO_HOKEN_K_FREE, KEIYAKUSHA_CHK, HOKENNOTAISHO_CHK, HOKANOHOKEN_CHK, HOKENKIKAN_CHK, JISHINHOKEN_CHK, HOSHONAIYO_CHK, JUYOJIKO_CHK, DAIRI_CHK, BOSHUNIN_CHK, ACCOUNT_CHK, MB_MEISAI_CHK, BNT_CHK, OTHER_CHK, KOJIN_DOI, JISHIN_KAKUNIN, DOC_SUBMIT, CHECK_DATE, CHECK_JIKAN, TEISEI, SHINSA_KEIYAKUSHA_CHK, SHINSA_HOKENNOTAISHO_CHK, SHINSA_HOKANOHOKEN_CHK, SHINSA_HOKENKIKAN_CHK, SHINSA_JISHINHOKEN_CHK, SHINSA_HOSHONAIYO_CHK, SHINSA_JUYOJIKO_CHK, SHINSA_DAIRI_CHK, SHINSA_BOSHUNIN_CHK, SHINSA_ACCOUNT_CHK, SHINSA_MB_MEISAI_CHK, SHINSA_BNT_CHK, SHINSA_OTHER_CHK, SHINSA_KOJIN_DOI, SHINSA_JISHIN_KAKUNIN, SHINSA_NAME, SHINSA_MEMO, KAKUNIN_NAME, KAKUNIN_MEMO, KAKUNIN_DATE, DAIRI_CD, DAIRI_NAME, OLD, KEIYAKU_OTHER, HOKEN_SHU_KANA1, HOKEN_CO_KANA1, myapp_SONPO1, HOKEN_TAISHO1, GAKU_KIHON_HOKEN1, GAKU_JISHIN_HOKEN1, MANKI_DATE1, SECOND_UMU, HOKEN_SHU_KANA2, HOKEN_CO_KANA2, myapp_SONPO2, HOKEN_TAISHO2, GAKU_KIHON_HOKEN2, GAKU_JISHIN_HOKEN2, MANKI_DATE2, ALL_KOSU, YOHO, SHOKUSAGYO_BUNRUI, SHOKUSAGYO, GEKIHEN_KANWA, OTHER_GAKU, OTHER_KONKYO, SETUJ_KANYU, SETUJ_HYOKA_GAKU, SETUJ_GAKU, SEIHN_KANYU, SEIHN_HYOKA_GAKU, SEIHN_GAKU, MB_HYOKA_GAKU, MB_GAKU, BNT_KBN, WARI_KBN, HKNJ1_KATEN_CD, HKNJ1_DAIRI_CD, HKNJ1_JIKO, HKNJ1_BNT_WARI, HKNJ2_KATEN_CD, HKNJ2_DAIRI_CD, HKNJ2_JIKO, HKNJ2_BNT_WARI, KEIYAKU_KBN, BEF_HOJIN_CD, AFT_HOJIN_CD, NAME_DAIHYO, NAME_DAIHYO_K, UKE_KBN, KATEN_CD, SHICHIKEN_UMU, TEITO_UMU, BETSUDO, TANTO_CD, BNT_UMU, TOKKI_K, BOSHUNIN_ID, BOSHUNIN_NAME, HOSEI_KASHO_CD, HOSEI_WARIAI, YUSHI_UMU, KOZA_HENKO, HAGAKI, POLICY_OLD, POLICY_OLD_EDA, JT_KBN, PAPER_POLICY_SEND, SEIGEN_CD, KETTEI_NO, MB_MEISAI_UMU, HRYO_SETUJ, HRYO_SEIHN, HRYO_MB, HRYO_TATEMONO_KANRI, SYOKAI_TRANSFER, BANK_KBN, FINANCIALINSTITUTION_CODE, BRANCH_NUMBER, SUBJECT, ACCOUNT_NUMBER, SYMBOL_YUTYO, NUMBER_YUTYO, ACCOUNT_NAME, ACCOUNT_NAME_KANA, TRANSFER_NOTICE, IRAISYO_FUYO, ACCOUNT_SEND_DATE, SAVE_DATE, KIGEN, OLD_ENTRY_NO, FIREPROOF_SEND_FLG, QUAKE_SEND_FLG, TRANSFER_SHICHIKEN_STATUS, TEISEI_ITEM_SELECT, PATTERN_CD, MOSIKOMI_BUNGEN, DEL_FLG, ADD_DATE, UPD_DATE, F_HRYO_JISHIN_NENGAKU, F_HRYO_JISHIN_SHOKAI, F_HRYO_JISHIN_GOUKEI, O_HRYO_JISHIN_NENGAKU, O_HRYO_JISHIN_SHOKAI, O_HRYO_JISHIN_GOUKEI, TANTOSYA_CD, KATEN_NAME) values ('703106', 1, 'P00000001', 'gaow@pactera.com', null, '4', '0', 'EntryAccountTransfer', '2', '2', '楽天太郎', 'ラクテンタロウ', '1234567', '1112134145', '岩手県の', '到底ますａｂｃ', 'テスト１テスト２テスト３', 'トウテイマスモ', '111', '1111', '1111', null, null, null, 'gaow@pactera.com', 'gaow@pactera.com', null, '1', '19950818', '1', null, null, null, null, null, null, null, null, null, null, '20190223', '160000', '20290223', '160000', '20240223', '160000', '1', '1', 3, 0, null, '1', null, null, '1', 'T', '03', '201703', 567.000, '1', '1', '1', '1', 11100, 220, null, null, '1', 30, 0, '2', 0, 210, 21400, 15600, 15600, '1', '1', '5', 10, null, '00000000', '1', null, '1', '1', '1', '1', '2', 10, 5, '1', '1', '1', '2', '1', '1', 0, '1', '1', '1', 10, 500, '1', '1', '1', '1', '1', '1', '2', null, '2', null, null, null, '2', '2', '2', '1', '1', '2', null, null, null, null, null, null, '1', '1', 30, '1', '1', '1', 30, 500, '1', '1', '1', '1', '1', '2', '2', null, '2', null, null, null, '2', '2', '2', '2', '2', '2', null, null, null, '2', null, null, 13300, 15600, 50000, 33660, 50000, 7800, 4680, 7800, 24550, 17440, 206690, 7580, 3030, 10610, 8000, 1000, 5700, 4500, 7800, 58300, 24550, 17440, 206690, 7580, 3030, 10610, 8000, 1000, 5700, 4500, 7800, 58300, '1', null, null, null, null, null, null, '1', '1', '1', '1', null, '1', '1', '1', '1', '1', null, '1', '1', null, '3', '1', '20190219', '165023', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, '1303037', '保険代理店', '1', '2', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, '01', null, null, null, null, null, null, null, 0, null, null, 0, null, 0, null, null, null, null, null, null, null, null, null, null, '1', null, null, null, null, null, '1303', null, null, null, null, null, null, '123       ', '楽天太郎', null, null, null, null, null, null, null, '9', 2, null, null, null, 40000, 50000, 60000, 222, '2', '1', '3333', '444', '1', '2345678', null, null, null, 'ラクテンタロウ', '2', '1', null, to_date('18-02-2019 18:20:16', 'dd-mm-yyyy hh24:mi:ss'), '20190519', '703106', null, '1', null, null, null, null, '0', '18-12-12 12:12:12.012', '18-12-12 12:12:12.012', null, null, null, null, null, null, null, '箇所名');

truncate table ENTRY_HA;