<%@page import="javax.servlet.*"%>
<%@page import="javax.servlet.http.*"%>
<%@page import="com.mockexam.servlet.*"%>
<!DOCTYPE html>
<html>
<head>
	<title>MockExam</title>
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
		}
		#bbtn{
			text-align: center;
		}
	</style>
</head>
<body>
	<div id="heading">
		<h1>Mock Exam</h1>
	</div>
	<div id="box">
		<h5 style="text-align: center;font-size: 20px;color:black; ">Instruction To The Candidates</h5>
		<p style="font-size: 30px">Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod
		tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,
		quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo
		consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse
		cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non
		proident, sunt in culpa qui officia deserunt mollit anim id est laborum.
		</p>
	</div>
	<div id="bbtn">
		<form action="examController" method="GET">
			<!-- <input type="hidden" name="count" value="0"> -->
			<button id="btn" style="height: 50px;width: 100px">Start Exam</button>
		</form>
	</div>
</body>
</html>