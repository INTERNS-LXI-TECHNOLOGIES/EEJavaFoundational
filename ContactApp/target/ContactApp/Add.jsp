<%@page import="com.lxisoft.config.*"%>
<%@page import="com.lxisoft.domain.*"%>
<%@page import="com.lxisoft.models.*"%>
<%@ page contentType="text/html;charset=UTF-8"  pageEncoding="UTF-8"%>
<HTML>
<HEAD>
	<TITLE>ADD</TITLE>
	</HEAD>
		<%Contact co=(Contact) session.getAttribute("contact");%>
		
	<BODY>
		<H1><CENTER><u>New Contact</u></CENTER></H1>
		<table bgcolor="ccffcc" align=center border="3px" width="20%">
			<form action="adddata" method="post">
				<%Internationalization international=new Internationalization();%>
				<%String language=(String) session.getAttribute("language");
				String fname=international.localization(language,"IN","Firstname");
				String lname=international.localization(language,"IN","Lastname");
				String number=international.localization(language,"IN","Number");
				String save=international.localization(language,"IN","Save");
				String cancel=international.localization(language,"IN","Cancel");%>
				<tr>
					<td><br><input type="text" name="fname" placeholder=<%=fname%>><br>
					<br><input type="text" name="lname" placeholder=<%=lname%>><br>
					<br><input type="text" name="contactNo" placeholder=<%=number%>><br>
					<br><a href="adddata"><input type="submit" value=<%=save%>></a>
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					</form>
					<a href="url"><input type="submit" value=<%=cancel%>></a>
					</td>
		    	</tr>
		</table> 
	</BODY>
</HTML>