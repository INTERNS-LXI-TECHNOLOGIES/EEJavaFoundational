<!DOCTYPE html>
<html>
<head>
	<title>user</title>
</head>
<body bgcolor="#EBCFDA">
<%@ page import="com.lxisoft.Domain.*" %>
<%@ page import="com.lxisoft.Models.*" %>
<%@ page import="java.util.*" %>


<% Contact contact=(Contact) session.getAttribute("users"); %>
 

<table class="table" border="2" align="CENTER" width="20%">
	<tr><th>ID</th><th>NAME</th><th>NUMBER</th></tr>
	<tr><td><%=contact.getId() %></td>
		<td><%=contact.getFullName() %> </td>
		<td><%=contact.getNo() %> </td>
		<td><a href="edit.jsp">edit</td>
		<td><a href="delete">delete</td>
		<td><a href="viewall">back</td>
	</tr>


	</table>
</body>
</html>