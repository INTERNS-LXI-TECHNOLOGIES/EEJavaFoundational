<!DOCTYPE html>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
<%@page import = "com.lxisoft.Config.*"%>
<%@page import="java.io.*"%>
<%@page import="java.util.*"%>
<%@page import="javax.servlet.*"%>
<%@page import="javax.servlet.http.*"%>
<%@page import="java.util.ResourceBundle"%>
<%@page import="java.util.ResourceBundle.Control"%>
<%@page contentType="text/html;charset=UTF-8"  pageEncoding="UTF-8"%>
<%@page import="com.lxisoft.Model.ExamModel"%>
<%@page import="com.lxisoft.Repository.SqlRepository"%>

<html>
<%
	ArrayList<ExamModel> models=new ArrayList<ExamModel>();
  	SqlRepository sqlrepo=new SqlRepository();
  	models=sqlrepo.readFromDatabase(models);
%>
<head>
   <style>
body {
  background-image: url('Delete.png');
  background-repeat: no-repeat;
  background-attachment: fixed;
  background-size: cover;
}
</style>
</head>
	<body>
<%
  Internationalization international = new Internationalization();
  String language = session.getAttribute("language").toString();
  if(language == null)
  {
    language = "en";
  } 
   session.setAttribute("language",language);
   String back= international.localization(language,"IN","Back");
  %>
   <a href = "?language=mal">Malayalam</a>
   <a href = "?language=en">English</a>
  <div class = "inset">
    <div class="dimbly" align="center">

	<div>
	<form>
		<center><h1>UPDATE</h1></center>
		<table style="width:70%" align ="center">
  <tr>
    <th><h2>Question</h2></th> 
    <th><h2>Option 1</h2></th>
    <th><h2>Option 2</h2></th>
    <th><h2>Option 3</h2></th>
    <th><h2>Option 4</h2></th>
    <th><h2>Answer</h2></th>
    <th><h2>Update</h2></th>
  </tr>
  <%
  for(int i=0;i<models.size();i++)
  {
  	%>
  <tr align="center">
  	  <td><h2><%out.println(models.get(i).getQuestion());%></h2></td>
      <td><h2><%out.println(models.get(i).getOpt1());%></h2></td>
      <td><h2><%out.println(models.get(i).getOpt2());%></h2></td>
      <td><h2><%out.println(models.get(i).getOpt3());%></h2></td>
      <td><h2><%out.println(models.get(i).getOpt4());%></h2></td>
      <td><h2><%out.println(models.get(i).getAnswer());%></h2></td>
      <td><button name ="Update" formaction ="Updatequestion.jsp" value=<%out.println(i);%>UPDATE</button></td>
  </tr>
  <%
	}
  %>
</table><br>
	<button formaction="Admin.jsp" class="button"><%back%></button> 
	</form>
	</div>
	</body>
</html>




