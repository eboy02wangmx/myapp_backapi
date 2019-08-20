DELETE FROM HIGH_VALUE_ITEM WHERE trim(ENTRY_NO) IN('E00001','E00002');
INSERT INTO HIGH_VALUE_ITEM (entry_no,serial_id,policy,ho_taisho_type,meiki_type,meiki_hinmei,hoken_kingaku,tokki_jiko,delete_flg,add_date,delete_date) VALUES ('E00001',1,'P0000000001','1','1','品名一',100000001,'特記事項一','',to_timestamp('2018-01-01 12:12:12.123','yyyy-mm-dd hh24:mi:ss.ff3'),to_timestamp('2018-01-01 12:12:12.456','yyyy-mm-dd hh24:mi:ss.ff3'));
INSERT INTO HIGH_VALUE_ITEM (entry_no,serial_id,policy,ho_taisho_type,meiki_type,meiki_hinmei,hoken_kingaku,tokki_jiko,delete_flg,add_date,delete_date) VALUES ('E00001',2,'P0000000001','2','2','品名二',100000002,'特記事項二','0',to_timestamp('2018-01-02 12:12:12.123','yyyy-mm-dd hh24:mi:ss.ff3'),to_timestamp('2018-01-02 12:12:12.456','yyyy-mm-dd hh24:mi:ss.ff3'));
INSERT INTO HIGH_VALUE_ITEM (entry_no,serial_id,policy,ho_taisho_type,meiki_type,meiki_hinmei,hoken_kingaku,tokki_jiko,delete_flg,add_date,delete_date) VALUES ('E00001',3,'P0000000001','3','3','品名三',100000003,'特記事項三','1',to_timestamp('2018-01-03 12:12:12.123','yyyy-mm-dd hh24:mi:ss.ff3'),to_timestamp('2018-01-03 12:12:12.456','yyyy-mm-dd hh24:mi:ss.ff3'));
INSERT INTO HIGH_VALUE_ITEM (entry_no,serial_id,policy,ho_taisho_type,meiki_type,meiki_hinmei,hoken_kingaku,tokki_jiko,delete_flg,add_date,delete_date) VALUES ('E00001',4,'P0000000002','3','4','品名四',100000004,'特記事項四','',to_timestamp('2018-01-04 12:12:12.123','yyyy-mm-dd hh24:mi:ss.ff3'),to_timestamp('2018-01-04 12:12:12.456','yyyy-mm-dd hh24:mi:ss.ff3'));
INSERT INTO HIGH_VALUE_ITEM (entry_no,serial_id,policy,ho_taisho_type,meiki_type,meiki_hinmei,hoken_kingaku,tokki_jiko,delete_flg,add_date,delete_date) VALUES ('E00002',1,'P0000000001','3','5','品名五',100000004,'特記事項五','',to_timestamp('2018-01-05 12:12:12.123','yyyy-mm-dd hh24:mi:ss.ff3'),to_timestamp('2018-01-05 12:12:12.456','yyyy-mm-dd hh24:mi:ss.ff3'));
