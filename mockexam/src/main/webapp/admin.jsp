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
  String back = international.localization(language,"IN","Back");
  
  %>
<body background="image/earth.jpg">

	
	<h1><font color="#87CEFA" style="margin-left: 43%"><%out.println(mockexam);%> </font></h1>
	<div align ="center">
	
	<form>
	<button formaction="add.jsp"><%out.println(addQuestion);%></button><button formaction="table.jsp"><%out.println(update);%></button><button formaction="display"><%out.println(dispayAll);%></button><button formaction="delete.jsp"><%out.println(delete);%></button>
  <button formaction="login.jsp"><%out.println(back);%></button>
	</form>
</div>
</body>
</html>