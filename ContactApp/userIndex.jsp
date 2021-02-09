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
	<%if(request.isUserinRole("admin")){%>
	<link href="style1.css" rel="stylesheet" type ="text/css">
	<div class="testbox">
		<h1> Contact Application</h1>
		<h2> by Lxisoft Technologies pvt.ltd</h2>
		<p class="credits">Welcome User </p>
		<a href="ViewDatabaseServlet" class="button">View Database</a>
		<%}
		else
		{
			response.sendRedirect("Wronguser.jsp");
		}
%>
    
</body>
</html>