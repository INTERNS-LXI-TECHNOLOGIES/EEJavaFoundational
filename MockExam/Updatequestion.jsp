<%@page import="com.lxisoft.Model.ExamModel"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.lxisoft.Repository.SqlRepository"%>
<html>
<body>
  <%
  ArrayList<ExamModel> models = new ArrayList<ExamModel>();
  SqlRepository sqlrepo = new SqlRepository();
  models = sqlrepo.readFromDatabase(models);
  int i=Integer.parseInt(request.getParameter("Update"));
  %>
<form>
  <div>    
  <font size="7">UPDATE QUESTION</font><br>
  <h3><label for="question">Question : </label>
  <input type = "hidden" name="id" value = <%out.println(models.get(i).getId());%> >
  <input type="text" id="question" name="question" placeholder="<%out.println(models.get(i).getQuestion());%>"><br>
  <label for="option1">Option1 : </label>
  <input type="text" id="option1" name="option1" placeholder = "<%out.println(models.get(i).getOpt1());%>" ><br>
  <label for="option2">Option2 : </label>
  <input type="text" id="option2" name="option2" placeholder = "<%out.println(models.get(i).getOpt2());%>"><br>
  <label for="option3">Option3 : </label>
  <input type="text" id="option3" name="option3" placeholder = "<%out.println(models.get(i).getOpt3());%>"><br>
  <label for="option4">Option4 : </label>
  <input type="text" id="option4" name="option4" placeholder = "<%out.println(models.get(i).getOpt4());%>"><br>
  <label for="answer">Answer : </label>
  <input type="text" id="answer" name="answer" placeholder = "<%out.println(models.get(i).getAnswer());%>"><br></h3>
  <button formaction="Admin.jsp" class="button">BACK</button> 
  <button formaction="UpdateServlet" class="button">UPDATE </button>
</div>
</form>
</body>
</html>