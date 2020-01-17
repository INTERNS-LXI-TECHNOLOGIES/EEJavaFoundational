<%@page import="javax.servlet.*"%>
<%@page import="javax.servlet.http.*"%>
<%@page import="com.lxisoft.repository.*"%>
<%@page import="com.lxisoft.domain.*"%>
<%@page import="com.lxisoft.models.*"%>
<%@page import="com.lxisoft.config.*"%>
<%@ page contentType="text/html;charset=UTF-8"  pageEncoding="UTF-8"%>
<HTML>
<HEAD>
	<TITLE>DELETE</TITLE>
</HEAD>
<BODY>
	<h1 align=center>Delete Contact</h1>
	<%Internationalization international=new Internationalization();%>
	<%
		Contact co=(Contact)session.getAttribute("contact");
		String language=(String) session.getAttribute("language");
		String delete= international.localization(language,"IN","Delete");
		String cancel= international.localization(language,"IN","Cancel");
	%>
	<table  bgcolor="ccffcc" align=center border="5" width=25% height=20%>
	<FORM action="deletedata" method="get">
		<tr>
			<td><center>You want to delete?</center></td><br>
		</tr>
		<br>
		<tr>
			<td><input type="hidden" name="id" value="<%=co.getId()%>"><br>
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="deletedata"><input type="submit" value=<%=delete%>></a>&nbsp;&nbsp;&nbsp;
				</FORM>
				<a href="url"><input type="submit" value=<%=cancel%>></a>
			</td>
		</tr>
		
	
	</table>
</BODY>
</HTML>