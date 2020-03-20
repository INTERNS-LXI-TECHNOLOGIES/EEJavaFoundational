<%@page contentType = "text/html;charset=UTF-8" pageEncoding = "UTF-8"%>
<%@page import = "com.lxisoft.config.*"%>
<html>
<link rel="stylesheet" href="Style.css"></link>
<head>
	<meta http-equiv="Content_Type" content="text/html;charset=UTF-8"/>
    <!-- <meta charset="UTF-8"/> -->
    <!-- <META http-equiv="Content-Type" content="text/html; charset=UTF-8"> -->
</head>
<body>
	<%
	// String currentUser= session.getAttribute("currentUser").toString();
	Internationalization international = new Internationalization();
  String language = session.getAttribute("language").toString();
  if(language == null)
  {
    language = "en";
  }
  String exam = international.localization(language,"IN","Exam");
  String add = international.localization(language,"IN","Add");
  String view = international.localization(language,"IN","View");
  String update = international.localization(language,"IN","Update");
  String delete = international.localization(language,"IN","Delete");
  String testExam = international.localization(language,"IN","TestExam");
  String back = international.localization(language,"IN","back");
  String admin = international.localization(language,"IN","Admin");
  String welcome = international.localization(language,"IN","Welcome");

	%>
<form>
	<div class = "wrapper">
	<!-- <div align = "center"> -->
		<div  align="center" style="background-color: darkmagenta;">
			<br>
			<br>
		<h1 style="font-size:50px;">!! <%out.println(welcome);%><%out.println(admin);%> !!</h1>
			<br>
			<br>
		</div>
			<br>
		<div align="center" style="padding-top: 80px;">
		<button formaction="View.jsp" class="button"><%out.println(view);%></button>
		<button formaction="Add.jsp" class="button"><%out.println(add);%></button>
		<button formaction="Update.jsp" class="button"><%out.println(update);%></button>
		<button formaction="Delete.jsp" class="button"><%out.println(delete);%></button>
		<button formaction="Introduction.jsp" class="button"><%out.println(testExam);%></button> <button formaction="Logout.jsp" class="button"><%out.println(back);%></button>
		<br>
		<br>
	</div> 
</div>
</form>
</body>
</html>