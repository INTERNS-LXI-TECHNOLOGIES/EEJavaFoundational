<%@page import="com.lxisoft.domain.*"%>
<%@page import="com.lxisoft.model.*"%>
<%@page import="com.lxisoft.config.*"%>
<%@page import="java.util.*"%>
<%@page import="java.io.*"%>
<%@page import="com.lxisoft.domain.*,com.lxisoft.config.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<head>
<html>
<title>CONTACTS</title>

	<style>
	#b1
	{
		background-color: green;
	    color: white;
	    margin: 8px 0;
	    border: none;
	    box-sizing: border-box;
	    width: 100;
	}
	#b2
	{
		background-color: #3CBC8D;
	    color: white;
	    margin-left: 1000px;
	    border-radius: 50%;
	    height: 5%; 
	    width: 3%;
	}
	#b3
	{
		background-color: black;
	 	border :none;
	    color: white;
	    height: 10%; 
	    width: 50%;
	}
</style>
</head>
<%
  Localizer lo=new Localizer();
  String lang=(String)session.getAttribute("langu");
%>
<h1><center><%=(lo.getWord("contactlist",lang,"IN"))%></center></h1>
<body style="background-color: white">
    <%
	if(request.isUserInRole("admin"))
	{%>
	<a href="AddContact.jsp"><input type="submit" id="b2"name="submit" value="+" /></a>
	<%}%>
	<form action= "sort" method="get">
	<select name="sort">
    <option value="1"><%=(lo.getWord("sortcontactbyname",lang,"IN"))%></option>
    <option value="2"><%=(lo.getWord("sortcontactbynumber",lang,"IN"))%></option>
    <option value="3"><%=(lo.getWord("sortcontactbyid",lang,"IN"))%></option>
    <input type="submit" name="submit" value="<%=(lo.getWord("submit",lang,"IN"))%>"/>
  </select>
</form>
	<%
	List<ContactModel> c=(List<ContactModel>) request.getAttribute("allContact");
	%>
	<form action= "search" method="get">
	<table align="center" border="1" width="10%" height="5%" >
		<tr>
			<td><input type="text" name="name" placeholder="<%=(lo.getWord("searchincontact",lang,"IN"))%>"/>
		
			<a href="search"><input type="submit" value="<%=(lo.getWord("submit",lang,"IN"))%>"></a></td>
		</tr>
	</table>
</form>
	<table align="center" width="60%"  border color= "blue" bgcolor="#3CBC8D">
		<tr>
			<th><%=(lo.getWord("contacts",lang,"IN"))%></th>
		</tr>
<%
for(int i=0;i<c.size();i++)
{
%>
		<form action= "getContact" method="get">
		<input type="hidden" name="id" value="<%=(c.get(i).getId())%>"/>
	<tr>
		<td>
			<img src="user-icon-jpg-13.jpg" width="20%" height="30%"> 
		<input type="submit" id="b1" value="<%=(c.get(i).getFirstName())%>&nbsp;<%=(c.get(i).getLastName())%>"/>
		<input type="hidden" name="crud" value="2"/>
</form>
	</td>
		<td>
			<%if(request.isUserInRole("admin"))
			{%>
			<form action= "getContact" method="get">
				<input type="hidden" name="id" value="<%=(c.get(i).getId())%>"/>
				<input type="submit" id="b3" value="<%=(lo.getWord("delete",lang,"IN"))%>">
				<input type="hidden" name="crud" value="4"/>
			</form>
		
			<form action= "getContact" method="get">
				<input type="hidden" name="id" value="<%=(c.get(i).getId())%>"/>
				<input type="submit" id="b3" value="<%=(lo.getWord("edit",lang,"IN"))%>">
				<input type="hidden" name="crud" value="3"/>
			</form>
			<%}%>
		</td>
	</tr>
<%
}
%>
</table>
</body>
</html>