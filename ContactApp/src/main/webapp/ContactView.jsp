<%@ page import="com.lxisoft.models.*"%>
<%@ page import="com.lxisoft.Domain.*"%>
<%@ page import="java.util.*"%>
<%@ page import="java.util.ResourceBundle"%>
<!-- <%@ page import="javax.servlet.jsp.jstl.core.Config"%> -->

<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<!-- <META http-equiv="Content-Type" content="text/html; charset=UTF-8"> -->

<!-- <!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd"> -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page isELIgnored="false" %>


<html >
		<head>
			<title> VIEW CONTACT </title>
			  <link rel="stylesheet" type="text/css" href="styles.css">
			   <script>
						var beep=new Audio();
						beep.src="sound2.wav";
				</script>
		</head>
		<body> 
			<% String locale=(String)session.getAttribute("currentlocale"); %>
			<fmt:setLocale value="${currentlocale}" />
            <fmt:setBundle basename="messages"/>
			<center> <h3> <fmt:message key="label.contacts"/></h3> <br/><br/></center>
			<%if(request.getUserPrincipal()!=null) { %>
				<center> <fmt:message key="label.welcome"/> <%=request.getUserPrincipal().getName()%> </center> <% }
			 else { %> <center> <fmt:message key="label.welcome"/> guest  <% } %> </center>

			 <a href="logout" style="float:right;"><fmt:message key="label.logout"/></a>

			<% if (request.isUserInRole("manager"))  { %>
			<a href="ContactAdd.jsp" ><img src="images/add.png" height="40px"; width="40px";></a> 
			<% }
			else { %>
			<nav>
			<button type="button" onclick="beep.play(); Access_denied();"><img src="images/add.png" height="40px"; width="40px";>
			<% } %></button></nav>
			<script>
						function Access_denied(){
						alert("Access denied!!!");
						// window.location="ContactAdd.jsp"
						}
			</script>
			<form action="select" method="GET"><center>
				<input type="text" name="user" placeholder= "<fmt:message key='label.Entername'/>">
				<button> <fmt:message key="label.search"/> </button></center>
			</form>

			<form action="sort" method="GET"><center>
				<select name="sortvalue">
	  				<option value="firstname"><fmt:message key="label.fName"/></option>
	  				<option value="lastname"><fmt:message key="label.lName"/></option>
	  			</select>
	  			<input type="submit" value="<fmt:message key='label.sort'/>"></center>

	  		</form>
  			<% if (request.isUserInRole("manager"))  { %>
				<center> <button  type="button" onClick="window.location.href = 'DeleteAll';"><fmt:message key="label.deleteall"/></button></center>
			<% }
			else { %>
				<center> <button  type="button" onclick="Access_denied()"><fmt:message key="label.deleteall"/></button></center>
			<% } %><br/><br/>
			
			<%ArrayList<ContactModel> contactList=( ArrayList<ContactModel>)session.getAttribute("contactmodel");
			  
				 if(contactList.size()==0)
				{%>
					 <script>
						msg()
						function msg(){
						alert(" No contacts to show");
						// window.location="ContactAdd.jsp"
						}
					</script>
				<%} %>
				<table align="center" border="10px" width="30%">
				<tr><th colspan="3"><strong>NAME</strong></th></tr>
				<% for(ContactModel contactmodel:contactList)
				{ %>

					<tr>
						<!-- <img src="images/person.png" height="50px";width="50px";> -->
					<% if (request.isUserInRole("manager"))  { %>	
						<td><button class="button" type="button" onClick="window.location.href ='select?user=<%=contactmodel.getFullName()%>';"><%=contactmodel.getFullName()%>
						</button></td>
					<% }
					else { %>
						<td>
						<button class="button" type="button" onclick="Access_denied()"><%=contactmodel.getFullName()%>
						</button></td>
					<% } %>

					<% if (request.isUserInRole("manager"))  { %>	
						<td><button class="button" type="button" onClick="window.location.href='selectContact?select=<%=contactmodel.getId()%>';"><fmt:message key="label.edit"/></button></td>
					<% }
					else { %>
						<td>
						<button class="button" type="button" onclick="Access_denied()"><fmt:message key="label.edit"/></button></td>
					<% } %>


					<% if (request.isUserInRole("manager"))  { %>	
						<td><button class="button" type="button" onClick="window.location.href='selectContact?select=<%=contactmodel.getFullName()%>';"><fmt:message key="label.delete"/></button></td>
					<% }
					else { %>
							<td>
							<button class="button" type="button" onclick="Access_denied()"><fmt:message key="label.delete"/></button></td>
						<% } %>

					</tr>
				<% } %>
		</table></br>


		<center><a href="lang?lang=en">English</a> &nbsp; <a href="lang?lang=ml">മലയാളം</a> &nbsp;<a href="lang?lang=hi">हिंदी</a> &nbsp; <a href="lang?lang=fr">française</a><br/><br/></center>
		

		<center><button type="button" onClick="window.location.href='View'"><fmt:message key="label.refresh"/></button>
		<% out.println("<fmt:message key='label.cnct'/>"+""+contactList.size());%></center>

		</body>
</html>