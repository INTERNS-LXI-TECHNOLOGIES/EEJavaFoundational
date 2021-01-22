<%@page import="com.lxisoft.control.*"%>
<%@page import="com.lxisoft.model.*"%>
<%@page import="com.lxisoft.repositry.*"%>
<%@page import="java.util.*"%>
<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"%>

<!DOCTYPE html>
<html>
<head>
  <title>Contact Application</title>
</head>
<body>
  <link href="style1.css" rel="stylesheet" type ="text/css">
  <div class="testbox">
    <h1><a href="Index.html" class="header"> Contact Application</a></h1>
    <h2> by Lxisoft Texhnologies pvt.ltd</h2>
    <div style="overflow-y:auto;">
    <table>
    	<tr>
        <th>ID</th>
    		<th>First Name</th>
    		<th>Last Name</th>
    		<th>Email</th>
    		<th>Contact Number</th>
    	</tr>
     
    	<%
    		ContactAppController controller= new ContactAppController();
            Contact contact = new Contact();
  Connection connection=null;
  Statement statement=null;
  ResultSet result =null;
  PreparedStatement preparedStatement=null;
  int row;
    String jdbcURL="jdbc:mysql://localhost:3306/ContactApp" ;
    String jdbcUserName="root";
    String jdbcPassword="root";

    try
    {
      Class.forName("com.mysql.cj.jdbc.Driver");
      try
      {
        connection=DriverManager.getConnection(jdbcURL,jdbcUserName,jdbcPassword);
        
    
    String sql  = "SELECT * FROM  ContactInfo" ;
    statement = connection.createStatement();
    result = statement.executeQuery(sql);
    while(result.next())
      {
      String id=result.getString(1);
      String fname = result.getString(2); 
      String lname = result.getString(3);
      String email = result.getString(4);
      String contactNumber = result.getString(5);
      contact.setFirstName(fname);
      contact.setLastName(lname);
      contact.setEmail(email);
      contact.setContactNumber(contactNumber);
      

       %>
     <tr>
      <td><%out.print(id); %></td>
      <td><a href="ContactDetails.jsp?id=<%contact.getFirstName();%>" class="tabledata"><%out.print(contact.getFirstName());%></a></td>
      <td><%out.print(contact.getLastName()); %></td>
      <td><%out.print(contact.getEmail());%></td>
      <td><%out.print(contact.getContactNumber()); %></td>
      </tr>
      <%
        
      }
    connection.close();
    }

      catch(SQLException e)
      {
        System.out.println(e);
      }
    }

    catch(ClassNotFoundException e)
    {
      System.out.println(e);
    }
      %>
    
</table>
</div>
    <a href="AddContacts.html" class="button">Add Contacts</a>
    <a href="DeleteContacts.html" class="button">Delete Contact</a>
    <a href="UpdateContacts.html" class="button">Update Contact</a>

    
</body>
</html>