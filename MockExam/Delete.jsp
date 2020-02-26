<%@page import="com.lxisoft.repository.*"%>
<%@page import="com.lxisoft.models.*"%>
<html>
<head>
	<style>
	  	.button
	  	{
	  		background-color: #4CAF50;
	  	}
	  	div
	  	{
	  		padding-top: 20px;
	  		padding-right: 70px;
	  		padding-left: 70px;
	  		padding-bottom: 20px;
	  	}
  	</style>
	<title>DELETE</title>
	<meta charset="utf-8">
  	<meta name="viewport" content="width=device-width, initial-scale=1">
  	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
  	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
  	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
</head>
<div class="jumbotron text-center">
	<h1 align=center>Delete Question</h1>
</div>
<body>
	<%Question qn=(Question)session.getAttribute("question");%>
	<table align=center border="1" width=30% height=25%>
	<form action="delete" method="get">
	<tr>
		<td><center><div>You want to delete?</center></div></td><br>
	</tr>
	<tr>
		<td>
		<div><input type="hidden" name="qno" value="<%=qn.getQno()%>">
			<input type="submit" value=Confirm>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	</form>
	<a href="admin"><input type="submit" value=Cancel></a></div>
		</td>
	</tr>
	</table>
</body>
</html>