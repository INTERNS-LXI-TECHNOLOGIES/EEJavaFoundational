<%@page import="com.lxisoft.domain.*"%>
<%@page import="com.lxisoft.repository.*"%>
<%@page import="com.lxisoft.domain.*"%>
<%@page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
	<title>Add </title>
</head>
<body>
<form action="<%= request.getContextPath() %>/save">
	word:<input type="text" name="word">&nbsp;&nbsp;&nbsp;&nbsp;
	meaning<input type="text" name="meaning">
	<input type="submit" name="save" value="save">
</form>
</body>
</html>