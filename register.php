<?php
$servername = "localhost";
$username = "";
$password = "";
$dbname = "person";
$conn = new mysqli($servername, $username, $password, $dbname);
if($conn -> connect_error) 
{
die("connection failed");
}
if($_SERVER["REQUEST_METHOD"] =="POST")
{
$raw =json_decode(file_get_contents('php://input'), true);
$Email= $raw['email'];
$Username= filter_var($raw['user'], FILTER_SANITIZE_STRING);
$Password= filter_var($raw['pass'], FILTER_SANITIZE_STRING);
$Degree= filter_var($raw['degree'], FILTER_SANITIZE_STRING);
$Department= filter_var($raw['dept'], FILTER_SANITIZE_STRING);
$College_name= filter_var($raw['college'], FILTER_SANITIZE_STRING);
$Mobile_number= filter_var($raw['mobile'], FILTER_SANITIZE_STRING);
if(!filter_var($Email, FILTER_VALIDATE_EMAIL) === false)
{
if($Username != "" && $Username !="") &&($Password != "" && $Password != "") && ($Degree != "" && $Degree != "") &&
($Department != "" && $Department !="") && ($College_name !="" && $College_name !="") && ($Mobile_number !="" && $Mobile_number !=""))
{
$sql = "INSERT INTO register (email, username, password, degree, department, college_name, mobile_number) VALUES ('$Email', '$Username',
'$Password', '$Degree', '$Department', '$College_name', '$Mobile_number')";
if($conn->query($sql) === TRUE)
{
$array_data = array('email' => $Email, 'username' => $Username, 'password' => $Password, 'degree' => $Degree, 'department' => $Department,
'college_name' => $College_name, 'mobile_number' => $Mobile_number);
$myfile = fopen("" .$Email.".json", "w") or die("unable to open file");
$txt = json_encode($array_data, JSON_PRETTY_PRINT);
fwrite($myfile, $txt);
fclose($myfile);
$response = array('status' => 'success', 'msg' => 'Register successfully');
echo json_encode($response);
}
else
{
$response = array('status' => "Error: ".$sql ."<br>".$conn->error);
echo json_encode($response);
}
}
else{
$response = array('status' => 'kindly input all the data');
echo json_decode($response);
}
}
else 
{
$response = array('status' => 'Email Id is Invalid');
echo json_encode($response);
}
$conn ->close();
}
?>
