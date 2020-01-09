<%@page import="com.lxisoft.Domain.*"%>
<%@page import="com.lxisoft.Repository.*"%>

<html>
<head>
	<title>EDIT CONTACT</title>
	<body>
		<%
		String id=request.getParameter("id");
		DataRepository drr = new DataRepository();
		Contact c = drr.findById(id);


		%>
		<table align="center" border= "5" width="30%" border color= "red" bgcolor="yellow">
			     <form action= "update" method="post">
		<input type="hidden" name="id" value="<%=(c.getId())%>"/>
		<input type="text" name="name" value="<%=(c.getName())%>"/>
		<input type="text" name="number" value="<%=(c.getNumber())%>"/>
		<input type="submit" value="SAVE">

        </form>
   
	</body>
</head>

