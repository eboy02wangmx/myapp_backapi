



<?php

//视频
if(!defined('IN_T')){
	die('hacking attempt');
}
$act = Common::sfilter($_REQUEST['act']);




/* if ($act == 'list') {
	$page = intval($_REQUEST['page']);
	$page = $page<1?1:$page;
	$size =  24;
	$recommend = isset($_REQUEST['recommend']) ? intval($_REQUEST['recommend']) : 1;
	$list = get_video_projects($recommend,$page,$size);
	echo $Json->encode($list);
	exit;
} */

// $tp->assign('videos',get_video_projects($recommend));



$recommend = get_video_projects();
$tp->assign('recommend',$recommend);

$tp->assign('host',$_lang['cdn_host']);
  
//提取视频项目
function get_video_projects(){
	$sql = "select v.id,v.pid,v.rname,v.obj,v.img_path,v.host,v.link,v.createtime,v.music,p.avatar,u.nickname "."from ".$GLOBALS['Base']->table('videobox')." as v ";
	$sql .= "left join".$GLOBALS['Base']->table('user')." as u on v.pid=u.pk_user_main ";  
    $sql .= "left join".$GLOBALS['Base']->table('user_profile')." as p on v.pid=p.pk_user_main ";
	" where v.recommend=1 order by  v.pid desc limit ";

	$res = $GLOBALS['Db']->query($sql);
	return $res;
}



$id = intval($_REQUEST['id']);
$a = $Db->query("select * from ".$Base->table('videobox')." where id=$id","Row");
$tp->assign('a',$a);


?>





