<%@ page import="java.util.*"%>
	<%@ page import="java.util.ResourceBundle"%>
	<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>

	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
	<%@ page isELIgnored="false" %>
<html>
		<head>
			<title> Login Error page </title>
			 <link rel="stylesheet" type="css" href="jsp/styles.css">
		</head>	
		<body style="background-color:#d9e6f2"> 
		<fmt:setLocale value="${currentlocale}" />
		<fmt:setBundle basename="messages"/>
		<h5 align="center">Access Denied! Entered username or password incorrect Login Again!</h5>
				</br>
				<center><a href="Login.jsp">Login</a></center>
		</body>
</html>