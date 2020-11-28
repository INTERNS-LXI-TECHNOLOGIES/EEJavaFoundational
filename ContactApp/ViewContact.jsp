
<%@ page import="java.util.*"%>
<%@ page import="java.io.*"%>
<%@page import="com.lxisoft.modal.Contact,com.lxisoft.repository.AddressBookRepository,java.util.*"%>

<!DOCTYPE html>
<html>
<head>
	<title>View Page</title>
	<link rel="stylesheet" href="Style.css">
</head>
<body>
	<style>
		table, th, td {
  border: 1px solid black;
}
	</style>
	<h2>Contact List</h2>
	<table>
		<tr>
			<th>Name</th>
						<th>Update Name</th>

			<th>Number</th>
						<th>Update No:</th>

			<th>Email</th>
						<th>Update Mail</th>
						<th>Delete Contact</th>

		</tr>

	<%
				AddressBookRepository addressbookrepo=new AddressBookRepository();
				Contact cm=new Contact();


		ArrayList<Contact> contactList=addressbookrepo.read();
		
		for(int i=0;i<contactList.size();i++)
		{ 
	%>
			<tr>
				<td><%out.println(contactList.get(i).getName());%></td>
								<td><a  href="UpdateName.jsp?id=<%out.println(contactList.get(i).getName());%>">Update</a></td>

				<td><%out.println(contactList.get(i).getNumber());%></td>
								<td><a  href="UpdateNumber.jsp?id=<%out.println(contactList.get(i).getNumber());%>">Update</a></td>

				<td><%out.println(contactList.get(i).getEmail());%></td>
								<td><a  href="UpdateEmail.jsp?id=<%out.println(contactList.get(i).getEmail());%>">Update</a></td>

				<td><a href="DeleteContact.jsp?id=<%out.println(contactList.get(i).getName());%>">Delete</a></td>

			</tr>
			</tr>
			<!-- System.out.println(contactList.get(i).getId()+"\t"+contactList.get(i).getName()+"\t"+contactList.get(i).getNumber()); -->
		<% }%>
</table>
<a href="Menu.jsp"><input type="button" value="Go back to menu" name="cancel"/></a>
</body>
</html>