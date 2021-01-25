<!DOCTYPE html>
<html>
<%@page import="com.lxisoft.model.Contact,com.lxisoft.control.*,com.lxisoft.repository.*"%>
<%@page import="java.sql.*,java.io.*,java.util.*"%>
<%@page import="java.sql.Connection"%>
<head>
  <title>Contact App</title>
</head>
<body bgcolor="800020">
  <center>
      <h1 class="text-center text-white pt-5">DELETE CONTACT</h1>
    <table>
        <tr><td>ENTER THE FIRST NAME YOU WANT TO DELETE : </td><td><input type="text" name="name"></td></tr>
      <tr><td></td><td><input type="submit" value="SUBMIT"></td></tr>
    </table>  
  </form>
  <%
     Control control = new Control();
     String name= request.getParameter("name");
     control.delete(name);
  %>
    <h1><b> YOUR REQUESTED CONTACT HAVE BEEN DELETED </b></h1>
      <table>
        <tr><td></td><td><a href="View.jsp" type="submit"> VIEW PAGE </a></td></tr>
      </table>
      </center>
</body>
</html>