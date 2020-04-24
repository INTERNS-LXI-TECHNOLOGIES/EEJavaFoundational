<%@ page contentType="text/html;charset=UTF-8"  pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@page import="com.megha.models.*"%>
<%@page import="com.megha.repository.*"%>
<%@page import="java.io.*"%>
<%@page import="java.util.*"%>
<meta http-equiv="Content-Type" content="text/html;charset=UTF-8"/>
<head>
	<title>Requests</title>
</head>
<%List<RequestMVT>requestList=new ArrayList<RequestMVT>();
  SqlRepositoryMVT sqlRepo=new SqlRepositoryMVT();
    requestList= sqlRepo.getAllRequestsMVT();%>
    <body>
      <h1 align="center">ALL REQUESTS</h1>
<table align=center align=center border="1px" >
	<tr>
    <th>ID</th>
    <th>Name</th>
    <th>PhnNo</th>
    <th>Address</th>
    <th>VehicleNO</th>
     <th>VehicleType</th>
     <th>StartingLocation</th>
    <th>Destination</th>
    <th>StartingTime</th>
     <th>StartingDate</th>
     <th>EndingTime</th>
     <th>EndingDate</th>
     <th>CoPassengerName</th>
    <th>Relation</th>
    <th>Reason</th>
  </tr>
  <%
  for(int i =0;i<requestList.size();i++)
  {
    %>
  <tr align="center">
    <td ><%out.println(i+1);%></td>
    <td><%out.println(requestList.get(i).getNameMVT());%></td>
    <td><%out.println(requestList.get(i).getPhnNoMVT());%></td>
    <td><%out.println(requestList.get(i).getAddressMVT());%></td>
    <td><%out.println(requestList.get(i).getVehicleNoMVT());%> </td>
    <td><%out.println(requestList.get(i).getVehicleTypeMVT());%></td>
    <td><%out.println(requestList.get(i).getStartingLocationMVT());%></td>
    <td><%out.println(requestList.get(i).getDestinationMVT());%></td>
    <td><%out.println(requestList.get(i).getStartingTimeMVT());%></td>
    <td><%out.println(requestList.get(i).getStartingDateMVT());%></td>
    <td><%out.println(requestList.get(i).getEndingTimeMVT());%></td>
    <td><%out.println(requestList.get(i).getEndingDateMVT());%></td>
    <td><%out.println(requestList.get(i).getCoPassengerNameMVT());%> </td>
    <td><%out.println(requestList.get(i).getRelationMVT());%></td>
    <td><%out.println(requestList.get(i).getReasonMVT());%></td>
  
  <form action="Accept.jsp">
        <input type="hidden" name="id" value="<%=requestList.get(i).getNameMVT()%>">
          <td><input type="submit" value=Approve></td></form>

          <form action="Reject.jsp">
          <input type="hidden" name="id" value="<%=requestList.get(i).getNameMVT()%>">
          <td><input type="submit" value=Reject></td></form></tr>
<%}%>
</table>
<center><a href=index.jsp><input type=Submit value=Back></a></center>
</body>
</html>