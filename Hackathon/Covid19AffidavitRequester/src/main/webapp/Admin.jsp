<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
<%@page import = "com.amritha.config.*"%>
<%@page import="com.amritha.model.CovidAmrModel"%>
<%@page import="com.amritha.repository.SqlRepositoryAmr"%>
<%@page import="java.io.*"%>
<%@page import="java.util.*"%>
<%@page import="javax.servlet.*"%>
<%@page import="javax.servlet.http.*"%>
<%@page contentType="text/html;charset=UTF-8"  pageEncoding="UTF-8"%>
<html>
<head>
   <div align="center" style="background-color: grey " class = "inset">
    <h1 style="font-size:50px;"> Admin Management </h1>
  
<div>
 
  <form>
<% ArrayList<CovidAmrModel> modelAmr=new ArrayList<CovidAmrModel>();
  SqlRepositoryAmr sqlrepoAmr=new SqlRepositoryAmr();
  modelAmr=sqlrepoAmr.readFromDatabase(modelAmr);
%>
  <table>
    <center>
    <tr>
    <th><h2>Name</h2></th> 
    <th><h2>Address</h2></th>
    </tr>
    <%for(int i=0;i<modelAmr.size();i++)
    {%> <tr>
      <td><h2><%out.println(modelAmr.get(i).getNameAmr());%></h2></td>
      <td><h2><%out.println(modelAmr.get(i).getAddressAmr());%></h2></td>
      </tr></center>
    <br>
   <% }
    %>
   
  </table>
  <a href="View.jsp">Click here for details</a><br><br>
  <button formaction="index.jsp" class="button">Back</button> 
</form>
</div>
</p>
</body>
</html>
 





