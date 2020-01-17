<%@page import="javax.servlet.*"%>
<%@page import="javax.servlet.http.*"%>
<%@page import="com.lxisoft.repository.*"%>
<%@page import="com.lxisoft.domain.*"%>
<%@page import="com.lxisoft.models.*"%>
<%@page import="com.lxisoft.config.*"%>
<%@ page contentType="text/html;charset=UTF-8"  pageEncoding="UTF-8"%>
<html>
<head>
	<title>EDIT</title>
	</head>
	<body>
		<center><h1>Edit Contact</h1></center>
		<%Internationalization international=new Internationalization();
		Contact co=(Contact)session.getAttribute("contact");
		String language=(String) session.getAttribute("language");
		String newfname= international.localization(language,"IN","NewFirstname");
		String newlname= international.localization(language,"IN","NewLastname");
		String newnumber= international.localization(language,"IN","NewContactNumber");
		String save= international.localization(language,"IN","Save");
		String cancel=international.localization(language,"IN","Cancel");%>
		<table bgcolor="ccffcc" align=center border=5 width=25% height=20%>
			<form action="edit" method="post">
				<input type="hidden" name="id" value="<%=co.getId()%>"/>
			<tr>
				
				<td><br><input type="text" name="fName" placeholder=<%=newfname%>><br>
				<br><input type="text" name="lName" placeholder=<%=newlname%>><br>
				<br><input type="text" name="contactNo" placeholder=<%=newnumber%>><br>
				<br><a href="edit"><input type="submit" value=<%=save%>></a>
			</form>
			<a href="url"><input type="submit" value=<%=cancel%>></a></td>
			</tr>
		</table>
		
	</body>
</html>