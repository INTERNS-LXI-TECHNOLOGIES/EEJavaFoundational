<%@page import="com.lxisoft.repository.*"%>
<%@page import="com.lxisoft.models.*"%>
<html>
<head>
	<title>EDIT</title>
	<meta charset="utf-8">
  	<meta name="viewport" content="width=device-width, initial-scale=1">
  	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>

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
		<td><br><div><input type="text" name="question" placeholder=NewQuestion><br>
		<br><input type="text" name="option1" placeholder=NewOption1><br>
		<br><input type="text" name="option2" placeholder=NewOption2><br>
		<br><input type="text" name="option3" placeholder=NewOption3><br>
		<br><input type="text" name="option4" placeholder=NewOption4><br>
		<br><input type="text" name="answer" placeholder=NewAnswer><br>
		<br><input type="submit" value=Save></a>
	</form>
	<a href="admin"><input type="submit" value=Cancel></a></div></td>
	</tr>
	</body>
</html>