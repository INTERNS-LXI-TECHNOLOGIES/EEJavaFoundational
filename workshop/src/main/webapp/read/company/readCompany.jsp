<%@ page import="java.util.*, com.lxi.yadhu.wktwo.company.model.*" %>
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
    Set<Company> companies = (Set<Company>) session.getAttribute("companyset");
    ResourceBundle resourceBundle = (ResourceBundle)session.getAttribute("resource");
    %>
    <h2><%=resourceBundle.getString("company.list")%> (<%=resourceBundle.getString("company.delete.info")%>)</h2>
    <table>
        <tr>
            <th><%=resourceBundle.getString("company.id")%></th>
            <th><%=resourceBundle.getString("company.name")%></th>
            <th><%=resourceBundle.getString("company.industry")%></th>
            <th><%=resourceBundle.getString("company.employee")%></th>
            <th><%=resourceBundle.getString("company.date")%></th>
            <th><%=resourceBundle.getString("company.revenue")%></th>
            <th><%=resourceBundle.getString("company.location")%></th>
            <th><%=resourceBundle.getString("company.ceo")%></th>
            <th><%=resourceBundle.getString("company.number")%></th>
            <th><%=resourceBundle.getString("company.stock")%></th>
            <th><%=resourceBundle.getString("company.customer")%></th>
        </tr>
        <%
        for (Company company : companies) {
        %>
        <tr>
            <td><a href="/workshop/companyServlet?companyId=<%= company.getCompanyId() %>">
                <%= company.getCompanyId() %></a></td>
            <td><%= company.getCompanyName() %></td>
            <td><%= company.getIndustry() %></td>
            <td><%= company.getEmployeeCount() %></td>
            <td><%= company.getFoundedDate() %></td>
            <td><%= company.getRevenue() %></td>
            <td><%= company.getLocation() %></td>
            <td><%= company.getCeoName() %></td>
            <td><%= company.getPhoneNumber() %></td>
            <td><%= company.getStockSymbol() %></td>
            <td><%= company.getCustomerCount() %></td>
        </tr>
        <%
        }
        %>
    </table>
</body>

</html>
