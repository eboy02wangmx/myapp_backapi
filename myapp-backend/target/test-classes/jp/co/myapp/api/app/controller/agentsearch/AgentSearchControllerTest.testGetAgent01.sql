truncate table BV_OL_ACCESS_TBL;
truncate table DAIRITEN;

INSERT INTO BV_OL_ACCESS_TBL （GROUP_CD，DAIRITEN_CD） VALUES ('1','1000001');
INSERT INTO BV_OL_ACCESS_TBL （GROUP_CD，DAIRITEN_CD） VALUES ('2','1000001');
INSERT INTO BV_OL_ACCESS_TBL （GROUP_CD，DAIRITEN_CD） VALUES ('3','1000001');
INSERT INTO BV_OL_ACCESS_TBL （GROUP_CD，DAIRITEN_CD） VALUES ('4','1000002');


INSERT INTO DAIRITEN （DAIRITEN_CD，DAIRI_MEI_K,DAIRI_MEI) VALUES ('1000001','tang01','アイウエオ');