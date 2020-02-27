<%@page import="com.lxisoft.Model.MockExamModel"%>
<%@page import="java.util.ArrayList"%>
<html>
<link rel="stylesheet" href="option.css"></link>
<head><center><h1>!! EXAM STARTED !!</h1></center> </head>
<body>
<section align = "center">
<% 
ArrayList<MockExamModel> model = (ArrayList<MockExamModel>)session.getAttribute("questions");
int qcount = Integer.parseInt(request.getParameter("ques"));
if(qcount != model.size()) 
{
	out.println("<p><h1>Question No : "+model.get(qcount).getId()+"</h1></p>");
	out.println("<p><h2 class=\"fontbig\">Question : "+model.get(qcount).getQuestion().getQuestion()+"</h2></p>");
	%>
	<div>
	<form align = "center" method="get" action="Option">
	<h2>
	<input type ="radio" value="1" id = "Option1" name = "option"> 
	<label for = "Option1" > <%out.println(model.get(qcount).getOption1().getOption());%>  </label></input></h2>
	<h2><input type ="radio" value="2" id = "Option2" name = "option"> 
	<label for = "Option2"> <%out.println(model.get(qcount).getOption2().getOption());%> </label></input></h2>
	<h2><input type ="radio" value="3" id = "Option3" name = "option"> 
	<label for = "Option3"> <%out.println(model.get(qcount).getOption3().getOption());%> </label></input></h2>
	<h2><input type ="radio" value="4" id = "Option4" name = "option"> 
	<label for = "Option4"> <%out.println(model.get(qcount).getOption4().getOption());%> </label></input></h2>

	</section>
	<%
	qcount++;
	%>
		<input type="hidden" name="ques" value=<%out.println(qcount);%>/>
		<div align = "center">
		<button align = "center" class="button" type="submit">Next</button> <button align = "center" class="button" type="submit">Skip</button>
	</div>
	</form>
	</div>
<%} 
else 
{
	response.sendRedirect("Result");
}
%>
</body>
</html>