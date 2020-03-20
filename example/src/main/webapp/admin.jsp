<%@page import = "com.lxisoft.config.*"%>
<%@page contentType = "text/html;charset=UTF-8" pageEncoding = "UTF-8"%>
<!DOCTYPE html>
<html>
 <%
  Internationalization international=new Internationalization();
  String language = session.getAttribute("language").toString();
  if(language==null)
  {
    language="en";
  }
  session.setAttribute("language",language);
  String mockexam = international.localization(language,"IN","MOCK-EXAM");
  String addQuestion = international.localization(language,"IN","Add_Question");
  String update = international.localization(language,"IN","Update");
  String dispayAll = international.localization(language,"IN","Display_all");
  String delete = international.localization(language,"IN","Delete");
  
  %>
<body background="image/earth.jpg">

	
	<h1><font color="#87CEFA" style="margin-left: 43%"><%out.println(mockexam);%> </font></h1>
	<div align ="center">
	
	<form>
	<button formaction="add.jsp">addQuestion</button><button formaction="table.jsp">update</button><button formaction="display">dispayAll</button><button formaction="delete.jsp">delete</button>
	</form>
</div>
</body>
</html>