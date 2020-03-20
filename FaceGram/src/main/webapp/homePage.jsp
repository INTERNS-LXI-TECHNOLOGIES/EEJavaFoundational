<%@page import="java.util.Base64"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<html>
<body>

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
	%>
	<img style="width: 200px; height: 100px;" src="data:image/jpeg;base64,<%=encode%>" />
	<h6><%rs.getString("name"); %></h6>
	<%
		}
	%>
</body>
</html>
