
<%@page import="com.lxisoft.models.*"%>
<%@page import="java.io.*"%>
<%@page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
	<title>Save</title>
</head>
 <body>
	<table align=center border="5px" width="50%">
	<%
    Question q=(Question) request.getAttribute("question");
    %>
	<tr>
    	<td><center><%=(q.getQuestion())%></center></td>  
    </tr>
    <tr>
        <td><center><%=(q.getOption1())%></center></td>  
    </tr>
    <tr>
        <td><center><%=(q.getOption2())%></center></td>  
    </tr>
    <tr>
        <td><center><%=(q.getOption3())%></center></td>  
    </tr>
    <tr>
        <td><center><%=(q.getOption4())%></center></td>  
    </tr>
    <tr>
        <td><center><%=(q.getAnswer())%></center></td>  
    </tr>
   
        <td><a href="admin"><input type="submit" value=Back></td>
    </tr>
  </table>
</body>
</html>