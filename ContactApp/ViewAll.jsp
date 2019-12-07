<%@page import="com.lxisoft.domain.*"%>
<%@page import="com.lxisoft.models.*"%>
<%@page import="java.io.*"%>
<%@page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
	<title>All Contacts</title>
</head>
<body>
	<table border="1px" width="25%">
	<tr>
		<th>ID</th>
		<th>Name</th></tr>
	<%
	List<ContactModel>contactsList=(List<ContactModel>) request.getAttribute("contactlist");
	// List<Contact> contactList=(List<Contact>) request.getAttribute("contactlist");
    // out.println(contactList.size());
	for(ContactModel cm:contactsList)
	{%>
	<TR>
		<TD><%=cm.getId()%></TD>
    	<TD><%=cm.getName()%></TD>
    </TR>
    <%
	}%>
	</table>
</body>
</html>