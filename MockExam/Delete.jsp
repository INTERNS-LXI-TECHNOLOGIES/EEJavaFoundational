<%@page import="com.lxisoft.repository.*"%>
<%@page import="com.lxisoft.models.*"%>
<HTML>
<HEAD>
	<TITLE>DELETE</TITLE>
</HEAD>
<BODY>
	<h1 align=center>Delete Question</h1>
	<%
		Question qn=(Question)session.getAttribute("question");
		int i=0;
	%>
	<table align=center border="5" width=25% height=20%>
	<FORM action="delete" method="get">
		<tr>
			<td><center>You want to delete?</center></td><br>
		</tr>
		<br>
		<tr>
			<td><input type="hidden" name="qno" value="<%=qn.getQno()%>"><br>
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="submit" value=Delete>&nbsp;&nbsp;&nbsp;
				</FORM>
				<a href="url"><input type="submit" value=Cancel></a>
			</td>
		</tr>
		
	
	</table>
</BODY>
</HTML>