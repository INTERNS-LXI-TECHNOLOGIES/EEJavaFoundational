<%@ page import="java.util.*"%>
<html>
<body>
    <%
    ResourceBundle resourceBundle = (ResourceBundle)session.getAttribute("resource");
    String date = (String)session.getAttribute("date");
    %>
    <h2><%=date%></h2>
    <h1><a href="/workshop/create/employee/createEmployee.jsp"><%=resourceBundle.getString("employee.upload")%></a></h1>
    <h1><a href="/workshop/read/employee/readEmployee.jsp"><%=resourceBundle.getString("employee.status")%></a></h1>
</body>
</html>