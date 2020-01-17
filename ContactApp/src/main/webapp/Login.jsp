<%@page import="com.lxisoft.config.*"%>
<%@ page contentType="text/html;charset=UTF-8"  pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<title>Login</title>
</head>
	<%Internationalization international=new Internationalization();
	String language=(String) session.getAttribute("language");
	String userName= international.localization(language,"IN","UserName");
	String password= international.localization(language,"IN","Password");
	String skip= international.localization(language,"IN","Skip");
	String signup= international.localization(language,"IN","SignUp");
	String login= international.localization(language,"IN","Login");%>
<body>
<table bgcolor="#00ffff" align=center border=1 width=25% height="">
	<form action="j_security_check" method="post">
		<tr>
			<td><h1 align="center"><u>Login Page</u></h1>
			&nbsp;&nbsp;<input type="text" name="j_username" placeholder=<%=userName%>><br>
			<br>&nbsp;&nbsp;<input type="password" name="j_password" placeholder=<%=password%>><br>
			<br>&nbsp;&nbsp;<input type="submit" value=<%=login%>>&nbsp;&nbsp;&nbsp;
			&nbsp;&nbsp;&nbsp;<a href="url"><input type="submit" value=<%=skip%>></a>&nbsp;&nbsp;&nbsp;
			&nbsp;&nbsp;&nbsp;<a href="SignUp.jsp"><input type="submit" value=<%=signup%>></a>
			</td>
		</tr>
	</form>
</table>
</body>
</html>