$(document).ready(function(){
$("#submit").click(function(){
var Username = $("#user").val();
var Password = $("#pass").val();
var dataString ='&Username1='+ user + '&Password1='+ pass;
if(user==''||pass=='')
{
alert("Please Fill All Fields");
}
else
{
$.ajax({
type: "POST",
url: "login.php",
data: dataString,
cache: false,
success: function(result){
alert(result);
}
});
}
return false;
});
});
