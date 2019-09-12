<?php
//720环物
if(!defined('IN_T')){
	die('hacking attempt');
}

$act = Common::sfilter($_REQUEST['act']);
if ($act == 'list') {
	$page = intval($_REQUEST['page']);
	$page = $page<1?1:$page;
	$size =  27;
	$list = get_ring_projects($page,$size);
	echo $Json->encode($list);
	exit;
}else{
	
}
$tp->assign('host',$_lang['cdn_host']);

//提取图片项目
function get_ring_projects($page,$size){
	$sql = "select v.id,v.pid,v.rname,v.obj,v.img_path,v.host,v.link,v.createtime,v.praised_num,v.browsing_num,v.music,p.avatar,u.nickname "."from ".$GLOBALS['Base']->table('videobox')." as v ";
	$sql .= "left join".$GLOBALS['Base']->table('user')." as u on v.pid=u.pk_user_main ";  
    $sql .= "left join".$GLOBALS['Base']->table('user_profile')." as p on v.pid=p.pk_user_main ";
	" where v.recommend=1 order by  v.pid desc limit ";

	$res = $GLOBALS['Db']->query($sql);
	return $res;
	
}



?>