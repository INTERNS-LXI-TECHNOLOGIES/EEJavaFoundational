<%@page import="javax.servlet.*"%>
<%@page import="javax.servlet.http.*"%>
<%@page import="com.mockexam.servlet.*"%>
<!DOCTYPE html>
<html>
<head>
	<title>Result</title>
	<style type="text/css">
		head,body{
			background-color: #7fcdcd;
		}
		#heading{
			text-align: center;
		}
		#box{
			background-color: lightgrey;
			width: 1150px;
			border:15px solid green;
			padding: 50px;
			padding-top: 5px;
			margin: 35px;
			border-radius: 45px;

		}
		#btn{
			border-radius: 15px;
			border-color: black;
			background-color: red;
			margin-top: -20px;
		}
		#bbtn{
			text-align: center;
			margin-top: 10px;
		}
	</style>
</head>
<body>
	<%
		String score = request.getAttribute("totalScore").toString();
	 	int mark = Integer.parseInt(score);
	%>
	<div id="heading">
	</div>
	<div id="box">
		<h5 style="text-align: center;font-size: 20px;color:black;">Mock Exam Result</h5>
		<p style="font-size: 30px">
			<ul>
				<li><h1> Thank U For Attending The Exam </h1></li>
				<li><h1> You Got <%out.println(mark);%> Marks.</h1></li>
				<%
				if(mark<6)
				{
				%>
				<li><h1> oops...! You Failed...</h1></li>
				<%}
				else 
				{
				%>	
				<li><h1> Hurray...Congragulation....You Passed...</h1></li>		
				<%	
				}
				request.removeAttribute("totalScore");
				%>
				<%%>
			</ul>
		</p>
	</div>
	<div id="bbtn" >
		<form action="introduction.jsp" method="GET">
			<button id="btn" style="height: 50px;width: 100px">Home</button>
		</form>
	</div>
</body>
</html>