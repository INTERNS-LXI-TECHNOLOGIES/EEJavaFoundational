<%@page import="com.lxisoft.Domain.*"%>
<%@page import="com.lxisoft.Model.*"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.io.*"%>
<html>
<title>DICTIONARY </title>
<head>


</head>
<h1><center>DICTIONORY</center></h1>
<body>
	<table align="center" border= "5" width="30%" border color= "red" bgcolor="yellow">
		<tr>
			<th>No:</th>
			<th>WORD</th>
			<th>MEANING</th>
		</tr>


<style>
table {
  font-family: arial, sans-serif;
  border-collapse: collapse;
  width: 100%;}

td, th {
  border: 1px solid #dddddd;
  text-align: left;
  padding: 8px;
}

tr:nth-child(even) {
  background-color: #dddddd;
}
</style>

<a href="Add.jsp"><h1><center>ADD<center></h1></a>
		
<%
ArrayList<Dictionary> d=(ArrayList<Dictionary>)request.getAttribute("dictionary");
for(int i=0;i<d.size();i++)
{
%>
	<tr>
		 <td><%=(d.get(i).getNo())%> </td>
		 <td><%=(d.get(i).getWord())%> </td>
		  <td><%=(d.get(i).getMeaning())%> </td>
		  <%
		  	Dictionary di = new Dictionary();
		  	di=d.get(i);
		  	session.setAttribute("dictionary",di);
		    String urldel = "Delete?no=" + d.get(i).getNo();
		}
		  %>
	</tr>
 
</table>
</body>
</html>
