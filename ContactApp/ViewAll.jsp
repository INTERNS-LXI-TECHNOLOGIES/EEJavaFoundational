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
	<!-- <a href="Select.jsp"><h1>Select</h1></a> -->
	<table align=center border="1px" width="15%">
	<tr>
		<!-- <th>ID</th> -->
		<th><b>Name</b></th></tr>
	<%
	List<ContactModel>contactsList=(List<ContactModel>) request.getAttribute("contactlist");
	for(ContactModel cm:contactsList)
	{%>
	<TR>
		<form action="select" method="get">
		<input type="hidden" name="id" value="<%=cm.getId()%>"> 
    	<TD><a href="select"><input type="submit" value="<%=cm.getName()%>"></a></TD>
    	</form>
    </TR>
    <%
	}%>
	</table>
</body>
</html>