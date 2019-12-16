<%@page import="javax.servlet.*"%>
<%@page import="javax.servlet.http.*"%>
<%@page import="com.lxisoft.repository.*"%>
<%@page import="com.lxisoft.domain.*"%>
<%@page import="com.lxisoft.models.*"%>
<HTML>
<HEAD>
	<TITLE>DELETE</TITLE>
</HEAD>
<BODY>
	<h1 align=center>Delete Contact</h1>
	<%
		Contact co=(Contact)session.getAttribute("contact");
	%>
	<table  bgcolor="ccffcc" align=center border="5" width=20% height=20%>
	<FORM action="deletedata" method="get">
		<tr>
			<td><center>You want to delete?</center></td><br>
		</tr>
		<br>
		<tr>
			<td><input type="hidden" name="id" value="<%=co.getId()%>"><br>
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="deletedata"><input type="submit" value="Delete"></a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				&nbsp;&nbsp;&nbsp;&nbsp;<input type="submit" value="Cancel">
			</td>
		</tr>
		
	</FORM>
	</table>
</BODY>
</HTML>