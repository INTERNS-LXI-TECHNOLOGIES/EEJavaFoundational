<%@page import = "com.lxisoft.config.*"%>
<%@page contentType = "text/html;charset=UTF-8" pageEncoding = "UTF-8"%>
<html>
<head>
<Title>MOCK EXAM</title>
<link rel="stylesheet" href="Style.css"></link>
</head>
<body>
	<%
	Internationalization international = new Internationalization();
	String language = request.getParameter("language");
	session.setAttribute("language",language);
	if(language == null)
	{
		language = "mal";
	}
	%>
	<a href = "?language=mal">Malayalam</a>
	<div align="center" style="background-color: mediumseagreen " class = "inset">
		<h1 style="font-size:50px;"> WELCOME TO MOCK EXAM </h1>
	</div>
<div class = "inset">
	
	<div class="dimbly" align="center">
		<ul>
			<h1 style="font-size:40px;">!! <%out.println(international.localization(language,"IN","Instructions"));%> !!</h1><br>
			<li><h1>  Exam has Total 10 Questions. </h1></li>
			<li><h1>  Total Time For Exam 30 minute. </h1></li>
			<li><h1>  No Negative Marks.</h1></li>
			<li><h1>  Minumum 6 Right Answers For Pass.</h1></li>
		</ul>
	</div>
	</div><br>
	<div align = "center">	
<form method="get" action="Home" value = "0">
	<input type="hidden" name="ques" value="0"/>
    <button  class ="button">Start Exam</button> 
    <button formaction="Sample1.jsp" class="button">BACK</button> 
</form>
</div>
</body>
</html>