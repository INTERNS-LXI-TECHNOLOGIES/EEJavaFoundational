<!DOCTYPE html>
<html>
<%@page import="com.lxisoft.model.Contact,com.lxisoft.servlet.*,com.lxisoft.repository.*,com.lxisoft.servlet.*"%>
<%@page import="java.sql.*,java.io.*,java.util.*"%>
<%@page import="java.sql.Connection"%>
<head>
  <title>Contact App</title>
</head>
<body bgcolor="800020">
   <%if(request.isUserInRole("admin")){%>
    <form action="DeleteServlet" method="get">
  <center>
      <h1 class="text-center text-white pt-5">REJECT USER</h1>
    <table>
        <tr><td>DO YOU WANT TO REJECT THIS PATIENT: </td></tr>
        <div class="form-group">
         <label for="number" class="text-info">Name</label><br>
         <input type="name" name="name" id="name" class="form-control"value="<%= request.getParameter("name")%>">
         <input type="hidden" name="id" id="id" class="form-control " value="<%= request.getParameter("id")%>">
         <input type="submit" name="name" value="YES">
         <a href="ViewServlet"><input type="button" name="name" value="NO"></a>
         </div>                  
    </table>  
      </center>
        </form>
</body>
<%}
  else
    {
      response.sendRedirect("ucantuse.jsp");
    }
%>
</html>