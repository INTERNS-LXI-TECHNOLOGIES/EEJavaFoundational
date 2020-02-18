<%@page import="com.lxisoft.Model.ExamModel"%>
<%@page import="java.util.ArrayList"%>
<html>
<head><center><h1>Questions</h></center></head>
<body>
<p>
<form align="center" method="get" >
<%	
	ArrayList<ExamModel> emodels = (ArrayList<ExamModel>)session.getAttribute("questions");
	int count = Integer.parseInt(request.getParameter("questionNo"));
	//out.println(count);
	if (emodels.size()!=count)
	{		
	
	out.println("<h3>QustNo : "+emodels.get(count).getQuestionNumber()+"</h3>");
	out.println("<h3>Question : "+emodels.get(count).getQuestion()+"</h3>");
	

%>
	<h2><input type ="radio" value="0" id = "Option1" name ="option"> 
	<label for = "Option1"><%out.println(emodels.get(count).getOpt1());%> </label></input></h2> <br>
		
	<h2><input type ="radio" value="1" id = "Option2" name = "option"> 
	<label for = "Option2"> <%out.println(emodels.get(count).getOpt2());%> </label></input></h2><br>
	
	<h2><input type ="radio" value="3" id = "Option4" name ="option">
	<label for = "Option3"> <%out.println(emodels.get(count).getOpt3());%> </label></input></h2> <br>	
	
	<h2><input type ="radio" value="4" id = "Option4" name ="option"> 
	<label for = "Option4"> <%out.println(emodels.get(count).getOpt4());%> </label></input></h2><br>
	
<%
}
count++;
%>
	<input  name="button" type="button" onclick="window.location.href = 'Questionview.jsp';" value="NEXT"/>
		
</form>
</p>
</body>
</html>

	
