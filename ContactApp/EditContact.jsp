<%@page import="com.lxisoft.domain.*"%>
<%@page import="com.lxisoft.model.*"%>
<%@page import="javax.servlet.http.*"%>
<%@page import="javax.servlet.*"%>
<!DOCTYPE html>
<html>
<head>
	<title>Edit Contact</title>
</head>
<body>
<table align="center" border="5" width="25%" height="25%">
		<caption><h1><center>Edit Contact</center></h1></caption>
		<%
		Contact c=(Contact)session.getAttribute("cont");
		%>
		<form action= "editContact" method="post">
			<input type="hidden" name="id" value="<%=(c.getContactId())%>">
			<tr>
				<td><input type="text" name="name" placeholder="name" /></td>
			</tr>
			<tr>
				<td><input type="text" name="number" placeholder="number" /></td>
			</tr>			
			<tr>
				<td><a href="editContact"><input type="submit" value="Save"/></a>
		</form>
		<form action= "getContact" method="get">
		<input type="hidden" name="crud" value="2"/>
		<a href="getContact">
			<input type="hidden" name="id" value="<%=(c.getContactId())%>"/>
			<input type="submit" value="Cancel"/></a></td>
		</form>
			</tr>
</body>
</html>