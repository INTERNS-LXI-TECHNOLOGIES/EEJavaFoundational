<%@ page import="java.util.ArrayList"%>
<%@ page import="java.util.*"%>
<%@ page import="java.io.*"%>
<%@ page import="com.lxisoft.model.Model"%>
<%@ page import="com.lxisoft.sqlrepository.Sqlrepository"%>
<%@page import="com.lxisoft.config.Internationalization"%>
<%@ page contentType="text/html;charset=UTF-8"  pageEncoding="UTF-8"%>
<!DOCTYPE html>
<body background="image/earth.jpg">
	<%
	Internationalization international=new Internationalization();
  	session.setAttribute("international",international);
  
  	String language=request.getParameter("language");
  	if(language==null)
  	{
    	language="en";
  	}
  	session.setAttribute("language",language);
  	System.out.println("language : "+language);
	String mockexam = international.localization(language,"IN","MOCK-EXAM");
	
	ArrayList<Model> questions= new ArrayList<Model>();
	Sqlrepository sqlrep=new Sqlrepository();
	questions.clear();
    questions=sqlrep.readquestion(questions); 
    session.setAttribute("array",questions);%>
    


	<h1><font color="#87CEFA" style="margin-left: 43%"><%out.println(mockexam);%></font></h1>
	<div align ="center">
	<form>


	 
	<button formaction="authenticate">login</button> <button formaction="Register1.jsp" >Signup</button>

	<center><a  href="?language=en">ENGLISH</a> 
	<a href="?language=mal">മലയാളം</a></center>
	</form>
   </div>
</body>
</html>