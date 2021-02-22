<%@page import="com.lxisoft.control.*"%>
<%@page import="com.lxisoft.model.*"%>
<%@page import="com.lxisoft.repositry.*"%>
<%@page import="java.util.*"%>
<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"%>

<!DOCTYPE html>
<html>
<head>
  <title>Covid Form</title>
</head>
<body>
  <link href="style1.css" rel="stylesheet" type ="text/css">
  <div class="testbox">
    <h1><a href="Index.jsp" class="header"> Covid Application Form</a></h1>
    <h2> by Lxisoft Texhnologies pvt.ltd</h2>
    <table>
    <tr>
        <th>Name</th>
        <th>Phone Number</th>
        <th>Type Of Function</th>
        <th>Address</th>
        <th>No.Of Peoples</th>
      </tr>
    <%
    
    CovidForm covidform = new CovidForm();
    String name=request.getParameter("name");
    String phno=request.getParameter("phno");
    String address=request.getParameter("address");
    String type=request.getParameter("type");
    String people=request.getParameter("people");
    %>
		<tr>
      <td><%out.print(covidform.getName());%></a></td>
      <td><%out.print(covidform.getPhoneNumber()); %></td>
      <td><%out.print(covidform.getFunctionType());%></td>
      <td><%out.print(covidform.getAddress()); %></td>
      <td><%out.print(covidform.getNumberOfPeople()); %></td>
      </tr>></table>
      <a href="DeleteApplicationServlet?name=<%=name%>" class="button">Reject Contact</a>
      <a href="UpdateApplication.jsp?name=<%=name%>&phno=<%=phno%>&address=<%=address%>&type=<%=type%>&people=<%=people%>"> Update And Confirm Applicaion </a>
</div>
</body>
</html>