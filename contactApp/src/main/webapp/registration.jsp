<%@page import="com.lxisoft.contact.model.*"%>
<%@page import="com.lxisoft.contact.controller.*"%>
<%@page import="java.sql.*" %>
<%@page import="java.io.*"%>
<!DOCTYPE html>
<html>
<head>
	<title>Registration page</title>
</head>
<body>
<form action="register" method="post">
	Registration<br><br>
	Username<br><br>
	<input type="text" name="username"><br><br>
	Password<br><br>
	<input type="text" name="password"><br><br>
	<input type="submit" name="submit" value="Submit">
</form>
<a href="index.jsp">login</a>
</body>
</html>