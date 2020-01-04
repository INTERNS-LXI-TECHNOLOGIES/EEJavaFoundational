<html>
		<head>
			<title> VIEW CONTACT </title>
			  <link rel="stylesheet" type="text/css" href="styles.css">
		</head>
		<body> 
			<%@ page import="com.lxisoft.models.*"%>
			<%@ page import="com.lxisoft.Domain.*"%>
			<%@ page import="java.util.*"%>
			<center> <h3> CONTACT APPLICATION </h3> <br/><br/></center>
			<%if(request.getUserPrincipal()!=null) { %>
				<center>	welcome <%=request.getUserPrincipal().getName()%> </center> <% }
			 else { %> <center> welcome guest  <% } %> </center>

			<% if (request.isUserInRole("manager"))  { %>
			<a href="ContactAdd.jsp" ><img src="images/add.png" height="40px"; width="40px";></a> 
			<% }
			else { %>
			<button type="button" onclick="Access_denied()"><img src="images/add.png" height="40px"; width="40px";></a> 
			<% } %></button>
			<script>
						function Access_denied(){
						alert("Access denied!!!");
						// window.location="ContactAdd.jsp"
						}
			</script>
			<form action="select" method="GET"><center>
			<input type="text" name="user" placeholder= "Enter Name">
			<button> search here </button></center></form>
			<form action="sort" method="GET"><center>
			<select name="sortvalue">
  				<option value="firstname">FirstName</option>
  				<option value="lastname">LastName</option>
  			</select>
  			<input type="submit" value="sort"> 
  			</center></form>
  			<% if (request.isUserInRole("manager"))  { %>
			<center> <button  type="button" onClick="window.location.href = 'DeleteAll';">DeleteAllContacts</button></center>
			<% }
			else { %>
			<center> <button  type="button" onclick="Access_denied()">DeleteAllContacts</button></center>
			<% } %>
			<%
			    ArrayList<ContactModel> contactList=( ArrayList<ContactModel>)session.getAttribute("contactmodel");
			  
				 if(contactList.size()==0)
				{%>
					 <script>
						msg()
						function msg(){
						alert(" No contacts to show");
						// window.location="ContactAdd.jsp"
						}
					</script>
				<%} %>
				<table align="center" border="10px" width="30%">
				<tr><th colspan="3"><strong>NAME</strong></th></tr>
				<% for(ContactModel contactmodel:contactList)
				{ %>

					<tr>
						<!-- <img src="images/person.png" height="50px";width="50px";> -->
					<% if (request.isUserInRole("manager"))  { %>	
						<td><button class="button" type="button" onClick="window.location.href ='select?user=<%=contactmodel.getFullName()%>';"><%=contactmodel.getFullName()%>
						</button></td>
					<% }
					else { %>
						<td>
						<button class="button" type="button" onclick="Access_denied()"><%=contactmodel.getFullName()%>
						</button></td>
					<% } %>

					<% if (request.isUserInRole("manager"))  { %>	
						<td><button class="button" type="button" onClick="window.location.href='selectContact?select=<%=contactmodel.getId()%>';">Edit</button></td>
					<% }
					else { %>
						<td>
						<button class="button" type="button" onclick="Access_denied()">Edit</button></td>
					<% } %>


					<% if (request.isUserInRole("manager"))  { %>	
						<td><button class="button" type="button" onClick="window.location.href='selectContact?select=<%=contactmodel.getFullName()%>';">Delete</button></td>
					<% }
					else { %>
							<td>
							<button class="button" type="button" onclick="Access_denied()">Delete</button></td>
						<% } %>

					</tr>
				<% } %>
		</table></br>
		<center><button type="button" onClick="window.location.href='View'">Refresh</button>
		<% out.println("No of contacts"+""+contactList.size());%></center>

		</body>
</html>