<%@page import="com.lxisoft.domain.*"%>
<%@page import="com.lxisoft.model.*"%>
<%@page import="java.util.*"%>
<%@page import="java.io.*"%>
<html>
<title>CONTACTS </title>
<head>
	<style>
	input[type="submit"]
	{
		background-color: #4CAF50;
	 	border-radius: 40px;
	    color: white;
	  /*  margin-bottom: 100px; */
	}
</style>
</head>
<h1><center>CONTACT LIST</center></h1>
<body>
	<table align="center" border= "5" width="80%" border color= "blue" bgcolor="pink">
		<tr>
			<th>ID</th>
			<th>NAME</th>
		</tr>
<%
List<ContactModel> c=(List<ContactModel>) request.getAttribute("allContact");
for(int i=0;i<c.size();i++)
{
	%>
	<tr>
		<td><%=(c.get(i).getId())%></td>
		<td><%=(c.get(i).getName())%></td>
		</tr>
<%
}
%>
<a href="AddContact.jsp"><input type="submit" name="submit" value="+" /></a>
</table>
</body>
</html>