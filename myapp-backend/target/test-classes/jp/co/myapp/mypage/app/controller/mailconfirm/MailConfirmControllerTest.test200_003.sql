truncate table MAIL_INFO;
truncate table ENTRY_HA;

INSERT INTO MAIL_INFO
 (open_id, policy, rireki_remban, mail_address, expiration_date, del_flg, upd_date, add_date)
 VALUES
  ('test_openid', '12345', 1, '',  TO_DATE('2020-01-01', 'yyyy-mm-dd'), '0',  TO_DATE('2018-01-01', 'yyyy-mm-dd'),  TO_DATE('2018-01-01', 'yyyy-mm-dd'))
;

INSERT INTO ENTRY_HA
 (policy, entry_no, keijyou_status, open_id, mail_keiyaku)
 VALUES
  ('12345', '123456', '1', 'test_openid', 'old@test.jp')
;

