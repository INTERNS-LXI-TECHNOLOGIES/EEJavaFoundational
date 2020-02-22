<!DOCTYPE html>
<html>
<head>
	<title>Add</title>
	<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
</head>
<body>
<table>
	<form action="add" method="post">
	<tr>
		<td><br><input type="text" name="question" required="" placeholder=question><br>
		<br><input type="text" name="option1" required="" placeholder=option1><br>
		<br><input type="text" name="option2" required="" placeholder=option2><br>
		<br><input type="text" name="option3" required="" placeholder=option3><br>
		<br><input type="text" name="option4" required="" placeholder=option4><br>
		<br><input type="text" name="answer" required="" placeholder=answer><br>
		<br><input type="submit" value=Save></form>
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		<a href="admin"><input type="submit" value=Cancel></a>
		</td>
	</tr>
	</table>
</body>
</html>