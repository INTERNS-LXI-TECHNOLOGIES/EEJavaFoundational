<!DOCTYPE html>
<html>
<head>
	<title>Delete Contact</title>
</head>
<body>
	<%@ page import="java.sql.*" %>
	<%@ page import="java.util.*" %>
	<%
	String id = request.getParameter("id");

	try{
	    Class.forName("com.mysql.cj.jdbc.Driver");
	    
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/contactapp","root","abi@1003");
        Statement stmnt = con.createStatement();
        stmnt.executeUpdate("delete from contacts where sno = '"+id+"'");
        out.println("Deleted contact : ");
    }
    catch(Exception e){
        e.printStackTrace();
    }
    %>
    <br>
    <a href="ViewContacts.jsp">View_contact</a>
    <br>
    <br>
    <a href="Login.jsp">Home</a>
    <br>
    <br>
    <a href="index.html">Log_out</a>
</body>
</html>