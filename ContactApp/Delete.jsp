<!DOCTYPE html>
<%@ page import = "java.sql.*" %> 
<html> 
  <head>  
  <title>Delete Contacts</title> 
  </head>

  <body>
   <%
     try{
          
          Class.forName("com.mysql.cj.jdbc.Driver"); 
         Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/lxisoft","root","root"); 
          PreparedStatement ps = null;
          
          ps = con.prepareStatement(" DELETE FROM contacts WHERE ph_no ='"+request.getParameter("ph_no")+"'" );
           ps.executeUpdate();
           response.sendRedirect("Contacts.jsp");
out.println("Data Deleted Successfully!");
}
catch(Exception e)
{
System.out.print(e);
e.printStackTrace();
}
         
     %>
     </body>
     </html>