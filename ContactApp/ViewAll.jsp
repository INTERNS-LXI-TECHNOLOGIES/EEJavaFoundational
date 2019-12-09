<%@page import="com.lxisoft.domain.*"%>
<%@page import="com.lxisoft.model.*"%>
<%@page import="java.util.*"%>
<%@page import="java.io.*"%>
<html>
<title>CONTACTS </title>
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
<a href="AddContact.jsp"><h1 align="center"> + </h1></a>
</table>
</body>
</html>