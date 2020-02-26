<%@page import="com.lxisoft.Model.MockExamModel"%>
<%@page import="java.util.ArrayList"%>
<html>
<%
ArrayList<MockExamModel> questions = (ArrayList<MockExamModel>)session.getAttribute("questions");
%>
	<body>
	<link rel="stylesheet" href="Login.css"></link>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<body>
	<div>
	<form>
		<h1>!! Questions !!</h1>
		<table style="width:50%" align = "center">
  <tr>
  	<th>QuestionID</th>
    <th>Question</th>
    <th>Option1</th>
    <th>Option2</th>
    <th>Option3</th>
    <th>Option4</th>
  </tr>
  <%
  for(int i =0;i<questions.size();i++)
  {
  	%>
  <tr>
  	<td><%out.println(questions.get(i).getId());%>
    <td><%out.println(questions.get(i).getQuestion().getQuestion());%></td>
    <td><%out.println(questions.get(i).getAnswer().getAnswer());%></td>
    <td><%out.println(questions.get(i).getOption1().getOption());%></td>
    <td><%out.println(questions.get(i).getOption2().getOption());%></td>
    <td><%out.println(questions.get(i).getOption3().getOption());%> </td>
    <td><button name ="Update" formaction ="UpdateQuestion.jsp" value =<%out.println(i);%>>UPDATE</button></td>
  </tr>
  <%
	}
  %>
</table>
	<button formaction="Admin.jsp" class="button">BACK</button> 
	</form>
	</div>
	</body>
</html>