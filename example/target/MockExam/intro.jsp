<%@ page import="java.util.ArrayList"%>
<%@ page import="java.util.*"%>
<%@ page import="java.io.*"%>
<%@ page import="com.lxisoft.model.Model"%>
<%@ page import="com.lxisoft.sqlrepository.Sqlrepository"%>
<!DOCTYPE html>
<html>
<body background="image/earth.jpg">
	<% ArrayList<Model> questions= new ArrayList<Model>();
	Sqlrepository sqlrep=new Sqlrepository();
	questions.clear();
    questions=sqlrep.readquestion(questions); 
    session.setAttribute("array",questions);%>
	<h1><font color="#87CEFA" style="margin-left: 43%">MOCK EXAM</font></h1>
	<div align ="center">
	<form>
	<button formaction="authenticate">Admin</button> <button formaction="authenticate" >User</button>
	</form>
   </div>
</body>
</html>