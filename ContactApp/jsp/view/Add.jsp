<!DOCTYPE html>
<%@ page import = "java.sql.*" %>
<%@ page import = "com.lxisoft.controller.ContactRepo" %>
<%@ page import = "com.lxisoft.model.Contact" %>
<html> 
  <head>  
  <title>Add Contacts</title> 
  </head>

  <body>
    <%
         // Contact contact = new Contact();
         String name1,name2,phone,email;
          ContactRepo cr = new ContactRepo();
          name1 = request.getParameter("f_name");
          name2 = request.getParameter("l_name");
          phone = request.getParameter("ph_no");
          email = request.getParameter("email");
         cr.addContacts(name1,name2,phone,email);

 response.sendRedirect("View.jsp");




     %>
     


     </body>
     </html>