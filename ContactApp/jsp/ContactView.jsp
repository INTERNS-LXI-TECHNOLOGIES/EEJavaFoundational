<html>
		<head>
			<title> VIEW CONTACT </title>
		</head>
		<body > 
			<%@ page import="com.lxisoft.models.*"%>
			<%@ page import="com.lxisoft.servlets.*"%>
			<%@ page import="com.lxisoft.Domain.*"%>
			<%@ page import="com.lxisoft.repository.*"%>
			<Center>
				 <h3> TO VIEW CONTACT </h3>
			</Center>
			<% 
		//	ArrayList <Contact> contactList=(ArrayList<Contact>)request.getAttribute("contacts");
			String n=(String)request.getAttribute("name");
			out.println("<h1>"+n+"</h1>");
			<table align="center" border="10px" width="50%">
			<tr>
					<th>ID</th>
					<th>NAME</th>
					<th>NUMBER</th>
			</tr>
			for(Contact contactlist:contacts)
			{ %>
				
				<tr>
					<td><%=contactlist.getId()%></td>
					<td><%=contactlist.getName()%></td>
					<td><%=contactlist.getNo()%></td>
				</tr>

			}
		</body>
</html>