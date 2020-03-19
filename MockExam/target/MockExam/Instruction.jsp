<%@page import = "com.lxisoft.Config.*"%>
<%@page contentType = "text/html;charset=UTF-8" pageEncoding = "UTF-8"%>
<%@page import="java.io.*"%>
<%@page import="java.util.*"%>
<%@page import="javax.servlet.*"%>
<%@page import="javax.servlet.http.*"%>
<html>
<head>
<title>MockExam</title>
<style>
body {
  background-image: url('instruction.jpg');
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
</head>
<body>
 <%
  Internationalization international = new Internationalization();
  String language = request.getParameter("language");
  session.setAttribute("language",language);
  if(language == null)
  {
    language = "mal";
  } 
  %>
  <a href = "?language=mal">Malayalam</a>
   <a href = "?language=en">English</a>
  <div align="center" style="background-color: mediumseagreen " class = "inset">
    <h1 style="font-size:50px;"> WELCOME TO MOCK EXAM </h1>
  </div>
<div class = "inset">
    <div class="dimbly" align="center">
    <ul>
      <h1 style="font-size:30px;"><%out.println(international.localization(language,"IN","Instructions"));%></h1><br>
    <ol>
 <h2><font color="SlateBlue"><li>Please read instructions so that you will be able to easily navigate through the Test.</li></font> </h2>
 <h2><font color="SlateBlue"><li>Timer start when you click start button.</li></font></h2>
 <h2><font color="SlateBlue"><li>Each Questions having multiple options.</li></font></h2>
 <h2><font color="SlateBlue"><li>Only one Question will be displayed at a time click on "Next"button next question will get.</li></font></h2>
 <h2><font color="SlateBlue"><li>If you answered all the questions please click on the 'Submit' button.</li></font></h2>
</ol>
</div>
  </div><br>
  <div align = "center">  

<form method="get" action="QuestionServlet" value="0">
  <input type = "hidden" name = "count" value ="0">
  <button type="submit" class="button_css"> Start </button>
  <button formaction = "index.jsp" class="button_css">Back</button>
</form>
</div>
</body>
</html>
  