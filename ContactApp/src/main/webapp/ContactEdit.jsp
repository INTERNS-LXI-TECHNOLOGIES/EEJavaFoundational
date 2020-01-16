<%@ page import="com.lxisoft.model.*"%>
<%@ page import="com.lxisoft.Domain.*"%>
<%@ page import="com.lxisoft.servlets.*"%>
<%@ page import="java.util.*"%>
	<%@ page import="java.util.ResourceBundle"%>
	<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>

	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
	<%@ page isELIgnored="false" %>
<html>
		<head>
			<fmt:setLocale value="${currentlocale}" />
			<fmt:setBundle basename="messages"/>
			<title> <fmt:message key="label.Editcntct"/> </title>
			 <link rel="stylesheet" type="text/css" href="styles.css">
		</head>
		<body > 
			<center>
				 <h3> <fmt:message key="label.Editcntct"/></h3>
			</center>
			</br></br> <a href="logout" style="float:right;"><fmt:message key="label.logout"/></a>
			</br>
			<% Contact contact=(Contact)session.getAttribute("currentcontact");	%>
			<form action="edit">
				<center>
					<input type="text"  name="fname"  value="<%=contact.getFirstName()%>" ></br></br> 
					<input type="text"  name="lname" value="<%=contact.getLastName()%>" ></br></br> 
					<input type="text"  name="num" value="<%=contact.getNo()%>" ></br></br>
					<input type="submit" value="<fmt:message key='label.save'/>">
					<input type="reset" value="<fmt:message key='label.reset'/>">
					<button align="left" type="button" onClick="window.location.href ='View';"><fmt:message key='label.back'/></button>
				</center>
		</body>
</html>