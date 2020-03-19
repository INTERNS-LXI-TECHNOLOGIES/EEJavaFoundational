<%@page contentType = "text/html;charset=UTF-8" pageEncoding = "UTF-8"%>
<%@page import = "com.lxisoft.config.*"%>
<html>
<link rel="stylesheet" href="Style.css"></link>
<head>
    <meta charset="UTF-8"/>
    <META http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>
	<%
	Internationalization international = new Internationalization();
  String language = request.getParameter("language");
  if(language == null)
  {
    language = "en";
  }
  String exam = international.localization(language,"IN","Exam");
  String english = international.localization(language,"IN","English");
  String malayalam = international.localization(language,"IN","Malayalam");
  String login = international.localization(language,"IN","LogIn");
  String signUp = international.localization(language,"IN","SignUp");
  String username = international.localization(language,"IN","username");
  String password = international.localization(language,"IN","Password");
  String add = international.localization(language,"IN","Add");
	%>
<form>
	<div class = "wrapper">
	<!-- <div align = "center"> -->
		<div  align="center" style="background-color: darkmagenta;">
			<br>
			<br>
		<h1 style="font-size:50px;">!! WELCOME ADMIN !!</h1>
			<br>
			<br>
		</div>
			<br>
		<div align="center" style="padding-top: 80px;">
		<button formaction="View.jsp" class="button">VIEW</button>
		<button formaction="Add.jsp" class="button"><%out.println(malayalam);%></button>
		<button formaction="Update.jsp" class="button">UPDATE</button>
		<button formaction="Delete.jsp" class="button">DELETE</button>
		<button formaction="Admin.jsp" class="button">SEARCH</button> <button formaction="Logout.jsp" class="button">BACK</button>
		<br>
		<br>
	</div> 
</div>
</form>
</body>
</html>