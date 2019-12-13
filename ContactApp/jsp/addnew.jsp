
<html>
<head>
	<title>add new </title>
</head>
<body>
	<%@ page import="com.lxisoft.Domain.*" %>
	<%@ page import="com.lxisoft.Models.*" %>
	<%@ page import="java.util.*" %>
	<% Contact contact= (Contact)session.getAttribute("newcontact"); %>
	<% if(contact.getName()==null){ %>
<form action="..\createNewContact" method="get"><br><center>
	<input type="text" name="name" placeholder="ENTER NAME"><br><br>
	<input type="text" name="number" placeholder="ENTER NUMBER"><br><br>
	<button  type="submit" name="CREATE">create</button>
	<button type="button" onClick="window.location.href='../viewall';">Back</button></center>
	<% } %>
</form>
</body>
</html>