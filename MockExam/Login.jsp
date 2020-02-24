<!DOCTYPE html>
<html>
<head>
	<title>question1</title>
</head>
<body bgcolor="FloralWhite">
<style>
.container {
  height: 700px;
  position: relative;
  border: 5px solid midnightblue;
}

.center {
  margin: 0;
  position: absolute;
  top: 50%;
  left: 50%;
  -ms-transform: translate(-50%, -50%);
  transform: translate(-50%, -50%);
}
.button_css
{
	background-color: midnightblue;
	color: white;
	width: 150px;
	height: 40px;
  border-radius: 12px;
   display: inline-block;
  font-size: 16px;
  text-decoration: none;
}
</style>
<div class="container">
<div class="center">
<p>
<center>
  <h2><b> UserName  <input type="text" name="name"></b></h2>
 <h2><b> Password  <input type="Password" name="Password"></b></h2>
  <input type="submit" class="button_css" name="Login" value="Login" href="">
  <input type="submit" class="button_css" name="cancel" value="cancel" onclick="window.location.href = 'http://localhost:8080/mockExam/AdminUser.jsp';">  

</center>
</p>
</div>
</div>
</div>

</body>
</html>