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
.button1_css
{
	background-color: midnightblue;
	color: white;
	width: 150px;
	height: 40px;
}
.button2_css
{
	background-color: midnightblue;
	color: white;
	width: 150px;
	height: 40px;
}
</style>
<div class="container">
<div class="center">
<p>
<form>
<center>
Name<input type="text" name="username">
</center>
  <input type="button" class="button1_css" onclick="window.location.href = 'http://localhost:8080/mockExam/welcome.jsp';" value="Back"/>
   <input type="button" class="button1_css" onclick="window.location.href = 'http://localhost:8080/mockExam/page1.jsp';"  value="NEXT" />
</form>
</p>
</div>
</div>

</body>
</html>