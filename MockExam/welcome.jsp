<%@page import="com.lxisoft.Model.MockExamModel"%>
<%@page import="java.util.ArrayList"%>
<html>
<link rel="stylesheet" href="option.css"></link>
<head><center><h1>!! EXAM STARTED !!</h1></center> </head>
<body style="border:15px solid Tomato;">
<section align = "center">
<% 
int k = 1;
ArrayList<MockExamModel> model = (ArrayList<MockExamModel>)request.getAttribute("question");
//for(int i=0;i<model.size();i++)
//{
out.println("<p><h1>Question No : "+model.get(0).getId()+"</h1></p>");
out.println("<p><h2>Question : "+model.get(0).getQuestion().getQuestion()+"</h2></p>");
//}
%>
<h2><input type ="radio" id = "Option1" name = "option"> 
<label for = "Option1"> <%out.println(model.get(0).getAnswer().getAnswer());%> </label></input></h2>
<h2><input type ="radio" id = "Option1" name = "option"> 
<label for = "Option1"> <%out.println(model.get(0).getAnswer().getAnswer());%> </label></input></h2>
<h2><input type ="radio" id = "Option1" name = "option"> 
<label for = "Option1"> <%out.println(model.get(0).getAnswer().getAnswer());%> </label></input></h2>
<h2><input type ="radio" id = "Option1" name = "option"> 
<label for = "Option1"> <%out.println(model.get(0).getAnswer().getAnswer());%> </label></input></h2>
</section>
<form align = "center" method="get" action="Home">
<button  type="submit">Next</button>
</form>

</body>
</html>