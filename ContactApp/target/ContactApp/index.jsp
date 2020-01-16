<%@ page import="java.util.*"%>
	<%@ page import="java.util.ResourceBundle"%>
	<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>

	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
	<%@ page isELIgnored="false" %>
<html >
		<head>
			<title> Index page of Contact App </title>
			 <link rel="stylesheet" type="css" href="jsp/styles.css">
		</head>	
		<body style="background-color:#d9e6f2"> 
			<fmt:setLocale value="${currentlocale}" />
			<fmt:setBundle basename="messages"/>
			<h3 align="center">CONTACT APPLICATION</h3>
				</br>
					<center><a href="View" ><img src="images/contacts.png" height="150px"; width="140px";></a>
					</center>	
		</body>
</html>