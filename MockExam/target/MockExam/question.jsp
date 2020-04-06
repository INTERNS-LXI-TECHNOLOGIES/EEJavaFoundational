<%@page import="com.lxisoft.servlet.*"%>
<%@page import="com.lxisoft.model.*"%>
<%@page import="com.lxisoft.repository.*"%>
<%@page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
	<title>ViewQuestion</title>
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
.button:hover {  background-color: black;}
.button2:hover {  background-color: #f44336;}
.button2 {background-color: #4CAF50;}	
	</style>
</head>
<body>
	<h1>Question</h1>
	
		<%  int i = Integer.parseInt(request.getParameter("count"));
			ExamDatabase db = new ExamDatabase();
			ArrayList<Problem> questions = new ArrayList<Problem>();
			questions = db.viewDatabase(questions);
			session.setAttribute("examqus",questions);	%>
		
		<%	if(i<questions.size()) {%>
		
		<form id="Question"; style= "text-align:left" action="addMark">				
			<li>Question :<%out.println(questions.get(i).getQuestion()+"?");%></li>
			<input type="radio" name="scores" id="1" value="1">
 			<label><%out.println(questions.get(i).getOption1());%></label><br>
 			<input type="radio" name="scores" id="2" value="2">
 			<label><%out.println(questions.get(i).getOption2());%></label><br>
 			<input type="radio" name="scores" id="3" value="3">
 			<label><%out.println(questions.get(i).getOption3());%></label><br>
 			<input type="radio" name="scores" id="4" value="4">
 			<label><%out.println(questions.get(i).getOption4());%></label><br>
            <%i++;%>
            <input type="hidden" name="count" value="<%=i%>">
 			 <a href="addMark"><button class="button">Submit</button></a>
				
 			</form>

		<%}					
			else
				{ response.sendRedirect("viewMark"); }%>	
</body>

</html>