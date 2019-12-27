<!DOCTYPE html>
<html>
<head>
	<title>
		
	</title>
</head>
<body style="background: lightyellow">
   
<%@page import = "com.lxisoft.servlet.*"%>
<%@page import = "com.lxisoft.repository.*"%>
<%@page import = "com.lxisoft.sqlrepository.*"%>
<%@page import = "com.lxisoft.model.*,java.util.*"%>
<form action="Add" method="get">
	<center>
	ENTER FIRST NAME : <input type="text" name="firstname"><br><br>
	ENTER LAST NAME : <input type="text" name="lastname"><br><br>
	ENTER NUMBER : <input type="text" name="number"><br><br>
	<input type="submit" value="submit">
	</center>
</form>
</body>
</html>