<%@page import="com.lxisoft.config.*"%>
<%@page import="com.lxisoft.models.*"%>
<%@page import="com.lxisoft.repository.*"%>
<%@page import="java.io.*"%>
<%@page import="java.util.*"%>
<%@ page contentType="text/html;charset=UTF-8"  pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>
<head>
	<title>All Questions</title>
</head>
	<%List<Question>questionList=new ArrayList<Question>();
	SqlRepository sqlRepo=new SqlRepository();
  	questionList= sqlRepo.getAllQuestion();%>
<body>
	<H1><CENTER>QUESTIONS</CENTER></H1>
	<table bgcolor="#ccccff" align=center border="1px" width="30%">
<tr>
    <th>QNo</th>
    <th>Question</th>
    <th>Option1</th>
    <th>Option2</th>
    <th>Option3</th>
    <th>Option4</th>
     <th>Answer</th>
  </tr>
  <%
  for(int i =0;i<questionList.size();i++)
  {
  	%>
  <tr align="center">
    <td ><%out.println(i+1);%></td>
    <td><%out.println(questionList.get(i).getQuestion());%></td>
    <td><%out.println(questionList.get(i).getOption1());%></td>
    <td><%out.println(questionList.get(i).getOption2());%></td>
    <td><%out.println(questionList.get(i).getOption3());%> </td>
    <td><%out.println(questionList.get(i).getOption4());%></td>
    <td><%out.println(questionList.get(i).getAnswer());%></td>
  
  			<form action="select" method="get">
	    	<input type="hidden" name="qno" value="<%=questionList.get(i).getQuestion()%>">
	    	<input type="hidden" name="opt" value="a">
	        <td><input type="submit" value=delete></td></form>

	        <form action="select" method="get">
	        <input type="hidden" name="qno" value="<%=questionList.get(i).getQuestion()%>">
	        <input type="hidden" name="opt" value="b">
	        <td><input type="submit" value=edit></td></form></tr>
  <%
	}
  %>
</table>
</body>
</html>