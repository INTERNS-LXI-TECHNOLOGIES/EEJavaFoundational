<!DOCTYPE html>
<html>
<%@page import="com.lxisoft.model.Contact"%>
<%@page import="java.sql.*,java.io.*"%>
<%@page import="java.sql.Connection"%>

<head>
	<title>Contact App</title>
</head>
<body bgcolor="8A2BE2">
	<center>
	<% String name= request.getParameter("name");
	   String lastname= request.getParameter("lname");
	   String number= request.getParameter("number");
	   String email= request.getParameter("email");

	   		 Contact contact=new Contact();
	   		 contact.setFirstName(name);
	   		 contact.setLastName(lastname);
	   		 contact.setNumber(number);
	   		 contact.setMailId(email);
	   		try
		   	{
		    Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/contactapp","root","password");
			Statement stmt = con.createStatement();
			//out.println("Succesfull"+"\n");

			
           PreparedStatement ps=con.prepareStatement("insert into contactapp(FirstName,LastName,MailID,Number) values(?,?,?,?)");
		     ps.setString(1,contact.getFirstName());
		     ps.setString(2,contact.getLastName());
		     ps.setString(3,contact.getMailId());
		     ps.setString(4,contact.getNumber());
		     	
			int a=ps.executeUpdate();
		}catch(Exception e)
		{
			out.println(e);
		}
		%>
		<tr><h1><b> CONTACTS IS ADDED SUCCESSFULLY </b></h1></tr>  
        <tr><td></td><td><a href="index.html" type="submit"> INDEX PAGE </a></td></tr>
        </center>
</body>
</html>