<%@page import="com.megha.models.*"%>
<%@page import="java.io.*"%>
<%@page import="java.util.*"%>
<!DOCTYPE html>
<head>
	<title>Save</title>
</head>
<body>
    <% RequestMVT rmvt=(RequestMVT) request.getAttribute("request"); %>
    <table align=center align=center border="1px" >
	<tr>
    	<td><center><%=rmvt.getNameMVT()%></center></td>  
    </tr>
    <tr>
        <td><center><%=rmvt.getPhnNoMVT()%></center></td>  
    </tr>
    <tr>
        <td><center><%=rmvt.getAddressMVT()%></center></td>  
    </tr>
    <tr>
        <td><center><%=rmvt.getVehicleNoMVT()%></center></td>  
    </tr>
    <tr>
        <td><center><%=rmvt.getVehicleTypeMVT()%></center></td>  
    </tr>
    <tr>
        <td><center><%=rmvt.getStartingLocationMVT()%></center></td>  
    </tr>
    <tr>
        <td><center><%=rmvt.getDestinationMVT()%></center></td>  
    </tr>
    <tr>
        <td><center><%=rmvt.getStartingTimeMVT()%></center></td>  
    </tr>
    <tr>
        <td><center><%=rmvt.getStartingDateMVT()%></center></td>  
    </tr>
    <tr>
        <td><center><%=rmvt.getEndingTimeMVT()%></center></td>  
    </tr>
    <tr>
        <td><center><%=rmvt.getEndingDateMVT()%></center></td>  
    </tr>
    <tr>
        <td><center><%=rmvt.getCoPassengerNameMVT()%></center></td>  
    </tr>
    <tr>
        <td><center><%=rmvt.getRelationMVT()%></center></td>  
    </tr>
    <tr>
        <td><center><%=rmvt.getReasonMVT()%></center></td>  
    </tr>
    <tr>
        <td><center><a href="index.jsp"><input type="submit" value=Back></a></td></center>
    </tr>
</table>>
</body>
</html>