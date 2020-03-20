<%@page import="com.lxisoft.Model.MockExamModel"%>
<%@page import="com.lxisoft.Repository.SqlRepository"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType = "text/html;charset=UTF-8" pageEncoding = "UTF-8"%>
<%@page import = "com.lxisoft.config.*"%>
<html>
<link rel="stylesheet" href="Style.css"></link>
<head>
    <meta http-equiv="Content_Type" content="text/html;charset=UTF-8"/>
</head>
<%
    Internationalization international = new Internationalization();
    String language = session.getAttribute("language").toString();
    if(language == null)
    {
        language = "en";
    }
    String back = international.localization(language,"IN","back");
    String delete = international.localization(language,"IN","Delete");
    String deleteQuestion = international.localization(language,"IN","DeleteQuestion");
    
 ArrayList<MockExamModel> questions = new ArrayList<MockExamModel>();
  SqlRepository sqlReppo = SqlRepository.getInstance();
  questions = sqlReppo.readFromDatabase(questions);
%>
	
	<body>
	<div>
	<form>
    <div class="hello" style ="border: outset;">
    <div align="center" style="background-color: darkmagenta;">
      <br>
		<h1 style="font-size:50px;">!! <%out.println(deleteQuestion);%> !!</h1>
    <br>
    </div>
    <br>
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
    <th>Delete</th>
  </tr>
  <%
  for(int i =0;i<questions.size();i++)
  {
  	%>
  <tr align="center">
  	<td><%out.println(i+1);%>
    <td><%out.println(questions.get(i).getQuestion().getQuestion());%></td>
    <td><%out.println(questions.get(i).getAnswer().getAnswer());%></td>
    <td><%out.println(questions.get(i).getOption1().getOption());%></td>
    <td><%out.println(questions.get(i).getOption2().getOption());%></td>
    <td><%out.println(questions.get(i).getOption3().getOption());%> </td>
    <td><%out.println(questions.get(i).getOption4().getOption());%> </td>
    <td><button style="background-color: darkmagenta;" name ="Delete" formaction ="Delete" value =<%out.println(questions.get(i).getId());%>><%out.print(delete);%></button></td>
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
  </div>
	</body>
</html>