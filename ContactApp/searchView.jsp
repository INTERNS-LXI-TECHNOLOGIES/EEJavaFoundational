<%@page import="com.lxisoft.servlet.*"%>
<%@page import="com.lxisoft.model.*"%>
<%@page import="com.lxisoft.repository.*"%>
<%@page import="java.util.*,java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
	<title>Search</title>
</head>
<body>
	<h4>The Search Result</h4>
	<table border="1" width="50%">
		<tr>
			<th>Name</th>
			<th>Number</th>
			<th>Mail</th>
		</tr>
		<%
		String name = request.getParameter("name");
		Contact model = new Contact();
	    Connection con = null;
	    ResultSet rs= null;
	    Statement stmt = null;
	    PreparedStatement ps = null;;
	    int row;
		//ContactDatabase cd = new ContactDatabase();
		try{
		    Class.forName("com.mysql.jdbc.Driver");
			try{
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/contactapp","root","abi@1003");	
			}catch(SQLException e)
			{	
				e.printStackTrace();	
			}
		    //cd.createDatabaseConnection();
		    stmt = con .createStatement();
		    rs = stmt.executeQuery("select * from contacts where name like '%"+name+"%'");
		    if(rs != null){
		        
		        while(rs.next()){
		        %>
			    <tr>
			        <td><%=rs.getString("name")%></td>
			    	<td><%=rs.getString("number")%></td>
			    	<td><%=rs.getString("email")%></td>
			    </tr> 
			    <%
			    }
		    }
	    }
	    catch(Exception e){
	        e.printStackTrace();
	    }
		%>
	</table>
	<br>
	<br>
	<a href="view.jsp">Back</a>
</body>
</html>