<!DOCTYPE html>
<html>
<title> MockExam </title>
<body bgcolor="OldLace">
  <%session.invalidate();%>
<style>
body {
  background-image: url('login1.jpg');
  background-repeat: no-repeat;
  background-attachment: fixed;
  background-size: cover;
}
.container {
  height: 700px;
  position: relative;
  border: 5px solid oldlace;
}
.center {
  margin: 0;
  position: absolute;
  top: 25%;
  left: 30%;
  -ms-transform: translate(-30%, -30%);
  transform: translate(-20%, -20%);
}
.button_css
{
  background-color: midnightblue;
  color: white;
  width: 150px;
  height: 40px;
}
</style>
</style>
<div class="container">
<div class="center">
<p align="center">
<b><center><font size="10" color="Black">Mock Exam </font></center>
</b>
<form align = "center" height= "50"%>
<button type="submit" formaction="LoginServlet" class="button">LOGIN</button> 
<button formaction="Register.jsp" class="button">REGISTER</button>
</form>
</p>
</div>
</div>
</body>
</head>
</html>

  


