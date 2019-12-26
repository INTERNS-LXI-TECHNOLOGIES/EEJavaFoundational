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



<form action="edit"><center>
	<input type="name" name="newName" placeholder="NEW NAME"><br><br>
	<input type="number" name="newNo" placeholder="NEW NUMBER"><br><br>
	
	<input type="submit" name="submit"></center>
</form>
<center><button onclick="window.location.href='viewall';">back</button> </center>



</body>
</html>