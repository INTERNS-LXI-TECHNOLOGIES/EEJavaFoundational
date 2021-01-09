<%@page import ="java.sql.*" %> 
<%@page import ="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
	<title>Add Contact
	</title>
</head>
<body>
	<a href =index.html><h1 align = center><b><u> Contact APP </u></b></h1></a>
	<p align = center>contact app developed by Faris for LxiTechnologies pvt.ltd</p>
	<p> SuccessFully Deleted  From Records</p>

	<% 
	String fname= request.getParameter("first_name");
	String lname= request.getParameter("last_name");
	String email= request.getParameter("email");
	String phNo= request.getParameter("contact");
	
	String jdbcURL = "jdbc:mysql://localhost:3306/ContactApp";
  	String userName = "root";
  	String password = "root";
  	PreparedStatement preparedstatement=null;
	Statement statement=null;
	
	try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			try
			{
				Connection connection = DriverManager.getConnection(jdbcURL,userName,password);
				
				//statement = connection.createStatement();
				preparedstatement = connection.prepareStatement("INSERT INTO ContactInfo (First_Name,Last_Name,Email,Contact_Number) VALUES ('"+fname+"','"+lname+"','"+email+"','"+phNo+"')");
				int row = preparedstatement.executeUpdate();


				preparedstatement.close();
				connection.close(); 
				}	

			catch(SQLException e)
			{
				out.println(e);
			}
		}
		catch(ClassNotFoundException e)
		{
			out.println(e);
		}
	%>
	 <a href = index.html color=black>Back to Home Page</a>
</body>
</html>