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
	
	<table bgcolor="#ccccff" align=center border="1px" width="25%">
		<form action="searchdata" method="get">
		<tr>
			<td align="center"><a href="Add.jsp"><h1>+</h1></a>
				<input type="text" name="n" placeholder="Search">
				<a href="searchdata"><input type="submit" value="OK"></a></td>
		</tr>
	</form>
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
    	<TD><input type="submit" value="<%=cm.getName()%>"></TD>
    	</form>
    </TR>
    <%
	}%>
	</table>
</body>
</html>