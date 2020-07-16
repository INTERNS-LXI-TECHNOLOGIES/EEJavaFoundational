<html>
<%@ page import="com.lxisoft.model.*"%>
<%@ page import="com.lxisoft.repository.*"%>
<%@ page import="java.sql.*"%>
<%
Question q = new Question();
DatabaseRepo db = new DatabaseRepo();
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
db.addToDatabase(q);

%>
<a href="AdminOptions.html"><button class="button">Home</button></a>




</html>