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
	<center><a href="home"><input type="submit" value="<---"></a></center>
<%
Contact con=(Contact) request.getAttribute("getContactById");

%>
<font size="15">
<center><img src="user-icon-jpg-12.jpg" width="10%" height="10%"> 
<center><%=(con.getContactName())%></center>
<center><%=(con.getContactNumber())%></center>
</font>
<tr>
	<center>
	
	<a href="EditContact.jsp"><input type="submit" value="Edit"></a>
	<a href="DeleteContact.jsp"><input type="submit" value="Delete"></a></center>
</tr>
</table>
</body>
</html>
