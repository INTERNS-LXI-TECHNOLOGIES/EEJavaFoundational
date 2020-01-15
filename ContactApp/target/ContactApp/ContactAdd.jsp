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
			<title> ADD CONTACT </title>
		</head>
		<body > 
			<!-- <% String locale=(String)session.getAttribute("currentlocale"); %> -->
			<fmt:setLocale value="${currentlocale}" />
			<fmt:setBundle basename="messages"/>
			<center>
				 <h3> TO ADD CONTACT </h3>
			</center>
			</br></br> <a href="logout" style="float:right;"><fmt:message key="label.logout"/></a>
			<% Contact contact =(Contact)request.getAttribute("contacts"); 
			if(contact!=null) 
			{ %>
				<button align="left" type="button" onClick="window.location.href = 'View';">Back</button>
				<form action="Add" method="">
					<center>
						<input type="text"  name="fname" placeholder= "<fmt:message key='label.Entername'/>"></br></br> 
						<input type="text"  name="lname" placeholder= "enter last name"></br></br> 
						<input type="text"  name="num" placeholder= "phone number"></br></br>
						<input type="submit" value="save">
						<input type="reset" value="reset">
						<% out.println(locale); %>
					</center>
					<script>
						msg()
						function msg(){
						alert(" same contact Name found choose another");}
					</script>
		<% } 
		  else
			{ %>
				<button align="left" type="button" onClick="window.location.href = 'View';">Back</button>
				<form action="Add" method="">
					<center>
						<input type="text"  name="fname" placeholder="<fmt:message key='label.Entername'/>"></br></br> 
						<input type="text"  name="lname" placeholder= "enter last name"></br></br> 
						<input type="text"  name="num" placeholder= "phone number"></br></br>
						<input type="submit" value="save">
						<input type="reset" value="reset">
						<% out.println(locale); %>
					</center>
		<% } %>
		</body>
</html>