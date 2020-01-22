<%@page import="com.lxisoft.config.*"%>
<%@page import="java.io.*"%>
<%@page import="java.util.*"%>
<%@page import="javax.servlet.*"%>
<%@page import="javax.servlet.http.*"%>
<%@ page contentType="text/html;charset=UTF-8"  pageEncoding="UTF-8"%>
<HTML>
<TITLE>CONTACT</TITLE>
<BODY>
<TABLE bgcolor=#ccffcc align=center BORDER="10px" width="25%">
<TR>
	<%Internationalization international=new Internationalization();
	String language=request.getParameter("language");
	if(language==null)
	{
		language="en";
	}
	String lang= international.localization(language,"IN","CONTACTAPP");
	session.setAttribute("language",language);%>
	<TD><H1><CENTER><a href="url"><%=lang%></a></H1></TD>
</TR>
<tr> 
	<TD>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="?language=en">ENGLISH</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="?language=mal">മലയാളം</a></TD>
</tr>
	
</TABLE>
</BODY>
</HTML>