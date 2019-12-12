<%@page import="com.lxisoft.controller.*"%>
<%@page import="com.lxisoft.domain.*"%>
<%@page import="com.lxisoft.model.*"%>
<%@page import="com.lxisoft.repository.*"%>
<%@page import="java.util.*"%>

<html>
<title>CONTACTS</title>
<body style="background-color:#D4DB65;">
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

<table style="border: 0.5px solid blue; background-color: yellowgreen; width: 40%;" align="center" tabindex="center ">
		<tr><td><h1 style="text-align: center; color:initial;"><b>CONTACTS</b></h1></td></tr>
<%
ArrayList<Contact> contactList=(ArrayList<Contact>) request.getAttribute("list");
int count=0;
for(Contact contact:contactList)
{
	count++;
	%>
	<tr>
	<td>
	<h2><a style="margin-left: 30px;" href="Select.jsp?selectId=<%=contact.getId()%>">
	<img src="person.jpg" width="50" height="50">  <%=contact.getName()%></a>
	</h2>
	</td>
	</tr>
 	<%
}
%>
</table>

<form action="Save.jsp">
 <button>+</button>
</form>
<div align="center" style="padding-top: 90px">total contacts: <%=count%></div>

</body>
</html>



