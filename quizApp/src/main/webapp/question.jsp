<!DOCTYPE html>
<html>
<head>
<title>Quiz Application</title>
</head>
<body>
 
<%@ page import="demoApp.*,java.util.List" %>
<% 
String name1 = request.getParameter("name1");
Servlet2 serv = new Servlet2();
 
Question quest = (Question)(session.getAttribute("quest"));
Question quest1 = (Question)(session.getAttribute("quest1"));
String options = request.getParameter("option");
Quizview quizview = new Quizview();
String questionNoText = request.getParameter("question_no");


String score = serv.removeLastChar(options);
int questionNo = (questionNoText != null)? Integer.parseInt(questionNoText):1;

String pp = String.valueOf(questionNo);

serv.updateScore(quest1, score);
 

%> 

<h1>Quiz Application</h1>
<p> <% 
  out.println(questionNo+". "+quest.toString());
  %>
</p>
<p>Select one option from below</p>
<form action="questions">
  <input type="radio" id="Real Madrid" name="option" value="<% out.println(quest.getOption1());%>">
  <label for="Real Madrid"><% out.println(quest.getOption1()); %></label><br>
   <input type="radio" id="Real Madrid" name="option" value="<% out.println(quest.getOption2());%>">
  <label for="Real Madrid"><% out.println(quest.getOption2()); %></label><br>
   <input type="radio" id="Real Madrid" name="option" value="<% out.println(quest.getOption3());%>">
  <label for="Real Madrid"><% out.println(quest.getOption3()); %></label><br>
  <br>
  <input type="hidden" name="question_no" id="question_no" value=<%= questionNo+1 %> />
 
  
  <input type="submit" value="Next"/>


</form>
 
</body>
</html>
