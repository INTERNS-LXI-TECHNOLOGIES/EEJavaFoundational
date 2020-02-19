<%@page import="com.lxisoft.repository.*"%>
<%@page import="com.lxisoft.models.*"%>
<html>
<head></head>>
	<title>DELETE</title>
	<meta charset="utf-8">
  	<meta name="viewport" content="width=device-width, initial-scale=1">
  	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<div class="jumbotron text-center">
	<h1 align=center>Delete Question</h1>
</div>
<body>
	<%Question qn=(Question)session.getAttribute("question");
	int i=0;%>
	<table align=center border="5" width=100% height=100%>
	<form action="delete" method="get">
	<tr>
		<td><center>You want to delete?</center></td><br>
	</tr>
	<tr>
		<td><input type="hidden" name="qno" value="<%=qn.getQno()%>"><br>
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="submit" value=Delete>&nbsp;&nbsp;&nbsp;
	</form>
	<a href="admin"><input type="submit" value=Cancel></a>
	</td>
	</tr>
	</table>
</body>
</html>