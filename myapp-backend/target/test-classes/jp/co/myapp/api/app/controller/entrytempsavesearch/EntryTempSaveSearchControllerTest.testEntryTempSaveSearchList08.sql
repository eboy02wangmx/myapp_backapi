truncate table ENTRY_HA_TEMP;
insert into ENTRY_HA_TEMP( 
  ENTRY_NO
  , SERIAL
  , MAIL
  , "STATE"
  , GAMEN_ID
  , ENTRY_TYPE
  , PAYMENT_TYPE
  , NAME_KEIYAKU
  , NAME_KEIYAKU_K
  , YUBIN_KEIYAKU
  , JUSHO_KEIYAKU
  , JUSHO_KEIYAKU_K
  , TEL_KEIYAKU_AREA
  , TEL_KEIYAKU_CITY
  , TEL_KEIYAKU_NUMBER
  , TEL_KEIYAKU2_AREA
  , TEL_KEIYAKU2_CITY
  , TEL_KEIYAKU2_NUMBER
  , MAIL_KEIYAKU
  , SEIBETSU_KEIYAKU
  , BIRTHDAY_KEIYAKU
  , KEIYAKU_HIHO_ONAJI
  , NAME_HIHO
  , NAME_HIHO_K
  , NAME_BAISHO_KOJIN
  , NAME_BAISHO_KOJIN_K
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
  , JISHIN_HKIKAN
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
  , O_TOKU_RUISHO
  , O_TOKU_TATEKAE
  , O_TOKU_KYOYO
  , O_TOKU_BOHAN
  , O_TOKU_MOCHIDASHI
  , O_TOKU_HIKKOSHI
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
  , F_TOKU_RUISHO
  , F_TOKU_TATEKAE
  , F_TOKU_KYOYO
  , F_TOKU_BOHAN
  , F_TOKU_MOCHIDASHI
  , F_TOKU_HIKKOSHI
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
  , O_HRYO
  , F_HRYO_KASAI_TATE
  , F_HRYO_KASAI_KAZAI
  , F_HRYO_KASAI
  , F_HRYO_JISHIN_TATE
  , F_HRYO_JISHIN_KAZAI
  , F_HRYO_JISHIN
  , F_HRYO
  , JUSHO_ONAJI
  , YUBIN_HOKEN
  , JUSHO_HOKEN
  , JUSHO_HOKEN_K
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
  , DAIRI_CD
  , DAIRI_NAME
  , "OLD"
  , YOHO
  , SHOKUSAGYO
  , SETUJ_KANYU
  , SETUJ_HYOKA_GAKU
  , SETUJ_GAKU
  , SEIHN_KANYU
  , SEIHN_HYOKA_GAKU
  , SEIHN_GAKU
  , MB_HYOKA_GAKU
  , MB_GAKU
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
  , UKE_KBN
  , KATEN_CD
  , SHICHIKEN_UMU
  , TEITO_UMU
  , BETSUDO
  , TANTO_CD
  , BNT_UMU
  , TOKKI_K
  , BOSHUNIN_ID
  , YUSHI_UMU
  , KOZA_HENKO
  , HAGAKI
  , POLICY_OLD
  , JT_KBN
  , MB_MEISAI_UMU
  , HRYO_SETUJ
  , HRYO_SEIHN
  , HRYO_MB
  , SAVE_DATE
  , KIGEN
  , OLD_ENTRY_NO
  , DEL_FLG
  , ADD_DATE
  , UPD_DATE
) 
values ( 
  'A00001'
  , 12
  , 'C0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001'
  , 'D'
  , '1'
  , '1'
  , '1'
  , 'H00000000000000000000000000001'
  , 'アアアアアアアアアアアアアアアアアアアアアアアアアアアアアアアアアアアアアアアアアアアアアアアアアアアアアアアアアアアア'
  , 'J000001'
  , 'K0000000000000000000000000000000000000000000000001'
  , 'L000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001'
  , 100001
  , 1001
  , 1001
  , 100001
  , 1001
  , 1001
  , 'S0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001'
  , 'T'
  , 'U0000001'
  , 'V'
  , 'W00000000000000000000000000001'
  , 'X00000000000000000000000000000000000000000000000000000000001'
  , 'Y00000000000000000000000000001'
  , 'Z00000000000000000000000000000000000000000000000000000000001'
  , 'A00000000000000000000000000001'
  , 'B00000000000000000000000000001'
  , 'C00000000000000000000000000001'
  , 'D00000000000000000000000000001'
  , '20190101'
  , 'F00001'
  , '20180101'
  , 'H00001'
  , '20180101'
  , 'J00001'
  , 'K'
  , 'L'
  , 101
  , 101
  , 101
  , 'P'
  , 'Q'
  , 'R'
  , 'S'
  , 'T'
  , 'U000000001'
  , 'V00001'
  , 1000001.001
  , 'X'
  , 'Y'
  , 'Z'
  , 100000001
  , 100000001
  , 100000001
  , 'D'
  , 'E'
  , 101
  , 11
  , 'H'
  , 11
  , 100000001
  , 100000001
  , 100000001
  , 100000001
  , 'N'
  , 'O'
  , 'P'
  , 11
  , 'R'
  , '20180101'
  , 'T'
  , 'U'
  , 'V'
  , 'W'
  , 'X'
  , 'Y'
  , 'Z'
  , 1001
  , 1001
  , 'C'
  , '1'
  , '1'
  , 'F'
  , 'G'
  , 'H'
  , 100000001
  , 'J'
  , 'K'
  , 'L'
  , 100000001
  , 100000001
  , 'O'
  , 'P'
  , 'Q'
  , '1'
  , 'S'
  , 'T'
  , 'U'
  , 100000001
  , 'W'
  , 100000001
  , 'Y'
  , 'Z'
  , 'A'
  , 'B'
  , 'C'
  , 'D'
  , 'E'
  , 'F'
  , 100000001
  , 'H'
  , 'I'
  , 'J'
  , 100000001
  , 100000001
  , 'M'
  , 'N'
  , 'O'
  , '1'
  , 'Q'
  , 'R'
  , 'S'
  , 100000001
  , 'U'
  , 100000001
  , 'W'
  , 'X'
  , 'Y'
  , 'Z'
  , 'A'
  , 'B'
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
  , 'Y'
  , 'Z000001'
  , 'A0000000000000000000000000000000000000000000000001'
  , 'B000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001'
  , 'C'
  , 'D'
  , 'E'
  , 'F'
  , 'G'
  , 'H'
  , 'I'
  , 'J'
  , 'K'
  , 'L'
  , '20180101'
  , 'N00001'
  , 'O000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001'
  , 'P'
  , 'Q'
  , 'R'
  , 'S'
  , 'T'
  , 'U'
  , 'V'
  , 'W'
  , 'X'
  , 'Y00000000000000000000000000001'
  , 'Z000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001'
  , '1234567890'
  , 'B0000000000000000001'
  , 'C'
  , 'D'
  , 'E'
  , 'F'
  , 100000001
  , 100000001
  , 'I'
  , 100000001
  , 100000001
  , 100000001
  , 100000001
  , 'N'
  , 'O'
  , 'P'
  , 'Q'
  , 'R'
  , 100001
  , 'T'
  , 'U'
  , 'V'
  , 100001
  , 'X'
  , '1234'
  , 'Z'
  , 'A'
  , 'B'
  , 'C'
  , 'D'
  , 'E000000000000001'
  , 'F000000001'
  , 'G'
  , 'H'
  , 'I'
  , 'J000000000000001'
  , 'K'
  , 'L'
  , 100000001
  , 100000001
  , 100000001
  , to_date('2018/1/1', 'yyyy/MM/dd')
  , 'Q0000001'
  , 'R00001'
  , '1'
  , to_date('2018/1/1', 'yyyy/MM/dd')
  , to_date('2018/1/1', 'yyyy/MM/dd')
); 