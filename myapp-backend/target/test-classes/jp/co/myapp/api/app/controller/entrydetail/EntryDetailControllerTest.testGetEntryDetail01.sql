truncate table entry_ha;
insert 
into SONPO_YHM.ENTRY_HA( 
  POLICY
  , ENTRY_NO
  , KEIJYOU_STATUS
  , OPEN_ID
  , ENTRY_TYPE
  , PAYMENT_TYPE
  , CHECK_DATE
  , CHECK_JIKAN
  , ENTRY_DATE
  , ENTRY_JIKAN
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
  , MAIL_SEND_FLG
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
  , TATE_KOUZOU
  , KOUZOU_TEKIN
  , KOUZOU_OTHER
  , GRADE
  , SHOZAI
  , KENCHIKU_YM_SEIREKI
  , AREA
  , TATE_KANYU
  , JYULON_RIYO
  , HYOKAGAKU_HUMEI
  , SAICHOTATU_GAKU
  , MONHEI_GAKU
  , SHINCHIKU_GAKU
  , HYOKA_KIJUN
  , KAZAI_KANYU
  , SETAI_NENREI
  , KODOMO_NINZU
  , HAIGUSHA
  , DOUKYO_NINZU
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
  , FIRE_HOSHO
  , HUSAI_HOSHO
  , HUSAI_GAKU
  , SUISAI_HOSHO
  , TONAN_HOSHO
  , HASON_HOSHO
  , HASON_HUTAN
  , HASON_LIMIT
  , JISHIN_HOSHO_TATE
  , JISHIN_HOSHO_KAZAI
  , SAIGAI_HOSHO
  , SAIGAI_LIMIT
  , HIYOU_HOSHO
  , TOKU_KOJINBAISHO
  , TOKU_SYAKUYABAISHO
  , TOKU_SYAKUYABAISHO_LIMIT
  , TOKU_TATEBAISHO
  , TOKU_TATEBAISHO_LIMIT
  , TOKU_MIZUNUREHOSHO
  , TOKU_ROSUI_TAISHOGAI
  , TOKU_RUISHO
  , TOKU_TATEKAE
  , TOKU_KYOYO
  , TOKU_BOHAN
  , TOKU_MOTIDASHI
  , TOKU_HIKOSHI
  , TOKU_FUSAI_SHIHARAI
  , TOKU_SUISAI_SHIHARAI
  , TOKU_HOJIN_KEIYAKU
  , TOKU_KAZAI_NOMI
  , TOKU_SUISAI_TAISHOGAI
  , TOKU_ZATU_TAISHOGAI
  , GAKU_KASAI_TATE
  , GAKU_KASAI_KAZAI
  , GAKU_JISHIN_TATE
  , GAKU_JISHIN_TATE_LOW
  , GAKU_JISHIN_TATE_UP
  , GAKU_JISHIN_KAZAI
  , GAKU_JISHIN_KAZAI_LOW
  , GAKU_JISHIN_KAZAI_UP
  , HRYO_KASAI_TATE
  , HRYO_KASAI_KAZAI
  , HRYO_KASAI
  , HRYO_JISHIN_TATE
  , HRYO_JISHIN_KAZAI
  , HRYO_JISHIN
  , HRYO_KOJINBAI
  , HRYO_SHAKUYABAI
  , HRYO_RUISHO
  , HRYO_NENGAKU
  , HRYO_SHOKAI
  , HRYO
  , JUSHO_ONAJI
  , YUBIN_HOKEN
  , JUSHO_CODE_HOKEN
  , JUSHO_HOKEN
  , JUSHO_HOKEN_FREE
  , JUSHO_HOKEN_K
  , JUSHO_HOKEN_K_FREE
  , JISHIN_KAKUNIN
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
  , YOUHOU
  , SHOKUSAGYO_BUNRUI
  , SHOKUSAGYO
  , GEKIHEN_KANWA
  , OTHER_KONKYO
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
  , KEIYAKU_KBN
  , BEF_HOJIN_CD
  , AFT_HOJIN_CD
  , NAME_DAIHYO
  , NAME_DAIHYO_K
  , UKE_KBN
  , KATEN_CD
  , KATEN_NAME
  , DAIRI_CD
  , DAIRI_NAME
  , SHICHIKEN_UMU
  , TEITO_UMU
  , BETUDOU
  , TANTO_CD
  , BNT_UMU
  , TOKI_K
  , BOSYUNIN_ID
  , HOSEI_KASHO_CD
  , HOSEI_WARIAI
  , YUSHI_UMU
  , KOZA_HENKO
  , HAGAKI
  , POLICY_OLD
  , POLICY_OLD_EDA
  , OPEN_ID_OLD
  , JT_KBN
  , SEIGEN_CD
  , KETTEI_NO
  , PAPER_POLICY_SEND
  , MB_SHOSAI_UMU
  , SYOKAI_TRANSFER
  , HRYO_SETUJ
  , HRYO_SEIHN
  , HRYO_MB
  , HRYO_TATEMONO_KANRI
  , FIREPROOF_SEND_FLG
  , QUAKE_SEND_FLG
  , PATTERN_CD
  , MOSIKOMI_BUNGEN
  , UPD_PROC_ID
  , UPD_DATE
  , ADD_PROC_ID
  , ADD_DATE
) 
values ( 
  'A0000000001'
  , '706022'
  , '1'
  , 'test_openid'
  , '2'
  , '2'
  , '20180101'
  , 'H00001'
  , '20190531'
  , 'J00001'
  , 'テスト　八太郎'
  , 'カナ　テスト'
  , 'M000001'
  , 'N000000001'
  , 'O0000000000000000000000000000000000000000000000000000000000000000001'
  , 'P0000000000000000000000000000000000000000000000001'
  , 'Q000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001'
  , 'R000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001'
  , 'S00001'
  , 'T001'
  , 'U001'
  , 'V00001'
  , 'W001'
  , 'X001'
  , 'Y0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001'
  , '2'
  , 'A'
  , 'B0000001'
  , 'C'
  , 'D00000000000000000000000000001'
  , 'E00000000000000000000000000000000000000000000000000000000001'
  , 'F00000000000000000000000000001'
  , 'G00000000000000000000000000000000000000000000000000000000001'
  , 'H00000000000000000000000000001'
  , 'I00000000000000000000000000001'
  , 'J00000000000000000000000000001'
  , 'K00000000000000000000000000001'
  , '20190601'
  , 'M00001'
  , '20180101'
  , 'O00001'
  , '20180101'
  , 'Q00001'
  , 'R'
  , '1'
  , 101
  , 101
  , 101
  , 'W'
  , 'X'
  , 'Y'
  , 'Z'
  , '32'
  , 'B00001'
  , 1000001.001
  , 'D'
  , 'E'
  , 'F'
  , 100000001
  , 10001
  , 1000000001
  , 'J'
  , 'K'
  , 101
  , 11
  , 'N'
  , 11
  , 100000001
  , 100000001
  , 100000001
  , 100000001
  , 'T'
  , 'U'
  , 'V'
  , 11
  , 'X'
  , '20180101'
  , 'Z'
  , 'A'
  , 'B'
  , 'C'
  , 'D'
  , 5
  , 10
  , 'G'
  , 'H'
  , 'I'
  , 'J'
  , 'K'
  , 'L'
  , 1000001
  , 'N'
  , 'O'
  , 'P'
  , 1000001
  , 100000001
  , 'S'
  , 'T'
  , 'U'
  , 'V'
  , 'W'
  , 'X'
  , 'Y'
  , 100000001
  , 'A'
  , 100000001
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
  , 'M'
  , 'N'
  , 'O'
  , 'P'
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
  , 15600000
  , 'K'
  , 'L000001'
  , 'M000000001'
  , 'N0000000000000000000000000000000000000000000000000000000000000000001'
  , 'O0000000000000000000000000000000000000000000000001'
  , 'P000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001'
  , 'Q000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001'
  , 'R'
  , 'S'
  , 'T000000001'
  , 'U000000001'
  , 'V'
  , 'W'
  , 100000001
  , 100000001
  , 'Z0000001'
  , 'A000000001'
  , 'B000000001'
  , 'C'
  , 'D'
  , 100000001
  , 100000001
  , 'G0000001'
  , 'H001'
  , 'I1'
  , 'J01'
  , 'K01'
  , 'L'
  , 'M00000000000000000000000000000000000000000000000000000000001'
  , 'N'
  , 100000001
  , 100000001
  , 'Q'
  , 100000001
  , 100000001
  , 100000001
  , 100000001
  , 'V'
  , 'W'
  , 'X001'
  , 'Y000000001'
  , 'Z'
  , 101.001
  , 'B001'
  , 'C000000001'
  , 'D'
  , 101.001
  , 'F'
  , 'G1'
  , 'H1'
  , 'I00000000000000000000000000001'
  , 'J00000000000000000000000000000000000000000000000000000000001'
  , 'K'
  , '1101'
  , '本店法人営業部法人営業二課'
  , '1111001'
  , '株式会社タカシ・フォーユー'
  , 'P'
  , 'Q'
  , 'R'
  , 'S000001'
  , 'T'
  , 'U000000000000001'
  , 'V000000001'
  , 'W001'
  , 'X01'
  , 'Y'
  , 'Z'
  , 'A'
  , 'B000000000000001'
  , 'C0001'
  , 'D000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001'
  , 'E'
  , 101
  , 100000001
  , 1
  , 'I'
  , 'J'
  , 100000001
  , 100000001
  , 100000001
  , 100000001
  , 'O'
  , 'P'
  , 'Q000000001'
  , 'R00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001'
  , 'S000000001'
  , '2019/04/18 19:30:53'
  , 'U000000001'
  , '2018/01/01 00:00:00'
); 

