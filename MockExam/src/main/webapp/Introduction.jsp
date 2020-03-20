<html>
<%@page import="com.lxisoft.Repository.SqlRepository"%>
<%@page import = "com.lxisoft.config.*"%>
<%@page  contentType = "text/html;charset=UTF-8" pageEncoding = "UTF-8"%>
<head>
	<meta http-equiv="Content_Type" content="text/html;charset=UTF-8"/>
<Title>MOCK EXAM</title>
<link rel="stylesheet" href="Style.css"></link>
</head>
<body>
	<%
	SqlRepository sqlReppo = SqlRepository.getInstance();
	Internationalization international = new Internationalization();
	String language = session.getAttribute("language").toString();
	if(language == null)
	{
		language = "en";
	}
	String username = request.getRemoteUser();
	String userrole = sqlReppo.selectRole(username);
	String back = international.localization(language,"IN","back");
	String startExam = international.localization(language,"IN","StartExam");

	String instructions = international.localization(language,"IN","Instructions");
	String mockExam = international.localization(language,"IN","WelcometoMockExam");
	%>
	<div class="hello" style ="border: outset;">
	<div align="center" style="background-color: darkmagenta;" >
		<br>
		<h1 style="font-size:50px;"> <%out.println(mockExam);%></h1>
		<br>
	</div>
<div>
	
	<div class="dimbly" align="center">
		<ul>
			<h1 style="font-size:40px;">!! <%out.println(instructions);%> !!</h1><br>
			<li><h1>  Exam has Total 10 Questions. </h1></li>
			<li><h1>  Each Question has 15 sec. </h1></li>
			<li><h1>  No Negative Marks.</h1></li>
			<li><h1>  Minumum 6 Right Answers For Pass.</h1></li>
		</ul>
	</div>
	</div><br>
	<div align = "center">	
<form method="get" action="Home" value = "0">
	<input type="hidden" name="ques" value="0"/>
    <button  class ="button"><%out.print(startExam);%></button> 
    <%
    if(userrole.equals("user"))
    {
    %>
    <button formaction="Logout.jsp" class="button"><%out.println(back);%></button>
    <%
	}
	else if(userrole.equals("admin"))
	{
		%>
	<button formaction="Admin.jsp" class="button"><%out.println(back);%></button>	
	<%
		}
    %> 
    <br>
    <br>
</form>
</div>
</div>
</body>
</html>