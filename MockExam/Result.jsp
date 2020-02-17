<%@page import="com.lxisoft.controllers.*"%>
<%@page import="com.lxisoft.models.*"%>
<%@page import="java.io.*"%>
<%@page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
	<title>Result</title>
</head>
<body>
<h1>Result</h1>
<%
int m=(int) session.getAttribute("mark");
out.println(m);
%>
</body>
</html>