<%@page import="com.lxisoft.Model.ExamModel"%>
<%@page import="java.util.ArrayList"%>
<html>
<head><center><h1>Questions</h></center></head>
<body>
<p>
<form align="center" method="get">
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
	
	<h2><input type ="radio" value="0" id = "Option1" name ="option"> 
	<label for = "Option1"><%out.println(emodels.get(0).getOpt1());%> </label></input></h2> <br>
		
	<h2><input type ="radio" value="1" id = "Option2" name = "option"> 
	<label for = "Option2"> <%out.println(emodels.get(0).getOpt2());%> </label></input></h2><br>
	
	<h2><input type ="radio" value="3" id = "Option4" name ="option">
	<label for = "Option3"> <%out.println(emodels.get(0).getOpt3());%> </label></input></h2> <br>	
	
	<h2><input type ="radio" value="4" id = "Option4" name ="option"> 
	<label for = "Option4"> <%out.println(emodels.get(0).getOpt4());%> </label></input></h2><br>
	
	<!-- <center><button name="button" type="button">Next</button></center> -->
	<input  name="button" type="button" onclick="window.location.href = 'Questionview.jsp';" value="NEXT"/>
		
</form>
</p>
</body>
</html>

	
