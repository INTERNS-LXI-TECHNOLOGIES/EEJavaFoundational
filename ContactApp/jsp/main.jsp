<html>
<title> CONTACT APP</title>
<head><link rel="stylesheet" type="css" href="styles.css"><CENTER>again.. welcome to contact App</CENTER></head>
<body>
<%@ page import="com.lxisoft.Domain.*" %>
<%@ page import="com.lxisoft.Models.*" %>
<%@ page import="java.util.*" %>


 
<button align="center" style="float:left;" onclick="window.location.href='jsp/addnew.jsp';" >Add new Contact</button> 
<button align="center" style="float:left;" onclick="window.location.href='deleteAll';" >delete All Contact</button> 
<form action="search" method="GET"  align="center">
	search a contact: <input type="text" align="right" name="user">
	<button name="search" type="submit">search</button>
</form>
 
<% ArrayList<ViewListModel>contacts=null;
contacts=(ArrayList<ViewListModel>)session.getAttribute("contacts");String str="ajith"; %>

<% 	if(contacts.size()==0){
	 out.println("<b><h1><CENTER>"+" no contact to show" +"</CENTER></h1><b>");
	 
%> <script> function functio {alert("no contacts to show");}</script>
<% } %>

<br>

<table class="table" border="2" align="CENTER" width="20%">
	<p><tr><th><h3>ID</h3></th>
		<th><h3>NAME</h3></th></p></tr>

	 <%  for (ViewListModel a: contacts){%>

	<tr><td><%out.println(a.getId());%></td>
		<% String useC=a.getName();%>
		<td><%out.println(a.getName());%></td>
		<td><a href="search?user=<%=a.getName()%>">select</td></a>
		
	</tr>

	<%}%>
</table>



</body>
</html>
