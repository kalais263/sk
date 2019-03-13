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
$raw = json_decode(file_get_contents('php://input'),true);
$Username= $raw['user'];
$Password= $raw['pass'];
$result = $conn->query("SELECT * FROM register where username='".$Username."'");
$data = array();
if($result->num_rows > 0)
{
$row = $result->fetch_assoc();
$Password_from_db = $row["password"];
if($Password == $Password_from_db)
{
$token='".$token."' WHERE username='".$Username."'";
$conn->query($sql);
$response = array('status' => 'success', 'msg' => 'Logged in successfully', session_id_key' => $token);
echo json_encode($response);
}
else
{
$response= array('status' => 'Password is not matching');
echo json_encode($response);
}
}
else
{
$response = array('status' => 'Email id is not match');
echo json_encode($response);
}
$conn ->close();
}
