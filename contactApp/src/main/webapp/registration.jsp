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
<form action="" method="post">
	Registration<br><br>
	Name<br><br>
	<input type="text" name="name"><br><br>
	Contact number<br><br>
	<input type="text" name="cnumber"><br><br>
	Username<br><br>
	<input type="text" name="uname"><br><br>
	Password<br><br>
	<input type="text" name="password"><br><br>
	<input type="submit" name="submit" value="Submit">
</form>
<a href="login.jsp">login</a>
</body>
</html>