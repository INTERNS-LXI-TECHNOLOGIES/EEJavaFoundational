<%@page import="com.mockexam.repository.*" %>
<%@page import="java.io.*"%>
<%@page import="java.util.*"%>
<%@page import="javax.servlet.*"%>
<%@page import="javax.servlet.http.*"%>
<%@page import="com.mockexam.model.*"%>
<!DOCTYPE html>
<html>
<head>
	<title>Questions</title>
		<style type="text/css">
			html,body
			{
				background-color: lightgreen;
				margin-top: 40px;
			}
			#question{
				background-color: grey;
				width: 1150px;
				height: 400px;
				border:15px solid green;
				/*padding:50px;*/
				padding-top: 5px;
				margin: 35px;
				border-radius: 50px;
				padding-left: 70px;
			}
			input[type=radio]{
				border:0px;
				height: 1.5em;
				width: 1.5em;
				vertical-align: middle;
				margin-top: -1px;
			}
			label{
				font-size: 23px;
				vertical-align: middle;
			}
			/*#radiobtn{
				width: 1.5em;
				height: 1.5em;
			}*/

			#btn
			{
				height: 35px;
				width: 85px; 
				border-radius: 15px; 
				/*border-color: black; */
				outline: none;
				float: right;
				display: inline-block;
				margin-top: 78px;
				margin-right: 25px
			}
			#option
			{
				padding-top: 25px;
				padding-left: 40px;
			}
		</style>
	</head>
<body>
		<%
			String count = request.getAttribute("count").toString();
			int qCount = (Integer.parseInt(count));
			ArrayList<Model> data = new ArrayList<Model>();
			data = (ArrayList<Model>)session.getAttribute("examdatas");
			if(qCount<data.size())
			{	
		%>
		<div id="question">
		<p style="font-size:40px;">Q<%out.println(data.get(qCount ).getQuestion());%></p>
		<form action="getAnswer" method="GET">
		<input type="hidden" name="id" value="<%=data.get(qCount ).getId()%>">
		<div id="option">
			<span>
			<input type="radio" id="radiobtn" name="ans" value="<%=data.get(qCount ).getOpt1()%>" required="required">
			<label><%out.println(data.get(qCount ).getOpt1());%></label><br>
			</span>
			<span>
			<input type="radio" id="radiobtn" name="ans" value="<%=data.get(qCount ).getOpt2()%>">
			<label><%out.println(data.get(qCount ).getOpt2());%></label><br>
			</span>
			<span>
			<input type="radio" id="radiobtn" name="ans" value="<%=data.get(qCount ).getOpt3()%>">
			<label><%out.println(data.get(qCount ).getOpt3());%></label><br>
			</span>
			<span>
			<input type="radio" id="radiobtn" name="ans" value="<%=data.get(qCount ).getOpt4()%>">
			<label><%out.println(data.get(qCount ).getOpt4());%></label>
			</span>
		</div>
			<%
			qCount ++;
			%>
			<input type="hidden" name="ques" value="<%out.println(qCount );%>"/>
			<a href="getAnswer"><button type="submit" id="btn" style="height: 35px;width: 85px;">Next</button></a>
			<button id="btn" style="height: 35px;width: 85px;">Previous</button>
		</form>
		<%}%>	
	</div>
	
</body>
</html>