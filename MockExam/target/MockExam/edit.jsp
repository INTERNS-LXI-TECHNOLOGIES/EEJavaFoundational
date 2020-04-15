<%@page import="com.lxisoft.servlet.*"%>
<%@page import="com.lxisoft.model.*"%>
<%@page import="com.lxisoft.repository.*"%>
<%@page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
	<title>Edit</title>
		<style>
		body{
		 background-color: lightblue;	
		 margin-top:250px;
		 text-align:center;
		}

		h1 {
  			color: black;
  			text-align: center;
  			font-family: verdana;
			}
	.button {
  background-color: #4CAF50;
  border: none;
  color: white;
  padding: 8px 35px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
  margin: 4px 2px;
  cursor: pointer;
}
/*.button2 {background-color: #f44336;}	*/
	</style>
</head>
<body>
		<%
		int n =Integer.parseInt(request.getParameter("id"));
			ExamDatabase db = new ExamDatabase();
			ArrayList<Problem> questions = new ArrayList<Problem>();
			questions = db.viewDatabase(questions);
		%>
	<div class="container">
		<form action="questionEdit" method="GET">
		<h2>Add Details</h2>
		 ID&nbsp&nbsp&nbsp<input type="text" name="id" placeholder="E" value="<%=request.getParameter("id")%>" readonly /><br><br>
		Question &nbsp&nbsp &nbsp<input type="text" name="Question" value ="<%questions.get(n).getQuestion();%>" required><br><br>
		Options One:<input type="text" value ="<%questions.get(n).getOption1();%>" name="option1" required><br><br>
		Options Two:<input type="text" value ="<%questions.get(n).getOption2();%>" name="option2" required><br><br>
		OptionsThree:<input type="text" value ="<%questions.get(n).getOption3();%>" name="option3" required><br><br>
		Options Four:<input type="text" value ="<%questions.get(n).getOption4();%>" name="option4" required><br><br>
		Answer :<input type="number" value ="<%questions.get(n).getAnswer();%>" name="answer" required><br><br>
		<button class="button">Change</button>
		</form>	
		<br>
		<a href="index.html"><button class="button">Home</button></a>



	</div>
</body>
</html> 