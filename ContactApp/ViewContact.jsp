<!DOCTYPE html>
<html>
<%@page import="com.lxisoft.modal.Contact,com.lxisoft.repository.AddressBook,java.util.*"%>
<%@page import="java.sql.*,java.io.*"%>
<%@page import="java.sql.Connection"%>
<head>
	<style>
		table, th, td {
  border: 1px solid black;
}
	</style>
	<title>View-Contact</title>
	<link rel="stylesheet" type="text/css" href="css/bootstrap.css">
</head>
<body>
	<table style="width:70%">
		<tr>
			<th>Name</th>
    <th>Number</th> 
    <th>Email ID</th>
    </tr>
    <tr>
<%
             ArrayList<Contact> datas=new ArrayList<Contact>(); 

				//out.println("...........");
			 try{
			 Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/contact","root","Karthik1996$");
			Statement stmt = con.createStatement();
			//out.println("Succesfull"+"\n");
	
           PreparedStatement ps=con.prepareStatement("select * from contact");
             ResultSet rs=ps.executeQuery();			 
             while(rs.next())
			 {	
              Contact cm=new Contact();
              %>
              <tr>
              <td><%=rs.getString("name")%></td>
			  <td><%=rs.getString("number")%></td>
			  <td><%=rs.getString("email")%></td>
			  </tr>
			  <%
			  //datas.add(cm);
			  //out.println("..........."+cm);
			  
			  
               // out.println(rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
			 }
			 }catch(Exception e){
				 e.printStackTrace();
			 }
//out.println(datas);
   
%>
</tr>

</table>




</body>
</html>