<!DOCTYPE html>
<html>
<head>
	<title>View contact</title>
</head>
<body>
	<%@ page import="java.sql.*" %>
	<%@ page import="java.util.*" %>
	<%
	try{
	    Class.forName("com.mysql.cj.jdbc.Driver");
	    
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/contactapp","root","abi@1003");
        Statement stmnt = con.createStatement();
        ResultSet rs = stmnt.executeQuery("select * from contacts");
        out.println("+--------+-----------------------+---------------------+-------------------------------+");
        %>
        <%
        out.println("|   S.No |         Name          |       Number         |            E-Mail            |")
        %>
        <%
        out.println("+--------+-----------------------+---------------------+-------------------------------+");
        
        while(rs.next()){
            int sno = rs.getInt("sno");
            String nme = rs.getString("name");
            String num = rs.getString("number");
            String mail = rs.getString("email");
            %>
            <%
            out.println("  "+sno+"     "+name+"      "+number+"         "+email);
        }
        %>
        <%
        out.println("+--------+-----------------------+---------------------+-------------------------------+");
    }
    %> 
</body>
</html>