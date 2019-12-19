<%@page import="com.lxisoft.controller.*"%>
<%@page import="com.lxisoft.domain.*"%>
<%@page import="com.lxisoft.model.*"%>
<%@page import="com.lxisoft.repository.*"%>
<%@page import="java.util.*"%>

<!DOCTYPE html>
<html>
<head>
	<title>CONTACT SELECTED</title>
</head>
<body style="background-color:#E6EC73;">
	<style type="text/css">
		#b1,#b2{		
    background-color: blue;
    color: white;
    font-size: large;
	}
		#b3 {
			  background-color: red;
    color: white;
    font-size: large;
		}
		#b4{
			background-color: red;
			font-size: larger;
		 float: right;	
		 margin: -28px 161px;
		}
	</style>
	<div>
		<button id="b4" onclick="window.location.href='index.jsp'">close(X)</button>
	</div>

	<%
	String selectId=(String) request.getParameter("selectId");
	Repository repository=new DbRepository();
	ArrayList<Contact> contactList=new ArrayList<Contact>();
	contactList=repository.findAll();
	SelectModel selectModel=new SelectModel();
	for(Contact contact:contactList)
	{
		if(contact.getId().equals(selectId))
			selectModel.setContact(contact);
	}
	%>

	<div align="center">
		<h2 style="margin: 47px;">
			<img src="person.jpg" width="135" height="135">
		</h2>
	</div>
	<div align="center">
		<h1>Id: <%=selectModel.getContact().getId()%></h1>
		<h1>Name: <%=selectModel.getContact().getName()%></h1>
		<h1>Number: <%=selectModel.getContact().getNumber()%></h1> 
	</div>
	<%
	session.setAttribute("selectModel",selectModel);
	%>

	<div align="center">
		<form action="deleteContact">
		    <input type="submit" id="b1" value="delete" onclick="return confirm('Are you sure you want to delete?')" />
		</form><br>

		<button id="b2" onclick="window.location.href='jsp/Edit.jsp'">Edit</button><br><br><br><br><br><br><br>
		
		<button id="b3" onclick="goBack()">Go Back</button>
	</div>

	<script type="text/javascript">
	function goBack() {
  	window.history.back();
	}
	</script>
</body>
</html>
