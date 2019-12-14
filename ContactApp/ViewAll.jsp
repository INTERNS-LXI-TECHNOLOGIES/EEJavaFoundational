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
	    border-radius:25%;
	    height: 5%; 
	    width: 3%;
	}
</style>
</head>
<h1><center>CONTACT LIST</center></h1>
<body style="background-color: grey">
	<a href="AddContact.jsp"><center><input type="submit" id="b2"name="submit" value="+" /></center></a>
	<form action= "search" method="get">
	<table align="center" border="1" width="20%" height="5%" >
		<tr>
			<td><input type="text" name="name" placeholder="Search"/>
			<a href="search"><input type="submit" value="submit"></a></td>
		</tr>
	</table>
</form>
	<table align="center" width="60%"  border color= "blue" bgcolor="#3CBC8D">
		<tr>
			<th>Contacts</th>
		</tr>
<%
List<ContactModel> c=(List<ContactModel>) request.getAttribute("allContact");
for(int i=0;i<c.size();i++)
{
%>
	
		<form action= "getContact" method="get">
		<input type="hidden" name="crud" value="2"/>
		<input type="hidden" name="id" value="<%=(c.get(i).getId())%>"/>
	<tr>
		<td>
			<img src="user-icon-jpg-13.jpg" width="20%" height="30%"> 
		<a href="getContact">
		<input type="submit" id="b1" value="<%=(c.get(i).getName())%>"/></a></td>
		</form>
	</tr>
<%
}
%>
</table>
</body>
</html>