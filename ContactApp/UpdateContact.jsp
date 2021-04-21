<!DOCTYPE html>
<html>
<head>
	<title>Update Contact</title>
</head>
<body>
	<%@ page import="java.util.*" %>
	<%@ page import="java.sql.*" %>
	<%
	String id = request.getParameter("id");
	try{
	    Class.forName("com.mysql.cj.jdbc.Driver");
	    
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/contactapp","root","abi@1003");
        Statement stmnt = con.createStatement();
        ResultSet rs = stmnt.executeQuery("select * from contacts where sno='"+id+"'");        
        
        while(rs.next()){
        %>
        <form action="Update.jsp">
        	<input type="hidden" name="sn" value="<%=rs.getInt("sno") %>">
        	<br>
        	Name : <br><input type="text" name="name" value="<%=rs.getString("name") %>">
        	<br>
        	Number : <br><input type="text" name="num" value="<%=rs.getString("number") %>">
        	<br>
        	E-Mail : <br><input type="text" name="mail" value="<%=rs.getString("email") %>">
        	<br>
        	<br>
        	<input type="submit" name="change" value="Update">
        </form>
        <%
        }
    }
    catch (Exception e) {
    	e.printStackTrace();
    }
    %>
</body>
</html>