<!DOCTYPE html>
<%@ page import = "java.sql.*" %> 
<html> 
  <head>  
  <title>Add Contacts</title> 
  </head>

  <body>

  <%
  
     try{
          
          Class.forName("com.mysql.cj.jdbc.Driver"); 
          Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/lxisoft","root","root"); 
          PreparedStatement ps = null;
         /* String f_name = "";
          String l_name = "";
          String ph_no = "";
          String email = "";
   
               f_name = request.getParameter("f_name");
               l_name = request.getParameter("l_name");
               ph_no = request.getParameter("ph_no");
               email = request.getParameter("email");-->
              out.println(request.getParameter("f_name"));
              out.println(request.getParameter("l_name"));
              out.println(request.getParameter("ph_no"));
              out.println(request.getParameter("email"));*/

              ps = con.prepareStatement("INSERT INTO contacts(f_name,l_name,ph_no,email) VALUES(?,?,?,?)");
              ps.setString(1, request.getParameter("f_name"));
              ps.setString(2, request.getParameter("l_name"));
              ps.setString(3, request.getParameter("ph_no"));
              ps.setString(4, request.getParameter("email"));


              ps.executeUpdate();
              response.sendRedirect("Contacts.jsp");
               out.println("update successfully!");
     
         }catch(Exception e){
     System.out.println(e);
     e.printStackTrace();
    }

    %>


  </body>
</html>