<%@ page import="java.sql.*" %>
<%@ page import="java.io.*" %> 
<%@ page import="java.util.*" %> 
<%@ page import="com.lxisoft.model.Model"%>
<!DOCTYPE HTML >
<html>
<head>
<title>MOCK EXAM</title>
</head>
<body background="image/earth.jpg">
<h2><font color="#87CEFA" style="margin-left: 43%">Datas of mock Exam</h2>
<%ArrayList<Model>datas=(ArrayList<Model>)session.getAttribute("array");%>
<TABLE align="center" cellpadding="15" border="1" style="background-color:  #122f39" >
	<tr>
    <th>Id</th>
    <th>Question</th>
    <th>Answer</th> 
    <th>Option 1</th>
    <th>Option 2</th>
    <th>Option 3</th>
    <th>Delete</th>
  </tr>
<% try{

for (int i=0;i<datas.size();i++){%>

<TR>
<TD><%out.println(i+1);%></TD>
<TD><%=(datas.get(i).getQuestion())%></TD>
<TD><%=(datas.get(i).getAnswer())%></TD>
<TD><%=(datas.get(i).getOption1())%></TD>
<TD><%=(datas.get(i).getOption2())%></TD>
<TD><%=(datas.get(i).getOption3())%></TD>
<form>
<TD><button formaction="delete" name="Delete" value=<%out.println(datas.get(i).getId());%>>Delete</button></TD>
</form>
</TR>
<% } 
} catch (Exception e) {
%>
</font>
<font size="+3" color="#87CEFA" style="margin-left:-6%"><br></br>
<%
	e.printStackTrace();
	out.println(e);
}
%>

</TR>
</TABLE>
</font>
<form style="margin-left: 45%">
<button type="submit" formaction="delete.jsp" ><-- submit</button>
<button type="submit" formaction="admin.jsp"  ><-- back</button></TD></TD>
</form>
</body> 
</html>