<html>
<head><title>display</title>
</head>
<%@ page import="com.lxisoft.*"%>
<%@ page import="java.sql.*"%>
<%
try{
Class.forName("com.mysql.jdbc.Driver");
Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/mockexam","root","root");
Statement s = c.createStatement();
ResultSet r = s.executeQuery("select * from questions");
%>
<table>
<tr><th>Name</th><th>Phone number</th><th>email</th><th>city</th><th>district</th><th>state</th>
</tr>
<%
while(r.next())
	{
		String n = r.getString("name");
		int i=1;
		%><tr><% 
		while(i<=6){
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
</html>