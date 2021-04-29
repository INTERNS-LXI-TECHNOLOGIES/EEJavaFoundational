<!DOCTYPE html>
<html>
<head>
	<title>Sign up</title>
</head>
<body>
	<h1>Sign up</h1><br/>
	<form action="Signin">
		User name <br/><input type="text" name="userName">
		<br/>
		Password <br/><input type="password" name="password">
		<br>
		<br>
		<input type="submit" value="Signup">
	</form>
	<br>
	<br>
	<a href="index.html">Back</a>
	<!--<h1>Welcome</h1>
	<%@ page import="java.sql.*" %>
	<%@ page import="java.util.*" %>
	<%
	String uname = request.getParameter("userName");
	String upassword = request.getParameter("password");
	try{
	    Class.forName("com.mysql.cj.jdbc.Driver");
	    try{
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/contactapp","root","abi@1003");
           //out.println("  "+uid+"  "+uname+"  "+upassword+"  ");
           PreparedStatement ps = con.prepareStatement("insert into users(name,password) values('"+uname+"','"+upassword+"')");
           int row = ps.executeUpdate();   
	    }	    
	    catch(SQLException e){
	        e.printStackTrace();
	    }
    }
    catch(ClassNotFoundException e){
        e.printStackTrace();
    }
    response.sendRedirect("Home.jsp");
	%>
	-->
</body>
</html>