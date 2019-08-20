TRUNCATE TABLE ENTRY_HA_TEMP;
TRUNCATE TABLE FILE_ID;
TRUNCATE TABLE FILE_INFO;
INSERT INTO ENTRY_HA_TEMP (entry_no,serial,mail,open_id,state,gamen_id,kaisu_chijo,kaisu_chika,kaisu_kyoju,area,kyotei_gaku,old_entry_no,del_flg,add_date)
values
('E00001',1,'test01@test.com','open_id01','1','G_NHA_033',1,11,111,1111,1,'old01','0',TO_TIMESTAMP('20180101 12:13:14.567','yyyy-mm-dd hh24:mi:ss.ff3'));

INSERT INTO ENTRY_HA_TEMP (entry_no,serial,mail,open_id,state,gamen_id,kaisu_chijo,kaisu_chika,kaisu_kyoju,area,kyotei_gaku,old_entry_no,del_flg,add_date)
values
('E00001',2,'test01@test.com','open_id01','1','G_NHA_033',2,22,222,2222,1,'old02','0',TO_TIMESTAMP('20180101 12:13:14.567','yyyy-mm-dd hh24:mi:ss.ff3'));

INSERT INTO ENTRY_HA_TEMP (entry_no,serial,mail,open_id,state,gamen_id,kaisu_chijo,kaisu_chika,kaisu_kyoju,area,kyotei_gaku,old_entry_no,del_flg,add_date)
values
('E00001',3,'test01@test.com','open_id01','1','G_NHA_033',3,33,333,3333,1,'old03','0',TO_TIMESTAMP('20180101 12:13:14.567','yyyy-mm-dd hh24:mi:ss.ff3'));

INSERT INTO ENTRY_HA_TEMP (entry_no,serial,mail,open_id,state,gamen_id,kaisu_chijo,kaisu_chika,kaisu_kyoju,area,kyotei_gaku,old_entry_no,del_flg,add_date)
values
('E00001',4,'test01@test.com','open_id01','1','G_NHA_033',4,44,444,4444,1,'old04','0',TO_TIMESTAMP('20180101 12:13:14.567','yyyy-mm-dd hh24:mi:ss.ff3'));