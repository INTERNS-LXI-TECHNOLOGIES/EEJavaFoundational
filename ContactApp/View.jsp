<!DOCTYPE html>
<html>
<%@page import="com.lxisoft.model.Contact,com.lxisoft.servlet.*,com.lxisoft.repository.*,com.lxisoft.servlet.*"%>
<%@page import="java.sql.*,java.io.*,java.util.*"%>
<%@page import="java.sql.Connection"%>
<head>
	<title>Contact App</title>
</head>
<body bgcolor="B87333">
  <center>
    <table border="">
      <tr>
        <th>Id</th>
        <th>First Name</th>
        <th>Last Name</th>
        <th>MailID</th>
        <th>Number</th>
      </tr>
      <tr>
	   <%  
 try
  {
      Class.forName("com.mysql.cj.jdbc.Driver");
       Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/contactapp","root","password");
        Statement stmt = con.createStatement();
       PreparedStatement ps =con.prepareStatement("select * from contactapp");
      ResultSet rs = ps.executeQuery();
     while(rs.next())
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
    con.close();
  }
      catch(SQLException e)
      {
        
      }
      %>
      </tr>
    </table>
    <tr><h1><b> THE DETAILS OF THE CONTACTS </b></h1></tr>  
    <table>
       <tr><td></td><td><a href="addContact.jsp" type="submit"> ADD CONTACT </a></td></tr>
       <tr><td></td><td><a href="Search1.jsp" type="submit"> SEARCH CONTACT </a></td></tr>
      <tr><td></td><td><a href="Delete.jsp" type="submit"> DELETE CONTACT </a></td></tr>
        <tr><td></td><td><a href="index.jsp" type="submit"> INDEX PAGE </a></td></tr>
    </table>
         </center>
</body>
</html>