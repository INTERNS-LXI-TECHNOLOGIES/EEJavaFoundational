<%@page import="com.lxisoft.repository.*"%>
<%@page import="com.lxisoft.models.*"%>
<html>
<head>
	<title>EDIT</title>
	<meta charset="utf-8">
  	<meta name="viewport" content="width=device-width, initial-scale=1">
  	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
  	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
  	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
  	<style>
  		.button
  		{
  		background-color: #4CAF50;
  		}
  		div
  		{
  		padding-top: 50px;
  		padding-right: 30px;
  		padding-left: 80px;
  		padding-bottom: 50px;
  		}
  	</style>
</head>
<div class="jumbotron text-center">
	<center><h1>Edit Question</h1></center>
</div>
<body>
	<%Question qn=(Question)session.getAttribute("question");%>
	<form action="edit" method="post">
	<input type="hidden" name="qno" value="<%=qn.getQno()%>"/>
	<tr>		
		<td><div><input type="text" name="question" value="<%=qn.getQuestion()%>"><br>
		<br><input type="text" name="option1" value="<%=qn.getOption1()%>"><br>
		<br><input type="text" name="option2" value="<%=qn.getOption2()%>"><br>
		<br><input type="text" name="option3" value="<%=qn.getOption3()%>"><br>
		<br><input type="text" name="option4" value="<%=qn.getOption4()%>"><br>
		<br><input type="text" name="answer" value="<%=qn.getAnswer()%>"><br>
    <br><input type="text" name="answer2" value="<%=qn.getAnswer2()%>"><br>
		<br><a href="edit"><input type="submit" value=Save></a>
	</form>
	<a href="admin"><input type="submit" value=Cancel></a></div></td>
	</tr>
</body>
</html>