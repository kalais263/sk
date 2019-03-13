$(document).ready(function(){
$("#submit").click(function(){
var Email = $("#mail").val();
var Username = $("#user").val();
var Password = $("#pass").val();
var Degree = $("#degree").val();
var Department = $("#dept").val();
var College_name = $("#college").val();
var Mobile_number = $("#mobile").val();
var dataString = '$Email1='+ mail + '&Username1='+ user + '&Password1='+ pass + '&Degree1='+ degree + '$Department1='+ dept + '$College_name='+ college + '$Mobile_number='+ mobile;
if(mail==''||user==''||pass==''||degree==''||dept==''||college==''||mobile=='')
{
alert("Please Fill All Fields");
}
else
{
$.ajax({
type: "POST",
url: "register.php",
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
