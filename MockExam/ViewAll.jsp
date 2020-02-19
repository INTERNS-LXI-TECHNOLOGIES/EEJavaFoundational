<%@page import="com.lxisoft.models.*"%>
<%@page import="java.io.*"%>
<%@page import="java.util.*"%>
<html>
<head>
	<title>Questions</title>
	<meta charset="utf-8">
  	<meta name="viewport" content="width=device-width, initial-scale=1">
  	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
	<style>
  		.button
  		{
  		background-color: #4CAF50;
  		}
  		div
  		{
  			padding-top: 50px;
  			padding-right: 30px;
  			padding-left: 80px;
  			padding-bottom: 50px;
  		}
  	</style>
</head>
	<div class="jumbotron text-center">
	<h1 align="center">Questions</h1>
	</div>
	<body>
	<table align=center border="1px" width="100%" height="100%">
	<%List<Question> qn=(List<Question>) request.getAttribute("questionlist");
	int j=(int)session.getAttribute("int");
	int i=(j-1);
	if(i<qn.size())
	{%>
		<div>
		<form action="result" method="get">
		<br><input type=hidden name="i" value="<%=qn.get(i).getQno()%>"/><br>
    	<input type="text" value="<%=qn.get(i).getQuestion()%>"/><br>
    	<input type="radio" id="<%=qn.get(i).getOption1()%>" name="option" value="<%=qn.get(i).getOption1()%>"/>
    	<label for="<%=qn.get(i).getOption1()%>"><%=qn.get(i).getOption1()%></label><br>
    	<input type="radio" id="<%=qn.get(i).getOption2()%>" name="option" value="<%=qn.get(i).getOption2()%>"/>
    	<label for="<%=qn.get(i).getOption2()%>"><%=qn.get(i).getOption2()%></label><br>
    	<input type="radio" id="<%=qn.get(i).getOption3()%>" name="option" value="<%=qn.get(i).getOption3()%>"/>
    	<label for="<%=qn.get(i).getOption3()%>"><%=qn.get(i).getOption3()%></label><br>
    	<input type="radio" id="<%=qn.get(i).getOption4()%>" name="option" value="<%=qn.get(i).getOption4()%>"/>
    	<label for="<%=qn.get(i).getOption4()%>"><%=qn.get(i).getOption4()%></label><br>
		<input type="submit"class="button" value="Next">
		</form>
		<!-- <a href="admin"><input type="button" class="button" value="Next"/></a> -->
		<form action="select" method="get">
    	<a href="select"><input type="hidden" name="qno" value="<%=qn.get(i).getQno()%>">
    	<input type="hidden" name="opt" value="a">
       	<input type="submit" class="button" value=Delete></a></form>
       	<form action="select" method="get">
		<a href="select"><input type="hidden" name="opt" value="b">
        <input type="submit" class="button" value=Edit></a></form></div>	
    </table>
    <%}
	else
	{%>
		<center><a href="Result.jsp"><input type="button" class="button" value="Submit"/></a></center>
	<%}%>
</body>
</html>
