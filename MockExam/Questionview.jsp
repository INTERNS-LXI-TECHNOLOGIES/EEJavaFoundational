<%@page import="com.lxisoft.Model.ExamModel"%>
<%@page import="java.util.ArrayList"%>
<html>
<head><center><h1>Questions</h></center></head>
<body>
<p>
<%
	ArrayList<ExamModel> emodels = (ArrayList<ExamModel>)request.getAttribute("question");
	out.println("<h3>QustNo : "+emodels.get(0).getQuestionNumber()+"</h3>");
	out.println("<h3>Question : "+emodels.get(0).getQuestion()+"</h3>");
	%>
	<!-- out.println("ArraySize : "+emodels.size());	
/*
	out.println("<h4>opt1 :"+emodels.get(0).getOpt1()+"</h4>");   
	out.println("<h4>opt2 :"+emodels.get(0).getOpt2()+"</h4>"); 
	out.println("<h4>opt3 :"+emodels.get(0).getOpt3()+"</h4>"); 
	out.println("<h4>opt4 :"+emodels.get(0).getOpt4()+"</h4>");
 */ -->
	<form>
	<input type="radio" id="opt1" name="opt1" value="ans">
	<label for="opt1">option1</label><br>
	
	<input type="radio" id="opt2" name="opt2" value="ans">
	<label for="opt2">option2</label><br>

	<input type="radio" id="opt3" name="opt3" value="ans">
	<label for="opt3">option3</label><br>

	<input type="radio" id="opt4" name="opt4" value="ans">
	<label for="opt4">option4</label><br>
	</form>
	<center><button name="button" type="button">Next</button></center>

	
</p>
</body>
</html>




