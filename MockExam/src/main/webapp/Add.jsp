<%@ page contentType="text/html;charset=UTF-8"  pageEncoding="UTF-8"%>
<%@page import="com.lxisoft.config.*"%>
<!DOCTYPE html>
<html>
<head>
	<title>Add</title>
</head>
<%Internationalization international=new Internationalization();
String language=(String)session.getAttribute("language");
String add=international.localization(language,"IN","Add");
String cancel=international.localization(language,"IN","Cancel");%>
<body background="aa.jpg">
<table align="center">
	<form action="add" method="post">
	<tr>
		<td><br><input type="text" name="question" required="" placeholder=question><br>
		<br><input type="text" name="option1" required="" placeholder=option1><br>
		<br><input type="text" name="option2" required="" placeholder=option2><br>
		<br><input type="text" name="option3" required="" placeholder=option3><br>
		<br><input type="text" name="option4" required="" placeholder=option4><br>
		<br><input type="text" name="answer" required="" placeholder=answer><br>
		<br><input type="submit" value="<%=add%>"></form>
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		<a href="index.jsp"><input type="submit" value="<%=cancel%>"></a></td>
	</tr>
</table>
</body>
</html>