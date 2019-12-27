<!DOCTYPE html>
<html>
<head>
	<title>add new </title>
</head>
<body>
	<%@ page import="com.lxisoft.Domain.*" %>
	<%@ page import="com.lxisoft.Models.*" %>
	<%@ page import="java.util.*" %>
	
	
	


		<center>	<img src="smiley.gif" alt="Smiley face" width="42" height="42" ></center>
			<form action="createNewContact" method="get"><br><center>
			<input type="text" name="firstname" placeholder="ENTER FIRST NAME"><br><br>
			<input type="text" name="lastname" placeholder="ENTER LAST NAME"><br><br>
			<input type="text" name="number" placeholder="ENTER NUMBER"><br><br>
			<button  type="submit" name="CREATE">create</button></form>
			<button type="button" onClick="window.location.href='viewall';">Back</button></center>
	
		
		
</body>
</html>