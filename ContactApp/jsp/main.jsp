<html>
<title>CONTACT APP</title>
<head><CENTER>again.. welcome to contact App</CENTER></head>
<body>
<%@ page import="com.lxisoft.Domain.*" %>
<%@ page import="java.util.*" %>


<button type="button"  style="color: red;" >Sucess</button> 
<button onclick="window.location.href='jsp/addnew.jsp';">Add new Contact</button> 
<% ArrayList<Contact>contacts=(ArrayList<Contact>)request.getAttribute("contacts"); %>


<table><CENTER>
	<tr><th><h3>ID</h3></th><th><h3>NAME</h3></th><th><h3>NUMBER</h3></th></tr>
<% for (Contact a: contacts){%>

<tr><td><%out.println(a.getId());%></td>
	<td><%out.println(a.getName());%></td>
	<td><%out.println(a.getNo());%></td>
</tr>
<%
}
%>
</table>



</body>
</html>
