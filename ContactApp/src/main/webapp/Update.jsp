<!DOCTYPE html>
<html>
<head>
	<title>
		
		
	</title>
</head>
<body style="background: lightblue">
  
<%@page import = "com.lxisoft.servlet.*"%>
<%@page import = "com.lxisoft.repository.*"%>
<%@page import = "com.lxisoft.sqlrepository.*"%>
<%@page import = "com.lxisoft.model.*,java.util.*"%>
<form action="Update" method="get">
	<center>
	ENTER NEW NAME : <input type="text" name="name"><br><br>
	ENTER NEW NUMBER : <input type="text" name="number"><br><br>
	<% String id= request.getParameter("id");%>
	 <input type="hidden" name="id" value="<%=id%>">
	<input type="submit" value="submit">
	</center>
</form>
</body>
</html>