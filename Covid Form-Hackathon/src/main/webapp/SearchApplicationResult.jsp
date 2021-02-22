<%@page import="com.lxisoft.servlet.*"%>
<%@page import="com.lxisoft.model.*"%>
<%@page import="com.lxisoft.repositry.*"%>
<%@page import="java.util.*"%>
<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <title>Covid Application Form</title>
</head>
<body>
    <h1><a href="Index.jsp" class="header"> Covid Application Search </a></h1>
    <h2> by Lxisoft Texhnologies pvt.ltd</h2>
     <table>
    	<tr>
        <th>Name</th>
    		<th>Phone Number</th>
    		<th>Type Of Function</th>
    		<th>Address</th>
    		<th>Number of Peoples</th>
    	</tr>
     
    	<%
        ArrayList<CovidForm> searchList=(ArrayList<CovidForm>)request.getAttribute("searchList");
         
     for(CovidForm covidform : searchList)
    { 
       %>
     <tr>
      <td><%out.print(covidform.getName());%></a></td>
      <td><%out.print(covidform.getPhoneNumber()); %></td>
      <td><%out.print(covidform.getFunctionType());%></td>
      <td><%out.print(covidform.getAddress()); %></td>
      <td><%out.print(covidform.getNumberOfPeople()); %></td>
      </tr>
      <%
        
      }
      %>
    
</table>

</body>
</html>
