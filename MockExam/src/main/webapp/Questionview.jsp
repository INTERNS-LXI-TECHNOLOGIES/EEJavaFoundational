<!DOCTYPE html>
<%@page import="com.lxisoft.Model.ExamModel"%>
<%@page import="java.util.ArrayList"%>
<%@page import = "com.lxisoft.Config.*"%>
<%@page contentType = "text/html;charset=UTF-8" pageEncoding = "UTF-8"%>
<html>
<head><center><h1>Questions</h></center>
<style>
body {
  background-image: url('quiz.jpg');
  background-repeat: no-repeat;
  background-attachment: fixed;
  background-size: cover;
}
.container {
  height: 700px;
  position: relative;
  border: 5px solid oldlace;
}
.center {
  margin: 0;
  position: absolute;
  top: 25%;
  left: 30%;
  -ms-transform: translate(-30%, -30%);
  transform: translate(-20%, -20%);
}
.button_css
{
  background-color: midnightblue;
  color: white;
  width: 150px;
  height: 40px;
}

</style>
<script>
<!--
<%
String clock = "10";
%>
var timeout = <%=clock%>;
function timer()
{
if( --timeout > 0 )
{
document.getElementById("clock").innerHTML=timeout;
window.setTimeout( "timer()", 1000 );
}
else
{
document.getElementById("clock").innerHTML = "Time over";
document.qform.submit();
///disable submit-button etc
}
}
//-->
</script>

<form action="<%=request.getRequestURL()%>" name="forma">
Seconds remaining: <span id="clock"><%=clock%></span>

</form>
<script>
<!--
timer();
//-->
</script>
</head>


<%Internationalization international=new Internationalization();
String language=(String) session.getAttribute("language");
String questions= international.localization(language,"IN","Questions");
String back= international.localization(language,"IN","Back");
String next= international.localization(language,"IN","Next");%>




<body>
	<p>

<%	
	ArrayList<ExamModel> models= (ArrayList<ExamModel>) session.getAttribute("qstn");
	int j=Integer.parseInt(request.getParameter("count"));		
	if (j != models.size())
	{			
		out.println("<h1><center>Question : "+models.get(j).getQuestion()+"</h1></center>");	
%>
<form align="center" method="get" name="qform" action="ResultServlet" >
	
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

