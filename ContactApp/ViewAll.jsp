<%@page import="com.lxisoft.domain.*"%>
<%@page import="com.lxisoft.model.*"%>
<%@page import="java.util.*"%>
<%@page import="java.io.*"%>
<html>
<title>CONTACTS </title>
<body>
<%
List<ContactModel> c=(List<ContactModel>) request.getAttribute("allContact");
out.println(c.size());
for(int i=0;i<c.size();i++)
{
	out.println(c.get(i).getId());
	out.println(c.get(i).getName());
}
%>
</body>
</html>