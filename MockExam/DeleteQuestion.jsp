<html>
<head><title>Delete Question</title>
</head>
<%@ page import="com.lxisoft.repository.*"%>
<%@ page import="com.lxisoft.model.*"%>
<%@ page import="java.sql.*"%>
<%@ page import="java.util.*"%>
<%
String sid = request.getParameter("id");
int id = Integer.parseInt(sid);
DatabaseRepo db = new DatabaseRepo();
ArrayList<Question> questions= new ArrayList<Question>();
questions = db.PrintDatabase();
questions.remove(id-1);

db.updateDatabase(questions);
%>
<a href="AdminOptions.html">
      <button class="Admin Menu ">Admin Menu</button>
      </a>

</html>