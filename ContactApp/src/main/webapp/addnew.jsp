<!DOCTYPE html>
<html>
<head>
	<title>add new </title>
</head>
<body>
	<%@ page language="java" contentType="text/html" pageEncoding="UTF-8"%>
	<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
	<%@ page import="com.lxisoft.Domain.*" %>
	<%@ page import="com.lxisoft.Models.*" %>
	<%@ page import="java.util.*" %>
	
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page isELIgnored="false"%>

<fmt:setLocale value="${lang}"/>
<fmt:setBundle basename="messages" />
 
<html lang="${lang}">
	<% String name=(String) request.getAttribute("newcontacts"); 
		if(name!=null)
		{
	
		%>
		<script type="text/javascript">
			msg()
			function msg()
			{
				alert("<fmt:message key='label.Cexist' />");
			
			}			
		</script>			
		<% }
	%>


		<center>	<img src="smiley.gif" alt="Smiley face" width="42" height="42" ></center>
			<form action="createNewContact" method="get"><br><center>
			<input type="text" name="firstname" placeholder="<fmt:message key='label.fName' />"><br><br>
			<input type="text" name="lastname" placeholder="<fmt:message key='label.lName' />"><br><br>
			<input type="text" name="number" placeholder="<fmt:message key='label.phno' />"><br><br>
			<button  type="submit" name="CREATE"><fmt:message key='label.submit' /></button></form>
			<button type="button" onClick="window.location.href='viewall';"><fmt:message key='label.back' /></button></center>
	
		
		
</body>
</html>