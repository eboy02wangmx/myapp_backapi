delete from mail_chgwk;
-- delete from mail_info;

insert into mail_chgwk values('token1', 'openid', 'policy1', 'old@mail.com', 'new@mail.com', sysdate + 1, '0', current_timestamp, current_timestamp);

commit;