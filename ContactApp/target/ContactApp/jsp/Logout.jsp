<%@page import="com.lxisoft.controller.*"%>
<%@page import="com.lxisoft.domain.*"%>
<%@page import="com.lxisoft.model.*"%>
<%@page import="com.lxisoft.repository.*"%>
<%@page import="java.util.*"%>

<html>
<head>
<title>Logout</title>
</head>
<body>
<p>You have been successfully logout</p>
<% session.invalidate(); 
response.SendRedirect();%>
<!-- <a href="<%=request.getContextPath()%>/showAll" style="color: black">skip for now</a> --></body>
</html>