<%@page import="com.lxisoft.Model.ExamModel"%>
<%@page import="com.lxisoft.Repository.SqlRepository"%>
<%@page import="java.util.ArrayList"%>
<html>
<%
  ArrayList<ExamModel> models = new ArrayList<ExamModel>();
  SqlRepository sqlrepo = new SqlRepository();
  models = sqlrepo.readFromDatabase(models);
%>
    <body>
    <div>
    <form>
      <h1>DELETE</h1>
      <table style="width:70%" align = "center">
    <tr>
      <th>QuestionNo</th>
      <th>Question</th>
      <th>Option1</th>
      <th>Option2</th>
      <th>Option3</th>
      <th>Option4</th>
      <th>Answer</th>
      <th>Delete</th>
    </tr>
    <%
    for(int i =0;i<models.size();i++)
    {
      %>
    <tr align="center">
      <td><%out.println(i+1);%>
      <td><%out.println(models.get(i).getQuestion());%></td>
      <td><%out.println(models.get(i).getOpt1());%></td>
      <td><%out.println(models.get(i).getOpt2());%></td>
      <td><%out.println(models.get(i).getOpt3());%> </td>
      <td><%out.println(models.get(i).getOpt4());%> </td>
       <td><%out.println(models.get(i).getAnswer());%></td>
      <td><button formaction ="DeleteServlet" value =<%out.println(models.get(i).getId());%>DELETE</button></td>
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

