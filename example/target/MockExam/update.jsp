<%@page import = "com.lxisoft.config.*"%>
<%@page contentType = "text/html;charset=UTF-8" pageEncoding = "UTF-8"%>
<%@ page import="java.sql.*" %>
<%@ page import="java.io.*" %> 
<%@ page import="java.util.*" %> 
<%@ page import="com.lxisoft.model.Model"%>
<!DOCTYPE HTML >
<html>
<head>
<title>MOCK EXAM</title>
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
  String datasofmock = international.localization(language,"IN","Datas_of_mock_Exam");
  String id= international.localization(language,"IN","Id");
  String questions = international.localization(language,"IN","Questions");
  String answer = international.localization(language,"IN","Answer");
  String option1 = international.localization(language,"IN","Option1");
  String option2 = international.localization(language,"IN","Option2");
  String option3 = international.localization(language,"IN","Option3");
  String submit = international.localization(language,"IN","Submit");
  String delete = international.localization(language,"IN","Delete");
  String back = international.localization(language,"IN","Back");

  %>
  <%Model edit=(Model)session.getAttribute("datas");%>
<form >
<h2><font color="#87CEFA" style="margin-left: 43%"><%=datasofmock%></h2><br><br>
  
  <label for="fname" color="white" style="margin-left: 21%"> <font color="#87CEFA"><%=questions%></font></label>
  <input type="text" name="question1" size="60"value=<%out.println(edit.getQuestion());%>><br><br>

  <label for="fname" color="white" style="margin-left: 21.8%"> <font color="#87CEFA"><%=answer%></font></label>
  <input type="text" name="Answer1" size="60"value=<%out.println(edit.getAnswer());%>><br><br>

  <label for="fname" color="white" style="margin-left: 21.8%"> <font color="#87CEFA"><%=option1%></font></label>
  <input type="text" name="option11" size="60"value=<%out.println(edit.getOption1());%>><br><br>

  <label for="fname" color="white" style="margin-left: 21.8%"> <font color="#87CEFA"><%=option2%></font></label>
  <input type="text" name="option21" size="60"value=<%out.println(edit.getOption2());%>><br><br>

  <label for="fname" color="white" style="margin-left: 21.8%"> <font color="#87CEFA"><%=option3%></font></label>
  <input type="text" name="option31" size="60"value=<%out.println(edit.getOption3());%>>
  <div align ="center">
</font>
<button formaction="update" type="submit" ><%=submit%></button>
<button formaction="table.jsp" type="submit" ><%=back%></button>
</form>
</div>
</body>
</html>