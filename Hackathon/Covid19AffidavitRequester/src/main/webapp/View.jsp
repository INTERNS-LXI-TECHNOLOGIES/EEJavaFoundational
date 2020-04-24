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
  <title>Users</title>
 
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
      <td><h2><%out.println(modelAmr.get(i).getPhnoAmr());%></h2></td>
      <td><h2><%out.println(modelAmr.get(i).getVehicleNoAmr());%></h2></td>
      <td><h2><%out.println(modelAmr.get(i).getVehicleTypeAmr());%></h2></td>
      <td><h2><%out.println(modelAmr.get(i).getLocationAmr());%></h2></td>
      <td><h2><%out.println(modelAmr.get(i).getDestinationAmr());%></h2></td>
      <td><h2><%out.println(modelAmr.get(i).getCoPassengerAmr());%></h2></td>
      <td><h2><%out.println(modelAmr.get(i).getRelationAmr());%></h2></td>
      <td><h2><%out.println(modelAmr.get(i).getReasonAmr());%></h2></td>
      <td><h2><%out.println(modelAmr.get(i).getTimeAmr());%></h2></td>
      </tr></center>
    <br>
   <% }
    %>
   
  </table>
  <button formaction="Admin.jsp" class="button">Back</button> 
</form>
</div>
</p>
</body>
</html>
 





