<%@page import="com.megha.models.*"%>
<%@page import="java.io.*"%>
<%@page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
	<title>Save</title>
</head>
<body>
    <% RequestMVT rmvt=(RequestMVT) request.getAttribute("request"); %>
	<tr>
    	<td><center><%=rmvt.getName()%></center></td>  
    </tr>
    <tr>
        <td><center><%=rmvt.getPhnNo()()%></center></td>  
    </tr>
    <tr>
        <td><center><%=rmvt.getAddress()%></center></td>  
    </tr>
    <tr>
        <td><center><%=rmvt.getVehicleNO()%></center></td>  
    </tr>
    <tr>
        <td><center><%=rmvt.getVehicleType()%></center></td>  
    </tr>
    <tr>
        <td><center><%=rmvt.getStartingLocation()%></center></td>  
    </tr>
    <tr>
        <td><center><%=rmvt.getDestination()%></center></td>  
    </tr>
    <tr>
        <td><center><%=rmvt.getStartingTime()%></center></td>  
    </tr>
    <tr>
        <td><center><%=rmvt.getStartingDate()%></center></td>  
    </tr>
    <tr>
        <td><center><%=rmvt.getEndingTime()%></center></td>  
    </tr>
    <tr>
        <td><center><%=rmvt.getEndingDate()%></center></td>  
    </tr>
    <tr>
        <td><center><%=rmvt.getCoPassengerName()%></center></td>  
    </tr>
    <tr>
        <td><center><%=rmvt.getRelation()%></center></td>  
    </tr>
    <tr>
        <td><center><%=rmvt.getReason()%></center></td>  
    </tr>
    <tr>
        <td><center><a href="index.jsp"><input type="submit" value=Back></td></center>
    </tr>
</body>
</html>