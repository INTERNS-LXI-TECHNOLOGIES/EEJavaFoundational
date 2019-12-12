<%@page import="com.lxisoft.domain.*"%>
<%@page import="java.util.*"%>
<%@page import="java.io.*"%>
<!DOCTYPE html>
<html>
<head>
	<title>getContact</title>
	<style>
	table,th,td{
		border: 1px solid black;
		border-collapse: collapse;
	}
	th,td{
		padding: 15px;
	}
	table{
		width: 25%;
		background-color: #f1f1c1;

	}
</style>
</head>
<body style="background-color: grey">
	<table align="center" border="5" width="25%" height="25%">
<%
Contact con=(Contact) request.getAttribute("getContactById");
// Contact c=(Contact)session.getAttribute("cont");
%>
<font size="15">
<center><%=(con.getContactName())%></center>
<center><%=(con.getContactNumber())%></center>
</font>
<tr>
	<td><a href="home"><input type="submit" value="Back"></a></td>
	<td><a href="EditContact.jsp"><input type="submit" value="Edit"></a>
		<a href="DeleteContact.jsp"><input type="submit" value="Delete"></td>
</tr>
</body>
</html>