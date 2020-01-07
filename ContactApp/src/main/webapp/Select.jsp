<!DOCTYPE html>
<html>
<head>
	<style>
		table th,td 
	{	width: 60px;
		border: 1px solid black;

	}
	</style>
	<title>
		
	</title>
</head>

<body style="background: lightblue">
<%@page import = "com.lxisoft.servet.*"%>
<%@page import = "com.lxisoft.repository.*"%>
<%@page import = "com.lxisoft.sqlrepository.*"%>
<%@page import = "com.lxisoft.model.*,java.util.*"%>
<br><br>
<table align="center" style="border-collapse: collapse;">
	        <tr>
				<th style="font-family: fantasy;font size: 5px">ID</th>
				<th style="font-family: fantasy;font size: 5px">FIRSTNAME</th>
				<th style="font-family: fantasy;font size: 5px">LASTNAME</th>
				<th style="font-family: fantasy;font size: 5px">NUMBER</th>
			</tr>

  <%
    String temp =request.getParameter("temp");
    String temp1 =request.getParameter("temp1");
    String temp2 =request.getParameter("temp2");
    String temp3 =request.getParameter("temp3");
    %>
    <% session.setAttribute("firstname","temp1");

     %>
	<tr>
		<td><% out.println(temp);%></td>
		<td><% out.println(temp1);%></td>
		<td><% out.println(temp2);%></td>
		<td><% out.println(temp3);%></td>
	</tr>		
</table>
<center>

	<% if (request.isUserInRole("admin")) 
	{ %>
		   	<br><a href="Update.jsp?id=<%=temp%>"> EDIT </a> <br><br>
			<a href="Delete.jsp?id=<%=temp%>"> DELETE </a>
    <%
     } %>
	
</center>
</body>
</html>