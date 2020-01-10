<%@page import="com.lxisoft.domain.*"%>
<%@page import="com.lxisoft.model.*"%>
<%@page import="com.lxisoft.config.*"%>
<%@page import="java.util.*"%>
<%@page import="java.io.*"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page isELIgnored="false" %>
<fmt:setLocale value="ml"/>
<fmt:setBundle basename="messages"/>

<html>
<title>CONTACTS </title>
<head>
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
<h1><center>CONTACT LIST</center></h1>
<body style="background-color: white">
	<select name="language">
    <option value="1">malayalam</option>
    <option value="2">english</option>
  </select>
    <%
	if(request.isUserInRole("admin"))
	{%>
	<fmt:message key="label.add" var="addTranslation" />
	<a href="AddContact.jsp"><input type="submit" id="b2"name="submit" value="${addTranslation}" /></a>
	<%}%>
	<form action= "sort" method="get">
	<select name="sort">
    	<fmt:message key="label.submit" var="submitTranslation" />
    <option value="1">Sort contact by name</option>
    <option value="2">Sort contact by number</option>
    <option value="3">Sort contact by id</option>
    <input type="submit" name="submit" value="${submitTranslation}"/>
  </select>
</form>
	<%
	List<ContactModel> c=(List<ContactModel>) request.getAttribute("allContact");
	%>
	<form action= "search" method="get">
	<table align="center" border="1" width="20%" height="5%" >
		<tr>
			<td><input type="text" name="name" placeholder="Search in <%=c.size()%> contacts"/>
		
			<a href="search"><input type="submit" value="${submitTranslation}"></a></td>
		</tr>
	</table>
</form>
	<table align="center" width="60%"  border color= "blue" bgcolor="#3CBC8D">
		<tr>
			<th>Contacts</th>
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
				<input type="submit" id="b3" value="Delete">
				<input type="hidden" name="crud" value="4"/>
			</form>
		
			<form action= "getContact" method="get">
				<input type="hidden" name="id" value="<%=(c.get(i).getId())%>"/>
				<input type="submit" id="b3" value="Edit">
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