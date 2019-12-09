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
	<H1><CENTER>CONTACT LIST</CENTER></H1>
	<center><a href="Add.jsp"><h1>+</h1></a></center>
	<table align=center border="1px" width="25%">
	<tr>
		<th>ID</th>
		<th>Name</th></tr>
	<%
	List<ContactModel>contactsList=(List<ContactModel>) request.getAttribute("contactlist");
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