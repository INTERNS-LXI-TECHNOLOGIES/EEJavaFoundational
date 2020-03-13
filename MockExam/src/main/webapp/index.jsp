<!DOCTYPE html>
<html>
<title> MockExam </title>
<body bgcolor="OldLace">
  <%session.invalidate();%>
<style>
.container {
  height: 700px;
  position: relative;
  border: 5px solid oldlace;
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
<b><center><font size="7" color="MediumBlue">Mock Exam </font></center>
</b>
<form align = "center" height= "50"%>
<button type="submit" formaction="LoginServlet" class="button">LOGIN</button> 
</form>
</p>
</div>
</div>
</body>
</head>
</html>

  


