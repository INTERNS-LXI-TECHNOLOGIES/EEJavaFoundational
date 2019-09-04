<%@page import="com.lxisoft.contact.* "%>
<%@ page import="java.util.*"%>
<%@ page import="java.io.*"%>
<html>
<head>
	<title>Edit Page</title>
	<link rel="stylesheet" href="Style.css">
</head>
<body>
<h2>Contact List</h2>
<form action="delete" method="post">
		<div class="container">
		<table>
			<tr>
				<!-- <th>Id.</th> -->
				<th>Name</th>
				<th>Contact Number</th>
				<th>Edit</th>
			</tr>

	<%
		String username=(String)session.getAttribute("uname");
		RepoImpl repoImpl=new RepoImpl();
		ArrayList<Contact> contactList=repoImpl.viewContact(username);
		for(int i=0;i<contactList.size();i++)
		{ 
	%>
			<tr>
				<!-- <td><%out.println(contactList.get(i).getId());%></td> -->
				<!-- <td><%out.println(i+1);%></td> -->
				<td><%out.println(contactList.get(i).getName());%></td>
				<td><%out.println(contactList.get(i).getNumber());%></td>
					<%int id=contactList.get(i).getId();%>
				<td>
					<input  type="submit" value="<%=contactList.get(i).getId()%>" name="id">Edit</td>

			</tr>
			<!-- System.out.println(contactList.get(i).getId()+"\t"+contactList.get(i).getName()+"\t"+contactList.get(i).getNumber()); -->
		<% }%>
</table>
	</div></form>
	
	
	<a href="Home.html">Back to Home</a>
</body>
</html>

<!-- <form action="edit" method="post">
		<div class="container">
 
			Enter id for updation:<input type="text" placeholder="Enter id" name="id"></br></br>
			
			New name		:<input type="text" placeholder="Enter New Name" name="Name"></br></br>
			New Contact Number:<input type="text" placeholder="Enter New Number" name="ContactNumber"></br>
			<button type="submit" value="Submit">Submit</button>
			<button type="reset" value="Reset">Reset</button>
		</div>
	</form> --><!-- <!DOCTYPE html>
<html>
<head>
	<title>Delete Contacts</title>
</head>
	<link rel="stylesheet" href="Style.css">
<body>
	<h2>Contact List</h2>
<form action="delete" method="post">
		<div class="container">
		<table>
			<tr>
				<th>Name</th>
				<th>Contact Number</th>
				<th>Delete</th>
			</tr>
		<%
			String username=(String)session.getAttribute("uname");

		</table>
	</div>
</form>
	
</body>
</html>
 -->


<!-- <form action="delete" method="post">
	<h1>Delete Contacts</h1>
	<div class="container">

			Enter id for deletion:<input type="text" placeholder="Enter id" name="id"></br></br>
			
			<button type="submit" value="Submit">Submit</button>
			<button type="reset" value="Reset">Reset</button>
		</div>
	</form> -->


