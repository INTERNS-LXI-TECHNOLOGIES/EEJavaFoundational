
<!DOCTYPE HTML>
 
<html>
  <head>
  </head>
  <body>
    <%@page import="java.util.*,com.lxisoft.contactapp.model.*"%>
    <br/><br/>
    <form method="post" name="frm" action="search">
      <table border="0" width="300" align="center" bgcolor="#FA8072">
        <tr><td colspan=2 style="font-size:12pt;" align="center">
        <h3>Search contact</h3></td></tr>
        <tr><td ><b> Name</b></td>
          <td>: <input  type="text" name="Name">
        </td></tr>        
        <tr><td colspan=2 align="center">
        <input  type="submit" name="submit" value="Search"></td></tr>
        <h1>All contacts</h1> 
         <table border ="1" width="500" align="center"> 
         <tr bgcolor="00ffff"> 
          <th><b> ID</b></th> 
          <th><b> Name</b></th> 
          <th><b> Number</b></th> 
         </tr> 
         <%Contact c=(Contact)request.getAttribute("con");
         if(c!=null)
          {
         %>
            <tr> 
                <td><%=c.getId()%></td> 
                <td><%=c.getName()%></td> 
                <td><%=c.getNumber()%></td> 
            </tr> 
 <%}%>
      </table>
    </form>
  </body>
</html>