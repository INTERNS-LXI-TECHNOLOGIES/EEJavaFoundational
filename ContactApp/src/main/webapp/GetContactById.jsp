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
	#b1
	{
		margin-left: 150px;
	}
	#b2
	{
		background-color: white;
	    color: black;
	    margin-left: 550px;
	   
	}
	#b3
	{
		background-color: #3CBC8D;
	 	border :none;
	    color: white;
	    height: 10%; 
	    width: 15%;
	}
</style>
</head>
<body style="background-color: grey">
	<table align="center" border="5" width="25%" height="25%">
	<a href="home"><input type="button" id="b2" value="<---"></a>
	<a href="EditContact.jsp"><input type="submit" id="b1" value="Edit"></a><br><br><br>
<%
Contact con=(Contact) request.getAttribute("getContactById");

%>
<font size="15">
<center><img src="user-icon-jpg-12.jpg" width="10%" height="10%"> 
<center><%=(con.getContactFirstName())%></center>
<center><%=(con.getContactLastName())%></center>
<center><%=(con.getContactNumber())%></center>
</font>
<tr>
	<center>
	<br>
	<a href="DeleteContact.jsp"><input type="submit" id="b3" value="Delete Contact">
	</a></center>
</tr>
</table>
</body>
</html>
