	<%@ page import="com.lxisoft.model.*"%>
	<%@ page import= "com.lxisoft.Domain.*"%>
	<%@ page import="com.lxisoft.servlets.*"%>
	<%@ page import="java.util.*"%>
	<%@ page import="java.util.ResourceBundle"%>
	<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>

	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
	<%@ page isELIgnored="false" %>

		<html >
		<head>
			 <link rel="stylesheet" type="text/css" href="styles.css">
			<fmt:setLocale value="${currentlocale}" />
			<fmt:setBundle basename="messages"/>
			<title> <fmt:message key="label.AddContacts"/> </title>
		</head>
		<body > 
			<!-- <% String locale=(String)session.getAttribute("currentlocale"); %> -->
			<center>
				 <h3><fmt:message key="label.AddContacts"/> </h3>
			</center>
			</br></br> <a href="logout" style="float:right;"><fmt:message key="label.logout"/></a>
			<% Contact contact =(Contact)request.getAttribute("contacts"); 
			if(contact!=null) 
			{ %>
				<button align="left" type="button" onClick="window.location.href = 'View';"><fmt:message key='label.back'/></button>
				<form action="Add" method="">
					<center>
						<input type="text"  name="fname" placeholder= "<fmt:message key='label.fName'/>"></br></br> 
						<input type="text"  name="lname" placeholder= "<fmt:message key='label.lName'/>"></br></br> 
						<input type="text"  name="num" placeholder= "<fmt:message key='label.phno'/>"></br></br>
						<input type="submit" value="<fmt:message key='label.save'/>">
						<input type="reset" value="<fmt:message key='label.reset'/>">
						
					</center>
					<script>
						msg()
						function msg(){
						alert(" <fmt:message key='label.Cexist'/>");}
					</script>
		<% } 
		  else
			{ %>
				<button align="left" type="button" onClick="window.location.href = 'View';">Back</button>
				<form action="Add" method="">
					<center>
						<input type="text"  name="fname" placeholder="<fmt:message key='label.fName'/>"></br></br> 
						<input type="text"  name="lname" placeholder= "<fmt:message key='label.lName'/>"></br></br> 
						<input type="text"  name="num" placeholder= "<fmt:message key='label.phno'/>"></br></br>
						<input type="submit" value="<fmt:message key='label.save'/>">
						<input type="reset" value="<fmt:message key='label.reset'/>">
						
					</center>
		<% } %>
		</body>
</html>