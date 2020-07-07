<%@page import="com.lxisoft.servlet.*"%>
<%@page import="com.lxisoft.model.*"%>
<%@page import="com.lxisoft.repository.*"%>
<%@page import="java.util.*"%>
<!DOCTYPE HTML>
<html>
  <head>
    <title>Mock Exam</title>
    	<style>
		body{
		 background-color:#C2F6A6 ;	
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
  padding: 15px 32px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
  margin: 4px 2px;
  cursor: pointer;

  .button:hover {  background-color: black;}
}	
	</style>
  </head>

   <body>
   			<h1>Question</h1>
	
		<%  int i = Integer.parseInt(request.getParameter("count"));
			QuestionDatabase db = new QuestionDatabase();
			ArrayList<Question> questions = new ArrayList<Question>();
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
 			 <a href="addMark"><button id="myBtn" class="button">Submit</button></a>
 			 <input type="hidden" name="count" value="<%=i%>">

 			 <a href="addMark"><button id="myBtn2" class="button button2">Skip</button></a>
			<div><span id="countdown">10</span></div>	
 			</form>

		<%}					
			else
				{ response.sendRedirect("resultView"); }%>

    <a href="index.html"><button class="button">Close</button></a>

    <script type="text/javascript">
	var seconds = document.getElementById("countdown").textContent;
var countdown = setInterval(function() {
    seconds--;
    document.getElementById("countdown").textContent = seconds;
    if (seconds <= 0)
    {   clearInterval(countdown);
    	document.getElementById("myBtn").disabled = true;
    	document.getElementById("1").disabled = true;
    	document.getElementById("2").disabled = true;
    	document.getElementById("3").disabled = true; 
	   	document.getElementById("4").disabled = true;   	

	   	// 	document.getElementById("myBtn").disabled = true;
    	// document.getElementById("1").disabled = true;
    	// document.getElementById("2").disabled = true;
    	// document.getElementById("3").disabled = true; 
	   	// document.getElementById("4").disabled = true;   	

	}
}, 1000);
</script>
	



    </body>

 
</html>
