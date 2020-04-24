<%@ page import="java.util.ArrayList"%>
<%@ page import="java.util.*"%>
<%@ page import="java.io.*"%>
<%@ page import="com.sanfar.model.Model"%>
<%@ page import="com.sanfar.sqlrepository.Sqlrepository"%>
<%@ page contentType="text/html;charset=UTF-8"  pageEncoding="UTF-8"%>
<!DOCTYPE html>
<body background="image/COVID19.jpg">
	<%ArrayList<Model> requests= new ArrayList<Model>();
	
	requests.clear();
	Sqlrepository sqlrep=new Sqlrepository();
    requests=sqlrep.readRequests(requests); 
    session.setAttribute("array",requests);%>
  
	<h1><font color="#87CEFA" style="margin-left: 43%">Covid19AffidavitRequester</font></h1>
	<div align ="center">
	<form>


	 
	<button formaction="authenticate">login</button> <button formaction="Reg" >Signup</button>
	</form>
   </div>
</body>
</html>