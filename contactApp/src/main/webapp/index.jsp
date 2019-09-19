<%@page import="com.lxisoft.contact.model.*"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page import="com.lxisoft.contact.controller.*"%>
<%@page import="java.sql.*" %>
<%@page import="java.io.*"%>
<%@page import="java.util.Locale"%>
<%@page import="java.util.ResourceBundle"%> 
<!DOCTYPE html>
<html>
<head>
	<title>Login page</title>
</head>
<body>
	<%
     Object msg = request.getAttribute("errorMsg");
        if(msg != null ){
           out.println(msg);
        }
        String langu=request.getParameter("lang");
        System.out.println("LAN:"+langu);
        if(langu==null)
        {
        	Locale locale = new Locale("langu", "IN");
        	ResourceBundle bundle = ResourceBundle.getBundle("LanguageBundle", locale); 
        }
     %>
<form action="login" method="post">
	<%=bundle.getString("login") %><br><br>
	<%=bundle.getString("username") %><br><br>
	<input type="text" name="username"><br><br>
	<%=bundle.getString("password") %><br><br>
	<input type="password" name="password"><br><br>
	<button type="submit" name="submit"><%=bundle.getString("login")%></button><br><br>
</form>
<form action="index.jsp" method="post">
	<input type="hidden" name="lang" value="ml">
	<input type="submit" name="submit" value="മലയാളം">
</form>
<form action="index.jsp" method="post">
	<input type="hidden" name="lang" value="hi">
	<input type="submit" name="submit" value="हिंदी">
</form>
<%
 String langChoice = request.getParameter( "name" );
 out.println(langChoice);
       /* if ( langChoice == null )
            session.setAttribute( "langPref", session.getValue("langPref") );
       	String langChoice = "eng";
   		session.setAttribute( "langPref", langChoice );*/
%>

<a href="registration.jsp">Registration</a> 
</body>
</html>