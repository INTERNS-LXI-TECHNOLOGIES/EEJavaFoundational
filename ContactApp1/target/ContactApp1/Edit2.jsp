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
	<form action="edit" method="post">
		<div class="container">
		<%
			int id=req.getParameter("id");
			System.out.println("ID::"+id);
			ArrayList<Contact> contactList=repoImpl.viewContact(username);
			for(int i=0;i<contactList.size();i++)
			{
				int k=contactList.get(i).getId();
				if(id==k)
				{%>
					New name		:<input type="text" placeholder="Enter New Name" name="Name"></br></br>
					New Contact Number:<input type="text" placeholder="Enter New Number" name="ContactNumber"></br>
					<button type="submit" value="Submit">Submit</button>
					<button type="reset" value="Reset">Reset</button>
					<%} %>
		
			
		</div>
	</form>
	<a href="Home.html">Back to Home</a>
</body>
</html>

