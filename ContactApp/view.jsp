<%@page import="com.lxisoft.servlet.*"%>
<%@page import="com.lxisoft.model.*"%>
<%@page import="com.lxisoft.repository.*"%>
<%@page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
	<title></title>
</head>
<body>
	<h1>Conntact List</h1>
	<table border="1" width="100%">
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Number</th>
			<th>E-Mail</th>
			<th>Actions</th>
		</tr>
		<%
		ContactDatabase db = new ContactDatabase();
		ArrayList<Contact> contactList = new ArrayList<Contact>();
		contactList = db.viewDatabase(contactList);	%>
	
		<%	for (int i=0;i<contactList.size();i++) 	{%>
		<tr>				
			<td><%out.println(contactList.get(i).getId());%></td>
			<td><%out.println(contactList.get(i).getName());%></td>
			<td><%out.println(contactList.get(i).getNumber());%></td>
			<td><%out.println(contactList.get(i).getEmail());%></td> 
		
			<td><a href="edit.jsp?id=<%=contactList.get(i).getId()%>"><button class="button">Edit</button></a>
			<a href="contactDelete?id=<%=contactList.get(i).getId()%>"><button class="button button2">Delete</button></a></td>	
				<%}%></tr>	
	</table>

	<a href="index.html"><button class="button">Home</button></a>

</body>
</html>