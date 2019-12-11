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
<body style="background-color:#D4DB65;">
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
	</style>

	<%
	String selectId=(String) request.getParameter("selectId");
	out.println(selectId);

	Repository repository=new DbRepository();
	ArrayList<Contact> contactList=repository.findAll();
	SelectModel selectModel=new SelectModel();
	for(Contact contact:contactList)
	{
		if(contact.getId().equals(selectId))
			selectModel.setContact(contact);
	}
	out.println("djhdhh==="+selectModel.getContact().getId());

	%>
	<div align="center">
		<h2>
			<img src="person.jpg" width="135" height="135">
		</h2>
	</div>
	<div align="center">
		<h1>Id: <%=selectModel.getContact().getId()%></h1>
		<h1>Name: <%=selectModel.getContact().getName()%></h1>
		<h1>Number: <%=selectModel.getContact().getName()%></h1> 
	</div>
	<div align="center">
		<form action="delete">
			<%session.setAttribute("selectModel",selectModel.getContact());
			out.println(session.getAttribute("selectModel"));%>
		    <input type="submit" id="b2" value="delete" onclick="return confirm('Are you sure you want to delete?')" />
		</form><br>
		<button id="b2"  onclick="window.location.href='Edit.jsp?selectModel=<%=selectModel.getContact().getId()%>'">Edit</button><br><br><br><br><br><br><br><br>
		<button id="b3"  onclick="window.location.href='showAll'">Back</button>
		<button onclick="goBack()">Go Back</button>
	</div>

	<script type="text/javascript">
	function goBack() {
  	window.history.back();
	}
	</script>



</body>
</html>