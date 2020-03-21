<%@page import="com.lxisoft.facegram.Model.UserDetails"%>
<%@page import="java.util.Base64"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<html>



<head>
<style>
.card {
  box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2);
  max-width: 300px;
  margin: auto;
  text-align: center;
  font-family: arial;
}

.title {
  color: grey;
  font-size: 18px;
}

button {
  border: none;
  outline: 0;
  display: inline-block;
  padding: 8px;
  color: white;
  background-color: #000;
  text-align: center;
  cursor: pointer;
  width: 100%;
  font-size: 18px;
}

a {
  text-decoration: none;
  font-size: 22px;
  color: black;
}

button:hover, a:hover {
  opacity: 0.7;
}
</style>
</head>






<body>

<%UserDetails u = (UserDetails)session.getAttribute("userName"); %>
<div class="card"> 
  <h1><%=u.getName() %></h1>
  <p class="title"><%=u.getEmail() %></p>
  <p><%=u.getBio() %></p>
  <div style="margin: 24px 0;">
    <a href="#"><i class="fa fa-dribbble"></i></a> 
    <a href="#"><i class="fa fa-twitter"></i></a>  
    <a href="#"><i class="fa fa-linkedin"></i></a>  
    <a href="#"><i class="fa fa-facebook"></i></a> 
  </div>
  <form action="Update.jsp">
   <button href="">Edit</button>
  </form>
 
</div>
	
	






    
	<form action="upload" method="post" enctype="multipart/form-data">
		<input type="text" name="name">
		<input type="file"name="photo">
		<input type="submit" value="save">
	</form>

	<%
		PreparedStatement ps = null;
		Connection con = null;
		ResultSet rs = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/facegram", "root", "root");
		} catch (Exception e) {
			e.printStackTrace();
		}

		String insertQuery = "select * from image";
		ps = con.prepareStatement(insertQuery);

		rs = ps.executeQuery();

		while (rs.next()) {
			byte[] imgData = rs.getBytes("photo");
			String encode = Base64.getEncoder().encodeToString(imgData);
			System.out.println(rs.getString("name"));
	%>
	<img style="width: 200px; height: 100px;" src="data:image/jpeg;base64,<%=encode%>" />
	<h6><%=rs.getString("name")%></h6>
	<%
		}
	%>
</body>

</html>
