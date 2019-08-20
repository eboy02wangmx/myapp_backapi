DELETE FROM openid where open_Id like 'test_openid_ac%';
INSERT INTO openid(mytoken,open_Id,expiration_Date,del_flg,upd_date,add_date) VALUES ('testtoken_ac2','test_openid_ac2',TO_DATE('2018-01-01'),0,sysdate,sysdate);
INSERT INTO openid(mytoken,open_Id,expiration_Date,del_flg,upd_date,add_date) VALUES ('testtoken_ac3','test_openid_ac3',TO_DATE('2020-12-31'),0,sysdate,sysdate);
