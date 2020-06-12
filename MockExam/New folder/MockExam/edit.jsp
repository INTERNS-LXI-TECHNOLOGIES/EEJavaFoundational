<%@page import="com.lxisoft.servlet.*"%>
<%@page import="com.lxisoft.model.*"%>
<%@page import="com.lxisoft.repository.*"%>
<%@page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
	<title>Edit</title>
		
</head>
<body>
		<%
		int i=Integer.parseInt(request.getParameter("id"));
			QuestionDatabase db = new QuestionDatabase();
			ArrayList<Question> questions = new ArrayList<Question>();
			questions = db.viewDatabase(questions);
		%>
	<div class="container">
		<form action="questionEdit" method="GET">
		<h2>Add Details</h2>
		<% for(int n=0;n<questions.size();n++)
		    {
			if(i==questions.get(n).getId())
			{%>
		 ID&nbsp&nbsp&nbsp<input type="text" name="id" placeholder="E" value="<%=request.getParameter("id")%>" readonly /><br><br>
		Question &nbsp&nbsp &nbsp<input type="text" name="Question" value ="<%out.println(questions.get(n).getQuestion());%>" required><br><br>
		Options One:<input type="text" value ="<%out.println(questions.get(n).getOption1());%>" name="option1" required><br><br>
		Options Two:<input type="text" value ="<%out.println(questions.get(n).getOption2());%>" name="option2" required><br><br>
		OptionsThree:<input type="text" value ="<%out.println(questions.get(n).getOption3());%>" name="option3" required><br><br>
		Options Four:<input type="text" value ="<%out.println(questions.get(n).getOption4());%>" name="option4" required><br><br>
		Answer :<input type="text" value ="<%out.println(questions.get(n).getAnswer());%>" name="answer" required><br><br><%}}%>
		<button class="button">Change</button>
		</form>	
		<br>
		<a href="index.html"><button class="button">Home</button></a>
	</div>
</body>
</html> 