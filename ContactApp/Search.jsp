<!DOCTYPE html>
<html>
<%@page import="com.lxisoft.model.Contact,com.lxisoft.control.*,com.lxisoft.repository.*"%>
<%@page import="java.sql.*,java.io.*,java.util.*"%>
<%@page import="java.sql.Connection"%>
<head>
	<title>Contact App</title>
</head>
<body bgcolor="orange">
	<center>
    <table border="1">	
      <tr>
        <th>Id</th>
        <th>First Name</th>
        <th>Last Name</th>
        <th>MailID</th>
        <th>Number</th>
      </tr>
      <tr>
	<%
	  Control control = new Control();
      String name= request.getParameter("name");
      control.searchContact(name); 
	   try
	   {
	   	Class.forName("com.mysql.cj.jdbc.Driver");
	   	 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/contactapp","root","password");
	   	 Statement stmt = con.createStatement();
       PreparedStatement ps =con.prepareStatement("select * from contactapp where FirstName = '"+name+"'");
       ResultSet rs = ps.executeQuery();
       while (rs.next())
       { 
       %>
      <tr>
        <td><%=rs.getInt("id")%></td>
        <td><%=rs.getString("FirstName")%></td>
        <td><%=rs.getString("LastName")%></td>
        <td><%=rs.getString("MailID")%></td>
        <td><%=rs.getString("Number")%></td>
      </tr>
      <%
        }
        }
	   catch(Exception e)
	   {
	   	
	   }      
      %>
     </tr>
     </table>
     <tr><h1><b> THIS IS THE DATA YOU REQUESTED TO SEARCH </b></h1></tr>
      	<tr><td></td><td><a href="View.jsp" type="submit"> VIEW PAGE </a></td></tr>
      </center>
</body>
</html>