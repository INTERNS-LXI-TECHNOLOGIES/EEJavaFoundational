<!DOCTYPE html>
<html>
<head>
	<style>
		table th,td 
	{	width: 2px;
		border: 2px solid black;

	}
	</style>
	<title>
		
	</title>
</head>

<body style="background: lightgreen">
<%@page import = "com.lxisoft.servet.*"%>
<%@page import = "com.lxisoft.repository.*"%>
<%@page import = "com.lxisoft.sqlrepository.*"%>
<%@page import = "com.lxisoft.model.*,java.util.*"%>
<br><br>
<table align="center" style="border-collapse: collapse;">
	        <tr>
				<th style="font-family: fantasy;font size: 10px">ID</th>
				<th style="font-family: fantasy;font size: 10px">NAME</th>
				<th style="font-family: fantasy;font size: 10px">NUMBER</th>
			</tr>

  <%
    String temp =request.getParameter("temp");
    String temp1 =request.getParameter("temp1");
    String temp2 =request.getParameter("temp2");
    %>
	<tr>
		<td><% out.println(temp);%></td>
		<td><% out.println(temp1);%></td>
		<td><% out.println(temp2);%></td>
	</tr>		
</table>
<center>
	<br><a href="Update.jsp?id=<%=temp%>"> EDIT </a> <br><br>
	<a href="Delete.jsp?id=<%=temp%>"> DELETE </a>
</center>
</body>
</html>