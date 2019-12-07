<%@ page import="com.lxisoft.models.*"%>
<%@ page import="com.lxisoft.servlets.*"%>
<%@ page import="com.lxisoft.Domain.*"%>
<%@ page import="com.lxisoft.repository.*"%>
<%@ page import="java.util.*"%>
<html>
		<head>
			<title> VIEW CONTACT </title>
		</head>
		<body > 
			
			<center>
				 <h3> TO VIEW CONTACT </h3>
			</center>
			<button align="left" type="button" onClick="window.location.href = 'jsp\\ContactAdd.jsp';">+</button>
			<table align="center" border="10px" width="50%">
			<tr>
					<th>ID</th>
					<th>NAME</th>
					<th>NUMBER</th>
			</tr>
			<%
			ArrayList<Contact> contactList=(ArrayList<Contact>) request.getAttribute("contacts");
			for(Contact contact:contactList)
				// out.println("hi");
			{ %>
				
				<tr>
					<td><% out.println(contact.getId()); %></td>
					<td><% out.println(contact.getName()); %></td>
					<td><% out.println(contact.getNo());  %></td>
				</tr>

			<%
			} %>
		</table>
		</body>
</html>