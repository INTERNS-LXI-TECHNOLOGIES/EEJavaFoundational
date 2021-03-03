<!DOCTYPE html>
<html>
<%@page import="com.lxisoft.model.Contact,com.lxisoft.servlet.*,com.lxisoft.repository.*,com.lxisoft.servlet.*"%>
<%@page import="java.sql.*,java.io.*"%>
<%@page import="java.sql.Connection"%>
<head>
	<title> SEARCH OPTION </title>
</head>
<body bgcolor="pink">
  <%if(request.isUserInRole("admin")){%>
	<center>
		<h1 class="text-center text-white pt-5">SEARCH OPTION</h1>
		<form action="SearchServlet" method="get">
			<tr><td>ENTER THE FIRST NAME TO SEARCH : </td><td><input type="text" name="name"></td></tr>
			<tr><td></td><td><input type="submit" value="SUBMIT"></td></tr>
		<table border="1">
     <tr>
        <th>Name</th>
        <th>Age</th>
        <th>Address</th>
        <th>MailID</th>
        <th>Number</th>
        <th>Blood Group</th>
        <th>Reject</th>
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
		<tr><td></td><td><a href="ViewServlet" type="submit"> VIEW PAGE </a></td></tr>	
	</form>
	</center>
</body>
<%}
  else
    {
      response.sendRedirect("ucantuse.jsp");
    }
%>
</html>