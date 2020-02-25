<!DOCTYPE html>
<html>
<head>
	<title>sample project</title>
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
	background-color:midnightblue ;
	color:white ;
  background-repeat:no-repeat;
	width: 150px;
	height: 40px;
}
</style>
<div class="container">
<div class="center">
<p align="center">
<b><font size="7" color="midnightblue">Welcome TO Your Mock Exam </font>
</b>
<form>
<input type="button" class="button_css" onclick="window.location.href = 'http://localhost:8080/mockExam/page0.jsp';" value="START"/>
<input type="button" class="button_css" onclick="window.location.href = 'http://localhost:8080/mockExam/AdminUser.jsp';" value="Back"/>
</form>
</p>
</div>
</div>
</body>
</html>