<?php 
if(!defined('IN_T')){
	die('hacking attempt');
}

$mapList=getList();

function insertList($mapList){
	$myList=array();
	foreach ($mapList as $key => $value) {
		if(strlen($value['lcposition'])>0){
			$arr=$need=getNeedBetween($value['lcposition'], '(' , ')' );
			$arr='['.$arr.']';
			array_push($myList,$arr);
		}
	}
}
function getList(){
	$sql="select lcposition from u_worksmain where lcposition is not null or trim(lcposition) != ''";
	$res = $GLOBALS['Db']->query($sql);
	insertList($res);
}
function getNeedBetween($kw1,$mark1,$mark2){
$kw=$kw1;
$kw='123'.$kw.'123';
$st =stripos($kw,$mark1);
$ed =stripos($kw,$mark2);
if(($st==false||$ed==false)||$st>=$ed)
return 0;
$kw=substr($kw,($st+1),($ed-$st-1));
return $kw;
}


