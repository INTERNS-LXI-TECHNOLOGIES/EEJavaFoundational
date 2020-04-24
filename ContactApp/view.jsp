<%@page import="com.lxisoft.servlet.*"%>
<%@page import="com.lxisoft.model.*"%>
<%@page import="com.lxisoft.repository.*"%>
<%@page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
	<title>ViewContacts</title>
		<style>
		body{
		 background-color: lightblue;	
		 margin-top:250px;
		 text-align:center;
		}

		h1 {
  			color: black;
  			text-align: center;
  			font-family: verdana;
			}
	.button {
  background-color: #4CAF50;
  border: none;
  color: white;
  padding: 8px 35px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
  margin: 4px 2px;
  cursor: pointer;
}
.button:hover {  background-color: black;}
.button2:hover {  background-color: #f44336;}
.button2 {background-color: #4CAF50;}	
	</style>
</head>
<body>
	<h1>Conntact List</h1>
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
		
			<td><a href="edit.jsp?id=<%=contactList.get(i).getId()%>"><button class="button">Edit</button></a><!-- </td> -->
			<!-- <td> --><a href="contactDelete?id=<%=contactList.get(i).getId()%>"><button class="button button2">Delete</button></a></td>	
				<%}%></tr>	
	</table>

	<a href="index.html"><button class="button">Home</button></a>


</body>
</html>