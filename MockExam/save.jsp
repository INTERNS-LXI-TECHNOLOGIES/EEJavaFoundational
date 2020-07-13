<html>
<%@ page import="com.lxisoft.*"%>
<%@ page import="java.sql.*"%>
<%
Question q = new Question();
String question = request.getParameter("question"); 
String answere = request.getParameter("answere");
String option1 = request.getParameter("opt1");
String option2= request.getParameter("opt2");
String option3= request.getParameter("opt3");
String option4= request.getParameter("opt4");

q.question = question;
q.answere = answere;
q.option1= option1;
q.option2 = option2;
q.option3 = option3;
q.option4 = option4;

try{
Class.forName("com.mysql.jdbc.Driver");
Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/mockexam","root","root");
Statement s = c.createStatement();
s.executeUpdate("insert into questions values('"+q.question+"','"+q.answere+"','"+q.option1+"','"+q.option2+"','"+q.option3+"','"+q.option4+"')");
ResultSet r = s.executeQuery("select * from mycontact");
}
catch(SQLException e)
{
	System.out.println(e);
}
%>
<a href="view.jsp">view Details</a>




</html>