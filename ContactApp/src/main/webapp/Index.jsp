<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@page import="java.io.IOException,java.io.InputStream,java.util.*,com.lxisoft.config.*"%>
<html>
<head>
<title>CONTACT APP</title>
<body>
	<%
	Localizer l=new Localizer();
	String lang="ml";
	String country="KL";
	String w="contactapp";
	String va=l.getWord(w,lang,country);
	out.println(va);
	%>
<a href="home"><h1><center>CONTACT APP<center></h1></a>
</body>
</head>
</html>