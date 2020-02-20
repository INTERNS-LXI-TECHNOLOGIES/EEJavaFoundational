<%@ page import="com.lxisoft.model.Model"%>
<%@ page import="java.util.ArrayList"%>

<!DOCTYPE html>
<html>
<head>
</head>
<body background="image/earth.jpg">
	<% for (int i=0;i<3;i++) {%>
		
	<% ArrayList<Model> model =(ArrayList<Model>)session.getAttribute("array");%>
	<h1><font color="#87CEFA"><%=(model.get(0).getQuestion())%></font></h1>
	<h3><input type="radio"value="" name="a"><font color="#87CEFA"><%=(model.get(0).getAnswer())%></font></h3>
	<h3><input type="radio"value="" name="a"><font color="#87CEFA"><%=(model.get(0).getOption1())%></font></h3>
	<h3><input type="radio"value=""name="a"><font color="#87CEFA"><%=(model.get(0).getOption2())%></font></h3>
	<h3><input type="radio"value=""name="a"><font color="#87CEFA"><%=(model.get(0).getOption3())%></font></h3>
	<%}%>
<button>
	<form method="get" action="check">
<a href="view1.jsp"> Next </button>
</a>
</form>
</body>
</html>