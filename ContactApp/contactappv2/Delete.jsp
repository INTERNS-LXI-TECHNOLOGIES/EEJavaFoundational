<!DOCTYPE HTML>
 
<html>
  <head>
  </head>
  <body>
    <%@page import="java.util.*,com.lxisoft.contactapp.model.*"%>
    <br/><br/>
    <form method="post" name="frm" action="Delete">
      <table border="0" width="300" align="center" bgcolor="#FA8072">
        <tr><td colspan=2 style="font-size:12pt;" align="center">
        <h3>Search contact</h3></td></tr>
        <tr><td ><b> Name</b></td>
          <td>: <input  type="text" name="Name">
        </td></tr>        
        <tr><td colspan=2 align="center">
        <input  type="submit" name="submit" value="Delete"></td></tr>
           </table>
    </form>
  </body>
</html>