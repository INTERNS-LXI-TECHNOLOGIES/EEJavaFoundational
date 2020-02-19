<%@ page import="com.lxisoft.model.Model"%>
<%@ page import="java.util.ArrayList"%>

<!DOCTYPE html>
<html>
<head>
</head>
<body background="image/earth.jpg">
	<% ArrayList<Model> model =(ArrayList<Model>)session.getAttribute("array");%>
	<h1><%=(model.get(1).getQuestion())%></h1>
	<h2><%=(model.get(1).getAnswer())%></h2>
	<h2><%=(model.get(1).getOption1())%></h2>
	<h2><%=(model.get(1).getOption2())%></h2>
	<h2><%=(model.get(1).getOption3())%></h2>
<button>
<a href=""> Next </button>
</body>
</html>

	