<%@page import="com.lxisoft.Model.MockExamModel"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.lxisoft.Repository.SqlRepository"%>
<html>
<link rel="stylesheet" href="Login.css"></link>
<!-- <meta name="viewport" content="width=device-width, initial-scale=1"> -->
<body>
  <%
  ArrayList<MockExamModel> questions = new ArrayList<MockExamModel>();
  SqlRepository sqlReppo = SqlRepository.getInstance();
  questions = sqlReppo.readFromDatabase(questions);

  int i = Integer.parseInt(request.getParameter("Update"));
  %>
<form>
	<div>
		
		<font size="9">UPDATE QUESTION</font><br>
  <h1><label for="question">Question : </label>
    <input type = "hidden" name="Id" value = <%out.println(questions.get(i).getId());%>>
  <input type="text" id="question" name="question" placeholder="<%out.println(questions.get(i).getQuestion().getQuestion());%>"><br>
  <label for="answer">Answer : </label>
  <input type="text" id="answer" name="answer" placeholder = "<%out.println(questions.get(i).getAnswer().getAnswer());%>"><br>
  <label for="option1">Option1 : </label>
  <input type="text" id="option1" name="option1" placeholder = "<%out.println(questions.get(i).getOption1().getOption());%>" ><br>
  <label for="option2">Option2 : </label>
  <input type="text" id="lname" name="option2" placeholder = "<%out.println(questions.get(i).getOption2().getOption());%>"><br>
  <label for="option3">Option3 : </label>
  <input type="text" id="lname" name="option3" placeholder = "<%out.println(questions.get(i).getOption3().getOption());%>"></h1>
  <label for="option4">Option4 : </label>
  <input type="text" id="lname" name="option4" placeholder = "<%out.println(questions.get(i).getOption4().getOption());%>"></h1><br>
  <button formaction="Admin.jsp" class="button">BACK</button> <button formaction="Update" class="button">UPDATE
  </button>
</div>
</form>
</body>
</html>