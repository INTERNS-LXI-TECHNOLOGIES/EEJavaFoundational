<%@ page import="com.lxisoft.model.Model"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="java.util.*"%>
<%@ page import="java.io.*"%>
<%@page import = "com.lxisoft.config.*"%>
<%@page contentType = "text/html;charset=UTF-8" pageEncoding = "UTF-8"%>
<!DOCTYPE html>
<html>
<head>
</head>
<body background="image/earth.jpg">

<%
  Internationalization international=new Internationalization();
  String language = session.getAttribute("language").toString();
  if(language==null)
  {
    language="en";
  }
  session.setAttribute("language",language);
  String mockexam = international.localization(language,"IN","MOCK-EXAM");
  String yourmark = international.localization(language,"IN","Your_Mark");
  String congrates = international.localization(language,"IN","Congratulations");
  String exam = international.localization(language,"IN","Exam");
  String passed = international.localization(language,"IN","Passed");
  String sorry = international.localization(language,"IN","Sorry");
  String fail = international.localization(language,"IN","Failed");
  
  %>

	<%Integer mark=(Integer)session.getAttribute("count");

	%>
	<center>
	<h1><font color="#87CEFA"><%=yourmark %>:<%out.println(mark);%></font></h1>
	
	<form action="first.jsp">

<%
	 if(mark >=3)
	 {
	 	%>
	 	<h1><%=congrates%>....</h1>
	 	<h1><%=exam%><%=passed%></h1>
	 	<%mark=0;%>
	 <%
	 }
	 else
	 {
	 	%>

	 	<h1>!! <%=sorry%> !!</h1><br>
	 	<h1><%=exam %><%=fail%></h1>
	 	<%mark=0;%>
	 <%
	 }
	 %>

		<input type="submit" value="next"></form>
		
</center>

</body>
<%session.invalidate();%>
</html>