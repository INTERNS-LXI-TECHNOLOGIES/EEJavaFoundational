<%@page import="com.lxisoft.domain.*"%>
<%@page import="java.util.*"%>
<%@page import="java.io.*"%>
<!DOCTYPE html>
<html>
<head>
	<style>
	#b1
	{
		background-color:  #3CBC8D;
	    color: white;
	    margin: 8px 0;
	    border: none;
	    box-sizing: border-box;
	    width: 100;
	}
</style>
	<title>Search result</title>
</head>
<body style="background-color: grey">
<table  align="center" width="40%"  border color= "blue" bgcolor="#3CBC8D">
	<caption><h1><center>Search</center></h1></caption>
	<%List<Contact>contact=(List<Contact>) request.getAttribute("search");
	for(int i=0;i<contact.size();i++){%>
	<tr>
	<form action= "getContact" method="get">
		<input type="hidden" name="crud" value="2"/>
		<input type="hidden" name="id" value="<%=(contact.get(i).getContactId())%>"/>
		<td>
		<a href="getContact">
			<input type="submit" id="b1" value="<%=(contact.get(i).getContactFirstName())%> <%=(contact.get(i).getContactLastName())%>"/>
		</a>
		</td>
	</form>
	</tr>
<%
}
%>
</table>
</body>
</html>