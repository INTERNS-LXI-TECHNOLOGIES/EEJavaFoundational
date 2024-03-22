<%@ page import="java.util.*"%>
<%@ page import="com.lxisoft.app.Contact"%>
<html>
<head>
</head>
<body>
<table border=2>

<tr>
<td>name</td>
<td>number</td>
</tr>
<%List<Contact> list = (ArrayList<Contact>) request.getAttribute("contact");

for(Contact con : list)
{
%>
<tr>
<td><%=con.getName()%></td>
<td><%=con.getNumber()%></td>
</tr>

<%}%>

</table>

<%for(int i=0; i<=9; i++){
%>
<a href= "./ContactServlet?number=<%=i%>"><%=i%></a>
<%}%>
</body>
</html>
