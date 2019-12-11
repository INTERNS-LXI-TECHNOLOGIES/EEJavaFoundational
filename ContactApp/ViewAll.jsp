<%@page import="com.lxisoft.controller.*"%>
<%@page import="com.lxisoft.domain.*"%>
<%@page import="com.lxisoft.model.*"%>
<%@page import="com.lxisoft.repository.*"%>
<%@page import="java.util.*"%>

<html>
<title>CONTACTS</title>
<body style="background-color:#D4DB65;">
	<center style="color: blue"><h1><b>CONTACTS</b><h1></center>
	<br>
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
		img{
			vertical-align: middle;
		}
	</style>
<%

ArrayList<Contact> contactList=(ArrayList<Contact>) request.getAttribute("list");
int count=0;
for(Contact contact:contactList)
{
	count++;
	%>
	<div style="border: 1px solid blue; background-color: yellowgreen;">
	<h2><a href="Select.jsp?selectId=<%=contact.getId()%>">
	<img src="person.jpg" width="50" height="50">  <%=contact.getName()%></a>
	</h2>
	<br>
	</div>
 	<%
}
%>
<form action="Save.jsp">
 <button>+</button>
</form>
<div align="center" style="padding-top: 90px">total contacts: <%=count%></div>

</body>
</html>



