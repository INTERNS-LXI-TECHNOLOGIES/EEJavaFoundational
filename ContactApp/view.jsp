<%@page import="com.lxisoft.servlet.*"%>
<%@page import="com.lxisoft.model.*"%>
<%@page import="com.lxisoft.repository.*"%>
<%@page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
	<title>Contacts</title>
</head>
<body>
	<h1>Contact List</h1>
	<table border="1" width="50%">
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
	
		<%	for (int i=0;i<contactList.size();i++) 	{
		        int id = contactList.get(i).getId();
		        String name = contactList.get(i).getName();
		        String number = contactList.get(i).getNumber();
		        String mail = contactList.get(i).getEmail();
		         %>
		<tr>				
			<td><%out.println(id/*contactList.get(i).getId()*/);%></td>
			<td><%out.println(name/*contactList.get(i).getName()*/);%></td>
			<td><%out.println(number/*contactList.get(i).getNumber()*/);%></td>
			<td><%out.println(mail/*contactList.get(i).getEmail()*/);%></td> 		
			<td><a href="edit.jsp?id=<%=id%> & name=<%=name%> & num =<%=number%> & mail=<%=mail%>"><button class="button">Edit</button></a>
			<a href="contactDelete?name=<%=contactList.get(i).getName()%>"><button class="button button2">Delete</button></a></td>	
			<%}%></tr>	
	</table>
	
	<br>
	<a href="search.html"><button class="button">Search</button></a>
	<br>
	<a href="index.html"><button class="button">Home</button></a>
	<br>
	<a href="add.html"><button class="button">AddContact</button></a>
</body>
</html>