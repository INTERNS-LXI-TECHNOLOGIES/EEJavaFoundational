<%@page import="com.lxisoft.domain.*"%>
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
		<th>Name</th>
		<th>Number</th></tr>
	<%
	List<Contact> contactList=(List<Contact>) request.getAttribute("contactlist");
    // out.println(contactList.size());
	for(Contact con:contactList)
	{%>
	<TR>
		<TD><%out.println(con.getId()+"\n");%></TD>
    	<TD><%out.println(con.getName()+"\n");%></TD>
    	<TD><%out.println(con.getContactNo()+"\n");%></TD>
    </TR><%
	}%>
	</table>
</body>
</html>