<!DOCTYPE html>
<html>
<head>
	<title>Update</title>
</head>
<body>
	<%@ page import="java.sql.*" %>
	<%@ page import="java.util.*" %>
	<%
	String snum = request.getParameter("sno");
	String nme = request.getParameter("name");
	String no = request.getParameter("num");
	String eml = request.getParameter("mail");
	try{
	    Class.forName("com.mysql.cj.jdbc.Driver");
	    
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/contactapp","root","abi@1003");
        PreparedStatement ps = con.prepareStatement("update contacts set name=?,number=?,email=? where sno='"+snum+"'");
        ps.setInt(1,snum);
        ps.setString(2,nme);
        ps.setString(3,no);
        ps.setString(4,eml);
        int i = ps.executeUpdate();
        out.println("Updated Successfully");
    }
    catch (Exception e) {
    	e.printStackTrace();
    }
	%>
	<br>
	<br>
	<a href="ViewContacts.jsp">View_Contact</a>
	<br>
	<a href="Login.jsp">Home</a>
	<br>
	<a href="index.jsp">Log_out</a>
</body>
</html>