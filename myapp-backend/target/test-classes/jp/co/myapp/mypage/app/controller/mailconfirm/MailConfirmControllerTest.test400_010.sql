truncate table MAIL_INFO;
truncate table ENTRY_HA;

INSERT INTO MAIL_INFO
 (open_id, policy, rireki_remban, mail_address, expiration_date, del_flg, upd_date, add_date)
 VALUES
  ('test_openid', '12345', 1, 'old@test.jp',  TO_DATE('2020-01-01', 'yyyy-mm-dd'), '0',  TO_DATE('2018-01-01', 'yyyy-mm-dd'),  TO_DATE('2018-01-01', 'yyyy-mm-dd'))
;

