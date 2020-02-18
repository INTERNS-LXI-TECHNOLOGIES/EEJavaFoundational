<%@page import="com.lxisoft.models.*"%>
<%@page import="java.io.*"%>
<%@page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
	<title>Questions</title>
	<style>
  	.button{
  		background-color: #4CAF50;
  	}
  	div{
  		padding-top: 50px;
  		padding-right: 30px;
  		padding-left: 80px;
  		padding-bottom: 50px;
  	}
  </style>
</head>

<body>
	<H1><CENTER><u>Questions</u></CENTER></H1>
	<table align=center border="1px" width="30%">
		<tr><td>
	<%
	
	List<Question> qn=(List<Question>) request.getAttribute("questionlist");
	int j=(int)session.getAttribute("int");
	int i=(j-1);
	
	if(i<qn.size())
	{%>
		<div>
		<form action="result" method="get">
		<br><input type=number name="i" value="<%=qn.get(i).getQno()%>"/><br>
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
			<form action=select method="get">
				<input type="hidden" name="qno" value="<%=qn.get(i).getQno()%>"/>
				<input type="hidden" name="operation" value="1"/>
				<input type="button" class="button" value="Delete" /></form>
			<form action=select method="post">
				<input type="hidden" name="qno" value="<%=qn.get(i).getQno()%>"/>
				<input type="hidden" name="operation" value="2"/>
				<input type="button" class="button" value="Edit"/></form>
    </table>
    <%
	}
	else
	{

	%>
	<a href="Result.jsp"><input type="button" class="button" value="Submit"/></a>
	 <%
	}
	%>

</body>
</html>
