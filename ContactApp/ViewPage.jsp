
<%@page import ="java.sql.*" %> 
<%@page import ="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
	<title>View Database
	</title>
</head>
<body>
	<a href =index.html><h1 align = center><b><u> Contact APP </u></b></h1></a>
	<p align = center>contact app developed by Faris for LxiTechnologies pvt.ltd</p>
	<p><b> Contacts Database<b></p>
		<h1>Displaying Student List</h1> 
	<table border ="1" width="500" align="center"> 
		<tr bgcolor="00FF7F"> 
		<th><b>First Name</b></th> 
		<th><b>Last Name</b></th> 
		<th><b>Email</b></th>
		<th><b>Contact Number</b></th> 
		</tr> 
		<%
		String jdbcURL = "jdbc:mysql://localhost:3306/ContactApp";
  	String userName = "root";
  	String password = "root";
  	PreparedStatement preparedstatement=null;
	Statement statement=null;
	ResultSet result = null;
	
	try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			try
			{
				Connection connection = DriverManager.getConnection(jdbcURL,userName,password);
				
				String sql  = "SELECT * FROM  ContactInfo" ;
			statement = connection.createStatement();
			result = statement.executeQuery(sql);
			System.out.println("\tID\tFirst_Name\tLast_Name\tEmail\tContact_Number");

			while(result.next())
			{
			
			String id = result.getString(1);
			String fname = result.getString(2);	
			String lname = result.getString(3);
			String email = result.getString(4);
			String contactNumber = result.getString(5);
			
			out.println("\n\t"+id+"\n\t"+fname+"\n\t"+lname+"\n\t"+email+"\n\t"+contactNumber+"\n\t");
			
			}
			
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
	
</table>
	 <a href = index.html color=black>Back to Home Page</a>

</body>
</html>
 	