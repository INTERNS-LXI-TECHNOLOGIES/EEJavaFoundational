<%@page import="com.lxisoft.contact.model.*"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page import="com.lxisoft.contact.controller.*"%>
<%@page import="java.sql.*" %>
<%@page import="java.io.*"%>
<%@page import="java.util.Locale"%>
<%@page import="java.util.ResourceBundle"%> 
<!DOCTYPE html>
<html>
<head>
	<title>Login page</title>
</head>
<body>
	<%
     Object msg = request.getAttribute("errorMsg");
        if(msg != null ){
           out.println(msg);
        }
        ResourceBundle bundle = ResourceBundle.getBundle("HindiBundle", Locale.IN);  
     %>
<form action="login" method="post">
	<%System.out.println(bundle.getString("Login")); %><br><br>
	<%System.out.println(bundle.getString("Username")); %><br><br>
	<input type="text" name="username"><br><br>
	<%System.out.println(bundle.getString("Password")); %><br><br>
	<input type="password" name="password"><br><br>
	<input type="submit" name="submit" value="Login"><br><br>
</form>
<form action="loginm.jsp" method="post">
	<input type="submit" name="submit1" value="മലയാളം">
</form>
<form action="index.jsp" method="post">
<input type="submit" name="submit2" value="English">
</form>
<a href="registration.jsp">Registration</a>
</body>
</html>