<html>
<title> CONTACT APP</title>
<head><link rel="stylesheet" type="css" href="styles.css"><CENTER>again.. welcome to contact App</CENTER></head>
<body>
<%@ page import="com.lxisoft.Domain.*" %>
<%@ page import="com.lxisoft.Models.*" %>
<%@ page import="java.util.*" %>


 
<button onclick="window.location.href='jsp/addnew.jsp';" >Add new Contact</button> 
<form action="search" method="GET">
	search a contact: <input type="text" name="name">
	<button name="search" type="submit">search</button>
</form>
 
<% ArrayList<ViewListModel>contacts=null;
contacts=(ArrayList<ViewListModel>)request.getAttribute("contacts");String str=null; %>


<% for(ViewListModel a: contacts){%>
<% str=a.getName()+"<br>";%>
<br>
<form action="search" ><button name=str type="submit"><% out.println(a.getName());}%></button></form>
<table border="2" align="CENTER" width="20%">
	<p><tr><th><h3>ID</h3></th>
		<th><h3>NAME</h3></th></p></tr>
<% //out.println(contacts.size()+"size...");
// if(contacts!=null)
	// out.println("<b>"+" no contact to show" +"<b>");
%>

	 <%  for (ViewListModel a: contacts){%>

	<tr><td><%out.println(a.getId());%></td>
		<td><%out.println(a.getName());%></td>
		<% session.setAttribute("use",a);%>
	</tr>

	<%}%>
</table>



</body>
</html>
