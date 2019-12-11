<html>
		<head>
			<title> VIEW CONTACT </title>
			  <link rel="stylesheet" type="text/css" href="styles.css">
		</head>
		<body > 
			<%@ page import="com.lxisoft.models.*"%>
			<%@ page import="com.lxisoft.servlets.*"%>
			<%@ page import="com.lxisoft.Domain.*"%>
			<%@ page import="com.lxisoft.repository.*"%>
			<%@ page import="java.util.*"%>
			<center>
				 <h3> CONTACT APPLICATION </h3>
			</center>
			<button align="left" type="button" onClick="window.location.href = 'jsp\\ContactAdd.jsp';">+</button>
			<form action="select"><center>
			<input type="text" name="user" placeholder= "Enter Name">
			<button> search here </button></center></form>
			<%
			ArrayList<ContactModel> contactList=( ArrayList<ContactModel>) request.getAttribute("contactmodel");%>
				<% out.println(contactList.size());%>
				<table align="center" border="10px" width="20%">
				<tr><th><strong>NAME</strong></th></tr>
				<% for(ContactModel contactmodel:contactList)
				{ 
					%>
					<tr>
					<!-- <td><% out.println(contactmodel.getName()); %>	 -->
					<td><button class="button" type="button" onClick="window.location.href ='select?user=<%=contactmodel.getName()%>';"><%=contactmodel.getName()%>
						</button></td>
					</tr>

				<%
			} %>
		</table>
		</body>
</html>