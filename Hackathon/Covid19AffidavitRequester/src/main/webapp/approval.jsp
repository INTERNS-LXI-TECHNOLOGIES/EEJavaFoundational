<%@	 page import="com.sanfar.model.Model"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="java.util.*"%>
<%@ page import="java.io.*"%>
<%@page import = "com.sanfar.config.*"%>
<%@page contentType = "text/html;charset=UTF-8" pageEncoding = "UTF-8"%>
<!DOCTYPE html>
<html>
<head>
</head>
<body background="image/earth.jpg">

	<% <%Model app=(Model)session.getAttribute("App");%>


	<center>
	<h1><font color="#87CEFA"><%=yourmark %>:<%out.println(mark);%></font></h1>
	
	<form action="first.jsp">

<%
	 if(mark >=3)
	 {
	 	%>
	 	<h1><%=congrates%>....</h1>
	 	<h1><%=exam%><%=passed%></h1>
	 	<%mark=0;%>
	 <%
	 }
	 else
	 {
	 	%>

	 	<h1>!! <%=sorry%> !!</h1><br>
	 	<h1><%=exam %><%=fail%></h1>
	 	<%mark=0;%>
	 <%
	 }
	 %>

		<input type="submit" value="next"></form>
		
</center>

</body>
<%session.invalidate();%>
</html>