<%@page import="com.lxisoft.Model.ExamModel"%>
<%@page import="java.util.ArrayList"%>
<html>
<head><center><h1>Questions</h></center></head>
<body>
<p>
<form align="center" method="get" >
<%	
	ArrayList<ExamModel> emodels = (ArrayList<ExamModel>) request.getAttribute("qstn");
	int j=(int)session.getAttribute("questions");
	int count=j-1;
	if (count<emodels.size())
	{			
		out.println("<h3>QustNo : "+emodels.get(count).getQuestionNumber()+"</h3>");
		out.println("<h3>Question : "+emodels.get(count).getQuestion()+"</h3>");	
%>
	<h2><input type ="radio" value="1" id = "Option1" name ="option"> 
	<label for = "Option1"><%out.println(emodels.get(count).getOpt1());%> </label></input></h2> <br>
		
	<h2><input type ="radio" value="2" id = "Option2" name = "option"> 
	<label for = "Option2"> <%out.println(emodels.get(count).getOpt2());%> </label></input></h2><br>
	
	<h2><input type ="radio" value="3" id = "Option4" name ="option">
	<label for = "Option3"> <%out.println(emodels.get(count).getOpt3());%> </label></input></h2> <br>	
	
	<h2><input type ="radio" value="4" id = "Option4" name ="option"> 
	<label for = "Option4"> <%out.println(emodels.get(count).getOpt4());%> </label></input></h2><br>
	<a href="Questionview.jsp"><input type="submit"class="button" value="Next"></a>	
	</form>	
<%
	}
	else
	{
%>
	<button name="button" type="button" onclick="window.location.href='ResultServlet';">Submit</button>
<%
	}
%>
</p>
</body>
</html>

