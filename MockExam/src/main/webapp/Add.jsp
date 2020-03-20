<%@page contentType = "text/html;charset=UTF-8" pageEncoding = "UTF-8"%>
<%@page import = "com.lxisoft.config.*"%>
<html>
<link rel="stylesheet" href="Style.css"></link>
<head>
    <meta http-equiv="Content_Type" content="text/html;charset=UTF-8"/>
</head>
<!-- <meta name="viewport" content="width=device-width, initial-scale=1"> -->
<body>
    <%
        Internationalization international = new Internationalization();
    String language = session.getAttribute("language").toString();
    if(language == null)
    {
        language = "en";
    }
    String back = international.localization(language,"IN","back");
    String reset = international.localization(language,"IN","Reset");
    String submit = international.localization(language,"IN","Submit");
    String enterQuestion = international.localization(language,"IN","EnterQuestion");
    %>
<form>
	<div class="wrapper">
        
		<div align="center" style="background-color: darkmagenta;" >
            <br>
            <br>
      		<font size="9"><%out.println(enterQuestion);%></font>
            <br>
            <br>
        </div>
        <div align="center">
        <h1><label for="question">Question : </label>
        <input class="text" type="text" id="question" placeholder="Enter Question" name="question"><br>
        <label for="answer">Answer : </label>
        <input type="text" id="answer" placeholder="Enter Answer"  name="answer"><br>
        <label for="option1">Option1 : </label>
        <input type="text" id="option1" placeholder="Enter Option"  name="option1"><br>
        <label for="option2">Option2 : </label>
        <input type="text" id="option2" placeholder="Enter Option2"  name="option2"><br>
        <label for="option3">Option3 : </label>
        <input type="text" id="option3" placeholder="Enter Option3"  name="option3"><br>
        <label for="option4">Option4 : </label>
        <input type="text" id="option4" placeholder="Enter Option4"  name="option4"></h1><br>
        <button formaction="Admin.jsp" class="button"><%out.println(back);%></button> <button formaction="Add" class="button"><%out.println(submit);%>
        </button> <button type="reset" class="button"><%out.println(reset);%></button>
  </div>
</div>
</form>
</body>
</html>