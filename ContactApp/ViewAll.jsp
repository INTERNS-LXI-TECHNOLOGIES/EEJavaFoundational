<%@page import="com.lxisoft.Domain.*"%>
<%@page import="com.lxisoft.Model.*"%>
<%@page import="java.util.*"%>
<%@page import="java.io.*"%>
<html>
<title>CONTACTS </title>
<head>
</head>
<h1><center>CONTACT LIST</center></h1>
<body>
	<table align="center" border= "10" width="20%" border color= "red" bgcolor="black">
		<tr>
			<th>Contacts</th>
		</tr>
<%ArrayList<Contact> c =(ArrayList<Contact>)session.getAttribute("contact");
for(int i=0;i<c.size();i++)
{
%>
	<tr>
		 <td><%=(c.get(i).getId())%> </td>
		 <td><%=(c.get(i).getName())%> </td>
		  <td><%=(c.get(i).getNumber())%> </td>
	</tr>
<%
}
%>
</table>
</body>
</html>