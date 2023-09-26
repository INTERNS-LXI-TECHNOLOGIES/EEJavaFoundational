<%@ page import="java.util.*, com.lxisoft.yasirhussain.amazon.company.model.*" %>
<html>

<head>
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
    Set<CompanyModel> companies = (Set<CompanyModel>) session.getAttribute("companyset");
    ResourceBundle resourceBundle = (ResourceBundle)session.getAttribute("resource");
    %>
    <h2><%=resourceBundle.getString("company.list")%> (<%=resourceBundle.getString("company.delete.info")%>)</h2>
    <table>
        <tr>
            <th><%=resourceBundle.getString("company.id")%></th>
            <th><%=resourceBundle.getString("company.name")%></th>
            <th><%=resourceBundle.getString("company.industry")%></th>
            <th><%=resourceBundle.getString("company.ceo")%></th>
        </tr>
        <%
        for (CompanyModel company : companies) {
        %>
        <tr>
            <td><a href="/Maven Projects/companyServlet?companyId=<%= company.getCompanyId() %>">
                <%= company.getCompanyId() %></a></td>
            <td><%= company.getCompanyName() %></td>
            <td><%= company.getIndustry() %></td>
            <td><%= company.getCeoName() %></td>
        </tr>
        <%
        }
        %>
    </table>
</body>

</html>
