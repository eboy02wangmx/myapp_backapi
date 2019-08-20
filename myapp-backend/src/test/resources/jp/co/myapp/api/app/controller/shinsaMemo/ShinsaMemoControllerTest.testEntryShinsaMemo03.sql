truncate table INSPECTION_MEMO;
insert into INSPECTION_MEMO(entry_no, policy, target, authority, user_id, user_name, memo, delete_flg, add_date)
values ('Ae0001', 'B1234567890', '1', '0', 'User01', 'Name01', 'aaaaaaaaaaa', '0', TO_TIMESTAMP('20190925 12:13:14.567','yyyymmdd hh24:mi:ss.ff3'));
insert into INSPECTION_MEMO(entry_no, policy, target, authority, user_id, user_name, memo, delete_flg, add_date)
values ('Ae0001', 'B1234567890', '0', '1', 'User02', 'Name02', 'bbbbbbbbbbb', '0', TO_TIMESTAMP('20191009 12:13:14.567','yyyymmdd hh24:mi:ss.ff3'));
insert into INSPECTION_MEMO(entry_no, policy, target, authority, user_id, user_name, memo, delete_flg, add_date)
values ('Ae0001', 'B1234567890', '1', '1', 'User03', 'Name03', 'ccccccccccc', '0', TO_TIMESTAMP('20191130 12:13:14.567','yyyymmdd hh24:mi:ss.ff3'));