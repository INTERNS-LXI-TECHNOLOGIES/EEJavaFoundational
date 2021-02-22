<%@page import="com.lxisoft.servlet.*"%>
<%@page import="com.lxisoft.model.*"%>
<%@page import="com.lxisoft.repositry.*"%>
<%@page import="java.util.*"%>
<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <title>Contact Application</title>
</head>
<body>
	<%if(request.isUserInRole("admin")){%>
  <link href="style1.css" rel="stylesheet" type ="text/css">
  <div class="testbox">
    <h1><a href="Index.jsp" class="header"> Contact Application</a></h1>
    <h2> by Lxisoft Texhnologies pvt.ltd</h2>
    <form action=SearchContactServlet method="POST">
     <label id="icon" for="name"><i class="icon-envelope "></i></label>
  <input type="text" name="search" id="search" placeholder="Enter First Name to Search " required/>
<input type="submit" value="search" class="searchbutton"/></form>
   <a href="ViewDatabaseServlet" class="button">View Database</a>


</div>
<% }
	else
		{
			response.sendRedirect("WrongAuth.jsp");
		}
%>
</body>

</html>
