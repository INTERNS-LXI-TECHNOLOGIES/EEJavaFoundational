<html>
		<head>
			<title> VIEW CONTACT </title>
			  <link rel="stylesheet" type="text/css" href="styles.css">
		</head>
		<body > 
			<%@ page import="com.lxisoft.models.*"%>
		
			<%@ page import="com.lxisoft.Domain.*"%>
		
			<%@ page import="java.util.*"%>

			<% Contact contact= (Contact)session.getAttribute("currentcontactList"); %>

			<h1><%=contact.getName()%></h1>
			<table align="center" border="10px" width="20%">
				<tr><th><strong>NAME</strong></th><th><strong>NUMBER</strong></th></tr>
				<tr><td> <% out.println(contact.getName()); %> </td>
					<td> <% out.println(contact.getNo());  %></td>
					<td><button class="button" type="button" 
						onClick="window.location.href ='ContactEdit.jsp';"> Edit </button></td>
					<td><button class="button" type="button" 
						onClick="window.location.href ='delete?user=<%=contact.getName()%>';"> Delete </button></td>
					<td><button class="button" type="button" 
						onClick="window.location.href ='View';"> Back</button></td>
					</tr>
					
		</table>
			
		</body>
	</html>