<!DOCTYPE HTML >
<%@ page import="java.sql.*" %>
<%@ page import="java.io.*" %> 
<%@ page import="java.util.*" %> 

<html>
<head>
<title>MOCK EXAM</title>
</head>
<body background="image/earth.jpg">
<h2><font color="#87CEFA" style="margin-left: 43%">Datas of mock Exam</h2>
<% ArrayList<Model> data=new ArrayList<Model>();
data=(ArrayList<Model>)session.getAttribute("data");
<TABLE cellpadding="15" border="1" style="background-color: #ffffcc;">
<%
for (int i=0;i<data.size();i++) 
{
%>
<TR>
<TD><%=(model.get(i).getQuestion())%></TD>
<TD><%=(data.get(i).getAnswer())%></TD>
<TD><%=(model.get(i).getOption1())%></TD>
<TD><%=(model.get(i).getOption2())%></TD>
<TD><%=(model.get(i).getOption3())%></TD>
</TR>
<% } %>
<%

rs.close();
statement.close();
connection.close();
} catch (Exception ex) {
%>
</font>
<font size="+3" color="#87CEFA" style="margin-left:-6%"><b></b>
<%
out.println("Unable to connect to database.");
}
%>
</TABLE><TABLE>
<TR>
<TD><FORM ACTION="admin.jsp" method="get" >
<button type="submit" style="margin-left: 1%"><-- back</button></TD>
</TR>
</TABLE>
</font>
</body>
</html>