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
			padding-top: 250px;
			background: #009b77;
			display: block; 
			padding-top:140px;
		}
		html,body
		{
			width: 100%;
			height: 100%;
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
		ID&nbsp&nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp<input type="text" name="id" 
		value="<%=request.getParameter("id")%>" readonly /><br><br>
		QUESTION &nbsp&nbsp &nbsp<input type="text" name="quest" value="<%=request.getParameter("question")%>" required><br><br>
		OPT_1 &nbsp&nbsp &nbsp <input type="text" name="op1" value="<%=request.getParameter("opt1")%>" required><br><br>
		OPT_2 &nbsp&nbsp &nbsp <input type="text" name="op2" value="<%=request.getParameter("opt2")%>" required><br><br>
		OPT_3 &nbsp&nbsp &nbsp <input type="text" name="op3" value="<%=request.getParameter("opt3")%>" required><br><br>
		OPT_1 &nbsp&nbsp &nbsp <input type="text" name="op4" value="<%=request.getParameter("opt4")%>" required><br><br>
		ANSWER  &nbsp &nbsp&nbsp &nbsp<input type="text" name="ans" value="<%=request.getParameter("answer")%>" required><br><br>
		<button value="updatebtn">UPDATE</button>
		</form>	
		<br>
		<a href="#"><button value="homebtn">Home</button></a>
	</div>
</body>
</html>