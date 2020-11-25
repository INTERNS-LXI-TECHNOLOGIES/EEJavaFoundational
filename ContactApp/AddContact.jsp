<!DOCTYPE html>
<html>
<%@page import="com.lxisoft.modal.Contact,com.lxisoft.repository.AddressBook"%>
<%@page import="java.sql.*,java.io.*"%>
<%@page import="java.sql.Connection"%>

<head>
	<title>Contact App</title>
</head>
<body>
	<% String name= request.getParameter("name");
	   String number= request.getParameter("number");
	   String email= request.getParameter("email"); 
	   		 Contact contact=new Contact();
	   		 contact.setName(name);
	   		 contact.setNumber(number);
	   		 contact.setEmail(email);
	   		try
		   	{
		    Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/contact","root","Karthik1996$");
			Statement stmt = con.createStatement();
			//out.println("Succesfull"+"\n");

			
           PreparedStatement ps=con.prepareStatement("insert into contact(NAME,Number,Email) values(?,?,?)");
		     ps.setString(1,contact.getName());
		     ps.setString(2,contact.getNumber());
		     ps.setString(3,contact.getEmail());
		  			
			int a=ps.executeUpdate();
			out.println("Contact added");
		}catch(Exception e)
		{
			out.println(e);
		}

		%>

</body>
</html>