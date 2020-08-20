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
	<%
	try{
Class.forName("com.mysql.jdbc.Driver");
Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/mockexam","root","root");
Statement s = c.createStatement();
ResultSet r = s.executeQuery("select name , regno from userinfo");
%>
<table>
<tr><th>Name</th><th>Reg NO</th>
</tr>
<%
while(r.next())
	{
		
		int i=1;
		%><tr><% 
		while(i<6){
								%><td>
								<% out.println(r.getString(i));
								   i++;
					}
		%></tr><%
	} %>
	</td>
<%}
catch(SQLException e)
{
	System.out.println(e);
}
%>
	
	<table style="background-color:#FFF8DC	" align="center">
		<tr><th>Register Number  </th><th>Name </th><th>Mark</th>
		</tr>
		
		</table>
</body>
</html>