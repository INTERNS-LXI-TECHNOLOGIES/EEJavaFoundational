<html>
		<head>
			<title> VIEW CONTACT </title>
			  <link rel="stylesheet" type="text/css" href="jsp/styles.css">
		</head>
		<body > 
			<%@ page import="com.lxisoft.models.*"%>
			<%@ page import="com.lxisoft.servlets.*"%>
			<%@ page import="com.lxisoft.Domain.*"%>
			<%@ page import="com.lxisoft.repository.*"%>
			<%@ page import="java.util.*"%>

			<% ArrayList<Contact> currentList= (ArrayList<Contact> ) request.getAttribute("currentcontactList"); %>
			<table align="center" border="10px" width="20%">
				<tr><th><strong>NAME</strong></th><th><strong>NUMBER</strong></th></tr>
				<% for(Contact contact:currentList)
				{ %>
				<tr><td> <% out.println(contact.getName()); %> </td>
					<td> <% out.println(contact.getNo());  %></td>
					<td><button class="button" type="button" 
						onClick="window.location.href ='edit?user=<%=contact.getName()%>';"> Edit </button></td>
					<td><button class="button" type="button" 
						onClick="window.location.href ='delete?user=<%=contact.getName()%>';"> Delete </button></td>
					</tr>
				<% } %>
		</table>
			
		</body>
	</html>