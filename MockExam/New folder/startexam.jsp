<html>

	<%@ page import="com.lxisoft.repository.*"%>
	<%@ page import="com.lxisoft.model.*"%>
	<%@ page import="java.sql.*"%>
	<%@ page import="java.util.*"%>
  <head>
    <title>Start-Exam</title>
    	<style>
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
  <%
  HttpSession sessions = request.getSession(false);
  int i= (Integer)sessions.getAttribute("question_count");
  DatabaseRepo db = new DatabaseRepo();
  ArrayList<Question> questions = new ArrayList<Question>();
  questions = db.PrintDatabase();
 out.println("size = " + questions.size()+ "i= " + i);
  if(i<questions.size())
  {
 %>
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
//	 out.println("Last questions");
 %>
<input type="hidden" name="qCount" value="<%=i%>">
<button id="setmark" class="button">SUBMIT</button>
 </form>
 
     
  </body>