<%@page import="com.lxisoft.repository.*"%>
<%@page import="com.lxisoft.models.*"%>
<html>
<head>
	<title>EDIT</title>
	</head>
	<body>
		<center><h1>Edit Question</h1></center>
		<%Question qn=(Question)session.getAttribute("question");%>
		<table align=center border=5 width=25% height=20% >
			<form action="edit" method="post">
				<input type="hidden" name="qno" value="<%=qn.getQno()%>"/>
			<tr>
				
				<td><br><input type="text" name="question" placeholder=NewQuestion><br>
				<br><input type="text" name="option1" placeholder=NewOption1><br>
				<br><input type="text" name="option2" placeholder=NewOption2><br>
				<br><input type="text" name="option3" placeholder=NewOption3><br>
				<br><input type="text" name="option4" placeholder=NewOption4><br>
				<br><input type="text" name="answer" placeholder=NewAnswer><br>
				<br><input type="submit" value=Save></a>
			</form>
			<a href="admin"><input type="submit" value=Cancel></a></td>
			</tr>
		</table>
		
	</body>
</html>