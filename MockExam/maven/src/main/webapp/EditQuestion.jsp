<html>
<head><title>Delete Question</title>
<style>
	body
	{
		background-color: #FF6F61  ;	
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
Question q = questions.get(id-1);
%>
<div align="center" style="background-color:#B22222;">
		<br>
		<br>
		<font size="9">Edit Question</font>
		<br>
		<br>
</div>
<form  	align="center" action="update">
<table align="center">
<tr>
<td> Question Number : </td>
<td> <input type="text" name="id" value = "<% out.println(id);%>" /> </td>
</tr>
<tr>
<td>Eneter the question  :</td><td> <input type="text" name="question" value ="<% out.println(q.getQuestion());%>" /> </td>
</tr>
<tr>
<td>CORRECT ANSWERE :</td><td> <input type="text" name="answere" value ="<% out.println(q.getAnswer());%>"/>  </td>
</tr>
<tr>
<td>option 1 :</td><td><input type="text" name="opt1"  value ="<% out.println(q.getOption1());%>" /> <br> </td>
</tr>
<tr>
<td>option 2 :</td><td> <input type="text" name="opt2"  value ="<% out.println(q.getOption2());%>" /> </td>
</tr>
<tr>
<td>option 3 :</td><td> <input type="text" name="opt3"  value ="<% out.println(q.getOption3());%>" /> </td>
</tr>
<tr>
	<td><input type="submit" name="sub" value="Update"> </td>
</table>
<%
db.updateDatabase(questions);
%>
<a href="AdminOptions.html">
      <button class="Admin Menu ">Admin Menu</button>
      </a>
</form>
</html>