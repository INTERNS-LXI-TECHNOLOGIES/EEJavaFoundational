<%@ page import="com.lxisoft.model.Model"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="java.util.*"%>
<%@ page import="java.io.*"%>

<!DOCTYPE html>
<html>
<head>
</head>
<body background="image/earth.jpg">
	<% ArrayList<Model> model =(ArrayList<Model>)session.getAttribute("array");
	 Integer i=(Integer)session.getAttribute("num");
	if(i<model.size())
		{%>

	<form action="go">
	<h1><font color="#87CEFA"><%=(model.get(i).getQuestion())%></font></h1>
	<h3><input type="radio" name="option" value="<%=(model.get(i).getAnswer())%>"><font color="#87CEFA"><%=(model.get(i).getAnswer())%></font></h3>
	<h3><input type="radio" name="option" value="<%=(model.get(i).getOption1())%>"><font color="#87CEFA"><%=(model.get(i).getOption1())%></font></h3>
	<h3><input type="radio" name="option" value="<%=(model.get(i).getOption2())%>"><font color="#87CEFA"><%=(model.get(i).getOption2())%></font></h3>
	<h3><input type="radio" name="option" value="<%=(model.get(i).getOption3())%>"><font color="#87CEFA"><%=(model.get(i).getOption3())%></font></h3>
	<input type="submit" value="next">
	</form>
	<%}%>


</body>
</html>