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
var timeout = <%=clk%>;
function timer()
{
	if( --timeout > 0 )
	{
		document.getElementById('clk').innerHTML = timeout;
		window.setTimeout( "timer()", 1000 );
	}
	else
	{
		
	}
}
//-->
</script>
<body>	
<form >
<div align="right">
<h1 >Seconds Remaining : <div id="clk"><%=clk%></div> </h1>
</div>
</form>
<script>
 timer();
</script>
</div>
</body>
</html>