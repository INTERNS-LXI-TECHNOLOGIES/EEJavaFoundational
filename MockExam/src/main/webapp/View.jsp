<%@page import="com.lxisoft.Model.MockExamModel"%>
<%@page import="com.lxisoft.Repository.SqlRepository"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType = "text/html;charset=UTF-8" pageEncoding = "UTF-8"%>
<%@page import = "com.lxisoft.config.*"%>
<html>
<head>
  <meta http-equiv="Content_Type" content="text/html;charset=UTF-8"/>
  </head>
<%
  ArrayList<MockExamModel> questions = new ArrayList<MockExamModel>();
  SqlRepository sqlReppo = SqlRepository.getInstance();
  questions = sqlReppo.readFromDatabase(questions);

  Internationalization international = new Internationalization();
  String language = session.getAttribute("language").toString();
  if(language == null)
  {
    language = "en";
  }
  String back = international.localization(language,"IN","back");
  String viewQuestions = international.localization(language,"IN","ViewQuestions");

%>
	<body>
	<link rel="stylesheet" href="Style.css"></link>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<body>
	<div class="hello">
    <div align="center" style="background-color: darkmagenta;">
      <br>
      <br>
	<h1 style="font-size:50px;">!! <%out.println(viewQuestions);%> !!</h1>
  <br>
  <br>
  </div>
  <form>
		<br>
		<table style="width:90%" align = "center">
  <tr>
    <th>QuestionNo</th>
    <th>Question</th>
    <th>Answer</th>
    <th>Option1</th>
    <th>Option2</th>
    <th>Option3</th>
    <th>Option4</th>
  </tr>
  <%
  for(int i =0;i<questions.size();i++)
  {
  	%>
  <tr align="center">
    <td ><%out.println(i+1);%></td>
    <td><%out.println(questions.get(i).getQuestion().getQuestion());%></td>
    <td><%out.println(questions.get(i).getAnswer().getAnswer());%></td>
    <td><%out.println(questions.get(i).getOption1().getOption());%></td>
    <td><%out.println(questions.get(i).getOption2().getOption());%></td>
    <td><%out.println(questions.get(i).getOption3().getOption());%> </td>
    <td><%out.println(questions.get(i).getOption4().getOption());%></td>
  </tr>
  <%
	}
  %>
</table>
<br>
<div align="center">
	<button formaction="Admin.jsp" class="button"><%out.println(back);%></button> 
	</div>
  </form>
	</div>
	</body>
</html>