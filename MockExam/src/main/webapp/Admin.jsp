<!DOCTYPE html>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
<%@page import = "com.lxisoft.Config.*"%>
<%@page contentType = "text/html;charset=UTF-8" pageEncoding = "UTF-8"%>
<%@page import="java.io.*"%>
<%@page import="java.util.*"%>
<html>
<body bgcolor="OldLace">
<style>
body {
  background-image: url('Admin1.jpg');
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
<div>
<form>
<center><h1>ADMIN</h1>	
<button formaction="View.jsp" class="button_css"><%out.println(international.localization(language,"IN","View"));%></button>
<button formaction="Add.jsp" class="button_css"><%out.println(international.localization(language,"IN","Add"));%></button>
<button formaction="Update.jsp"  class="button_css"><%out.println(international.localization(language,"IN","Update"));%></button>
<button formaction="Delete.jsp" class="button_css"><%out.println(international.localization(language,"IN","Delete"));%></button>
<button formaction ="index.jsp" class="button_css"><%out.println(international.localization(language,"IN","Back"));%></button> 
</center>
</form>
</div>
</body>
</html>
