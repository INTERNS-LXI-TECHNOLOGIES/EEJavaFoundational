<!DOCTYPE html>
<html>
<head>
<title>Quiz Application</title>
</head>
<body>
    <link rel="stylesheet" href="index.css">

<%@ page import="com.Lxisoft.Files.*,java.util.List" %>
<% Controller controller = new Controller();

session.setAttribute("og", controller);
List<Question> questions = controller.loadQuestions();
%>

<h1>WELCOME TO THE QUIZ GAME</h1>
<p><%= "You will have "+questions.size()+ " questions"%></p>
<p>You need to score minimum 50% to pass the Quiz</p>
<p>Click next to continue</p>
<form action="question.jsp?question_no=1">
<input type="submit" value="next"></input>
</form>
</body>
</html>
