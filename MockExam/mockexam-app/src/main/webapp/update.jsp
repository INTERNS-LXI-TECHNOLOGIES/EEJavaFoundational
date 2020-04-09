<!DOCTYPE html>
<html>
<head>
	<title>UPDATE</title>
	<style type="text/css">
		.container
		{
			text-align:center;
			width: 100%;
			height: 100%;
			margin: 0 auto;
			background: #009b77;
			display: block; 
			padding-top:25px;
		}
		html,body
		{
			width: 100%;
			height: 100%;
		}
		input
		{
			border-radius: 8px;
			border-spacing: 20px;
			width: 250px;
			height: 26px;
		}
		textarea
		{
			width: 300px;
			height: 50px;
		}
		button
		{
			width: 80px;
			height: 35px;
			border-radius: 10px;
		}
		input #que
		{
			width: 100px;
			height: 40px;
		}
	</style>
</head>
<body>
		<!-- <%
		String n = request.getParameter("id");
		%> -->
	<div class="container">
		<form action="updateQuestion"  method="GET">
		<h2>UPDATE QUESTION</h2>
		ID<input type="text" name="id" value="<%=request.getParameter("id")%>" readonly /><br><br>
		QUESTION <input type="text" id="que" name="ques" value="<%=request.getParameter("question")%>" required="required"></textarea> <br><br>
		OPT_1  <input type="text" name="op1" value="<%=request.getParameter("opt1")%>" required="required"><br><br>
		OPT_2  <input type="text" name="op2" value="<%=request.getParameter("opt2")%>" required="required"><br><br>
		OPT_3  <input type="text" name="op3" value="<%=request.getParameter("opt3")%>" required="required"><br><br>
		OPT_4  <input type="text" name="op4" value="<%=request.getParameter("opt4")%>" required="required"><br><br>
		ANSWER <input type="text" name="ans" value="<%=request.getParameter("answer")%>" required="required"><br><br>
		<button value="updatebtn">UPDATE</button>
		</form>	
		<br>
		<a href="#"><button value="homebtn">Home</button></a>
	</div>
</body>
</html>