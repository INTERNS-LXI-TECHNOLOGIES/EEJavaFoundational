<!DOCTYPE html>
<html>
<%@page import="com.lxisoft.Model.Contact,com.lxisoft.repository.ContactRepository"%>
<%@page import="java.sql.*,java.io.*"%>
<%@page import="java.sql.Connection"%>
<head>
	<title>Contact App</title>
</head>
<body>
	<% String fname= request.getParameter("fname");
	   String lname= request.getParameter("lname");
	   String email= request.getParameter("email");
	   String number= request.getParameter("number");
	   Contact contact = new Contact();
	   contact.setFirstName(fname);
	   contact.setLastName(lname);
	   contact.setNumber(number);
	   contact.setMailId(email);
	   try
	   {
	   	Class.forName("com.mysql.cj.jdbc.Driver");
	   	 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/contactapp","root","password");
	   	 Statement stmt = con.creatStatement();

	   	   PreparedStatement ps = con.prepareStatement("insert into contactapp(FirstName,LastName,MailId,Number) values(?,?,?,?)");
	   	   ps.setString(1,contact.getFirstName());
	   	   ps.setString(2,contact.getLastName());
	   	   ps.setString(3,contact.getNumber());
	   	   ps.setString(4,contact.getMailId());
	   	    int a =ps.executeUpdate();
	   }
	   catch(SQLException e)
	   {
	   	System.out.println(e)
	   }
      %>
</body>
</html>