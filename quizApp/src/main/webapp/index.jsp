<!DOCTYPE html>
<html>
<head>
<title>Quiz Application</title>
</head>
<body>
  

<%@ page import="demoApp.*,java.util.List" %>
<%
Repository bd = new Repository();

bd.reset();
bd.idQ();
%>

<h1>WELCOME TO THE QUIZ GAME</h1>
<p><%= "You will have "+10+ " questions"%></p>
<p>You need to score minimum 50% to pass the Quiz</p>


<form action="questions">
<label for="name1"> Name: </label>
<input type="text" name="name1" id="name1"><br>

<p>Click next to continue</p>

<input type="submit" value="next"></input>

</form>
</body>
</html>
