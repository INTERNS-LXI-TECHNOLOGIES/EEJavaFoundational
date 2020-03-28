<%@page import="com.lxisoft.servlet.*"%>
<%@page import="com.lxisoft.model.*"%>
<%@page import="com.lxisoft.repository.*"%>
<%@page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
	<title>ViewContacts</title>
</head>
<body>

	<table border="1" width="100%">
		<tr>
			<th>Id</th>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Phone Number</th>
			<th>Change OR Delete</th>
		</tr>
		<%
		ContactDatabase db = new ContactDatabase();
		ArrayList<Contact> contactList = new ArrayList<Contact>();
		contactList = db.viewDatabase(contactList);	%>
	
		<%	for (int i=0;i<contactList.size();i++) 	{%>
		<tr>				
			<td><%out.println(contactList.get(i).getId());%></td>
			<td><%out.println(contactList.get(i).getFirstname());%></td>
			<td><%out.println(contactList.get(i).getLastname());%></td>
			<td><%out.println(contactList.get(i).getNumber());%></td> 
		</tr>	
			<td><a href="edit.jsp?id=<%=contactList.get(i).getId()%>"><button>Edit</button></a></td>
			<td><a href="ContactDelete?id=<%=contactList.get(i).getId()%>"><button>Delete</button></a></td>	
				<%}%>
	</table>

	<a href="index.html"><button>Home</button></a>


</body>
</html>