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
	 	border-radius :40px;
	    color: white;
	}
</style>
</head>
<h1><center>CONTACT LIST</center></h1>
<body>
	<table align="center" border= "5" width="20%" border color= "blue" bgcolor="pink">
		<tr>
			<th>Contacts</th>
		</tr>
<%
List<ContactModel> c=(List<ContactModel>) request.getAttribute("allContact");
for(int i=0;i<c.size();i++)
{
	%>
	<tr>
		
		<form action= "getContact" method="get">
		<input type="hidden" name="id" value="<%=(c.get(i).getId())%>">
		<td><a href="getContact"><input type="submit" value="<%=(c.get(i).getName())%>"/></a></td>
		</form>
		</tr>
<%
}
%>
<a href="AddContact.jsp"><input type="submit" name="submit" value="+" /></a>
</table>
</body>
</html>