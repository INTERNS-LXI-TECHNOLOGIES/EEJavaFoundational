<%@page import="com.lxisoft.domain.*"%>
<%@page import="com.lxisoft.model.*"%>
<%@page import="java.util.*"%>
<%@page import="java.io.*"%>
<html>
<title>CONTACTS </title>
<head>
	<style>
	#b1
	{
		background-color:  #3CBC8D;
	    color: white;
	    margin: 8px 0;
	    border: none;
	    box-sizing: border-box;
	    width: 100;
	}
	#b2
	{
		background-color: pink;
	    color: black;
	    border-radius: 
	}
</style>
</head>
<h1><center>CONTACT LIST</center></h1>
<body style="background-color: grey">
	<table align="center" width="100%"  border color= "blue" bgcolor="#3CBC8D">
		<tr>
			<th>Contacts</th>
		</tr>
<%
List<ContactModel> c=(List<ContactModel>) request.getAttribute("allContact");
for(int i=0;i<c.size();i++)
{
	%>
	<tr>
		<form action= "getContact" method="get">
		<input type="hidden" name="id" value="<%=(c.get(i).getId())%>"/>
	<td ><a href="getContact"><input type="submit" id="b1" value="<%=(c.get(i).getName())%>"/></a></td>
		</form>
		</tr>
<%
}
%>
<a href="AddContact.jsp"><input type="submit" id="b2"name="submit" value="+" /></a>
</table>
</body>
</html>