<%@page import ="java.sql.*" %> 
<%@page import ="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
	<title>Delete Contact
	</title>
</head>
<body>
	<a href =index.html><h1 align = center><b><u> Contact APP </u></b></h1></a>
	<p align = center>contact app developed by Faris for LxiTechnologies pvt.ltd</p>
	<p> SuccessFully Deleted  From Records</p>

	<%	
    	
		String delete= request.getParameter("delete");
    	Connection connection =null;
		Statement statement = null;
    	String jdbcURL = "jdbc:mysql://localhost:3306/ContactApp";
  		String userName = "root";
  		String password = "root";
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			try
			{
				connection = DriverManager.getConnection(jdbcURL,userName,password);
				
			statement = connection.createStatement();
			statement.executeUpdate("delete from ContactInfo where ID='"+delete+"'");
			System.out.println("Record Sucessfully Deleted");
			statement.close();
			connection.close();	
			}
		

			catch(SQLException e)
			{
				System.out.println("Database is not Connected Due to SQLException");
			}
		}
		catch(ClassNotFoundException e)
		{
			System.out.println("Database Is Not Connected To Database Due To ClassNotFoundException");
		}
		%>
		 <a href = index.html color=black>Back to Home Page</a>

</body>
</html>
