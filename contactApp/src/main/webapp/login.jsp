<%@page import="com.lxisoft.contact.model.*"%>
<%@page import="com.lxisoft.contact.controller.*"%>
<%@page import="java.sql.*" %>
<%@page import="java.io.*"%>
<!DOCTYPE html>
<html>
<head>
	<title>Login page</title>
</head>
<body>
<form action="index.jsp" method="post">
	Login<br><br>
	Username<br><br>
	<input type="text" name="username"><br><br>
	Password<br><br>
	<input type="text" name="password"><br><br>
	<input type="submit" name="submit" value="Login">
</form>
<a href="registration.jsp">Registration</a>
</body>
</html>