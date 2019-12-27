<!DOCTYPE html>
<html>
<head> 
<style>
	table th,td 
	{	width: 2px;
		border:2px solid black;

	}
</style> 
	<h1 align="center">CONTACTS</h1>
	<title>
		
	</title>
</head>
<body style="background: white">
<%@page import = "com.lxisoft.servet.*"%>
<%@page import = "com.lxisoft.repository.*"%>
<%@page import = "com.lxisoft.sqlrepository.*"%>
<%@page import = "com.lxisoft.model.*,java.util.*"%>

<table align="center" style="border-collapse: collapse;">
	        <tr>
				<th style="font-family: fantasy;font size: 10px">NAME</th>
				
			</tr>
<% ArrayList<Contact> contactList=(ArrayList<Contact>) request.getAttribute("contactList");
	
	for(Contact i : contactList)
		{ %>
			<b>
			<tr style=" font-style:oblique;  ">
			<td>
				<a href="Select.jsp?temp=<%=i.getId()%>
					&temp1=<%=i.getFirstname()%>
					&temp2=<%=i.getLastname()%>
					&temp3=<%=i.getNumber()%>">
					<input type="button" name="submit" value="<%=i.getFirstname()%>&nbsp;<%=i.getLastname()%>">
				</a>
			</td>
			
			</tr>
			</b>
			<%
		} %>

</table>
<center><br>
<a style="font-family:fantasy; font size: 70px;"  href="Add.jsp" > ADD NEW CONTACT</a>	
</center>
</body>
</html>