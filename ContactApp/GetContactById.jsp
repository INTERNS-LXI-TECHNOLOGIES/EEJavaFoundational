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
		width: 25%%;
		background-color: #f1f1c1;
	}
</style>
</head>
<body>
	<table align="center" border="5" width="25%" height="25%">
<%
Contact con=(Contact) request.getAttribute("getContactById");
%>
<tr>
	<td><center><%=(con.getContactName())%></center></td>
</tr>
<tr>
	<td><center><%=(con.getContactNumber())%></center></td>
</tr>
<a href="home"><input type="submit" value="Back"></a></td>
</body>
</html>