truncate table ENTRY_HA_TEMP;
insert into ENTRY_HA_TEMP(entry_no,serial,state,gamen_id,entry_type,payment_type,name_keiyaku,name_keiyaku_k,shiki_date,kozo_tekkotsu,kozo_other,kakunin_shorui,kasai_hoho,jishin_hoho,check_date,dairi_cd,uke_kbn,katen_cd,old_entry_no,del_flg,upd_date)
values ('E00001','1','1','H000000001','1','2','朝日　太郎','アサヒ　タロウ','20180101','1','','1','1','1','20190101','1000000001','K','1001','S00001',null,TO_TIMESTAMP('20191231 12:13:14.567','yyyymmdd hh24:mi:ss.ff3'));
