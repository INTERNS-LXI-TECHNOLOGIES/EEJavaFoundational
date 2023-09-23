<%@ page import="java.util.*, com.lxi.yadhu.wktwo.company.model.*" %>
<!DOCTYPE html>
<html>
<head>
    <title>Company_CRUD</title>
    <style>
        table {
            border-collapse: collapse;
            width: 100%;
        }

        th, td {
            border: 1px solid #ddd;
            text-align: left;
            padding: 8px;
        }

        th {
            background-color: #f2f2f2;
        }
    </style>
</head>
<body>
    <%
    ResourceBundle resourceBundle = (ResourceBundle)session.getAttribute("resource");
    String date = (String)session.getAttribute("date");
    %>
    <h1><%=date%></h1>
    <h1><a href="/workshop/create/company/createCompany.jsp"><%=resourceBundle.getString("company.registration")%></a></h1>
    <h1><a href="/workshop/companyServlet"><%=resourceBundle.getString("company.status")%></a></h1>
    <h2><center><%=(String)request.getAttribute("Success")%></center></h2>
    <h2><center><%=(String)request.getAttribute("invalid")%></center></h2>
<hl><%=resourceBundle.getString("company.updation")%></hl>
    
    
</body>
</html>
