<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
<%@page import = "com.lxisoft.config.*"%>
<%@page import="com.lxisoft.model.CovidAmrModel"%>
<%@page import="com.lxisoft.repository.SqlRepositoryAmr"%>
<%@page import="java.io.*"%>
<%@page import="java.util.*"%>
<%@page import="javax.servlet.*"%>
<%@page import="javax.servlet.http.*"%>
<%@page import="java.util.ResourceBundle"%>
<%@page import="java.util.ResourceBundle.Control"%>
<%@page contentType="text/html;charset=UTF-8"  pageEncoding="UTF-8"%>
<html>
<head>
  <title>User</title>
  <style>
body {
  background-image: url('View.png');
  background-repeat: no-repeat;
  background-attachment: fixed;
  background-size: cover;
}
</style>
</head>
<body> 
 <% ArrayList<CovidAmrModel> modelAmr=new ArrayList<CovidAmrModel>();
  SqlRepositoryAmr sqlrepoAmr=new SqlRepositoryAmr();
  modelAmr=sqlrepoAmr.readFromDatabase(modelAmr);
%>
  
    <%for(int i=0;i<modelAmr.size();i++)
    {%> <tr>
      <td><h2><%out.println(modelAmr.get(i).getName());%></h2></td>
      
       </tr></center>
    <br>
   <% }
    %>
   
  </table>
  <button formaction="Admin.jsp" class="button">back</button> 
</form>
</div>
</p>
</body>
</html>
 





