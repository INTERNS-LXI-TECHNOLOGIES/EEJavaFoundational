<%@page import="com.lxisoft.model.*"%>
<%@page import="com.lxisoft.repository.*"%>
<%@page import="com.lxisoft.servlet.*"%>
<%@page import="javax.servlet.http.*"%>
<%@page import="javax.servlet.*"%>
<%@page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
	<title>Search Results</title>
</head>
<body>
	<table border="1" width="100%">
		<tr>
			<th>ID</th>
			<th>FIRST NAME</th>
			<th>LAST NAME</th>
			<th>PHONE NUMBER</th>
		</tr>
		<% 
		    ArrayList<Contact> searchList = new ArrayList<Contact>();
		  	searchList = (ArrayList<Contact>)request.getAttribute("searchList");
		   	
		 %>
		 <%for (int i=0;i<searchList.size();i++) 
		 {%>
		<tr>
			<td><%out.println(searchList.get(i).getId());%></td>
			<td><%out.println(searchList.get(i).getFirstName());%></td>
			<td><%out.println(searchList.get(i).getLastName());%></td>
			<td><%out.println(searchList.get(i).getPhoneNum());%></td>
		</tr>
		<%}%>
	</table>
	<a href="index.html"><button value="homebtn">Home</button></a>
</body>
</html>