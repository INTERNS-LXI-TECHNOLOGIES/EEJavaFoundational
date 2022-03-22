<!DOCTYPE html> 
<%@ page import = "java.sql.*" %> 
<html> 
  <head>  
  <title>Update Contacts</title> 
  </head>
  <body>
<%

 try{
          
          Class.forName("com.mysql.cj.jdbc.Driver"); 
          Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/lxisoft","root","root"); 
          Statement st  = con.createStatement(); 
          String sl_no = request.getParameter("sl_no");
          int num = Integer.parseInt(sl_no);
          ResultSet rs = st.executeQuery("select * from contacts where sl_no = '"+sl_no+"'");
          PreparedStatement ps = null;
         while(rs.next()) 
          {

          String fName = request.getParameter("f_name");
          String lName = request.getParameter("l_name");
          String phn = request.getParameter("ph_no");
          String email = request.getParameter("email");
         // Integer sl_no = rs.getInt(5);
         if(fName != null && lName != null && phn != null && email != null){


               ps = con.prepareStatement("UPDATE contacts set f_name=?,l_name=?,ph_no=?,email=? WHERE sl_no = "+rs.getInt(5));
               ps.setString(1, request.getParameter("f_name"));
               ps.setString(2, request.getParameter("l_name"));
               ps.setString(3, request.getParameter("ph_no"));
               ps.setString(4, request.getParameter("email"));
               ps.executeUpdate();
                response.sendRedirect("Contacts.jsp");
out.println("update successfully!");
          }
else{
  out.println("Some issues occured");
}
out.println("UPDATE contacts set f_name = "+ fName + ", l_name = " + lName + ", ph_no = " + phn + ", email = " + email +" WHERE sl_no = "+rs.getInt(5));
      }
       con.close();
         st.close();
         }catch(Exception e){
     System.out.println(e);
     e.printStackTrace();
    }
    %>
        </body>
        </html>