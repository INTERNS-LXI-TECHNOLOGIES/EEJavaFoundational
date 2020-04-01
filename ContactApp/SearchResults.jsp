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
	<style type="text/css">
		html,body{
			padding: 5px;margin: 10px;
			background:#009b77;
		}
	</style>
</head>
<body>
	<h3 style="text-align: center;" >CONTACT APP</h3>
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
	<a href="index.jsp"><button value="homebtn" style="background-color: #008cba; padding-top: 20px;
	border-radius: 10px; float: right; height: 40px; width: 70px; margin: 15px auto; padding:0;  text-align: center;">Home</button></a>
</body>
</html>