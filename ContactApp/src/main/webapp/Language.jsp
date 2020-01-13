<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<head>
	<title>Language</title>
	<meta charset="UTF-8">
	<!-- <link rel="stylesheet" type="text/css" href="style_contacts.css"> -->
</head>
<body>
<%@ page import="java.util.*,com.lxisoft.model.*"%>
<% String type="ENGLISH";
   String type1="MALAYALAM";

      if(type.equals(request.getParameter("type")))
      
            session.setAttribute("language",type);
      else
           session.setAttribute("language",type1);
      %>
 </body>
 </html> 