<%@page import="com.lxisoft.servlet.*"%>
<%@page import="com.lxisoft.model.*"%>
<%@page import="com.lxisoft.repository.*"%>
<%@page import="java.util.*"%>
<!DOCTYPE HTML>
<html>
  <head>
    <title>Mock Exam</title>
  </head>

   <body>
   			<h1>Question</h1>
	
		<%  int i = Integer.parseInt(request.getParameter("count"));
			QuestionDatabase db = new QuestionDatabase();
			ArrayList<Question> questions = new ArrayList<Question>();
			questions = db.viewDatabase(questions);
			//session.setAttribute("examqus",questions);	%>
		
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
 			 <a href="addMark"><button id="myBtn" class="button">Submit</button></a>
 			 <input type="hidden" name="count" value="<%=i%>">

 			 <a href="addMark"><button id="myBtn2" class="button button2">Skip</button></a>
			<div><span id="countdown">10</span></div>	
 			</form>

		<%}					
			else
				{ response.sendRedirect("result.html"); }%>

    <a href="index.html"><button class="button">Close</button></a>
    </body>

  <!--   <form id="Question"; style= "text-align:left" action="addMark">				
			<li>Question :<%out.println(questions.get(i).getQuestion()+"?");%></li>
			<input type="radio" name="scores" id="1" value="1">
 			<label><%out.println(questions.get(i).getOption1());%></label><br>
 			
            <input type="hidden" name="count" value="<%=i%>">
 			 <a href="addMark"><button id="myBtn" class="button">Submit</button></a>
 			 <input type="hidden" name="count" value="<%=i%>"> -->
</html>
