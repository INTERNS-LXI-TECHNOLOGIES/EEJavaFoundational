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
		ArrayList<Model> data = new ArrayList<Model>();
		data = (ArrayList<Model>)session.getAttribute("examdata"); 
	%>
	<div id="question">
		<p style="font-size:40px;">Q--><%out.println(data.get(1).getQuestion());%></p>
		<div id="option">
			<span>
			<input type="radio" id="radiobtn" name="ans1">
			<label><%out.println(data.get(1).getOpt1());%></label><br>
			</span>
			<span>
			<input type="radio" id="radiobtn" name="ans1">
			<label><%out.println(data.get(1).getOpt2());%></label><br>
			</span>
			<span>
			<input type="radio" id="radiobtn" name="ans1">
			<label><%out.println(data.get(1).getOpt3());%></label><br>
			</span>
			<span>
			<input type="radio" id="radiobtn" name="ans1">
			<label><%out.println(data.get(1).getOpt4());%></label>
			</span>
		</div>
			<button id="btn" style="height: 35px;width: 85px;">Next</button>
			<button id="btn" style="height: 35px;width: 85px;">Previous</button>
	</div>
</body>
</html>