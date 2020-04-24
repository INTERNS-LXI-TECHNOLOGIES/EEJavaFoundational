<%@page import="com.mockexam.model.*"%>
<%@page import="com.mockexam.repository.*"%>
<%@page import="com.mockexam.servlet.*"%>
<%@page import="javax.servlet.http.*"%>
<%@page import="javax.servlet.*"%>
<%@page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
	<title>Search Results</title>
	<style type="text/css">
		html,body{
			padding: 5px;margin: 10px;
			background:#009b77;
		}
	</style>
</head>
<body>
	<h3 style="text-align: center;">Mock Exam</h3>
	<table border="1" width="100%">
		<tr>
			<th>SL.NO</th>
			<th>ID</th>
			<th>QUESTION</th>
			<th>OPT_1</th>
			<th>OPT_2</th>
			<th>OPT_3</th>
			<th>OPT_4</th>
			<th>ANSWER</th>
		</tr>
		<% 
		    ArrayList<Contact> searchList = new ArrayList<Contact>();
		  	searchList = (ArrayList<Contact>)request.getAttribute("searchList");
		   	
		 %>
		 <%for (int i=0;i<searchList.size();i++) 
		 {%>
		<tr>				
			<td><%out.println(questionList.get(i).getId());%></td>
			<td><%out.println(questionList.get(i).getQuestion()());%></td>
			<td><%out.println(questionList.get(i).getOpt1());%></td>
			<td><%out.println(questionList.get(i).getOpt2());%></td>
			<td><%out.println(questionList.get(i).getOpt3());%></td>
			<td><%out.println(questionList.get(i).getOpt4());%></td> 
			<td><%out.println(questionList.get(i).getAnswer());%></td>

		</tr>
		<%}%>
	</table>
	<a href="index.jsp"><button value="homebtn" style="background-color: #008cba; padding-top: 20px;
	border-radius: 10px; float: right; height: 40px; width: 70px; margin: 15px auto; padding:0;  text-align: center;">Home</button></a>
</body>
</html>