<html>
<head>
	<title>Jos</title>
</head>
<body  >
	 <%@page import="java.sql.*" %>
	<% 
     try{  
    Class.forName("com.mysql.jdbc.Driver");  
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/contact","root","root");  
    //here sonoo is database name, root is username and password  
    Statement stmt=con.createStatement();  
    
    ResultSet rs=stmt.executeQuery("select * from contactlist"); 
       %>
    <h1>WELCOME</h1>  
    <% 
    while(rs.next()) {
    %>
    <h1><%out.println("  Id  "+"      "+"  Name       "+"   "+"   Number     ");%></h1>  
    <h1><%out.println(rs.getInt(1)+"  "+rs.getString(2)+"   "+rs.getString(3));%></h1>  
    <%
    }
    con.close();  
    }catch(Exception e){ System.out.println(e);} 
	%>
	happy
</body>
</html>