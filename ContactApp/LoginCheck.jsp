<!DOCTYPE html>
<html>
<head>
	<title>LoginCheck</title>
</head>
<body>
<%
	   String name= request.getParameter("username");
	   String password= request.getParameter("password");
	   out.println(name);
	   if(name.equals("karthik")&&password.equals("123456"))
		{
			response.sendRedirect("Menu.html");
		}
		else
		{

			response.sendRedirect("Failed.html");
		}%>
</body>
</html>