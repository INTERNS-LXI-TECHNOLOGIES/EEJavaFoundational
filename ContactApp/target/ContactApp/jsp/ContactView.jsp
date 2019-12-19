<html>
		<head>
			<title> VIEW CONTACT </title>
			  <link rel="stylesheet" type="text/css" href="jsp/styles.css">
		</head>
		<body > 
			<%@ page import="com.lxisoft.models.*"%>
			<%@ page import="com.lxisoft.Domain.*"%>
			<%@ page import="java.util.*"%>
			<center>
				 <h3> CONTACT APPLICATION </h3>
			</center>
			<button  class ="butt" align="left" type="button" onClick="window.location.href = 'jsp/ContactAdd.jsp';">+</button>
			<form action="select" method="GET"><center>
			<input type="text" name="user" placeholder= "Enter Name">
			<button> search here </button></center></form>
			<center> <button  type="button" onClick="window.location.href = 'DeleteAll';">DeleteAllContacts</button></center>
			<%
			    ArrayList<ContactModel> contactList=( ArrayList<ContactModel>)session.getAttribute("contactmodel");%>
				<% out.println(contactList.size());%>
				<% if(contactList.size()==0)
				{%>
					<script>
						msg()
						function msg(){
						alert(" contact list empty..");
						window.location="jsp//ContactAdd.jsp"}
					</script>
				<%} %>
				<table id="tab" align="center" border="10px" width="30%">
				<tr><th><strong>NAME</strong></th></tr>
				<% for(ContactModel contactmodel:contactList)
				{ 
					%>
					<tr>
					<!-- <td><% out.println(contactmodel.getName()); %>	 -->
					<td
						img src="images/person.png" height="50px";width="50px";></td>
						<button class="button" type="button" onClick="window.location.href ='select?user=<%=contactmodel.getName()%>';"><%=contactmodel.getName()%>
						</button>
					</tr>

				<%
			} %>
		</table>
		</body>
</html>