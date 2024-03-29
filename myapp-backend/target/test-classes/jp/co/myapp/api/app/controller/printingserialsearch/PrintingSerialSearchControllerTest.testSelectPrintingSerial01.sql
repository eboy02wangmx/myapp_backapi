truncate table ENTRY_HA_TEMP;
insert 
into ENTRY_HA_TEMP( 
  ENTRY_NO
  , SERIAL
  , POLICY
  , MAIL
  , OPEN_ID
  , "STATE"
  , GAMEN_ID
  , ENTRY_TYPE
  , PAYMENT_TYPE
  , NAME_KEIYAKU
  , NAME_KEIYAKU_K
  , YUBIN_KEIYAKU
  , JUSHO_CODE_KEIYAKU
  , JUSHO_KEIYAKU
  , JUSHO_KEIYAKU_FREE
  , JUSHO_KEIYAKU_K
  , JUSHO_KEIYAKU_K_FREE
  , TEL_KEIYAKU_AREA
  , TEL_KEIYAKU_CITY
  , TEL_KEIYAKU_NUMBER
  , TEL_KEIYAKU2_AREA
  , TEL_KEIYAKU2_CITY
  , TEL_KEIYAKU2_NUMBER
  , MAIL_KEIYAKU
  , MAIL_KEIYAKU_CONFIRM
  , SEIBETSU_KEIYAKU
  , BIRTHDAY_KEIYAKU
  , KEIYAKU_HIHO_ONAJI
  , NAME_HIHO
  , NAME_HIHO_K
  , KOJIN_BAISHO_ONAJI
  , NAME_BAISHO_KOJIN
  , NAME_BAISHO_KOJIN_K
  , SYAKUYA_BAISHO_ONAJI
  , NAME_BAISHO_SYAKUYA
  , NAME_BAISHO_SYAKUYA_K
  , NAME_BAISHO_KANRI
  , NAME_BAISHO_KANRI_K
  , SHIKI_DATE
  , SHIKI_JIKAN
  , KASAI_SHUKI_DATE
  , KASAI_SHUKI_JIKAN
  , JISHIN_SHUKI_DATE
  , JISHIN_SHUKI_JIKAN
  , TATE_SHOYU
  , TATE_KEITAI
  , KAISU_CHIJO
  , KAISU_CHIKA
  , KAISU_KYOJU
  , TATE_KOZO
  , KOZO_TEKKOTSU
  , KOZO_OTHER
  , CONST_CHK
  , GRADE
  , SHOZAI
  , KENCHIKU_YM_SEIREKI
  , AREA
  , DOC_CHK
  , TATE_KANYU
  , HYOKAGAKU_FUMEI
  , KYOTEI_GAKU
  , MON_GAKU
  , SHINCHIKU_GAKU
  , HYOKA_KIJUN
  , KAZAI_KANYU
  , SETAI_NENREI
  , KODOMO_NINZU
  , HAIGUSHA
  , DOKYO_NINZU
  , TATE_HYOKA_GAKU_LOW
  , TATE_HYOKA_GAKU_UP
  , KAZAI_HYOKA_GAKU_LOW
  , KAZAI_HYOKA_GAKU_UP
  , TATE_JISHIN_KANYU
  , KAZAI_JISHIN_KANYU
  , KAKUNIN_SHORUI
  , JISHIN_WARIBIKIRITSU
  , TAISHIN
  , TAISHIN_DATE
  , BUILT_DATE_CHK
  , WARIBIKI_CHK
  , INC_KISO
  , INC_TATAMI
  , INC_MONHEI
  , INC_SHAKO
  , INC_KYOYO
  , KASAI_HKIKAN
  , KASAI_TANKI_FLG
  , JISHIN_HKIKAN
  , JISHIN_TANKI_FLG
  , JISHIN_JIDOKEIZOKU
  , KASAI_HOHO
  , JISHIN_HOHO
  , SENTAKU_PLAN
  , O_FIRE_HOSHO
  , O_FUSAI_HOSHO
  , O_FUSAI_GAKU
  , O_SUISAI_HOSHO
  , O_TONAN_HOSHO
  , O_HASON_HOSHO
  , O_HASON_FUTAN
  , O_HASON_LIMIT
  , O_JISHIN_HOSHO_TATE
  , O_JISHIN_HOSHO_KAZAI
  , O_SAIGAI_HOSHO
  , O_SAIGAI_LIMIT
  , O_HIYO_HOSHO
  , O_TOKU_KOJINBAISHO
  , O_TOKU_SHAKUYABAISHO
  , O_TOKU_SHAKUYABAISHO_LIMIT
  , O_TOKU_TATEBAISHO
  , O_TOKU_TATEBAISHO_LIMIT
  , O_TOKU_MIZUNUREHOSHO
  , O_TOKU_RUISHO
  , O_TOKU_TATEKAE
  , O_TOKU_KYOYO
  , O_TOKU_BOHAN
  , O_TOKU_MOCHIDASHI
  , O_TOKU_HIKKOSHI
  , O_TOKU_FUSAI_SHIHARAI
  , O_TOKU_SUISAI_SHIHARAI
  , O_TOKU_HOJIN_KEIYAKU
  , F_FIRE_HOSHO
  , F_FUSAI_HOSHO
  , F_FUSAI_GAKU
  , F_SUISAI_HOSHO
  , F_TONAN_HOSHO
  , F_HASON_HOSHO
  , F_HASON_FUTAN
  , F_HASON_LIMIT
  , F_JISHIN_HOSHO_TATE
  , F_JISHIN_HOSHO_KAZAI
  , F_SAIGAI_HOSHO
  , F_SAIGAI_LIMIT
  , F_HIYO_HOSHO
  , F_TOKU_KOJINBAISHO
  , F_TOKU_SHAKUYABAISHO
  , F_TOKU_SHAKUYABAISHF_LIMIT
  , F_TOKU_TATEBAISHO
  , F_TOKU_TATEBAISHF_LIMIT
  , F_TOKU_MIZUNUREHOSHO
  , F_TOKU_RUISHO
  , F_TOKU_TATEKAE
  , F_TOKU_KYOYO
  , F_TOKU_BOHAN
  , F_TOKU_MOCHIDASHI
  , F_TOKU_HIKKOSHI
  , F_TOKU_FUSAI_SHIHARAI
  , F_TOKU_SUISAI_SHIHARAI
  , F_TOKU_HOJIN_KEIYAKU
  , GAKU_KASAI_TATE
  , GAKU_KASAI_KAZAI
  , GAKU_JISHIN_TATE
  , GAKU_JISHIN_TATE_LOW
  , GAKU_JISHIN_TATE_UP
  , GAKU_JISHIN_KAZAI
  , GAKU_JISHIN_KAZAI_LOW
  , GAKU_JISHIN_KAZAI_UP
  , O_HRYO_KASAI_TATE
  , O_HRYO_KASAI_KAZAI
  , O_HRYO_KASAI
  , O_HRYO_JISHIN_TATE
  , O_HRYO_JISHIN_KAZAI
  , O_HRYO_JISHIN
  , O_HRYO_KOJINBAI
  , O_HRYO_SHAKUYABAI
  , O_HRYO_RUISHO
  , O_HRYO_NENGAKU
  , O_HRYO_SHOKAI
  , O_HRYO
  , O_HRYO_JISHIN_NENGAKU
  , O_HRYO_JISHIN_SHOKAI
  , O_HRYO_JISHIN_GOUKEI
  , F_HRYO_KASAI_TATE
  , F_HRYO_KASAI_KAZAI
  , F_HRYO_KASAI
  , F_HRYO_JISHIN_TATE
  , F_HRYO_JISHIN_KAZAI
  , F_HRYO_JISHIN
  , F_HRYO_KOJINBAI
  , F_HRYO_SHAKUYABAI
  , F_HRYO_RUISHO
  , F_HRYO_NENGAKU
  , F_HRYO_SHOKAI
  , F_HRYO
  , F_HRYO_JISHIN_NENGAKU
  , F_HRYO_JISHIN_SHOKAI
  , F_HRYO_JISHIN_GOUKEI
  , JUSHO_ONAJI
  , YUBIN_HOKEN
  , JUSHO_CODE_HOKEN
  , JUSHO_HOKEN
  , JUSHO_HOKEN_FREE
  , JUSHO_HOKEN_K
  , JUSHO_HOKEN_K_FREE
  , KEIYAKUSHA_CHK
  , HOKENNOTAISHO_CHK
  , HOKANOHOKEN_CHK
  , HOKENKIKAN_CHK
  , JISHINHOKEN_CHK
  , HOSHONAIYO_CHK
  , JUYOJIKO_CHK
  , KOJIN_DOI
  , JISHIN_KAKUNIN
  , DOC_SUBMIT
  , CHECK_DATE
  , CHECK_JIKAN
  , TEISEI
  , SHINSA_KEIYAKUSHA_CHK
  , SHINSA_HOKENNOTAISHO_CHK
  , SHINSA_HOKANOHOKEN_CHK
  , SHINSA_HOKENKIKAN_CHK
  , SHINSA_JISHINHOKEN_CHK
  , SHINSA_HOSHONAIYO_CHK
  , SHINSA_JUYOJIKO_CHK
  , SHINSA_KOJIN_DOI
  , SHINSA_JISHIN_KAKUNIN
  , SHINSA_NAME
  , SHINSA_MEMO
  , "OLD"
  , DAIRI_CD
  , DAIRI_NAME
  , KATEN_CD
  , TANTO_CD
  , KEIYAKU_OTHER
  , HOKEN_SHU_KANA1
  , HOKEN_CO_KANA1
  , myapp_SONPO1
  , HOKEN_TAISHO1
  , GAKU_KIHON_HOKEN1
  , GAKU_JISHIN_HOKEN1
  , MANKI_DATE1
  , HOKEN_SHU_KANA2
  , HOKEN_CO_KANA2
  , myapp_SONPO2
  , HOKEN_TAISHO2
  , GAKU_KIHON_HOKEN2
  , GAKU_JISHIN_HOKEN2
  , MANKI_DATE2
  , ALL_KOSU
  , YOHO
  , SHOKUSAGYO_BUNRUI
  , SHOKUSAGYO
  , GEKIHEN_KANWA
  , HYOKA_KBN
  , OTHER_KONKYO
  , MB_MEISAI_UMU
  , MB_GAKU
  , MB_HYOKA_GAKU
  , SETUJ_KANYU
  , SETUJ_GAKU
  , SETUJ_HYOKA_GAKU
  , SEIHN_KANYU
  , SEIHN_GAKU
  , SEIHN_HYOKA_GAKU
  , BOSHUNIN_ID
  , BOSHUNIN_NAME
  , BOSHUNIN_KANA
  , HOSEI_KASHO_CD
  , HOSEI_WARIAI
  , BNT_KBN
  , WARI_KBN
  , HKNJ1_KATEN_CD
  , HKNJ1_DAIRI_CD
  , HKNJ1_JIKO
  , HKNJ1_BNT_WARI
  , HKNJ2_KATEN_CD
  , HKNJ2_DAIRI_CD
  , HKNJ2_JIKO
  , HKNJ2_BNT_WARI
  , KNJ_KATEN_CD
  , KNJ_DAIRI_CD
  , KNJ_JIKO
  , KNJ_BNT_WARI
  , KEIYAKU_KBN
  , BEF_HOJIN_CD
  , AFT_HOJIN_CD
  , NAME_DAIHYO
  , NAME_DAIHYO_K
  , UKE_KBN
  , SHICHIKEN_UMU
  , TEITO_UMU
  , BETSUDO
  , BNT_UMU
  , TOKKI_K
  , YUSHI_UMU
  , KOZA_HENKO
  , HAGAKI
  , POLICY_OLD
  , JT_KBN
  , FUKUSU_HOSEI
  , SEIGEN_CD
  , KETTEI_NO
  , HRYO_SETUJ
  , HRYO_SEIHN
  , HRYO_MB
  , BANK_KBN
  , FINANCIALINSTITUTION_CODE
  , BRANCH_NUMBER
  , SUBJECT
  , ACCOUNT_NUMBER
  , ACCOUNT_NAME_KANA
  , TRANSFER_NOTICE
  , SYMBOL_YUTYO
  , NUMBER_YUTYO
  , ACCOUNT_NAME_KANA_YUTYO
  , TRANSFER_NOTICE_YUTYO
  , SAVE_DATE
  , KIGEN
  , OLD_ENTRY_NO
  , DEL_FLG
  , ADD_DATE
  , UPD_DATE
) 
values ( 
  'A00001'
  , 11
  , 'C0000000001'
  , 'D0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001'
  , 'E000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001'
  , 'F'
  , 'G0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001'
  , 'H'
  , 'I'
  , 'J00000000000000000000000000001'
  , 'K00000000000000000000000000000000000000000000000000000000001'
  , 'L000001'
  , 1000000001
  , 'N0000000000000000000000000000000000000000000000000000000000000000001'
  , 'O0000000000000000000000000000000000000000000000001'
  , 'P000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001'
  , 'Q000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001'
  , 'R00001'
  , 'S001'
  , 'T001'
  , 'U00001'
  , 'V001'
  , 'W001'
  , 'X0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001'
  , 'Y0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001'
  , 'Z'
  , 'A0000001'
  , 'B'
  , 'C00000000000000000000000000001'
  , 'D00000000000000000000000000000000000000000000000000000000001'
  , 'E'
  , 'F00000000000000000000000000001'
  , 'G00000000000000000000000000000000000000000000000000000000001'
  , 'H'
  , 'I00000000000000000000000000001'
  , 'J00000000000000000000000000001'
  , 'K00000000000000000000000000001'
  , 'L00000000000000000000000000001'
  , '20180101'
  , 'N00001'
  , '20180101'
  , 'P00001'
  , '20180101'
  , 'R00001'
  , 'S'
  , 'T'
  , 101
  , 101
  , 101
  , 'X'
  , 'Y'
  , 'Z'
  , 'A'
  , 'B'
  , 'C000000001'
  , 'D00001'
  , 1000001.001
  , 'F'
  , 'G'
  , 'H'
  , 100000001
  , 10001
  , 1000000001
  , 'L'
  , 'M'
  , 101
  , 11
  , 'P'
  , 11
  , 100000001
  , 100000001
  , 100000001
  , 100000001
  , 'V'
  , 'W'
  , 'X'
  , 11
  , 'Z'
  , '20180101'
  , 'B'
  , 'C'
  , 'D'
  , 'E'
  , 'F'
  , 'G'
  , 'H'
  , 1001
  , 1
  , 1001
  , 1
  , 'M'
  , 'N'
  , 'O'
  , 'P'
  , 'Q'
  , 'R'
  , 1000001
  , 'T'
  , 'U'
  , 'V'
  , 1000001
  , 100000001
  , 'Y'
  , 'Z'
  , 'A'
  , 'B'
  , 'C'
  , 'D'
  , 'E'
  , 100000001
  , 'G'
  , 100000001
  , 'I'
  , 'J'
  , 'K'
  , 'L'
  , 'M'
  , 'N'
  , 'O'
  , 'P'
  , 'Q'
  , 'R'
  , 'S'
  , 'T'
  , 1000001
  , 'V'
  , 'W'
  , 'X'
  , 1000001
  , 100000001
  , 'A'
  , 'B'
  , 'C'
  , 'D'
  , 'E'
  , 'F'
  , 'G'
  , 100000001
  , 'I'
  , 100000001
  , 'K'
  , 'L'
  , 'M'
  , 'N'
  , 'O'
  , 'P'
  , 'Q'
  , 'R'
  , 'S'
  , 'T'
  , 100000001
  , 100000001
  , 100000001
  , 100000001
  , 100000001
  , 100000001
  , 100000001
  , 100000001
  , 100000001
  , 100000001
  , 100000001
  , 100000001
  , 100000001
  , 100000001
  , 100000001
  , 100000001
  , 100000001
  , 100000001
  , 100000001
  , 100000001
  , 100000001
  , 100000001
  , 100000001
  , 100000001
  , 100000001
  , 100000001
  , 100000001
  , 100000001
  , 100000001
  , 100000001
  , 100000001
  , 100000001
  , 100000001
  , 100000001
  , 100000001
  , 100000001
  , 100000001
  , 100000001
  , 'G'
  , 'H000001'
  , 1000000001
  , 'J0000000000000000000000000000000000000000000000000000000000000000001'
  , 'K0000000000000000000000000000000000000000000000001'
  , 'L000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001'
  , 'M000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001'
  , 'N'
  , 'O'
  , 'P'
  , 'Q'
  , 'R'
  , 'S'
  , 'T'
  , 'U'
  , 'V'
  , 'W'
  , '20180101'
  , 'Y00001'
  , 'Z000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001'
  , 'A'
  , 'B'
  , 'C'
  , 'D'
  , 'E'
  , 'F'
  , 'G'
  , 'H'
  , 'I'
  , 'J00000000000000000000000000001'
  , 'K000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001'
  , 'L'
  , 'M000000001'
  , 'N0000000000000000001'
  , 'O001'
  , 'P000001'
  , 'Q'
  , 'R0000000000000000001'
  , 'S0000000000000000001'
  , 'T'
  , 'U'
  , 100000001
  , 100000001
  , 'X0000001'
  , 'Y0000000000000000001'
  , 'Z0000000000000000001'
  , 'A'
  , 'B'
  , 100000001
  , 100000001
  , 'E0000001'
  , 'F001'
  , 'G1'
  , 'H01'
  , 'I01'
  , 'J'
  , 'K'
  , 'L00000000000000000000000000000000000000000000000000000000001'
  , 'M'
  , 100000001
  , 100000001
  , 'P'
  , 100000001
  , 100000001
  , 'S'
  , 100000001
  , 100000001
  , 'V000000001'
  , 'W0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001'
  , 'X0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001'
  , 1001
  , 101
  , 1
  , 1
  , 1001
  , 1000000001
  , 1
  , 100001
  , 1001
  , 1000000001
  , 1
  , 100001
  , 1001
  , 1000000001
  , 1
  , 100001
  , 'O'
  , 'P1'
  , 'Q1'
  , 'R00000000000000000000000000001'
  , 'S00000000000000000000000000000000000000000000000000000000001'
  , 'T'
  , 'U'
  , 'V'
  , 'W'
  , 'X'
  , 'Y000000000000001'
  , 'Z'
  , 'A'
  , 'B'
  , 'C000000000000001'
  , 'D'
  , 1
  , 101
  , 100000001
  , 100000001
  , 100000001
  , 100000001
  , 1
  , 1001
  , 101
  , 1
  , 1000001
  , 'P00000000000000000000000000000000000000000000000000000000001'
  , 1
  , 10001
  , 10000001
  , 100000000000000000000000000000000000000000000000000000000000
  , 1
  , to_date('2018/1/1', 'yyyy/MM/dd')
  , 'W0000001'
  , 'X00001'
  , 'Y'
  , to_date('2018/1/1', 'yyyy/MM/dd')
  , to_date('2018/1/1', 'yyyy/MM/dd')
); 
insert 
into ENTRY_HA_TEMP( 
  ENTRY_NO
  , SERIAL
  , POLICY
  , MAIL
  , OPEN_ID
  , "STATE"
  , GAMEN_ID
  , ENTRY_TYPE
  , PAYMENT_TYPE
  , NAME_KEIYAKU
  , NAME_KEIYAKU_K
  , YUBIN_KEIYAKU
  , JUSHO_CODE_KEIYAKU
  , JUSHO_KEIYAKU
  , JUSHO_KEIYAKU_FREE
  , JUSHO_KEIYAKU_K
  , JUSHO_KEIYAKU_K_FREE
  , TEL_KEIYAKU_AREA
  , TEL_KEIYAKU_CITY
  , TEL_KEIYAKU_NUMBER
  , TEL_KEIYAKU2_AREA
  , TEL_KEIYAKU2_CITY
  , TEL_KEIYAKU2_NUMBER
  , MAIL_KEIYAKU
  , MAIL_KEIYAKU_CONFIRM
  , SEIBETSU_KEIYAKU
  , BIRTHDAY_KEIYAKU
  , KEIYAKU_HIHO_ONAJI
  , NAME_HIHO
  , NAME_HIHO_K
  , KOJIN_BAISHO_ONAJI
  , NAME_BAISHO_KOJIN
  , NAME_BAISHO_KOJIN_K
  , SYAKUYA_BAISHO_ONAJI
  , NAME_BAISHO_SYAKUYA
  , NAME_BAISHO_SYAKUYA_K
  , NAME_BAISHO_KANRI
  , NAME_BAISHO_KANRI_K
  , SHIKI_DATE
  , SHIKI_JIKAN
  , KASAI_SHUKI_DATE
  , KASAI_SHUKI_JIKAN
  , JISHIN_SHUKI_DATE
  , JISHIN_SHUKI_JIKAN
  , TATE_SHOYU
  , TATE_KEITAI
  , KAISU_CHIJO
  , KAISU_CHIKA
  , KAISU_KYOJU
  , TATE_KOZO
  , KOZO_TEKKOTSU
  , KOZO_OTHER
  , CONST_CHK
  , GRADE
  , SHOZAI
  , KENCHIKU_YM_SEIREKI
  , AREA
  , DOC_CHK
  , TATE_KANYU
  , HYOKAGAKU_FUMEI
  , KYOTEI_GAKU
  , MON_GAKU
  , SHINCHIKU_GAKU
  , HYOKA_KIJUN
  , KAZAI_KANYU
  , SETAI_NENREI
  , KODOMO_NINZU
  , HAIGUSHA
  , DOKYO_NINZU
  , TATE_HYOKA_GAKU_LOW
  , TATE_HYOKA_GAKU_UP
  , KAZAI_HYOKA_GAKU_LOW
  , KAZAI_HYOKA_GAKU_UP
  , TATE_JISHIN_KANYU
  , KAZAI_JISHIN_KANYU
  , KAKUNIN_SHORUI
  , JISHIN_WARIBIKIRITSU
  , TAISHIN
  , TAISHIN_DATE
  , BUILT_DATE_CHK
  , WARIBIKI_CHK
  , INC_KISO
  , INC_TATAMI
  , INC_MONHEI
  , INC_SHAKO
  , INC_KYOYO
  , KASAI_HKIKAN
  , KASAI_TANKI_FLG
  , JISHIN_HKIKAN
  , JISHIN_TANKI_FLG
  , JISHIN_JIDOKEIZOKU
  , KASAI_HOHO
  , JISHIN_HOHO
  , SENTAKU_PLAN
  , O_FIRE_HOSHO
  , O_FUSAI_HOSHO
  , O_FUSAI_GAKU
  , O_SUISAI_HOSHO
  , O_TONAN_HOSHO
  , O_HASON_HOSHO
  , O_HASON_FUTAN
  , O_HASON_LIMIT
  , O_JISHIN_HOSHO_TATE
  , O_JISHIN_HOSHO_KAZAI
  , O_SAIGAI_HOSHO
  , O_SAIGAI_LIMIT
  , O_HIYO_HOSHO
  , O_TOKU_KOJINBAISHO
  , O_TOKU_SHAKUYABAISHO
  , O_TOKU_SHAKUYABAISHO_LIMIT
  , O_TOKU_TATEBAISHO
  , O_TOKU_TATEBAISHO_LIMIT
  , O_TOKU_MIZUNUREHOSHO
  , O_TOKU_RUISHO
  , O_TOKU_TATEKAE
  , O_TOKU_KYOYO
  , O_TOKU_BOHAN
  , O_TOKU_MOCHIDASHI
  , O_TOKU_HIKKOSHI
  , O_TOKU_FUSAI_SHIHARAI
  , O_TOKU_SUISAI_SHIHARAI
  , O_TOKU_HOJIN_KEIYAKU
  , F_FIRE_HOSHO
  , F_FUSAI_HOSHO
  , F_FUSAI_GAKU
  , F_SUISAI_HOSHO
  , F_TONAN_HOSHO
  , F_HASON_HOSHO
  , F_HASON_FUTAN
  , F_HASON_LIMIT
  , F_JISHIN_HOSHO_TATE
  , F_JISHIN_HOSHO_KAZAI
  , F_SAIGAI_HOSHO
  , F_SAIGAI_LIMIT
  , F_HIYO_HOSHO
  , F_TOKU_KOJINBAISHO
  , F_TOKU_SHAKUYABAISHO
  , F_TOKU_SHAKUYABAISHF_LIMIT
  , F_TOKU_TATEBAISHO
  , F_TOKU_TATEBAISHF_LIMIT
  , F_TOKU_MIZUNUREHOSHO
  , F_TOKU_RUISHO
  , F_TOKU_TATEKAE
  , F_TOKU_KYOYO
  , F_TOKU_BOHAN
  , F_TOKU_MOCHIDASHI
  , F_TOKU_HIKKOSHI
  , F_TOKU_FUSAI_SHIHARAI
  , F_TOKU_SUISAI_SHIHARAI
  , F_TOKU_HOJIN_KEIYAKU
  , GAKU_KASAI_TATE
  , GAKU_KASAI_KAZAI
  , GAKU_JISHIN_TATE
  , GAKU_JISHIN_TATE_LOW
  , GAKU_JISHIN_TATE_UP
  , GAKU_JISHIN_KAZAI
  , GAKU_JISHIN_KAZAI_LOW
  , GAKU_JISHIN_KAZAI_UP
  , O_HRYO_KASAI_TATE
  , O_HRYO_KASAI_KAZAI
  , O_HRYO_KASAI
  , O_HRYO_JISHIN_TATE
  , O_HRYO_JISHIN_KAZAI
  , O_HRYO_JISHIN
  , O_HRYO_KOJINBAI
  , O_HRYO_SHAKUYABAI
  , O_HRYO_RUISHO
  , O_HRYO_NENGAKU
  , O_HRYO_SHOKAI
  , O_HRYO
  , O_HRYO_JISHIN_NENGAKU
  , O_HRYO_JISHIN_SHOKAI
  , O_HRYO_JISHIN_GOUKEI
  , F_HRYO_KASAI_TATE
  , F_HRYO_KASAI_KAZAI
  , F_HRYO_KASAI
  , F_HRYO_JISHIN_TATE
  , F_HRYO_JISHIN_KAZAI
  , F_HRYO_JISHIN
  , F_HRYO_KOJINBAI
  , F_HRYO_SHAKUYABAI
  , F_HRYO_RUISHO
  , F_HRYO_NENGAKU
  , F_HRYO_SHOKAI
  , F_HRYO
  , F_HRYO_JISHIN_NENGAKU
  , F_HRYO_JISHIN_SHOKAI
  , F_HRYO_JISHIN_GOUKEI
  , JUSHO_ONAJI
  , YUBIN_HOKEN
  , JUSHO_CODE_HOKEN
  , JUSHO_HOKEN
  , JUSHO_HOKEN_FREE
  , JUSHO_HOKEN_K
  , JUSHO_HOKEN_K_FREE
  , KEIYAKUSHA_CHK
  , HOKENNOTAISHO_CHK
  , HOKANOHOKEN_CHK
  , HOKENKIKAN_CHK
  , JISHINHOKEN_CHK
  , HOSHONAIYO_CHK
  , JUYOJIKO_CHK
  , KOJIN_DOI
  , JISHIN_KAKUNIN
  , DOC_SUBMIT
  , CHECK_DATE
  , CHECK_JIKAN
  , TEISEI
  , SHINSA_KEIYAKUSHA_CHK
  , SHINSA_HOKENNOTAISHO_CHK
  , SHINSA_HOKANOHOKEN_CHK
  , SHINSA_HOKENKIKAN_CHK
  , SHINSA_JISHINHOKEN_CHK
  , SHINSA_HOSHONAIYO_CHK
  , SHINSA_JUYOJIKO_CHK
  , SHINSA_KOJIN_DOI
  , SHINSA_JISHIN_KAKUNIN
  , SHINSA_NAME
  , SHINSA_MEMO
  , "OLD"
  , DAIRI_CD
  , DAIRI_NAME
  , KATEN_CD
  , TANTO_CD
  , KEIYAKU_OTHER
  , HOKEN_SHU_KANA1
  , HOKEN_CO_KANA1
  , myapp_SONPO1
  , HOKEN_TAISHO1
  , GAKU_KIHON_HOKEN1
  , GAKU_JISHIN_HOKEN1
  , MANKI_DATE1
  , HOKEN_SHU_KANA2
  , HOKEN_CO_KANA2
  , myapp_SONPO2
  , HOKEN_TAISHO2
  , GAKU_KIHON_HOKEN2
  , GAKU_JISHIN_HOKEN2
  , MANKI_DATE2
  , ALL_KOSU
  , YOHO
  , SHOKUSAGYO_BUNRUI
  , SHOKUSAGYO
  , GEKIHEN_KANWA
  , HYOKA_KBN
  , OTHER_KONKYO
  , MB_MEISAI_UMU
  , MB_GAKU
  , MB_HYOKA_GAKU
  , SETUJ_KANYU
  , SETUJ_GAKU
  , SETUJ_HYOKA_GAKU
  , SEIHN_KANYU
  , SEIHN_GAKU
  , SEIHN_HYOKA_GAKU
  , BOSHUNIN_ID
  , BOSHUNIN_NAME
  , BOSHUNIN_KANA
  , HOSEI_KASHO_CD
  , HOSEI_WARIAI
  , BNT_KBN
  , WARI_KBN
  , HKNJ1_KATEN_CD
  , HKNJ1_DAIRI_CD
  , HKNJ1_JIKO
  , HKNJ1_BNT_WARI
  , HKNJ2_KATEN_CD
  , HKNJ2_DAIRI_CD
  , HKNJ2_JIKO
  , HKNJ2_BNT_WARI
  , KNJ_KATEN_CD
  , KNJ_DAIRI_CD
  , KNJ_JIKO
  , KNJ_BNT_WARI
  , KEIYAKU_KBN
  , BEF_HOJIN_CD
  , AFT_HOJIN_CD
  , NAME_DAIHYO
  , NAME_DAIHYO_K
  , UKE_KBN
  , SHICHIKEN_UMU
  , TEITO_UMU
  , BETSUDO
  , BNT_UMU
  , TOKKI_K
  , YUSHI_UMU
  , KOZA_HENKO
  , HAGAKI
  , POLICY_OLD
  , JT_KBN
  , FUKUSU_HOSEI
  , SEIGEN_CD
  , KETTEI_NO
  , HRYO_SETUJ
  , HRYO_SEIHN
  , HRYO_MB
  , BANK_KBN
  , FINANCIALINSTITUTION_CODE
  , BRANCH_NUMBER
  , SUBJECT
  , ACCOUNT_NUMBER
  , ACCOUNT_NAME_KANA
  , TRANSFER_NOTICE
  , SYMBOL_YUTYO
  , NUMBER_YUTYO
  , ACCOUNT_NAME_KANA_YUTYO
  , TRANSFER_NOTICE_YUTYO
  , SAVE_DATE
  , KIGEN
  , OLD_ENTRY_NO
  , DEL_FLG
  , ADD_DATE
  , UPD_DATE
) 
values ( 
  'A00002'
  , 11
  , 'C0000000001'
  , 'D0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001'
  , 'E000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001'
  , 'F'
  , 'G0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001'
  , 'H'
  , 'I'
  , 'J00000000000000000000000000001'
  , 'K00000000000000000000000000000000000000000000000000000000001'
  , 'L000001'
  , 1000000001
  , 'N0000000000000000000000000000000000000000000000000000000000000000001'
  , 'O0000000000000000000000000000000000000000000000001'
  , 'P000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001'
  , 'Q000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001'
  , 'R00001'
  , 'S001'
  , 'T001'
  , 'U00001'
  , 'V001'
  , 'W001'
  , 'X0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001'
  , 'Y0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001'
  , 'Z'
  , 'A0000001'
  , 'B'
  , 'C00000000000000000000000000001'
  , 'D00000000000000000000000000000000000000000000000000000000001'
  , 'E'
  , 'F00000000000000000000000000001'
  , 'G00000000000000000000000000000000000000000000000000000000001'
  , 'H'
  , 'I00000000000000000000000000001'
  , 'J00000000000000000000000000001'
  , 'K00000000000000000000000000001'
  , 'L00000000000000000000000000001'
  , '20180101'
  , 'N00001'
  , '20180101'
  , 'P00001'
  , '20180101'
  , 'R00001'
  , 'S'
  , 'T'
  , 101
  , 101
  , 101
  , 'X'
  , 'Y'
  , 'Z'
  , 'A'
  , 'B'
  , 'C000000001'
  , 'D00001'
  , 1000001.001
  , 'F'
  , 'G'
  , 'H'
  , 100000001
  , 10001
  , 1000000001
  , 'L'
  , 'M'
  , 101
  , 11
  , 'P'
  , 11
  , 100000001
  , 100000001
  , 100000001
  , 100000001
  , 'V'
  , 'W'
  , 'X'
  , 11
  , 'Z'
  , '20180101'
  , 'B'
  , 'C'
  , 'D'
  , 'E'
  , 'F'
  , 'G'
  , 'H'
  , 1001
  , 1
  , 1001
  , 1
  , 'M'
  , 'N'
  , 'O'
  , 'P'
  , 'Q'
  , 'R'
  , 1000001
  , 'T'
  , 'U'
  , 'V'
  , 1000001
  , 100000001
  , 'Y'
  , 'Z'
  , 'A'
  , 'B'
  , 'C'
  , 'D'
  , 'E'
  , 100000001
  , 'G'
  , 100000001
  , 'I'
  , 'J'
  , 'K'
  , 'L'
  , 'M'
  , 'N'
  , 'O'
  , 'P'
  , 'Q'
  , 'R'
  , 'S'
  , 'T'
  , 1000001
  , 'V'
  , 'W'
  , 'X'
  , 1000001
  , 100000001
  , 'A'
  , 'B'
  , 'C'
  , 'D'
  , 'E'
  , 'F'
  , 'G'
  , 100000001
  , 'I'
  , 100000001
  , 'K'
  , 'L'
  , 'M'
  , 'N'
  , 'O'
  , 'P'
  , 'Q'
  , 'R'
  , 'S'
  , 'T'
  , 100000001
  , 100000001
  , 100000001
  , 100000001
  , 100000001
  , 100000001
  , 100000001
  , 100000001
  , 100000001
  , 100000001
  , 100000001
  , 100000001
  , 100000001
  , 100000001
  , 100000001
  , 100000001
  , 100000001
  , 100000001
  , 100000001
  , 100000001
  , 100000001
  , 100000001
  , 100000001
  , 100000001
  , 100000001
  , 100000001
  , 100000001
  , 100000001
  , 100000001
  , 100000001
  , 100000001
  , 100000001
  , 100000001
  , 100000001
  , 100000001
  , 100000001
  , 100000001
  , 100000001
  , 'G'
  , 'H000001'
  , 1000000001
  , 'J0000000000000000000000000000000000000000000000000000000000000000001'
  , 'K0000000000000000000000000000000000000000000000001'
  , 'L000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001'
  , 'M000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001'
  , 'N'
  , 'O'
  , 'P'
  , 'Q'
  , 'R'
  , 'S'
  , 'T'
  , 'U'
  , 'V'
  , 'W'
  , '20180101'
  , 'Y00001'
  , 'Z000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001'
  , 'A'
  , 'B'
  , 'C'
  , 'D'
  , 'E'
  , 'F'
  , 'G'
  , 'H'
  , 'I'
  , 'J00000000000000000000000000001'
  , 'K000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001'
  , 'L'
  , 'M000000001'
  , 'N0000000000000000001'
  , 'O001'
  , 'P000001'
  , 'Q'
  , 'R0000000000000000001'
  , 'S0000000000000000001'
  , 'T'
  , 'U'
  , 100000001
  , 100000001
  , 'X0000001'
  , 'Y0000000000000000001'
  , 'Z0000000000000000001'
  , 'A'
  , 'B'
  , 100000001
  , 100000001
  , 'E0000001'
  , 'F001'
  , 'G1'
  , 'H01'
  , 'I01'
  , 'J'
  , 'K'
  , 'L00000000000000000000000000000000000000000000000000000000001'
  , 'M'
  , 100000001
  , 100000001
  , 'P'
  , 100000001
  , 100000001
  , 'S'
  , 100000001
  , 100000001
  , 'V000000001'
  , 'W0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001'
  , 'X0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001'
  , 1001
  , 101
  , 1
  , 1
  , 1001
  , 1000000001
  , 1
  , 100001
  , 1001
  , 1000000001
  , 1
  , 100001
  , 1001
  , 1000000001
  , 1
  , 100001
  , 'O'
  , 'P1'
  , 'Q1'
  , 'R00000000000000000000000000001'
  , 'S00000000000000000000000000000000000000000000000000000000001'
  , 'T'
  , 'U'
  , 'V'
  , 'W'
  , 'X'
  , 'Y000000000000001'
  , 'Z'
  , 'A'
  , 'B'
  , 'C000000000000001'
  , 'D'
  , 1
  , 101
  , 100000001
  , 100000001
  , 100000001
  , 100000001
  , 1
  , 1001
  , 101
  , 1
  , 1000001
  , 'P00000000000000000000000000000000000000000000000000000000001'
  , 1
  , 10001
  , 10000001
  , 100000000000000000000000000000000000000000000000000000000000
  , 1
  , to_date('2018/1/1', 'yyyy/MM/dd')
  , 'W0000001'
  , 'X00001'
  , 'Y'
  , to_date('2018/1/1', 'yyyy/MM/dd')
  , to_date('2018/1/1', 'yyyy/MM/dd')
); 
insert 
into ENTRY_HA_TEMP( 
  ENTRY_NO
  , SERIAL
  , POLICY
  , MAIL
  , OPEN_ID
  , "STATE"
  , GAMEN_ID
  , ENTRY_TYPE
  , PAYMENT_TYPE
  , NAME_KEIYAKU
  , NAME_KEIYAKU_K
  , YUBIN_KEIYAKU
  , JUSHO_CODE_KEIYAKU
  , JUSHO_KEIYAKU
  , JUSHO_KEIYAKU_FREE
  , JUSHO_KEIYAKU_K
  , JUSHO_KEIYAKU_K_FREE
  , TEL_KEIYAKU_AREA
  , TEL_KEIYAKU_CITY
  , TEL_KEIYAKU_NUMBER
  , TEL_KEIYAKU2_AREA
  , TEL_KEIYAKU2_CITY
  , TEL_KEIYAKU2_NUMBER
  , MAIL_KEIYAKU
  , MAIL_KEIYAKU_CONFIRM
  , SEIBETSU_KEIYAKU
  , BIRTHDAY_KEIYAKU
  , KEIYAKU_HIHO_ONAJI
  , NAME_HIHO
  , NAME_HIHO_K
  , KOJIN_BAISHO_ONAJI
  , NAME_BAISHO_KOJIN
  , NAME_BAISHO_KOJIN_K
  , SYAKUYA_BAISHO_ONAJI
  , NAME_BAISHO_SYAKUYA
  , NAME_BAISHO_SYAKUYA_K
  , NAME_BAISHO_KANRI
  , NAME_BAISHO_KANRI_K
  , SHIKI_DATE
  , SHIKI_JIKAN
  , KASAI_SHUKI_DATE
  , KASAI_SHUKI_JIKAN
  , JISHIN_SHUKI_DATE
  , JISHIN_SHUKI_JIKAN
  , TATE_SHOYU
  , TATE_KEITAI
  , KAISU_CHIJO
  , KAISU_CHIKA
  , KAISU_KYOJU
  , TATE_KOZO
  , KOZO_TEKKOTSU
  , KOZO_OTHER
  , CONST_CHK
  , GRADE
  , SHOZAI
  , KENCHIKU_YM_SEIREKI
  , AREA
  , DOC_CHK
  , TATE_KANYU
  , HYOKAGAKU_FUMEI
  , KYOTEI_GAKU
  , MON_GAKU
  , SHINCHIKU_GAKU
  , HYOKA_KIJUN
  , KAZAI_KANYU
  , SETAI_NENREI
  , KODOMO_NINZU
  , HAIGUSHA
  , DOKYO_NINZU
  , TATE_HYOKA_GAKU_LOW
  , TATE_HYOKA_GAKU_UP
  , KAZAI_HYOKA_GAKU_LOW
  , KAZAI_HYOKA_GAKU_UP
  , TATE_JISHIN_KANYU
  , KAZAI_JISHIN_KANYU
  , KAKUNIN_SHORUI
  , JISHIN_WARIBIKIRITSU
  , TAISHIN
  , TAISHIN_DATE
  , BUILT_DATE_CHK
  , WARIBIKI_CHK
  , INC_KISO
  , INC_TATAMI
  , INC_MONHEI
  , INC_SHAKO
  , INC_KYOYO
  , KASAI_HKIKAN
  , KASAI_TANKI_FLG
  , JISHIN_HKIKAN
  , JISHIN_TANKI_FLG
  , JISHIN_JIDOKEIZOKU
  , KASAI_HOHO
  , JISHIN_HOHO
  , SENTAKU_PLAN
  , O_FIRE_HOSHO
  , O_FUSAI_HOSHO
  , O_FUSAI_GAKU
  , O_SUISAI_HOSHO
  , O_TONAN_HOSHO
  , O_HASON_HOSHO
  , O_HASON_FUTAN
  , O_HASON_LIMIT
  , O_JISHIN_HOSHO_TATE
  , O_JISHIN_HOSHO_KAZAI
  , O_SAIGAI_HOSHO
  , O_SAIGAI_LIMIT
  , O_HIYO_HOSHO
  , O_TOKU_KOJINBAISHO
  , O_TOKU_SHAKUYABAISHO
  , O_TOKU_SHAKUYABAISHO_LIMIT
  , O_TOKU_TATEBAISHO
  , O_TOKU_TATEBAISHO_LIMIT
  , O_TOKU_MIZUNUREHOSHO
  , O_TOKU_RUISHO
  , O_TOKU_TATEKAE
  , O_TOKU_KYOYO
  , O_TOKU_BOHAN
  , O_TOKU_MOCHIDASHI
  , O_TOKU_HIKKOSHI
  , O_TOKU_FUSAI_SHIHARAI
  , O_TOKU_SUISAI_SHIHARAI
  , O_TOKU_HOJIN_KEIYAKU
  , F_FIRE_HOSHO
  , F_FUSAI_HOSHO
  , F_FUSAI_GAKU
  , F_SUISAI_HOSHO
  , F_TONAN_HOSHO
  , F_HASON_HOSHO
  , F_HASON_FUTAN
  , F_HASON_LIMIT
  , F_JISHIN_HOSHO_TATE
  , F_JISHIN_HOSHO_KAZAI
  , F_SAIGAI_HOSHO
  , F_SAIGAI_LIMIT
  , F_HIYO_HOSHO
  , F_TOKU_KOJINBAISHO
  , F_TOKU_SHAKUYABAISHO
  , F_TOKU_SHAKUYABAISHF_LIMIT
  , F_TOKU_TATEBAISHO
  , F_TOKU_TATEBAISHF_LIMIT
  , F_TOKU_MIZUNUREHOSHO
  , F_TOKU_RUISHO
  , F_TOKU_TATEKAE
  , F_TOKU_KYOYO
  , F_TOKU_BOHAN
  , F_TOKU_MOCHIDASHI
  , F_TOKU_HIKKOSHI
  , F_TOKU_FUSAI_SHIHARAI
  , F_TOKU_SUISAI_SHIHARAI
  , F_TOKU_HOJIN_KEIYAKU
  , GAKU_KASAI_TATE
  , GAKU_KASAI_KAZAI
  , GAKU_JISHIN_TATE
  , GAKU_JISHIN_TATE_LOW
  , GAKU_JISHIN_TATE_UP
  , GAKU_JISHIN_KAZAI
  , GAKU_JISHIN_KAZAI_LOW
  , GAKU_JISHIN_KAZAI_UP
  , O_HRYO_KASAI_TATE
  , O_HRYO_KASAI_KAZAI
  , O_HRYO_KASAI
  , O_HRYO_JISHIN_TATE
  , O_HRYO_JISHIN_KAZAI
  , O_HRYO_JISHIN
  , O_HRYO_KOJINBAI
  , O_HRYO_SHAKUYABAI
  , O_HRYO_RUISHO
  , O_HRYO_NENGAKU
  , O_HRYO_SHOKAI
  , O_HRYO
  , O_HRYO_JISHIN_NENGAKU
  , O_HRYO_JISHIN_SHOKAI
  , O_HRYO_JISHIN_GOUKEI
  , F_HRYO_KASAI_TATE
  , F_HRYO_KASAI_KAZAI
  , F_HRYO_KASAI
  , F_HRYO_JISHIN_TATE
  , F_HRYO_JISHIN_KAZAI
  , F_HRYO_JISHIN
  , F_HRYO_KOJINBAI
  , F_HRYO_SHAKUYABAI
  , F_HRYO_RUISHO
  , F_HRYO_NENGAKU
  , F_HRYO_SHOKAI
  , F_HRYO
  , F_HRYO_JISHIN_NENGAKU
  , F_HRYO_JISHIN_SHOKAI
  , F_HRYO_JISHIN_GOUKEI
  , JUSHO_ONAJI
  , YUBIN_HOKEN
  , JUSHO_CODE_HOKEN
  , JUSHO_HOKEN
  , JUSHO_HOKEN_FREE
  , JUSHO_HOKEN_K
  , JUSHO_HOKEN_K_FREE
  , KEIYAKUSHA_CHK
  , HOKENNOTAISHO_CHK
  , HOKANOHOKEN_CHK
  , HOKENKIKAN_CHK
  , JISHINHOKEN_CHK
  , HOSHONAIYO_CHK
  , JUYOJIKO_CHK
  , KOJIN_DOI
  , JISHIN_KAKUNIN
  , DOC_SUBMIT
  , CHECK_DATE
  , CHECK_JIKAN
  , TEISEI
  , SHINSA_KEIYAKUSHA_CHK
  , SHINSA_HOKENNOTAISHO_CHK
  , SHINSA_HOKANOHOKEN_CHK
  , SHINSA_HOKENKIKAN_CHK
  , SHINSA_JISHINHOKEN_CHK
  , SHINSA_HOSHONAIYO_CHK
  , SHINSA_JUYOJIKO_CHK
  , SHINSA_KOJIN_DOI
  , SHINSA_JISHIN_KAKUNIN
  , SHINSA_NAME
  , SHINSA_MEMO
  , "OLD"
  , DAIRI_CD
  , DAIRI_NAME
  , KATEN_CD
  , TANTO_CD
  , KEIYAKU_OTHER
  , HOKEN_SHU_KANA1
  , HOKEN_CO_KANA1
  , myapp_SONPO1
  , HOKEN_TAISHO1
  , GAKU_KIHON_HOKEN1
  , GAKU_JISHIN_HOKEN1
  , MANKI_DATE1
  , HOKEN_SHU_KANA2
  , HOKEN_CO_KANA2
  , myapp_SONPO2
  , HOKEN_TAISHO2
  , GAKU_KIHON_HOKEN2
  , GAKU_JISHIN_HOKEN2
  , MANKI_DATE2
  , ALL_KOSU
  , YOHO
  , SHOKUSAGYO_BUNRUI
  , SHOKUSAGYO
  , GEKIHEN_KANWA
  , HYOKA_KBN
  , OTHER_KONKYO
  , MB_MEISAI_UMU
  , MB_GAKU
  , MB_HYOKA_GAKU
  , SETUJ_KANYU
  , SETUJ_GAKU
  , SETUJ_HYOKA_GAKU
  , SEIHN_KANYU
  , SEIHN_GAKU
  , SEIHN_HYOKA_GAKU
  , BOSHUNIN_ID
  , BOSHUNIN_NAME
  , BOSHUNIN_KANA
  , HOSEI_KASHO_CD
  , HOSEI_WARIAI
  , BNT_KBN
  , WARI_KBN
  , HKNJ1_KATEN_CD
  , HKNJ1_DAIRI_CD
  , HKNJ1_JIKO
  , HKNJ1_BNT_WARI
  , HKNJ2_KATEN_CD
  , HKNJ2_DAIRI_CD
  , HKNJ2_JIKO
  , HKNJ2_BNT_WARI
  , KNJ_KATEN_CD
  , KNJ_DAIRI_CD
  , KNJ_JIKO
  , KNJ_BNT_WARI
  , KEIYAKU_KBN
  , BEF_HOJIN_CD
  , AFT_HOJIN_CD
  , NAME_DAIHYO
  , NAME_DAIHYO_K
  , UKE_KBN
  , SHICHIKEN_UMU
  , TEITO_UMU
  , BETSUDO
  , BNT_UMU
  , TOKKI_K
  , YUSHI_UMU
  , KOZA_HENKO
  , HAGAKI
  , POLICY_OLD
  , JT_KBN
  , FUKUSU_HOSEI
  , SEIGEN_CD
  , KETTEI_NO
  , HRYO_SETUJ
  , HRYO_SEIHN
  , HRYO_MB
  , BANK_KBN
  , FINANCIALINSTITUTION_CODE
  , BRANCH_NUMBER
  , SUBJECT
  , ACCOUNT_NUMBER
  , ACCOUNT_NAME_KANA
  , TRANSFER_NOTICE
  , SYMBOL_YUTYO
  , NUMBER_YUTYO
  , ACCOUNT_NAME_KANA_YUTYO
  , TRANSFER_NOTICE_YUTYO
  , SAVE_DATE
  , KIGEN
  , OLD_ENTRY_NO
  , DEL_FLG
  , ADD_DATE
  , UPD_DATE
) 
values ( 
  'A00003'
  , 12
  , 'C0000000001'
  , 'D0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001'
  , 'E000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001'
  , 'F'
  , 'G0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001'
  , 'H'
  , 'I'
  , 'J00000000000000000000000000001'
  , 'K00000000000000000000000000000000000000000000000000000000001'
  , 'L000001'
  , 1000000001
  , 'N0000000000000000000000000000000000000000000000000000000000000000001'
  , 'O0000000000000000000000000000000000000000000000001'
  , 'P000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001'
  , 'Q000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001'
  , 'R00001'
  , 'S001'
  , 'T001'
  , 'U00001'
  , 'V001'
  , 'W001'
  , 'X0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001'
  , 'Y0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001'
  , 'Z'
  , 'A0000001'
  , 'B'
  , 'C00000000000000000000000000001'
  , 'D00000000000000000000000000000000000000000000000000000000001'
  , 'E'
  , 'F00000000000000000000000000001'
  , 'G00000000000000000000000000000000000000000000000000000000001'
  , 'H'
  , 'I00000000000000000000000000001'
  , 'J00000000000000000000000000001'
  , 'K00000000000000000000000000001'
  , 'L00000000000000000000000000001'
  , '20180101'
  , 'N00001'
  , '20180101'
  , 'P00001'
  , '20180101'
  , 'R00001'
  , 'S'
  , 'T'
  , 101
  , 101
  , 101
  , 'X'
  , 'Y'
  , 'Z'
  , 'A'
  , 'B'
  , 'C000000001'
  , 'D00001'
  , 1000001.001
  , 'F'
  , 'G'
  , 'H'
  , 100000001
  , 10001
  , 1000000001
  , 'L'
  , 'M'
  , 101
  , 11
  , 'P'
  , 11
  , 100000001
  , 100000001
  , 100000001
  , 100000001
  , 'V'
  , 'W'
  , 'X'
  , 11
  , 'Z'
  , '20180101'
  , 'B'
  , 'C'
  , 'D'
  , 'E'
  , 'F'
  , 'G'
  , 'H'
  , 1001
  , 1
  , 1001
  , 1
  , 'M'
  , 'N'
  , 'O'
  , 'P'
  , 'Q'
  , 'R'
  , 1000001
  , 'T'
  , 'U'
  , 'V'
  , 1000001
  , 100000001
  , 'Y'
  , 'Z'
  , 'A'
  , 'B'
  , 'C'
  , 'D'
  , 'E'
  , 100000001
  , 'G'
  , 100000001
  , 'I'
  , 'J'
  , 'K'
  , 'L'
  , 'M'
  , 'N'
  , 'O'
  , 'P'
  , 'Q'
  , 'R'
  , 'S'
  , 'T'
  , 1000001
  , 'V'
  , 'W'
  , 'X'
  , 1000001
  , 100000001
  , 'A'
  , 'B'
  , 'C'
  , 'D'
  , 'E'
  , 'F'
  , 'G'
  , 100000001
  , 'I'
  , 100000001
  , 'K'
  , 'L'
  , 'M'
  , 'N'
  , 'O'
  , 'P'
  , 'Q'
  , 'R'
  , 'S'
  , 'T'
  , 100000001
  , 100000001
  , 100000001
  , 100000001
  , 100000001
  , 100000001
  , 100000001
  , 100000001
  , 100000001
  , 100000001
  , 100000001
  , 100000001
  , 100000001
  , 100000001
  , 100000001
  , 100000001
  , 100000001
  , 100000001
  , 100000001
  , 100000001
  , 100000001
  , 100000001
  , 100000001
  , 100000001
  , 100000001
  , 100000001
  , 100000001
  , 100000001
  , 100000001
  , 100000001
  , 100000001
  , 100000001
  , 100000001
  , 100000001
  , 100000001
  , 100000001
  , 100000001
  , 100000001
  , 'G'
  , 'H000001'
  , 1000000001
  , 'J0000000000000000000000000000000000000000000000000000000000000000001'
  , 'K0000000000000000000000000000000000000000000000001'
  , 'L000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001'
  , 'M000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001'
  , 'N'
  , 'O'
  , 'P'
  , 'Q'
  , 'R'
  , 'S'
  , 'T'
  , 'U'
  , 'V'
  , 'W'
  , '20180101'
  , 'Y00001'
  , 'Z000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001'
  , 'A'
  , 'B'
  , 'C'
  , 'D'
  , 'E'
  , 'F'
  , 'G'
  , 'H'
  , 'I'
  , 'J00000000000000000000000000001'
  , 'K000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001'
  , 'L'
  , 'M000000001'
  , 'N0000000000000000001'
  , 'O001'
  , 'P000001'
  , 'Q'
  , 'R0000000000000000001'
  , 'S0000000000000000001'
  , 'T'
  , 'U'
  , 100000001
  , 100000001
  , 'X0000001'
  , 'Y0000000000000000001'
  , 'Z0000000000000000001'
  , 'A'
  , 'B'
  , 100000001
  , 100000001
  , 'E0000001'
  , 'F001'
  , 'G1'
  , 'H01'
  , 'I01'
  , 'J'
  , 'K'
  , 'L00000000000000000000000000000000000000000000000000000000001'
  , 'M'
  , 100000001
  , 100000001
  , 'P'
  , 100000001
  , 100000001
  , 'S'
  , 100000001
  , 100000001
  , 'V000000001'
  , 'W0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001'
  , 'X0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001'
  , 1001
  , 101
  , 1
  , 1
  , 1001
  , 1000000001
  , 1
  , 100001
  , 1001
  , 1000000001
  , 1
  , 100001
  , 1001
  , 1000000001
  , 1
  , 100001
  , 'O'
  , 'P1'
  , 'Q1'
  , 'R00000000000000000000000000001'
  , 'S00000000000000000000000000000000000000000000000000000000001'
  , 'T'
  , 'U'
  , 'V'
  , 'W'
  , 'X'
  , 'Y000000000000001'
  , 'Z'
  , 'A'
  , 'B'
  , 'C000000000000001'
  , 'D'
  , 1
  , 101
  , 100000001
  , 100000001
  , 100000001
  , 100000001
  , 1
  , 1001
  , 101
  , 1
  , 1000001
  , 'P00000000000000000000000000000000000000000000000000000000001'
  , 1
  , 10001
  , 10000001
  , 100000000000000000000000000000000000000000000000000000000000
  , 1
  , to_date('2018/1/1', 'yyyy/MM/dd')
  , 'W0000001'
  , 'X00001'
  , 'Y'
  , to_date('2018/1/1', 'yyyy/MM/dd')
  , to_date('2018/1/1', 'yyyy/MM/dd')
); 


