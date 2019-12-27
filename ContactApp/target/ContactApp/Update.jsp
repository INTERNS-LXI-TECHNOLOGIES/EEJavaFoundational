<!DOCTYPE html>
<html>
<head>
	<title>
		
		
	</title>
</head>
<body style="background:  lightblue">
  
<%@page import = "com.lxisoft.servlet.*"%>
<%@page import = "com.lxisoft.repository.*"%>
<%@page import = "com.lxisoft.sqlrepository.*"%>
<%@page import = "com.lxisoft.model.*,java.util.*"%>
<form action="Update" method="get">
	<center>
	ENTER FIRSTNAME : <input type="text" name="firstname"><br><br>
	ENTER LASTNAME : <input type="text" name="lastname"><br><br>
	ENTER NUMBER : <input type="text" name="number"><br><br>
	<% String id= request.getParameter("id");%>
	 <input type="hidden" name="id" value="<%=id%>">
	<input type="submit" value="submit">
	</center>
</form>
</body>
</html>