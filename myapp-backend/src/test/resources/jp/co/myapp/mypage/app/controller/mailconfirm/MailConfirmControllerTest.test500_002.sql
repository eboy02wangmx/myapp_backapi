truncate table MAIL_INFO;
truncate table ENTRY_HA;

INSERT INTO ENTRY_HA
 (policy, entry_no, keijyou_status, open_id, mail_keiyaku)
 VALUES
  ('12345', '123456', '1', 'test_openid', '')
;

