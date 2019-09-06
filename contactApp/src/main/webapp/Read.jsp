<%@page import="com.lxisoft.contact.model.*"%>
<%@page import="com.lxisoft.contact.controller.*"%>
<%@page import="com.lxisoft.contact.repository.*"%>
<%@page import="java.sql.*" %>
<%@page import="java.io.*"%>
<!DOCTYPE html>
<html>
<head>
	<title>ContactApp</title>
</head>
<body>
	<h1>Read</h1>
	<form action="read" method="">
	<input type="hidden" name="page" value="1">	
	<input type="submit" name="submit" value="Data">	
	</form>
	<a href="ViewServlet?page=1">View contacts</a>
	<%
	// out.println(request.getParameter("name"));
	%>
	
</body>
</html>