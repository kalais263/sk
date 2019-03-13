<?php
require('../../admin/register.php');
$db=mysql_connect($host, $username, $password) or die('could not connect');
mysql_select_db($db_name, $db) or die('');
$result = mysql_query("SELECT * FROM REGISTER") or die('could not query');
$json = array();
if(mysql_num_rows($result))
{
$row = mysql_fetch_assoc($result);
while($row = mysql_fetch_row($result))
{
$test_data[]=$row;
}
$json['testdata']=$test_data;
}
mysql_close($db);
echo json_encode($json);
?>
