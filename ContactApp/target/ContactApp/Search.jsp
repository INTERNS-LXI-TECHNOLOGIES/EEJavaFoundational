<!DOCTYPE html>
<html>
<head>
	<title>
		
	</title>
</head>
<body button style ="background: lightblue">

<%@page import = "com.lxisoft.servet.*"%>
<%@page import = "com.lxisoft.repository.*"%>
<%@page import = "com.lxisoft.sqlrepository.*"%>
<%@page import = "com.lxisoft.model.*,java.util.*"%>
<table align="center" style="border-collapse: collapse;">
	        <tr>
				<th style="font-family: fantasy;font size: 10px">NAME</th>
				
			</tr>
<% ArrayList<Contact> contactList=(ArrayList<Contact>) request.getAttribute("searchlist");
	for(Contact i: contactList)
		{ %>
			<b>
			<tr style=" font-style:oblique;  ">
				<td>

			<%out.println(i.getFirstname());%>

				</td>
			</tr>
			</b>
			<%
		} %>

</table>
</body>
</html>