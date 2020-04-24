<%@page import="com.lxisoft.repository.*"%>
<%@page import="com.lxisoft.models.*"%>
<%@page import="com.lxisoft.config.*"%>
<%@ page contentType="text/html;charset=UTF-8"  pageEncoding="UTF-8"%>
<html>
<head>
	<style>
	  	.button
	  	{
	  		background-color: #4CAF50;
	  	}
	  	div
	  	{
	  		padding-top: 20px;
	  		padding-right: 70px;
	  		padding-left: 70px;
	  		padding-bottom: 20px;
	  	}
  	</style>
	<title>DELETE</title>
	<meta charset="utf-8">
  	<meta name="viewport" content="width=device-width, initial-scale=1">
  	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
  	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
  	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
</head>
<%Question qn=(Question)session.getAttribute("question");
Internationalization international=new Internationalization();
String language=(String) session.getAttribute("language");
String cancel= international.localization(language,"IN","Cancel");
String confirm= international.localization(language,"IN","Confirm");
String q=international.localization(language,"IN","Do_You_Want_To_Continue?");%>
<div class="jumbotron text-center">
	<h1 align=center>Delete Question</h1>
</div>
<body background="aa.jpg">
	<table align=center border="1" width=30% height=25%>
	<form action="delete" method="get">
	<tr>
		<td><center><div><b><%=q%></b></center></div></td><br>
	</tr>
	<tr>
		<td>
		<div><input type="hidden" name="qno" value="<%=qn.getQno()%>">
			<input type="submit" value="<%=confirm%>">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	</form>
	<a href="index.jsp"><input type="submit" value=<%=cancel%>></a></div>
		</td>
	</tr>
	</table>
</body>
</html>