<%@page import="com.lxisoft.model.*"%>
<%@page import="com.lxisoft.repository.*"%>
<%@page import="com.lxisoft.servlet.*"%>
<%@page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
	<title>ContactApp</title>
	<style type="text/css">
		
		html,body{
			padding: 5px;margin: 10px;
			background:#009b77;
		}

		.button1{
			background-color: #008cba;
			color: white;
			padding: 15px 30px;
			text-align: center;
			text-decoration: none;
			display: inline-block;
			font-size: 15px;
			border-radius: 10px;
		}
		#search{
			float: right;
			position: relative;top: -50px;
		}
		/*#view
		{
			display: inline-table;
			width: 40%;
			margin: auto;
		}
*/		table
		{
    		align-content: center;
   			margin: inherit;
    		width: 100%;
		}
	</style>
</head>
<body>
	<div id="addcontact">
		<a href="add.html"><button class="button1">Add Contact</button></a>
	</div>
	<div id="search">
		<form action="searchContact" method="GET">
			<input type="text" name="searchname" placeholder="Enter a Name" required style="width: 500px; height: 45px">
			<button class="button2" style="height: 50px;background-color: #008cba; width: 100px; color: white;border-radius: 10px;">Search</button>
		</form>
	</div>
	<div id="view">
		<table border="1" width="100%">
		<tr>
			<th>ID</th>
			<th>FULL NAME</th>
			<th>PHONE NUMBER</th>
		</tr>
		<%
		DataBase db = new DataBase();
		ArrayList<Contact> contactList = new ArrayList<Contact>();
		contactList = db.getAllContacts(contactList);
		if(contactList.size() == 0)
		{%>
			<script type="text/javascript">
				window.alert("No Records To Display");
			</script>	
		<%}
		else{
		%>
		<%
			for (int i=0;i<contactList.size();i++) 
			{%>
		<tr>				
			<td><%out.println(contactList.get(i).getId());%></td>
			<td><%out.println(contactList.get(i).getFullName());%></td>
			<td><%out.println(contactList.get(i).getPhoneNum());%></td> 
			<td><a href="update.jsp?id=<%=contactList.get(i).getId()%>&firstname=<%=contactList.get(i).getFirstName()%>
				&lastname=<%=contactList.get(i).getLastName()%>&phno=<%=contactList.get(i).getPhoneNum()%>"><button style="background-color: #008cba;color: white; border-radius: 10px;">Update</button></a></td>
			<td><a href="deleteContact?id=<%=contactList.get(i).getId()%>"><button style="background-color: #008cba;color: white;border-radius: 10px;">Delete</button></td>	
		</tr>
		 <%}
		}%>
	</table>
	</div>
</body>
</html>