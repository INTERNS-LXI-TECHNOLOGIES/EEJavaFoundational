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
	 try{
	 Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/contact","root","Karthik1996$");
			Statement stmt = con.createStatement();

	 String query="delete from contact where name=?";
	  PreparedStatement ps=con.prepareStatement(query);
	  ps.setString(1,name);
	  ps.executeUpdate();
	   }
	 catch(Exception e){

	}
	out.println("Contact\t"+name+"\tis removed");
    

		%>

</body>
</html>