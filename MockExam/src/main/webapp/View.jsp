<%@page import="com.lxisoft.Model.ExamModel"%>
<%@page import="com.lxisoft.Repository.SqlRepository"%>
<%@page import="java.util.ArrayList"%>
<html>
<head>
  <title>Questions</title>
  <style>
body {
  background-image: url('crud.jpg');
  background-repeat: no-repeat;
  background-attachment: fixed;
  background-size: cover;
}
</style>

</head>
<body>  
  <form>
<% ArrayList<ExamModel> models=new ArrayList<ExamModel>();
  SqlRepository sqlrepo=new SqlRepository();
  models=sqlrepo.readFromDatabase(models);
%>
  <table>
    <center>
    <tr>
    <!-- <th><h2>Qno</h2></th> -->
    <th><h2>Question</h2></th> 
    <th><h2>Option 1</h2></th>
    <th><h2>Option 2</h2></th>
    <th><h2>Option 3</h2></th>
    <th><h2>Option 4</h2></th>
    </tr>
    <%for(int i=0;i<models.size();i++)
    {%> <tr>
    <!--   <td><h2><%out.println(models.get(i).getId());%></h2></td> -->
      <td><h2><%out.println(models.get(i).getQuestion());%></h2></td>
      <td><h2><%out.println(models.get(i).getOpt1());%></h2></td>
      <td><h2><%out.println(models.get(i).getOpt2());%></h2></td>
      <td><h2><%out.println(models.get(i).getOpt3());%></h2></td>
      <td><h2><%out.println(models.get(i).getOpt4());%></h2></td>
       </tr></center>
    <br>
   <% }
    %>
   
  </table>
  <button formaction="Admin.jsp" class="button">BACK</button> 
</form>
</div>
</p>
</body>
</html>
 