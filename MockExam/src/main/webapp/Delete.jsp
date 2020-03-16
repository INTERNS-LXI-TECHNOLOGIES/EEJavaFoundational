<!DOCTYPE html>
<%@page import="com.lxisoft.Model.ExamModel"%>
<%@page import="com.lxisoft.Repository.SqlRepository"%>
<%@page import="java.util.ArrayList"%>
<html>
<head>
   <style>
body {
  background-image: url('download2.jpg');
  background-repeat: no-repeat;
  background-attachment: fixed;
  background-size: cover;
}
</style>

  </head>
<%
  ArrayList<ExamModel> models = new ArrayList<ExamModel>();
  SqlRepository sqlrepo = new SqlRepository();
  models = sqlrepo.readFromDatabase(models);
%>
    <body>
    <div>
    <form>
     <center> <h1>DELETE</h1></center>
      <table style="width:70%" align = "center">
    <tr>
      <th>Question</th>
      <th>Option1</th>
      <th>Option2</th>
      <th>Option3</th>
      <th>Option4</th>
      <th>Answer</th>
      <th>Delete</th>
    </tr>
    <%
    for(int i=0;i<models.size();i++)
    {
      %>
    <tr align="center">
     <td><h2> <%out.println(models.get(i).getQuestion());%></td>
      <td><%out.println(models.get(i).getOpt1());%></td>
      <td><%out.println(models.get(i).getOpt2());%></td>
      <td><%out.println(models.get(i).getOpt3());%></td>
      <td><%out.println(models.get(i).getOpt4());%></td>
       <td><%out.println(models.get(i).getAnswer());%></td>
      <td><button formaction ="DeleteServlet" name="Delete" value =<%out.println(models.get(i).getId());%>DELETE</button></h2></td>
    </tr>
    <%
     }
    %>
  </table><br>
  <button formaction="Admin.jsp" class="button">BACK</button> 
  </form>
  </div>
  </body>
  </html>

