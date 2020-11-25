<!DOCTYPE html>
<html>
<%@page import="com.lxisoft.modal.Contact,com.lxisoft.repository.AddressBook"%>
<%@page import="java.sql.*,java.io.*"%>
<%@page import="java.sql.Connection"%>

<head>
	<title>Contact App</title>
</head>
<body>
	<% 
	String name = request.getParameter("name");
	String newname =request.getParameter("newname");
	 try{
	 	Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/contact","root","Karthik1996$");
			Statement stmt = con.createStatement();

				String updateQuery="UPDATE contact SET name = '"+newname+"' where name= '"+name+"'";
				PreparedStatement ps=con.prepareStatement(updateQuery);
				ps.executeUpdate();
		   }
		catch(Exception e)
		{}
		out.println(name+"\t"+"is updated to\t"+newname);
    

		%>

</body>
</html>