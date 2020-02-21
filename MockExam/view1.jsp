<%@ page import="com.lxisoft.model.Model"%>
<%@ page import="java.util.ArrayList"%>

<!DOCTYPE html>
<html>
<head>
</head>
<body background="image/earth.jpg">
	<% ArrayList<Model> model =(ArrayList<Model>)session.getAttribute("array");%>
	<% int i=0;%>
	<form>
	<h1><font color="#87CEFA"><%=(model.get(i).getQuestion())%></font></h1>
	<h3><input type="radio"value=""name="option"><font color="#87CEFA"><%=(model.get(i).getAnswer())%></font></h3>
	<h3><input type="radio"value=""name="option"><font color="#87CEFA"><%=(model.get(i).getOption1())%></font></h3>
	<h3><input type="radio"value=""name="option"><font color="#87CEFA"><%=(model.get(i).getOption2())%></font></h3>
	<h3><input type="radio"value=""name="option"><font color="#87CEFA"><%=(model.get(i).getOption3())%></font></h3>
	</form>
<button>

	<form method="get" action="check">

<a href="go"> Next </button>
</a>
</form>

</body>
</html>