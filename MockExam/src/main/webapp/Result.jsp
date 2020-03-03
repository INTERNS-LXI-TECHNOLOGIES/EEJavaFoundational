<%@page import="com.lxisoft.Control.*"%>
<%@page import="com.lxisoft.Model.*"%>
<%@page import="java.io.*"%>
<%@page import="java.util.*"%>
<html>
<html>
<head>
	<title>Result</title>
	<h1 align="center">Result</h1>
<body>
<%int m=(int) session.getAttribute("Mark");
out.println(m);%>
</body>
</html>