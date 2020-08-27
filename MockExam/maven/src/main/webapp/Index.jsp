<html>
<head>
<title>Mock Exam</title>
<style>
body {
	background-color: #f7cac9;
	text-align: center;
}

h1 {
	color: black;
	text-align: center;
	font-family: courier;
}

.button {
	padding: 15px 25px;
	font-size: 24px;
	text-align: center;
	cursor: pointer;
	outline: none;
	color: #fff;
	background-color: #4CAF50;
	border: none;
	border-radius: 15px;
	box-shadow: 0 9px #999;
}

.button:active {
	background-color: #3e8e41;
	box-shadow: 0 5px #666;
	transform: translateY(4px);
}
</style>
</head>
<body>
<% session.invalidate(); %>
	<div align="center">
		<h1>MockExam</h1>
			<form align = "center" height= "50"%>
				<button formaction="login" class="button">LOGIN</button> 
				<button formaction="register.jsp" class="button">Register</button> 
			</form>
	</div>
</body>
</html>