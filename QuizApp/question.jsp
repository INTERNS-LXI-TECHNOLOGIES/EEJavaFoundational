<!DOCTYPE html>
<html>
<head>
<title>Quiz Application</title>
</head>
<body>
  <link rel="stylesheet" href="index.css">
<%@ page import="com.Lxisoft.Files.*,java.util.List" %>
<% 
Controller myCount = (Controller)session.getAttribute("og");
String options = request.getParameter("option");
Quizview quizview = new Quizview();
List<Question> questions = myCount.loadQuestions();
String questionNoText = request.getParameter("question_no");


String score = myCount.removeLastChar(options);
int questionNo = (questionNoText != null)? Integer.parseInt(questionNoText):1;
Question question =  (questionNo < 2)? questions.get(questionNo-1): questions.get(questionNo -2);


myCount.updateScore(question, score);
 
String result = (questionNo < questions.size())? "question.jsp":"result.jsp";

%> 

<h1>Quiz Application</h1>
<p> <% 
  out.println(questionNo+". "+questions.get(questionNo-1).getquestions());
  %>
</p>
<p>Select one option from below</p>
<form action="<%out.println(result);%>">
  <input type="radio" id="Real Madrid" name="option" value="<% out.println(questions.get(questionNo-1).getOption1());%>">
  <label for="Real Madrid"><% out.println(questions.get(questionNo-1).getOption1()); %></label><br>
  <input type="radio" id="css" name="option" value="<% out.println(questions.get(questionNo-1).getOption2());%>">
  <label for="html"><% out.println(questions.get(questionNo-1).getOption2()); %></label><br>
  <input type="radio" id="javascript" name="option" value="<% out.println(questions.get(questionNo-1).getOption3());%>">
  <label for="html"><% out.println(questions.get(questionNo-1).getOption3()); %></label><br>
  <br>
  <input type="hidden" name='question_no' id='question_no' value=<%= questionNo+1 %> />
  
  <input type="submit" value="Next"/>

  
</form>
 


</body>
</html>
