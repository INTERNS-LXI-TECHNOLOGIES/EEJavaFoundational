<%@page import="com.lxisoft.Model.MockExamModel"%>
<%@page import="com.lxisoft.Repository.SqlRepository"%>
<%@page import="java.util.ArrayList"%>
<!DOCTYPE html>
<link rel="stylesheet" href="Login.css"></link>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
</head>
<body>
	<%
	SqlRepository sqlReppo = SqlRepository.getInstance();
	ArrayList<MockExamModel> questions = new ArrayList<MockExamModel>();
	questions = sqlReppo.readFromDatabase(questions);
	session.setAttribute("questions",questions);
	%>
<div>
<h1>MOCK EXAM</h1>
<form>
<button formaction="Admin.jsp" class="button">ADMIN</button> <button type="submit" formaction="Introduction.jsp" class="button">USER</button>
</form>
</div>
</body>
</html>