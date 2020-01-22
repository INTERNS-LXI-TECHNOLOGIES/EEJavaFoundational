<%@ page import="java.util.*"%>
	<%@ page import="java.util.ResourceBundle"%>
	<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>

	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
	<%@ page isELIgnored="false" %>
<html>
		<head>
			<title> Index page of Contact App </title>
			 <link rel="stylesheet" type="css" href="jsp/styles.css">
		</head>	
		<body style="background-color:#d9e6f2"> 
			<fmt:setLocale value="${currentlocale}" />
			<fmt:setBundle basename="messages"/>
			<h3 align="center">User Login </h3>
				</br>
					<div>
						<form action="j_security_check" method="GET"><center>
							<input type="text"  name="j_username" placeholder= "username"></br></br> 
							<input type="password"  name="j_password" placeholder= "password"></br></br> 
							<input type="submit" value="Login">
							<input type="reset" value="reset"></br></br>
						</form>
							<a href="j_security_check?j_username=guest&j_password=guest">skip</a></center>
					</div>
		</body>
</html>