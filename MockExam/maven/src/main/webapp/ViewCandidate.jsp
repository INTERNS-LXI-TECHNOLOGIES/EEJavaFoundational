<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<style>
table, th, td {
  border: .1px solid black;
  border-style: dotted;
}
table.center {
  margin-left: auto; 
  margin-right: auto;
}
h1 {
  			color: black;
  			text-align: center;
  			font-family: courier;
			}

</style>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<body>
	<h1>CANDIDATES</h1>

	<%@ page import="com.lxisoft.repository.*"%>
	<%@ page import="com.lxisoft.model.*"%>
	<%@ page import="java.sql.*"%>
	<%@ page import="java.util.*"%>
	<%
	DatabaseRepo db = new DatabaseRepo();
	ArrayList<Question> questions= new ArrayList<Question>();
	questions = db.PrintDatabase();
	int id=1;
	%>
	
	<table style="background-color:#FFF8DC	" align="center">
		<tr><th>Register Number  </th><th>Name </th><th>Mark</th>
		</tr>
		
		</table>
</body>
</html>