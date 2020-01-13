<%@ page import="com.lxisoft.Domain.*" %>
<%@ page import="com.lxisoft.Models.*" %>
<%@ page import="java.util.*" %>
	<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<html>
<title> CONTACT APP</title>
<head>
	<!-- <meta http-equiv="Content-Type" content="text/html; charset=utf-8"> -->
	<script>
		var beep=new Audio();
		beep.src="song.mp3";
	</script>
<link rel="stylesheet" type="text/css" href="styles.css"><CENTER><font color="red" size="32"><b> CONTACT APP </b></font></CENTER></head>
<body>


<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page isELIgnored="false"%>
 
<fmt:setLocale value="${param.lang}" />
<fmt:setBundle basename="messages" />
 
<html lang="${param.lang}">




<% String userName=null;
if(request.getUserPrincipal()!=null){
userName= request.getUserPrincipal().getName();

}%>
<% if (userName!=null){ %>
<center><fmt:message key="label.welcome" /> <%=userName %></center>
<c:set var="log" scope="application" value="login"/>
<% session.setAttribute("login",userName);
 }
else if (request.getUserPrincipal()==null){ %>
<center><fmt:message key="label.welcome" /> Guest</center>
<% }  %>


<center><% if(request.isUserInRole("admin")){ %>
<a href="addnew.jsp" style="color: green; text-align: center;"><button >+</button></a>
<% }
else{ %>
<!-- <embed src="song.mp4"> </embed> -->
<button onclick="beep.play();denied();" >+</button></a>
<% } %> </center>
 

<script>
	function denied()
	{
		alert("access denied");
		// <audio controls autoplay>  
  // <source src="song.mp3" type="audio/mpeg"></audio>  
	}
</script>
 <center>
<form action="search" method="GET"  align="center">
	<font color="white"> search a contact: </font><br><input  type="text"  align="center" name="user">
	<button name="search" type="submit"><fmt:message key="label.search" /></button></form>

</center>
<% if(request.isUserInRole("admin")){  %>
<center><button  onclick="window.location.href='deleteAll';" ><fmt:message key="label.delete" /></button> <br></center>
<% }
else { %>
<center><button  onclick="beep.play();denied();" ><fmt:message key="label.delete" /></button> <br></center>
	<% } %>
<center>
<form action="sort">
	<select name="sort">
		<option value="first">first name</option>
		<option value="last">last name</option>
		<option value="id">id</option>
		
	</select>
	<input type="submit" value="sort">
</form></center>
<br>

<br>
<center>
	<button onclick="window.location.href='viewall';">refresh</button>
	<button onclick="window.location.href='logout';">logout</button>
</center>

<center>
<a href="?lang=eng">english</a>
<a href="?lang=ml">മലയാളം</a>
</center>
<% ArrayList<ViewListModel>contacts=new ArrayList<ViewListModel>();
contacts=(ArrayList<ViewListModel>)session.getAttribute("contacts"); %>

<% 	if(contacts.size()==0  ){ %>
<%	 out.println("<b><h1><CENTER>"+"no contact to show"+"</CENTER></h1></b>"); %> 

<% } else{%>

<br>
	<!-- <img src="dead.jpg" width="50" height="50"> -->
<div style="overflow-x: auto;">
<table align="center">
	<p><tr><th></th><th><h3>ID</h3></th>
		<th><h3>NAME</h3></th></p></tr>

	 <%  for (ViewListModel a: contacts){%>

	<tr>
		<td><img src="contact.png" width="50" height="50"></td>
		<td><font color=" grey" size="65"><%out.println(a.getId());%></font></td>
		<td><a href="search?user=<%=a.getFullName()%>"><font color=" green" size="65"><%out.println(a.getFirstName());%></font></td></a>
		<%  if(request.isUserInRole("admin")){ %>
		<td><a href="select?type=edit&name=<%=a.getFullName()%>"><fmt:message key="label.edit" /></a></td>
		<td><a href="select?name=<%=a.getFullName()%>&type=delete"><fmt:message key="label.del" /></a></td>
		<% }
		else { %>
		<td><button onclick="beep.play();denied();"><fmt:message key="label.edit" /></button></td>
		<td><button onclick="beep.play();denied();"><fmt:message key="label.del" /></button></td>
		<% } %>
		
	</tr>

	<%}%>
</table></div>

	<%}%>


</body>
</html>
