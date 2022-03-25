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
         
          ContactRepo cr = new ContactRepo();
     cr.updateContacts(request.getParameter("f_name"),request.getParameter("l_name"),request.getParameter("ph_no"),request.getParameter("email"),request.getParameter("sl_no"));

           response.sendRedirect("View.jsp");

     %>
     


     </body>
     </html>