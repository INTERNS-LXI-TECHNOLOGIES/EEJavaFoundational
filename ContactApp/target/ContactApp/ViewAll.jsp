<%@page import="com.lxisoft.domain.*"%>
<%@page import="com.lxisoft.models.*"%>
<%@page import="com.lxisoft.config.*"%>
<%@page import="java.io.*"%>
<%@page import="java.util.*"%>


<%@ page contentType="text/html;charset=UTF-8"  pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>
<head>
	<title>All Contacts</title>
</head>
<%
	Internationalization international=new Internationalization();
	String language=(String) session.getAttribute("language");
	String delete= international.localization(language,"IN","Delete");
	String edit= international.localization(language,"IN","Edit");
	String search= international.localization(language,"IN","Search");
	String ok= international.localization(language,"IN","OK");
	String name= international.localization(language,"IN","Namesort");
	String number= international.localization(language,"IN","Numbersort");
	%>
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
				<input type="text" name="n" placeholder=<%=search%>>
				<a href="searchdata"><input type="submit" value=<%=ok%>></a></td></form>
				<!-- <td><select name="language">
			<option value="1">English</option>
			<option value="2">മലയാളം</option>
			<option value="3" selected>Language</option>
		</select>
		<input type="submit" value="OK"></a>
			</td> -->
		</tr>
	
	<tr>
		<!-- <th>ID</th> -->
		<th><b>Name</b></th>
		<form action="sort" method="get">
		<th><select name="sort">
			<option value="a" selected><%=name%></option>
			<option value="b"><%=number%></option>
		</select>
		<input type="submit" value=<%=ok%>></a>
	</th>
	</tr>
	</form>

	<%
	List<ContactModel>contactsList=(List<ContactModel>) request.getAttribute("contactlist");
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
	        <td><input type="submit" value=<%=delete%>></td></form>

	        <form action="select" method="get">
	        <input type="hidden" name="id" value="<%=cm.getId()%>">
	        <input type="hidden" name="operations" value="3">
	        <td><input type="submit" value=<%=edit%>></td></form>
    	<%
		}
	}%>
	</table>
</body>
</html>