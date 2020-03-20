<%@page import="com.lxisoft.Model.MockExamModel"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.lxisoft.Repository.SqlRepository"%>
<%@page contentType = "text/html;charset=UTF-8" pageEncoding = "UTF-8"%>
<%@page import = "com.lxisoft.config.*"%>
<html>
<link rel="stylesheet" href="Style.css"></link>
<head>
    <meta http-equiv="Content_Type" content="text/html;charset=UTF-8"/>
</head>
<body>
  <%
    Internationalization international = new Internationalization();
    String language = session.getAttribute("language").toString();
    if(language == null)
    {
        language = "en";
    }
    String updateQuestion = international.localization(language,"IN","UpdateQuestion");
    String back = international.localization(language,"IN","back");
    String update = international.localization(language,"IN","Update");
    
  ArrayList<MockExamModel> questions = new ArrayList<MockExamModel>();
  SqlRepository sqlReppo = SqlRepository.getInstance();
  questions = sqlReppo.readFromDatabase(questions);

  int i = Integer.parseInt(request.getParameter("Update"));
  
  %>
<form>
	<div class="wrapper">
    <div align="center" style="background-color: darkmagenta;" >
            <br>
            <br>
          <font size="9"><%out.println(updateQuestion);%></font>
            <br>
            <br>
        </div>
		
		<!-- <font size="9">UPDATE QUESTION</font><br> -->
    <div align="center">
  <h1><label for="question">Question : </label>
    <input type = "hidden" name="index" value = <%out.println(i);%>>
    <input type = "hidden" name="Id" value = <%out.println(questions.get(i).getId());%>>
  <input type="text" id="question" name="question" placeholder="<%out.println(questions.get(i).getQuestion().getQuestion());%>"><br>
  <label for="answer">Answer : </label>
  <input type="text" id="answer" name="answer" placeholder = "<%out.println(questions.get(i).getAnswer().getAnswer());%>"><br>
  <label for="option1">Option1 : </label>
  <input type="text" id="option1" name="option1" placeholder = "<%out.println(questions.get(i).getOption1().getOption());%>" ><br>
  <label for="option2">Option2 : </label>
  <input type="text" id="lname" name="option2" placeholder = "<%out.println(questions.get(i).getOption2().getOption());%>"><br>
  <label for="option3">Option3 : </label>
  <input type="text" id="lname" name="option3" placeholder = "<%out.println(questions.get(i).getOption3().getOption());%>"><br>
  <label for="option4">Option4 : </label>
  <input type="text" id="lname" name="option4" placeholder = "<%out.println(questions.get(i).getOption4().getOption());%>"></h1><br>
  <button formaction="Update.jsp" class="button"><%out.println(back);%></button> <button formaction="Update" class="button"><%out.println(update);%>
  </button>
</div>
</div>
</form>
</body>
</html>