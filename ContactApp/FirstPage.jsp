<%@page import="com.lxisoft.modal.Contact,com.lxisoft.repository.AddressBook"%>
<%@page import="java.sql.*,java.io.*"%>
<%@page import="java.sql.Connection"%>

<!DOCTYPE html>
<html>
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
	   		 out.println(contact.getEmail());
	   		
		   	try
		   	{
		    out.println(contact.getEmail());
		    Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/contact?useSSL=false&serverTimezone=Asia/Shanghai","root","Karthik1996$");
			Statement stmt = con.createStatement();
			out.println("Succesfull");

			
            PreparedStatement ps=con.prepareStatement("insert into contact(NAME,Number,Email) values(?,?,?)");
		     ps.setString(1,contact.getName());
		     ps.setString(2,contact.getNumber());
		     ps.setString(3,contact.getEmail());
		  

			 out.println("before executed");
			int a=ps.executeUpdate();
			out.println("inserted :"+a);
		}catch(Exception e)
		{
			out.println("failed");
		}

		%>

</body>
</html>