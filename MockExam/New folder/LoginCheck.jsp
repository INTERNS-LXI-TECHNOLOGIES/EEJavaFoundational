<html>
<head><title>Delete Question</title>
</head>
<%@ page import="com.lxisoft.repository.*"%>
<%@ page import="com.lxisoft.model.*"%>
<%@ page import="java.sql.*"%>
<%@ page import="java.util.*"%>
<%
Question q = new Question();
String sid = request.getParameter("id");
int id = Integer.parseInt(sid);
String question = request.getParameter("question"); 
String answere = request.getParameter("answere");
String option1 = request.getParameter("opt1");
String option2= request.getParameter("opt2");
String option3= request.getParameter("opt3");
q.question = question;
q.answer = answere;
q.option1= option1;
q.option2 = option2;
q.option3 = option3;
DatabaseRepo db = new DatabaseRepo();
ArrayList<Question> questions= new ArrayList<Question>();
questions = db.PrintDatabase();
questions.add(id-1 , q);
db.updateDatabase(questions);
%>
<a href="AdminOptions.html">
      <button class="Admin Menu ">Admin Menu</button>
      </a>

</html>