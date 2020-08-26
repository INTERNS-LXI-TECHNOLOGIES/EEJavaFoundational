<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<script>
<%
String clk = "10";
%>
var seconds = 10;
function timer()
{
	seconds--;
	if(seconds >= 0 )
	{
		document.getElementById('clk').innerHTML = seconds;
		window.setTimeout( "timer()", 1000 );
	}
	else
	{
		
	}
}
function reLoad()
{
	d
	
}
//-->
</script>
<body>	
<form >
<div align="right">
<h1>Time Left : <div id="clk">seconds<%=clk%></div> 
</h1>
</div>
</form>
<script>
timer();
</script>
</body>
</html>