<%@page import="com.mockexam.model.*"%>
<%@page import="com.mockexam.repository.*"%>
<%@page import="com.mockexam.servlet.*"%>
<%@page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
	<title>Admin Menu</title>
	<link rel="stylesheet" type="text/css" href="page.css">
	<style type="text/css">
		
		html,body{
			padding: 5px;margin: 10px;
			background:#009b77;
		}

		.button1{
			background-color: #008cba;
			color: white;
			padding: 15px 30px;
			text-align: center;
			text-decoration: none;
			display: inline-block;
			font-size: 15px;
			border-radius: 10px;
		}
		#logout
		{
			float: right;
			position: relative;
			top: -50px;	
			left: 50px;
		}
		#exam
		{
			float: right;
			position: relative;
			top: -50px;	
			left: -210px;
		}
		table
		{
    		align-content: center;
   			margin: inherit;
    		width: 100%;
		}
		
	</style>
</head>
<body onload="myFunction()">
	<div id="addQuestion">
		<a href="add.html"><button class="button1">Add Question</button></a>
	</div>
	<div id="exam">
		<button class="button4" style="height: 50px;background-color: #008cba; width: 100px; color: white;border-radius: 10px;">
			Test Exam
		</button>
	</div>
	<div id="logout">
		<button class="button3" style="height: 50px;background-color: #008cba; width: 100px; color: white;border-radius: 10px;">
			Logout
		</button>
	</div>	
	<div id="view">
		<table id="pager" border="2" width="100%">
		<tr>
			<th>SL.NO</th>
			<th>ID</th>
			<th>QUESTION</th>
			<th>OPT_1</th>
			<th>OPT_2</th>
			<th>OPT_3</th>
			<th>OPT_4</th>
			<th>ANSWER</th>
		</tr>
		<%
		Database db = new Database();
		ArrayList<Model> questionList = new ArrayList<Model>();
		questionList = db.getMockExamData(questionList);
		if(questionList.size() == 0)
		{%>
			<script type="text/javascript">
				window.alert("No Records To Display");
			</script>	
		<%}
		else{
		%>
		<%
			for (int i=0;i<questionList.size();i++) 
			{%>
		<tr>
			<td><%out.println(i+1);%></td>				
			<td><%out.println(questionList.get(i).getId());%></td>
			<td><%out.println(questionList.get(i).getQuestion());%></td>
			<td><%out.println(questionList.get(i).getOpt1());%></td>
			<td><%out.println(questionList.get(i).getOpt2());%></td>
			<td><%out.println(questionList.get(i).getOpt3());%></td>
			<td><%out.println(questionList.get(i).getOpt4());%></td> 
			<td><%out.println(questionList.get(i).getAnswer());%></td>

			<td><a href="update.jsp?id=<%=questionList.get(i).getId()%>&question=<%=questionList.get(i).getQuestion()%>
				&opt1=<%=questionList.get(i).getOpt1()%>&opt2=<%=questionList.get(i).getOpt2()%>&opt3=<%=questionList.get(i).getOpt3()%>&opt4=<%=questionList.get(i).getOpt4()%>&answer=<%=questionList.get(i).getAnswer()%>">
				<button style="background-color: #008cba;color: white; border-radius: 10px;">Update</button></a></td>
			<td><a href="deleteQuestion?id=<%=questionList.get(i).getId()%>"><button style="background-color: #008cba;color: white;
			border-radius: 10px;">Delete</button></td>	
		</tr>
		 <%}
		}%>
	</table>
	</div>
<div id="pageNavPosition" class="pager-nav" style="float: right;"></div>
<script src="PagerJS.js" defer></script>
<script>
<script>
	function myFunction() 
	{
		alert("Admin Login Successfull......");
	}

let pager = new Pager('pager', 6);
pager.init();
pager.showPageNav('pager', 'pageNavPosition');
pager.showPage(1);

</script>
</script>
</body>
</html>