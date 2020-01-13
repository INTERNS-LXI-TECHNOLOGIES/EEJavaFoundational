<!DOCTYPE html>
<html>
<head>
	<title>edit</title>
</head>
<body>
	<%@ page import="com.lxisoft.Domain.*" %>
<%@ page import="com.lxisoft.Models.*" %>
<%@ page import="com.lxisoft.Repository.*" %>
<%@ page import="java.util.*" %>

<% Contact contact=(Contact) session.getAttribute("users"); %>
<form action="edit"><center>
	<input type="name" name="newFirstName" value="<%=contact.getFirstName()%>" placeholder="NEW FIRST NAME"><br><br>
	<input type="name" name="newLastName" value="<%=contact.getLastName()%>" placeholder="NEW LAST NAME"><br><br>
	<input type="number" name="newNo" value="<%=contact.getNo()%>"placeholder="NEW NUMBER"><br><br>
	
	<input type="submit" name="submit"></center>
</form>
<center><button onclick="window.location.href='viewall';">back</button> </center>



</body>
</html>