<!DOCTYPE html>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
<%@page import = "com.lxisoft.Config.*"%>
<%@page contentType = "text/html;charset=UTF-8" pageEncoding = "UTF-8"%>
<html>	
<head>
  <style>
body {
  background-image: url('Delete.png');
  background-repeat: no-repeat;
  background-attachment: fixed;
  background-size: cover;
}
</style>
</head>								
<body>
   <%
  Internationalization international = new Internationalization();
  String language = request.getParameter("language");
  session.setAttribute("language",language);
  if(language == null)
  {
    language = "en";
  } 
  %>
  <a href = "?language=mal">Malayalam</a>
   <a href = "?language=en">English</a>
      <div class="dimbly" align="center">
<form>
	<div>
	<h1></h1>
		<center><font size="6">NEW QUESTION</font><br>
  <label for="question">Question = </label>
  <input type="text" id="question" name="question"><br><br>
  <label for="option1">Option1 =</label>
  <input type="text" id="option1" name="option1"><br><br>
  <label for="option2">Option2 =</label>
  <input type="text" id="option2" name="option2"><br><br>
  <label for="option3">Option3 =</label>
  <input type="text" id="option3" name="option3"><br><br>
  <label for="option4">Option4 =</label>
  <input type="text" id="option4" name="option4"><br><br>
  <label for="answer">Answer =</label>
  <input type="text" id="answer" name="answer"><br><br>
  <button formaction="Admin.jsp" class="button"><%out.println(international.localization(language,"IN","Back"));%></button> 
  <button formaction="AddServlet" class="button"><%out.println(international.localization(language,"IN","Submit"));%></button>
  <button type="reset" class="button"><%out.println(international.localization(language,"IN","Reset"));%></button></center>
</div>
</form>
</body>
</html>
