<%@page import="com.lxisoft.Model.MockExamModel"%>
<%@page import="java.util.ArrayList"%>
<html>
<link rel="stylesheet" href="option.css"></link>
<head><center><h1>!! EXAM STARTED !!</h1></center> </head>
<body style="border:15px solid Tomato;">
<section align = "center">
<% 
ArrayList<MockExamModel> model = (ArrayList<MockExamModel>)session.getAttribute("questions");
int qcount = Integer.parseInt(request.getParameter("ques"));
if(qcount != model.size()) {
	

out.println("<p><h1>Question No : "+model.get(qcount).getId()+"</h1></p>");
out.println("<p><h2 class=\"fontbig\">Question : "+model.get(qcount).getQuestion().getQuestion()+"</h2></p>");
%>
<form align = "center" method="get" action="Option">
<h2>
<input type ="radio" value="1" id = "Option1" name = "option"> 
<label for = "Option1" > <%out.println(model.get(qcount).getAnswer().getAnswer());%> </label></input></h2>
<h2><input type ="radio" value="2" id = "Option2" name = "option"> 
<label for = "Option2"> <%out.println(model.get(qcount).getOption1().getOption());%> </label></input></h2>
<h2><input type ="radio" value="3" id = "Option3" name = "option"> 
<label for = "Option3"> <%out.println(model.get(qcount).getOption2().getOption());%> </label></input></h2>
<h2><input type ="radio" value="4" id = "Option4" name = "option"> 
<label for = "Option4"> <%out.println(model.get(qcount).getOption3().getOption());%> </label></input></h2>

</section>
<%
//request.setAttribute("array",model);
//out.println(document.getElementById("result").value = browser;
//model.get(qcount).getSelectedOption().setOption();
qcount++;
%>

	<input type="hidden" name="ques" value=<%out.println(qcount);%>/>
	<button align = "center" type="submit">Next</button></a>
</form>
<%
String url="Questions.jsp?ques=" + (qcount-2);
%>
<a href=<%out.println(url);%>>back</a>
<%} else {
//ArrayList<MockExamModel> arrayModel = (ArrayList<MockExamModel>)session.getAttribute("Array");

	//out.println("selected option : "+arrayModel.get(0).getSelectedOption().getOption());
	//HttpSession sessions = request.getSession();
		//sessions.setAttribute("resultarray",arrayModel);
	//request.setAttribute("test",arrayModel);
	//request.getRequestDispatcher("Result.jsp").forward(request, response);
 response.sendRedirect("Result");
}
%>
</body>
</html>