<%@ page import="com.lxisoft.model.Model"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="java.util.*"%>
<%@ page import="java.io.*"%>

<!DOCTYPE html>
<html>
<head>
</head>
<body background="image/earth.jpg">
	<%Integer mark=(Integer)session.getAttribute("count");

	%>
	<h1><font color="#87CEFA"><%out.println("your Mark : "+mark);%></font></h1>
	<center>
	<form action="first.jsp">
		<input type="submit" value="next"></form>
		
</center>

</body>
<%session.invalidate();%>
</html>