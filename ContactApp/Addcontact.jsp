<!DOCTYPE html>
<html>
<head>
	<title>Added contact</title>
</head>
<body>
    <form action="AddContacts">
        Contact Name : <br><input type="text" name="contactName">
        <br>
        Number : <br><input type="text" name="number">
        <br>
        Email : <br><input type="text" name="mailid">
        <br>
        <br>
        <input type="submit" value="Add">
    </form>
	<!--<%@ page import="java.sql.*" %>
	<%@ page import="java.util.*" %>
	<%
	String cname = request.getParameter("contactName");
	String num = request.getParameter("number");
	String mail = request.getParameter("mailid");
	try{
	    Class.forName("com.mysql.cj.jdbc.Driver");
	    
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/contactapp","root","abi@1003");
        
        PreparedStatement ps = con.prepareStatement("insert into contacts(name,number,email) values('"+cname+"','"+num+"','"+mail+"')");
        int row = ps.executeUpdate();
        
        out.print("\nContact addded");	    
    }
    catch(Exception e){
        e.printStackTrace();
    }
    
    %>-->
    <br>
    <a href="ViewContacts.jsp">View_contact</a>
    <br>
    <br>
    <a href="Addcontact.html">Add_contact</a>
    <br>
    <a href="index.html">Log_out</a>
</body>
</html>