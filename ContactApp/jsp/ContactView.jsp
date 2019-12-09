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
			<table align="center" border="10px" width="20%">
			<tr>
					<th><strong>NAME</strong></th>
			</tr>
			<%
			Repository repo=new MySqlRepo();
			// ArrayList<Contact> contactList=repo.getAllContacts();
			ArrayList<Contact> contactList=(ArrayList<Contact>) request.getAttribute("contacts");
			ContactsListModel contactlistmodel=new ContactsListModel();
			if(contactList!=null)
			{ 
				for(int i=0;i<contactList.size();i++)
				{
					ContactModel contactmodel=new ContactModel();
					contactmodel.setId(contactList.get(i).getId());
					contactmodel.setName(contactList.get(i).getName());
					contactlistmodel.setAllContacts(contactmodel);
				}
				ArrayList<ContactModel> contacts=contactlistmodel.getAllContacts();
				for(ContactModel contactmodel:contacts)
				{ session.setAttribute("name",contactmodel.getName()); %>
					<tr>
						<!-- <td><% out.println(contactmodel.getId()); %></td> -->
						<!-- <td><% out.println(contactmodel.getName()); %></td> -->
						
					<td><button class="button" type="button" onClick="window.location.href ='select';"><%=contactmodel.getName() %>
						</button></td>
					</tr>

				<%
				}
			} %>
		</table>
		</body>
</html>