<<<<<<< HEAD
<%@page import="com.lxisoft.servlet.*"%>
<%@page import="com.lxisoft.model.*"%>
<%@page import="com.lxisoft.repository.*"%>
<%@page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
	<title>ViewContacts</title>
</head>
<body>
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
				//alert("error");
				window.alert("No Records To Display");
				//showAlert();	
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
			<td><a href="update.jsp?id=<%=contactList.get(i).getId()%>"><button>Update</button></a></td>
			<td><a href="deleteContact?id=<%=contactList.get(i).getId()%>"><button>Delete</button></td>	
		</tr>
		<%}
		}%>
	</table>
	<a href="index.html"><button>Home</button></a>
	<script type="text/javascript">
		function showAlert() 
		{
			window.alert("No Records To Display");
		}
		
	</script>
</body>
=======
<%@page import="com.lxisoft.servlet.*"%>
<%@page import="com.lxisoft.model.*"%>
<%@page import="com.lxisoft.repository.*"%>
<%@page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
	<title>ViewContacts</title>
</head>
<body>
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
		%>
		<%
			for (int i=0;i<contactList.size();i++) 
			{%>
		<tr>				
			<td><%out.println(contactList.get(i).getId());%></td>
			<td><%out.println(contactList.get(i).getFullName());%></td>
			<td><%out.println(contactList.get(i).getPhoneNum());%></td> 
			<td><a href="update.jsp?id=<%=contactList.get(i).getId()%>"><button>Update</button></a></td>
			<td><a href="deleteContact?id=<%=contactList.get(i).getId()%>"><button>Delete</button></td>	
		</tr>
		<%}%>
	</table>
	<a href="index.html"><button>Home</button></a>
</body>
>>>>>>> b81f6fd2e67710b4348ee6ebc133966c3528ddee
</html>