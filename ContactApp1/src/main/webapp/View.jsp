<%@page import="com.lxisoft.contact.* "%>
<%@ page import="java.util.*"%>
<%@ page import="java.io.*"%>
<!DOCTYPE html>
<html>
<head>
	<title>View Page</title>
	<link rel="stylesheet" href="Style.css">
</head>
<body>
	<h2>Contact List</h2>
	<!-- <a href='ViewServlet?page=1'>1</a>
	<a href='ViewServlet?page=2'>2</a>
	<a href='ViewServlet?page=3'>3</a> -->
	<form action="viewall" method="get">
		<button type="submit" value="1" name="page">1</button>
		<button type="submit" value="2" name="page">2</button>
	</form>

	<table>
		<tr>
			<th>Id.</th>
			<th>Name</th>
			<th>Contact Number</th>
		</tr>

	<%
		
		RepoImpl repoImpl=new RepoImpl();
		ArrayList<Contact> contactList=(ArrayList<Contact>)session.getAttribute("list");
		
		for(int i=0;i<contactList.size();i++)
		{ 
	%>
			<tr>
				<td><%out.println(contactList.get(i).getId());%></td>
				<!-- <td><%out.println(i+1);%></td> -->
				<td><%out.println(contactList.get(i).getName());%></td>
				<td><%out.println(contactList.get(i).getNumber());%></td>
			</tr>
			<!-- System.out.println(contactList.get(i).getId()+"\t"+contactList.get(i).getName()+"\t"+contactList.get(i).getNumber()); -->
		<% }%>
</table>
	
<a href='ViewServlet?page=1'>1</a>
<a href='ViewServlet?page=2'>2</a>
<a href='ViewServlet?page=3'>3</a>

<a href="Home.jsp">Back to Home</a>

</body>
</html>
 
