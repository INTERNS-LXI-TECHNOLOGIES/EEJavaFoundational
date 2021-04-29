<!DOCTYPE html>
<html>
<head>
	<title>Log in</title>
</head>
<body>
    <h2>Log In</h2>
    <form action="Login">
        <br>
        User Name : <input type="text" name="name">
        <br>  
        <br>
        Password  : <input type="password" name="password">
        <br>
        <br>
        <input type="submit" name="button" value="Login">
        <br>
        <br>
        <a href="index.html">Back</a>
    </form>
    <!--
	<%@page import="java.util.*" %>
	<%@page import ="java.sql.*" %>
	<%
	String user = request.getParameter("name");
	String pass = request.getParameter("password");
	try{
	    Class.forName("com.mysql.cj.jdbc.Driver");
	    
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/contactapp","root","abi@1003");
        Statement stmnt = con.createStatement();
        ResultSet rs = stmnt.executeQuery("select * from users where name='"+user+"'");
        if(rs.next()){
            if(rs.getString(3).equals(pass)){
                response.sendRedirect("Home.jsp"); 
            }
            else{
                out.println("Wrong password");
                %>
                <br>
                <br>
                <a href="Login.html">Back</a>
                <br>
            <%
            }
        }
        else{
            out.println("Wrong password or username");
            %>
            <br>
            <%
            out.println("If you havent signup ");
            %>
            <a href="SignIn.html">Signup</a>
            <br>
            <br>
            <a href="Login.html">Back</a>
            <br>
            <%
        }
    }
    catch (Exception e) {
        e.printStackTrace();         	
    }        
        
	%>-->
</body>
</html>