<html>
<head><title>display</title>
<style>
table, th, td {
  border: 1px solid black;
}
table.center {
  margin-left: auto; 
  margin-right: auto;
}
</style>
</head>
<%@ page import="com.lxisoft.repository.*"%>
<%@ page import="com.lxisoft.model.*"%>
<%@ page import="java.sql.*"%>
<%@ page import="java.util.*"%>
<%
DatabaseRepo db = new DatabaseRepo();
ArrayList<Question> questions= new ArrayList<Question>();
questions = db.PrintDatabase();
int id=1;
%>
<table style="background-color:#00FF00">
<tr><th>Question - Number </th><th>Question</th><th>Answere</th><th>Option-1</th><th>Option-2</th><th>Option-3</th><th> Select Any operation</th>
</tr>
<%
for(Question q : questions)
{
	%>
	<tr>
		<td><% out.println(id); %></td>
		<td><% out.println(q.question);%></td>
		<td><% out.println(q.answer); %></td>
		<td><% out.println(q.option1); %></td>
		<td><% out.println(q.option2); %></td>
		<td><% out.println(q.option3); %></td>
        <td><a href="DeleteQuestion.jsp?id=<%=id%>"><button>Delete</button>
        <a href="EditQuestion.jsp?id=<%=id%>"><button>Edit</button></td>

	</tr><%
	id++;
}
%>
</html>