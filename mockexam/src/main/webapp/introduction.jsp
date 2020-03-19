<%@page import="com.lxisoft.config.Internationalization"%>
<%@page import="java.io.*"%>
<%@page import="java.util.*"%>
<%@page import="javax.servlet.*"%>
<%@page import="javax.servlet.http.*"%>
<%@page import="java.util.ResourceBundle"%>
<%@page import="java.util.ResourceBundle.Control"%>
<%@ page contentType="text/html;charset=UTF-8"  pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<h1 align="center"><font color="white">Read instruction below..</font></h1>
	
</head>
<body background="image/earth.jpg">
	<%try
	Internationalization international=new Internationalization();
	session.setAttribute("international",international);
	session.setAttribute("language",language);
	String language=request.getParameter("language");
	if(language==null)
	{
		language="mal";
	}
	String mockexam= international.localization(language,"IN","MOCK-EXAM");
	String introduction= international.localization(language,"IN","Introduction");
	String startexam= international.localization(language,"IN","StartExam");
	String search= international.localization(language,"IN","Search");
	String ok= international.localization(language,"IN","ok");
	%>
    <div>
	<h1 align="center"><%=mockexam%></h1>
	<center><a href="?language=en">ENGLISH</a>
	<a href="?language=mal">മലയാളം</a></center>


<header>
	<h3><font color="white">* You have got 10 minutes to complete the exam</font></h3>
	<h3><font color="white">* Answer all questions</font></h3>
	<h3><font color="white">* Read questions carefully and select the answer given below</font></h3>
	<h3><font color="white">* Any malpractice will lead to debar</font></h3>
	<div align="center" class="button">
		<form method="get" action="check">
			<input type="submit" name="Next">
		</form>
	</form>
	</div>
	<% } 
	catch (Exception e) {
%>

<font size="+3" color="#87CEFA" style="margin-left:-6%"></font><br></br>
<%
	e.printStackTrace();
	out.println(e);
}
%>
</header>
</body>
</html>

	