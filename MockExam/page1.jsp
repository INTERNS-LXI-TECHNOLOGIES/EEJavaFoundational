<!DOCTYPE html>
<html>
<head>
	<title>instructions</title>
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
<div class="container">
<div class="center">
<p>
<h1><font color="midnightblue">Read The Instructions Below</font></h1>
<ol>
 <h2><font color="midnightblue"><li>You Have got 10 Minutes to complete the exam</li></font> </h2>
 <h2><font color="MidnightBlue"><li>do not use mobile phone without the permission of invigilator</li></font></h2>
 <h2><font color="MidnightBlue"><li>read the questions carefully and select the answer given below</li></font></h2>
 <h2><font color="MidnightBlue"><li>you can ask as many papers from the invigilator as you wish</li></font></h2>
 <h2><font color="MidnightBlue"><li>any malpractice will lead to debar</li></font></h2>
</ol>
<form>
  <input type="button" class="button_css" onclick="window.location.href = 'http://localhost:8080/mockExam/page0.jsp';" value="NEXT"/>
</form>
    <%
      String name = (String)session.getAttribute("name");
      out.println("sjksjkjskjkjksj" + name);
    %>
</p>
</div>
</div>
</body>
</html>