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
	
	<table bgcolor="#ccccff" align=center border="1px" width="30%">
		<form action="searchdata" method="get">
		<tr>
			<%if (request.isUserInRole("admin"))
			{%>
			<td align="center"><a href="Add.jsp"><h3>+</h3></a>
			<%
			}%>
				<input type="text" name="n" placeholder="Search">
				<a href="searchdata"><input type="submit" value="OK"></a></td></form>
				<td><select name="language">
			<option value="1" selected>English</option>
			<option value="2">Malayalam</option>
		</select>
		<input type="submit" value="OK"></a>
			</td>
		</tr>
	
	<tr>
		<!-- <th>ID</th> -->
		<th><b>Name</b></th>
		<form action="sort" method="get">
		<th><select name="sort">
			<option value="a" selected>Name Sort</option>
			<option value="b">Number Sort</option>
		</select>
		<input type="submit" value="OK"></a>
	</th>
	</tr>
	</form>
	
	<%List<ContactModel>contactsList=(List<ContactModel>) request.getAttribute("contactlist");
	for(ContactModel cm:contactsList)
	{%>
	
		<form action="select" method="get">
		<tr><input type="hidden" name="id" value="<%=cm.getId()%>">
		<input type="hidden" name="operations" value="1"> 
    	<td><input type="submit" value="<%=cm.getFName()%> <%=cm.getLName()%>"></td></form>
		<%if (request.isUserInRole("admin"))
		{%>
	    	<form action="select" method="get">
	    	<input type="hidden" name="id" value="<%=cm.getId()%>">
	    	<input type="hidden" name="operations" value="2">
	        <td><input type="submit" value="Delete"></td></form>

	        <form action="select" method="get">
	        <input type="hidden" name="id" value="<%=cm.getId()%>">
	        <input type="hidden" name="operations" value="3">
	        <td><input type="submit" value="Edit"></td></form>
    	<%
		}
	}%>
	</table>
</body>
</html>