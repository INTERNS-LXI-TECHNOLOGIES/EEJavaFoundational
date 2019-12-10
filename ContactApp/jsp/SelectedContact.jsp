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

			<% ArrayList<Contact> contactList= (ArrayList<Contact) request.getAttribute("cocurrentcontactList");
			<table align="center" border="10px" width="20%">
				<tr><th><strong>NAME</strong></th></tr>
				<% for(Contact contact:contactList)
				{ 
					%>
					<tr>
					<!-- <td><% out.println(contactmodel.getName()); %>	 -->
					<td><button class="button" type="button" onClick="window.location.href ='select?user=<%=contactmodel.getName()%>';"><%=contact.getName()%>
						</button></td>
					</tr>

				<%
			} %>
		</table>
			
		</body>
	</html>