<%@page import = "com.sanfar.config.*"%>
<%@page contentType = "text/html;charset=UTF-8" pageEncoding = "UTF-8"%>
<%@ page import="java.sql.*" %>
<%@ page import="java.io.*" %> 
<%@ page import="java.util.*" %> 
<%@ page import="com.sanfar.model.Model"%>
<!DOCTYPE HTML >
<html>
<head>
<title>MOCK EXAM</title>
</head>
<body background="image/earth.jpg">


<h2><font color="#87CEFA" style="margin-left: 43%"><%=mockexam%></h2>
<%ArrayList<Model>datas=(ArrayList<Model>)session.getAttribute("array");%>
<TABLE align="center" cellpadding="15" border="1" style="background-color:  #122f39" >
	<tr>
	<th><%=no%></th>
    <th><%=name%></th>
    <th><%=phoneNumber%></th> 
    <th><%=address%></th>
    <th><%=vehicleNumber%></th>
    <th><%=vehicleType%></th>
    <th><%=startingLocation%></th>
    <th><%=destinstion%></th> 
    <th><%=satrtingDate and time%></th>
    <th><%=endingDate and time%></th>
    <th><%=coPassenger%></th>
    <th><%=relation%></th>
    <th><%=reason%></th>
     <th><%=approval%></th>
      <th><%=rejection%></th>

  </tr>
<% try{

for (int i=0;i<datas.size();i++){%>


<%out.println(i+1);%>
<TD><%=(datas.get(i).getName())%></TD>
<TD><%=(datas.get(i).getPhoneNumber())%></TD>
<TD><%=(datas.get(i).getAddress())%></TD>
<TD><%=(datas.get(i).getVehicleNumber())%></TD>
<TD><%=(datas.get(i).getVehicleType())%></TD>
<TD><%=(datas.get(i).getStartingLocation())%></TD>
<TD><%=(datas.get(i).getDestination())%></TD>
<TD><%=(datas.get(i).getStartingDate())%></TD>
<TD><%=(datas.get(i).getStartingTime())%></TD>
<TD><%=(datas.get(i).getEndingDate())%></TD>
<TD><%=(datas.get(i).getEndingtime())%></TD>
<TD><%=(datas.get(i).getCopassengername())%></TD>
<TD><%=(datas.get(i).getRelation())%></TD>
<TD><%=(datas.get(i).getReason())%></TD>
<form>
<TD><button formaction="approval" name="app" value=<%out.println("Approve");%>>approve</button></TD>
<TD><button formaction="approval" name="app" value=<%out.println("Reject");%>>Reject</button></TD>
</form>
<% } 
} catch (Exception e) {
%>
</font>
<font size="+3" color="#87CEFA" style="margin-left:-6%"><b></b>
<%
	e.printStackTrace();
	out.println(e);
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