<html>
<title> CONTACT APP</title>
<head>
	<link rel="stylesheet" type="text/css" href="styles.css"><CENTER><font color="red" size="32"><b> CONTACT APP </b></font></CENTER></head>
<body>
<%@ page import="com.lxisoft.Domain.*" %>
<%@ page import="com.lxisoft.Models.*" %>
<%@ page import="java.util.*" %>

<% String userName=null;
if(request.getUserPrincipal()!=null){
userName= request.getUserPrincipal().getName();

}%>
<% if (userName!=null){ %>
<center>welcome <%=userName %></center>
<% }
else if (request.getUserPrincipal()==null){ %>
<center>welcome guest</center>
<% } %>



<center><% if(request.isUserInRole("admin")){ %>
<a href="addnew.jsp" style="color: green; text-align: center;"><button >+</button></a>
<% }
else{ %>
<!-- <embed src="song.mp4"> </embed> -->
<button onclick="denied()" >+</button></a>
<% } %> </center>
 
<script>
	function denied()
	{
		alert("access denied");
		
	}
</script>
 <center>
<form action="search" method="GET"  align="center">
	<font color="white"> search a contact: </font><br><input  type="text"  align="center" name="user">
	<button name="search" type="submit">search</button></form>

</center>
<% if(request.isUserInRole("admin")){  %>
<center><button  onclick="window.location.href='deleteAll';" >delete All Contact</button> <br></center>
<% }
else { %>
<center><button  onclick="denied()" >delete All Contact</button> <br></center>
	<% } %>
<center>
<form action="sort">
	<select name="sort">
		<option value="first">first name</option>
		<option value="last">last name</option>
		<option value="id">id</option>
		
	</select>
	<input type="submit" value="sort">
</form></center>
<center><button onclick="window.location.href='viewall';">refresh</button></center>
<% ArrayList<ViewListModel>contacts=new ArrayList<ViewListModel>();
contacts=(ArrayList<ViewListModel>)session.getAttribute("contacts"); %>

<% 	if(contacts.size()==0  ){ %>
<%	 out.println("<b><h1><CENTER>"+"no contact to show"+"</CENTER></h1></b>"); %> 

<% } else{%>

<br>
	<!-- <img src="dead.jpg" width="50" height="50"> -->
<div style="overflow-x: auto;">
<table align="center">
	<p><tr><th></th><th><h3>ID</h3></th>
		<th><h3>NAME</h3></th></p></tr>

	 <%  for (ViewListModel a: contacts){%>

	<tr>
		<td><img src="contact.png" width="50" height="50"></td>
		<td><font color=" grey" size="65"><%out.println(a.getId());%></font></td>
		<td><a href="search?user=<%=a.getFullName()%>"><font color=" green" size="65"><%out.println(a.getFirstName());%></font></td></a>
		<%  if(request.isUserInRole("admin")){ %>
		<td><a href="select?type=edit&name=<%=a.getFullName()%>">edit</a></td>
		<td><a href="select?name=<%=a.getFullName()%>&type=delete">delete</a></td>
		<% }
		else { %>
		<td><button onclick="denied()">edit</button></td>
		<td><button onclick="denied()">delete</button></td>
		<% } %>
		
	</tr>

	<%}%>
</table></div>

	<%}%>


</body>
</html>
