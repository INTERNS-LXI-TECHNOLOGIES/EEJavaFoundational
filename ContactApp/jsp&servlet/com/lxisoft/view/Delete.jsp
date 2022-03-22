<!DOCTYPE html>
<%@ page import = "java.sql.*" %>
<%@ page import = "com.lxisoft.controller.ContactRepo" %>
<%@ page import = "com.lxisoft.model.Contact" %>
<html> 
  <head>  
  <title>Delete Contacts</title> 
  </head>

  <body>
  <%
         // Contact contact = new Contact();
         
          ContactRepo cr = new ContactRepo();
               cr.deleteContacts(request.getParameter("sl_no"));

 response.sendRedirect("View.jsp");

     %>
     


     </body>
     </html>