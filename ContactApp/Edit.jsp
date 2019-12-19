<%@page import="com.lxisoft.Domain.*"%>

<html>
<head>
	<title>EDIT CONTACT</title>
	<body>
		
		<table align="center" border= "5" width="30%" border color= "red" bgcolor="yellow">
			     <form action= "update" method="post">
		<input type="hidden" name="id" value="<%=((Contact)session.getAttribute("c")).getId()%>"/>
		<input type="text" name="name" value="<%=((Contact)session.getAttribute("c")).getName()%>"/>
		<input type="text" name="number" value="<%=((Contact)session.getAttribute("c")).getNumber()%>"/>
		<input type="submit" value="SAVE">
		<!-- <form action = "edit" method ="post"> -->
        

        </form>
   
	</body>
</head>

