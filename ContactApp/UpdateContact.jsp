<!DOCTYPE html>
<html>
<head>
	<title>Update Contact</title>
</head>
<body>
	<%@ page import="java.util.*" %>
	<%@ page import="java.sql.*" %>
	<%
	String nme = request.getParameter("name");
	try{
	    Class.forName("com.mysql.cj.jdbc.Driver");
	    
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/contactapp","root","abi@1003");
        Statement stmnt = con.createStatement();
        ResultSet rs = stmnt.executeQuery("select * from contacts where name='"+nme+"'");        
        
        while(rs.next()){
        %>
        <form action="Update.jsp">
        	ID : <input type="text" name="sn" value="<%=rs.getInt("sno") %>">
        	<br>
        	Name : <br><input type="text" name="name" value="<%=rs.getString("name") %>">
        	<br>
        	Number : <br><input type="text" name="num" value="<%=rs.getString("number") %>">
        	<br>
        	E-Mail : <br><input type="text" name="mail" value="<%=rs.getString("email") %>">
        	<br>
        	<br>
            <input type="submit" value="Update">
        </form>
        <%
         	//<a href="Update.jsp?name=<%=rs.getString("name") & num=<%=rs.getString("number") & mail=<%=rs.getString("email")">
        }
    }
    catch (Exception e) {
    	e.printStackTrace();
    }
    %>
</body>
</html>