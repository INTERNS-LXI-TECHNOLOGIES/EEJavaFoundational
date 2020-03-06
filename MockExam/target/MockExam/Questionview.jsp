<!DOCTYPE html>
<%@page import="com.lxisoft.Model.ExamModel"%>
<%@page import="java.util.ArrayList"%>
<html>
<head><center><h1>Questions</h></center></head>
<body>
<p>

<%	
	ArrayList<ExamModel> models= (ArrayList<ExamModel>) session.getAttribute("qstn");
	int j=Integer.parseInt(request.getParameter("count"));		
	if (j != models.size())
	{			
		out.println("<h3>Question : "+models.get(j).getQuestion()+"</h3>");	
%>
<form align="center" method="get" action="ResultServlet" >
	
	<h2><input type="hidden" value="models.get(j).getId()" name="qstNo">
	
	<input type = "hidden" name="value" value=<%=j%> >
	<h2><input type ="radio" value="1" id = "Option1" name ="option"> 
	<label for = "Option1"><%out.println(models.get(j).getOpt1());%> </label></input></h2> <br>
		
	<h2><input type ="radio" value="2" id = "Option2" name = "option"> 
	<label for = "Option2"> <%out.println(models.get(j).getOpt2());%> </label></input></h2><br>
	
	<h2><input type ="radio" value="3" id = "Option3" name ="option">
	<label for = "Option3"> <%out.println(models.get(j).getOpt3());%> </label></input></h2> <br>	
	
	<h2><input type ="radio" value="4" id = "Option4" name ="option"> 
	<label for = "Option4"> <%out.println(models.get(j).getOpt4());%> </label></input></h2><br>
	<%
	j++;
	String x = String.valueOf(j);
	request.setAttribute("questionNo",j); %>
	<input type="hidden"class="button" name="count" value=<%out.println(j);%>>
	<button type="submit">Next</button>
	</form>	
<%
	}
	else
	{
		response.sendRedirect("Result.jsp");
	}
%>
</p>
</body>
</html>

