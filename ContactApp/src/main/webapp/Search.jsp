<!DOCTYPE html>
<html>
<head>
	<style>
.button{
			  background-color: #FF0000;
			  color: white;
			  text-align: center;
			  text-decoration: none;
			  display: inline-block;
			  cursor: pointer;

       }
	table th,td 
	{	width: 5px;
		border:2px solid black;

	}
</style> 
	<title>
		SEARCH
	</title>
</head>
<body button style ="background: lightblue">

<%@page import = "com.lxisoft.servet.*"%>
<%@page import = "com.lxisoft.repository.*"%>
<%@page import = "com.lxisoft.sqlrepository.*"%>
<%@page import = "com.lxisoft.model.*,java.util.*"%><br><br>
<table align="center" style="border-collapse: collapse;">
	        <tr>
				<th style="font-family: fantasy;font size: 5px">ID</th>
				<th style="font-family: fantasy;font size: 5px">FIRSTNAME</th>
				<th style="font-family: fantasy;font size: 5px">LASTNAME</th>
				<th style="font-family: fantasy;font size: 5px">NUMBER</th>
				<% if (request.isUserInRole("admin")) { %>				
				<th style="font-family: fantasy;font size: 5px">OPTIONS</th>
				  <% } %>
			</tr>
<% ArrayList<Contact> contactList=(ArrayList<Contact>) request.getAttribute("searchList");
	for(Contact i: contactList)
		{ %>
			<b>

			<tr style=" font-style:oblique;">
			<td><%out.println(i.getId());%></td>
			<td><%out.println(i.getFirstname());%></td>
			<td><%out.println(i.getLastname());%></td>
			<td><%out.println(i.getNumber());%></td>
			<center>
				<% if (request.isUserInRole("admin")) { %>
			   <td><button class="button" onclick=" window.location.href='Update.jsp?id=<%=i.getId()%>'">edit&nbsp;
	          <button class="button" onclick="window.location.href= 'Delete.jsp?id=<%=i.getId()%>'">delete&nbsp;
	          </td>
             <% } %>
			</center>
				
			</tr>
			</b>
			<%
		} %>

</table>
<center>
	
	</center>	
</body>
</html>