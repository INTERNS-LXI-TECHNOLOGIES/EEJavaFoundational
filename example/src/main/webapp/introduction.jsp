<%@page import="com.lxisoft.config.Internationalization"%>
<%@page import="java.io.*"%>
<%@ page import="com.lxisoft.model.Model"%>
<%@ page import="com.lxisoft.sqlrepository.Sqlrepository"%>
<%@ page import="java.util.ArrayList"%>
<%@page import="java.util.*"%>
<%@page import="javax.servlet.*"%>
<%@page import="javax.servlet.http.*"%>
<%@page import="java.util.ResourceBundle"%>
<%@page import="java.util.ResourceBundle.Control"%>
<%@ page contentType="text/html;charset=UTF-8"  pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
	<h1 align="center"><font color="white">Read instruction below..</font></h1>
	
</head>
<body background="image/earth.jpg">
	<%try{
	Internationalization international=new Internationalization();
 	String language = session.getAttribute("language").toString();
	if(language==null)
	{
		language="en";
	}
	session.setAttribute("language",language);
	String mockexam= international.localization(language,"IN","MOCK-EXAM");
	String introduction= international.localization(language,"IN","Introduction");
	String startexam= international.localization(language,"IN","StartExam");
	String search= international.localization(language,"IN","Search");
	String ok= international.localization(language,"IN","ok");
	
	String intro1= international.localization(language,"IN","You_have_got_10_minutes_to_complete_the_exam");

	String intro2= international.localization(language,"IN","Answer_all_questions");

	String intro3= international.localization(language,"IN","Read_questions_carefully_and_select_the_answer_given_below");

	String intro4= international.localization(language,"IN","Any_malpractice_will_lead_to_debar");

	

	%>
   	<% ArrayList<Model> questions= new ArrayList<Model>();
	Sqlrepository sqlrep=new Sqlrepository();
	questions.clear();
    questions=sqlrep.readquestion(questions); 
    session.setAttribute("array",questions);%>

	 <div>
	<h1 align="center"><font color="white"><%=mockexam%></font></h1>

<header>
	<h3><font color="white">* <%=intro1%></font></h3>
	<h3><font color="white">* <%=intro2%></font></h3>
	<h3><font color="white">* <%=intro3%></font></h3>
	<h3><font color="white">* <%=intro4%></font></h3>
	<div align="center" class="button">
		<form method="get" action="check">
			<input type="hidden" name="ques" value="0"/>
			<button type="submit">Start</button>
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

	