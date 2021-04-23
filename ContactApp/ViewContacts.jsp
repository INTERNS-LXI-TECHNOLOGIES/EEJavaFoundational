<!DOCTYPE html>
<html>
<head>
	<title>View contact</title>
</head>
<body>
	<table border="1">
		<tr>
			<td>S.No</td>
			<td>Name</td>
			<td>Number</td>
			<td>E-mail</td>
			<td>Action</td>
			<td>Action</td>
		</tr>
	<%@ page import="java.sql.*" %>
	<%@ page import="java.util.*" %>
	<%
	try{
	    Class.forName("com.mysql.cj.jdbc.Driver");
	    
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/contactapp","root","abi@1003");
        Statement stmnt = con.createStatement();
        ResultSet rs = stmnt.executeQuery("select * from contacts");        
        
        while(rs.next()){
        %>
        <tr>
        	<td><%= rs.getInt("sno")%></td>
        	<td><%= rs.getString("name")%></td>
        	<td><%= rs.getString("number")%></td>
        	<td><%= rs.getString("email")%></td>
        	<td><a href="DeleteContact.jsp?id=<%=rs.getInt("sno")%>"><button type="button" class="DeleteContact">Delete</button></a></td>
        	<td><a href="UpdateContact.jsp?name=<%=rs.getString("name")%>"><button type="button" class="UpdateContact">Update</button></a></td>
        </tr>
        <%    
        }    
    }
    catch(Exception e){
        e.printStackTrace();
    }
    %> 
    </table>
    <br>
    <a href="Home.jsp">Home</a>
    <br>
    <br>
    <a href="index.html">Log_out</a>
</body>
</html>