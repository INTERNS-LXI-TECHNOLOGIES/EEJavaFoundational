<html>

	<%@ page import="com.lxisoft.repository.*"%>
	<%@ page import="com.lxisoft.model.*"%>
	<%@ page import="java.sql.*"%>
	<%@ page import="java.util.*"%>
  <head>
    <title>Start-Exam</title>
    <style>
    #clk{
    display: inline;}
  
  	
    	.timer_div{
    	position:absolute;
  		bottom:0;

  		width:100%;
  		height:100px;
    	
    	}
		body{
		 background-color:#f7cac9 ;	
      text-align:center;  
		
		}	
		h1 {
  			color: black;
  			text-align: center;
  			font-family: courier;
			}
.button {
  padding: 15px 25px;
  font-size: 11px;
  text-align: center;
  cursor: pointer;
  outline: none;
  color: #fff;
  background-color: #4CAF50;
  border: none;
  border-radius: 15px;
  box-shadow: 0 9px #999;
}


.button:active {
  background-color: #3e8e41;
  box-shadow: 0 5px #666;
  transform: translateY(4px);
}
	</style>
  </head>
  <body>
  
<div class="main_div">
  <%
  HttpSession sessions = request.getSession(false);
  int i= (Integer)sessions.getAttribute("question_count");
  DatabaseRepo db = new DatabaseRepo();
  ArrayList<Question> questions = new ArrayList<Question>();
  questions = db.PrintDatabase();
// out.println("size = " + questions.size()+ "i= " + i);
  if(i<questions.size())
  {
	  String clk = "10";
 %>
 <script>
 var seconds = 10;
 function timer()
 {
 	seconds=seconds-1;
 	if(seconds >0 )
 	{
 		document.getElementById('clk').innerHTML = seconds;
 		//document.write(5);
 		window.setTimeout( "timer()", 1000 );
 		
 	}
 	else
 	{
 		alert
 		reLoad();
 	}
 }
 function reLoad()
 {
	// document.write(5 + 6);
	 document.getElementById("setmark").click();
 	 
	// document.getElementById("form").submit();
 }
 </script>

 <form >
 <div class="timer_div">
 <h1>Time Left : <div  id="clk"><%=clk%></div> 
 </h1>
 </div>
 </form>
 <script>
 timer();
 </script>
 
 <div  id="qnum_div"align="center" style="background-color:#a28089;">
		<br>
		<br>
		<font size="6">Question - <% out.println(i+1);%></font>
		<br>
		<br>
</div>
<div id ="form_div">
<form id="Question"; style= "text-align:left" action="setMark">				
			<li>Question :<%out.println(questions.get(i).getQuestion());%></li>
			<input type="radio" name="options" id="1" value="1">
 			<label><%out.println(questions.get(i).getOption1());%></label><br>
 			<input type="radio" name="options" id="2" value="2">
 			<label><%out.println(questions.get(i).getOption2());%></label><br>
 			<input type="radio" name="options" id="3" value="3">
 			<label><%out.println(questions.get(i).getOption3());%></label><br>
 			<input type="radio" name="options" id="4" value="4">
 			<label><%out.println(questions.get(i).getAnswer());%></label><br>
 <%
 i++;
 session.setAttribute("question_count",i);
  }
  else
  {
	  response.sendRedirect("viewResult");
  }

 %>
<input type="hidden" name="qCount" value="<%=i%>">
<button id="setmark" class="button">SUBMIT</button>
 </form>
</div>
  </body>