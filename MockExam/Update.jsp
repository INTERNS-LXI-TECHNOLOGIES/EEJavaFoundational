<%@page import="com.lxisoft.Model.MockExamModel"%>
<%@page import="com.lxisoft.Repository.SqlRepository"%>
<%@page import="java.util.ArrayList"%>
<html>
<%
//ArrayList<MockExamModel> questions = (ArrayList<MockExamModel>)session.getAttribute("questions");
 ArrayList<MockExamModel> questions = new ArrayList<MockExamModel>();
  SqlRepository sqlReppo = SqlRepository.getInstance();
  questions = sqlReppo.readFromDatabase(questions);
%>
	<body>
	<link rel="stylesheet" href="Login.css"></link>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<body>
	<div>
	<form>
		<h1>!!UPDATE QUESTIONS !!</h1>
		<table style="width:70%" align = "center">
  <tr>
  	<th>QuestionNo</th>
    <th>Question</th>
    <th>Answer</th>
    <th>Option1</th>
    <th>Option2</th>
    <th>Option3</th>
    <th>Option4</th>
    <th>Update</th>
  </tr>
  <%
  for(int i =0;i<questions.size();i++)
  {
  	%>
  <tr align="center">
  	<td><h3><%out.println(i+1);%></h3></td>
    <td><h3><%out.println(questions.get(i).getQuestion().getQuestion());%></h3></td>
    <td><h3><%out.println(questions.get(i).getAnswer().getAnswer());%></h3></td>
    <td><h3><%out.println(questions.get(i).getOption1().getOption());%></h3></td>
    <td><h3><%out.println(questions.get(i).getOption2().getOption());%></h3></td>
    <td><h3><%out.println(questions.get(i).getOption3().getOption());%> </h3></td>
    <td><h3><%out.println(questions.get(i).getOption4().getOption());%> </h3></td>
    <td><button name ="Update" formaction ="UpdateQuestion.jsp" value =<%out.println(i);%>>UPDATE</button></td>
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