<%@page import="com.lxisoft.models.*"%>
<%@page import="java.io.*"%>
<%@page import="java.util.*"%>
<%@page import="com.lxisoft.config.*"%>
<%@ page contentType="text/html;charset=UTF-8"  pageEncoding="UTF-8"%>
<html>
<head>
	<title>Questions</title>
	<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
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
  			padding-bottom: 30px;
  		}
  </style>
</head>
<script>
<%
String clock = request.getParameter( "clock" );
if( clock == null ) clock = "20";
%>
var timeout = <%=clock%>;
function timer()
{
if( --timeout > 0 )
{
document.forma.clock.value = timeout;
window.setTimeout( "timer()", 1000 );
}
else
{
document.forma.clock.value = "Time over";
}
}
</script>

<%Internationalization international=new Internationalization();
String language=(String) session.getAttribute("language");
String questions= international.localization(language,"IN","Questions");
String back= international.localization(language,"IN","Back");
String next= international.localization(language,"IN","Next");
String edit= international.localization(language,"IN","Edit");
String delete= international.localization(language,"IN","Delete");
String submit= international.localization(language,"IN","Submit");%>
<div class="jumbotron text-center">
<h1 align="center"><u><%=questions%></u></h1><br>
<br><form action="<%=request.getRequestURL()%>" name="forma">
  <h3 align="right">Seconds remaining:<input type="text" name="clock" value="<%=clock%>" style="border:0px solid white"></h3></form>
</div>
<body background="rr.jpeg">
<table align=center>
	<%List<Question> qn=(List<Question>) request.getAttribute("questionlist");
	int j=(int)session.getAttribute("cc");
	int i=(j-1);
	if(i<qn.size())
	{%>
	   <div>
		  <form action="result" method="get">
      
      <script>
        timer();
      </script>
		  <br><input type=hidden name="i" value="<%=qn.get(i).getQno()%>"/><br>
    	<input type="text" value="<%=qn.get(i).getQuestion()%>"/><br>
    	<input type="checkbox" id="<%=qn.get(i).getOption1()%>" name="option" value="<%=qn.get(i).getOption1()%>"/>
    	<label for="<%=qn.get(i).getOption1()%>"><%=qn.get(i).getOption1()%></label><br>
    	<input type="checkbox" id="<%=qn.get(i).getOption2()%>" name="option" value="<%=qn.get(i).getOption2()%>"/>
    	<label for="<%=qn.get(i).getOption2()%>"><%=qn.get(i).getOption2()%></label><br>
    	<input type="checkbox" id="<%=qn.get(i).getOption3()%>" name="option" value="<%=qn.get(i).getOption3()%>"/>
    	<label for="<%=qn.get(i).getOption3()%>"><%=qn.get(i).getOption3()%></label><br>
    	<input type="checkbox" id="<%=qn.get(i).getOption4()%>" name="option" value="<%=qn.get(i).getOption4()%>"/>
    	<label for="<%=qn.get(i).getOption4()%>"><%=qn.get(i).getOption4()%></label><br>
		  <input type="submit"class="button" value="<%=next%>">
		  </form>
      <input type="submit"class="button" value="<%=back%>" onclick="history.back()">
		  <!-- <a href="admin"><input type="button" class="button" value="Next"/></a> -->
      <%if (request.isUserInRole("admin"))
      {%>
		    <form action="select" method="get">
    	  <a href="select"><input type="hidden" name="qno" value="<%=qn.get(i).getQno()%>">
    	  <input type="hidden" name="opt" value="a">
        <input type="submit" class="button" value="<%=delete%>"></a></form>
        <form action="select" method="get">
		    <a href="select"><input type="hidden" name="qno" value="<%=qn.get(i).getQno()%>">
        <input type="hidden" name="opt" value="b">
        <input type="submit" class="button" value="<%=edit%>"></a></form></div>	
    <%}
  }
	else
	{%>
		<center><a href="Result.jsp"><input type="button" class="button" value="<%=submit%>"/></a></center>
    </table>
<%}%>
</body>
</html>
