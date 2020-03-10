<%@page import="com.lxisoft.config.*"%>
<%@page import="java.io.*"%>
<%@page import="java.util.*"%>
<%@page import="javax.servlet.*"%>
<%@page import="javax.servlet.http.*"%>
<%@ page contentType="text/html;charset=UTF-8"  pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <title>Instructions</title>
	<style>
	.button
	{
		background-color: #4CAF50;
	}
	div
	{
		padding-top: 40px;
		padding-right: 30px;
		padding-left: 80px;
		padding-bottom: 20px;
	}
  </style>
</head>
<font color="white">
<body background="lap.jpeg">
	<%Internationalization international=new Internationalization();
	String language=request.getParameter("language");
	if(language==null)
	{
		language="en";
	}
	String lang= international.localization(language,"IN","MOCK-EXAM");
	session.setAttribute("language",language);%>
</TR>
<tr> 
	<TD>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="?language=en">ENGLISH</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="?language=mal">മലയാളം</a></TD>
</tr>
	
<div>
  <%if (request.isUserInRole("admin"))
    {%>
    <center><a href="Add.jsp"><b><input type="button" class="button" value="+"></b></a><br>
    <form action="search" method="get">
    <br><input type="text" name="letter" placeholder="Search" />
    <input type="submit" value="ok"></center></form><%}%>
	  <h1 align="center"><%=lang%></h1>
</div>
<div>
<h2 align="center"><u>INSTRUCTIONS</u></h2>
<h4>1.Please read and understand the Test instructions so that you will be able to easily navigate through the Test</h4>
<h4>2. Once you click on the 'Start exam' button the actual test time will begin.</h4>
<h4>3. Only one Question will be displayed on the computer screen at a time. To move to the next question,click on "Next"button.</h4>
<h4>4. You can move between the Test sections to attempt the test section of your choice.</h4>
<h4>5. The questions can be answered in any order. Each question carries 1 mark.</h4>
<h4>6. Once you have answered all the questions please click on the 'Submit' button</h4></div></font>
<a href="admin"><center><b><input type="button" class="button" value="Start Exam"></b></center></a>
</body>
</html>