<%@page import="com.lxisoft.domain.*"%>
<%@page import="com.lxisoft.repository.*"%>
<%@page import="com.lxisoft.domain.*"%>
<%@page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
	<title>view</title>
</head>
<body>
<form action="<%= request.getContextPath() %>/save" method ="post">
	word:<input type="text" name="word">
	meaning<input type="text" name="meaning">
	<input type="button" name="save">
</form>
</body>
</html>