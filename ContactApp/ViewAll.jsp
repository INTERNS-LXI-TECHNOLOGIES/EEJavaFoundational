<%@page import="com.lxisoft.controller.*"%>
<%@page import="com.lxisoft.domain.*"%>
<%@page import="com.lxisoft.model.*"%>
<%@page import="com.lxisoft.repository.*"%>
<%@page import="java.util.*"%>

<html>
<body>
	<table style="width:100%">
  <tr>
    <th>ID</th>
    <th>NAME</th> 
    <th>NUMBER</th>
  </tr>
<%
ArrayList<Contact> contactList=(ArrayList<Contact>) request.getAttribute("list");
for(Contact contact:contactList)
{
	%>
	 <tr>
    <th><%=contact.getId()%></th>
    <th><%=contact.getName()%></th> 
    <th><%=contact.getNumber()%></th>
  	</tr>
	<%
}
%>
</table>
</body>
</html>