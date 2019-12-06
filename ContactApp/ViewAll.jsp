<%@page import="com.lxisoft.controller.*"%>
<%@page import="com.lxisoft.domain.*"%>
<%@page import="com.lxisoft.model.*"%>
<%@page import="com.lxisoft.repository.*"%>
<%@page import="java.util.*"%>

<html>
<title>ALL CONTACTS</title>
<body style="background-color:#D4DB65;">
	<center style="color: blue"><h2><u><b>ALL CONTACTS</b><h2></u></center>
	<br>
	<table style="width:100%">
		<style>
			button {
			  background-color: blue;
			  border-radius: 70%;
			  color: white;
			  padding: 30px;
			  font-size: large;
			 float: right;	
			  margin: 25px 75px;
				}
		table, th, td {
			border: 0.25px solid black;
			border-collapse: collapse;
		    padding: 10px;
		}
		</style>
	  	<tr>
		<th style="color: blue">ID</th>
		<th style="color: blue">NAME</th> 
		<th style="color: blue">NUMBER</th>
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
<form action="Save.jsp">
 <button>+</button>
</form>

</body>
</html>



<!-- ViewAllModel temp=request.getAttribute("list");
for(Contact contact:temp.getList()) -->