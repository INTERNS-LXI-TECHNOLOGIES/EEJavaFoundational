<%@page import = "com.lxisoft.config.*"%>
<%@page contentType = "text/html;charset=UTF-8" pageEncoding = "UTF-8"%>
<!DOCTYPE html>
<html>
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
  String english = international.localization(language,"IN","English");
  String questions = international.localization(language,"IN","Questions");
  String answer = international.localization(language,"IN","Answer");
  String option1 = international.localization(language,"IN","Option1");
  String option2 = international.localization(language,"IN","Option2");
  String option3 = international.localization(language,"IN","Option3");
  String submit = international.localization(language,"IN","Submit");
  String back = international.localization(language,"IN","Back");

  %>
<form >
	<h1><font color="#87CEFA" style="margin-left: 40%"><%out.println(mockexam);%></font></h1>
  <label for="fname" color="white" style="margin-left: 21%"> <font color="#87CEFA"><%out.println(questions);%></font></label>
  <input type="text" name="question" size="60"><br><br>

  <label for="fname" color="white" style="margin-left: 21.8%"> <font color="#87CEFA"><%out.println(answer);%></font></label>
  <input type="text" name="Answer" size="60"><br><br>

  <label for="fname" color="white" style="margin-left: 21.8%"> <font color="#87CEFA"><%out.println(option1);%></font></label>
  <input type="text" name="option1" size="60"><br><br>

  <label for="fname" color="white" style="margin-left: 21.8%"> <font color="#87CEFA"><%out.println(option2);%></font></label>
  <input type="text" name="option2" size="60"><br><br>

  <label for="fname" color="white" style="margin-left: 21.8%"> <font color="#87CEFA"><%out.println(option3);%></font></label>
  <input type="text" name="option3" size="60"><br><br>
  <div align ="center">
  
  <button formaction="add" ><%out.println(submit);%></button><br><br><button formaction="admin.jsp"><%out.println(back);%></button>
  <center><a href="?language=en">ENGLISH</a>
  <a href="?language=mal">മലയാളം</a></center>
</form>
</div>
</body>
</html>