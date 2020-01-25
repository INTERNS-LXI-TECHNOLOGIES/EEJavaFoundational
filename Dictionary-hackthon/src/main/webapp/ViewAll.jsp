<%@page import="com.lxisoft.model.*"%>
<%@page import="java.util.*"%>
<%@page import="java.io.*"%>
<html>
<head>
<style>
table {
  font-family: arial, sans-serif;
  border-collapse: collapse;
  width: 100%;
}

td, th {
  border: 1px solid #dddddd;
  text-align: center;
  padding: 8px;
}

tr:nth-child(even) {
  background-color: #dddddd;
}
</style>
</head>
<title>Dictionary </title>
<h1><center>DICTIONARY</center></h1>
<body style="background-color: white">
	
	<%List<WordUnit> w=(List<WordUnit>) request.getAttribute("allWord");%>
	<table>
		<tr>
			<th>Word</th>
			<th>Meaning</th>
		</tr>
<%
	if(request.isUserInRole("admin"))
	{%>
	<a href="AddWord.jsp"><input type="submit" id="b2"name="submit" value="+" /></a>
	<%
	}
for(int i=0;i<w.size();i++)
{
%>
	<tr>
		<td><%=(w.get(i).getWord())%></td>
		<td><%=(w.get(i).getMeaning())%></td>
	</tr>
<%
}
%>
</table>
</body>
</html> 