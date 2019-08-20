DELETE FROM openid where open_Id like 'test_logout%';
INSERT INTO openid(mytoken,open_Id,expiration_Date,del_flg,upd_date,add_date) VALUES ('testtoken_lo1','test_logout1',TO_DATE('2018-01-01'),0,sysdate,sysdate);
INSERT INTO openid(mytoken,open_Id,expiration_Date,del_flg,upd_date,add_date) VALUES ('testtoken_lo2','test_logout2',TO_DATE('2020-12-31'),0,sysdate,sysdate);
