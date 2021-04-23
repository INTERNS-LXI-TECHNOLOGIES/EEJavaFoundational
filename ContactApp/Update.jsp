<!DOCTYPE html>
<html>
<head>
	<title>Update</title>
</head>
<body>
	<%@ page import="java.sql.*" %>
	<%@ page import="java.util.*" %>
	<%
	//String snum = request.getParameter("sno");
	String nme = request.getParameter("name");
	String no = request.getParameter("num");
	String eml = request.getParameter("mail");
	out.println(nme+no+eml);
	try{
	    Class.forName("com.mysql.cj.jdbc.Driver");
	    
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/contactapp","root","abi@1003");
        //int num = Integer.parseInt(snum);
        PreparedStatement ps = con.prepareStatement("update contacts set name=?,number=?,email=? where name=?");
        ps.setString(1,nme);
        ps.setString(2,no);
        ps.setString(3,eml);
        ps.setString(5,nme);
        ps.executeUpdate();
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
	<a href="Home.jsp">Home</a>
	<br>
	<a href="index.jsp">Log_out</a>
</body>
</html>