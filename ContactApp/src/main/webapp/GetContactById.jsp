<%@page import="com.lxisoft.domain.*"%>
<%@page import="java.util.*"%>
<%@page import="java.io.*"%>
<%@page import="com.lxisoft.domain.*,com.lxisoft.config.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<style>
	table,th,td{
		border: 1px solid black;
		border-collapse: collapse;
	}
	th,td{
		padding: 15px;
	}
	table{
		width: 25%;
		background-color: #f1f1c1;

	}
	#b1
	{
		margin-left: 200px;
	}
	#b2
	{
		background-color: white;
	    color: black;
	    margin-left: 550px;
	   
	}
	#b3
	{
		background-color: #3CBC8D;
	 	border :none;
	    color: white;
	    height: 10%; 
	    width: 15%;
	}
</style>
</head>
<%
  Localizer lo=new Localizer();
  String lang=(String)session.getAttribute("langu");
%>
<title><%=(lo.getWord("contact",lang,"IN"))%></title>
<body style="background-color: grey">
	<table align="center" border="5" width="25%" height="25%">
	<a href="home"><input type="button" id="b2" value="<%=(lo.getWord("back",lang,"IN"))%>"></a>
	<%if(request.isUserInRole("admin"))
{%>
	
	<%}
Contact con=(Contact) request.getAttribute("getContactById");

%>
<a href="editContact"><input type="submit" id="b1" value="<%=(lo.getWord("edit",lang,"IN"))%>"></a><br><br><br>
<font size="15">
<center><img src="user-icon-jpg-12.jpg" width="10%" height="10%"> 
<center><%=(con.getContactFirstName())%></center>
<center><%=(con.getContactLastName())%></center>
<center><%=(con.getContactNumber())%></center>
</font>
<%if(request.isUserInRole("admin"))
{%>
<tr>
	<center>
	<br>
	<form action= "delete" method="post">
	<input type="submit" id="b3" value="<%=(lo.getWord("deletecontact",lang,"IN"))%>">
	</form></center>
</tr>
</table>

	
	<%}%>
</body>
</html>
