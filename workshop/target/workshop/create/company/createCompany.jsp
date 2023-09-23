<%@ page import="java.util.*"%>
<html>

<head>
    <title>Create Company</title>
</head>

<body>
    <%
    ResourceBundle resourceBundle = (ResourceBundle)session.getAttribute("resource");
    %>
    <form action="/workshop/companyValidator" method="post">
        <table>
            <tr>
                <td><%=resourceBundle.getString("company.name")%>:</td>
                <td><input type="text" name="Company" required></td>
                <td><span style="color: red;"><%= request.getAttribute("invalid") %></span></td>
            </tr>
            <tr>
                <td><%=resourceBundle.getString("company.industry")%>:</td>
                <td><input type="text" name="Industry" required></td>
                <td><span style="color: red;"><%= request.getAttribute("invalid") %></span></td>
            </tr>
            <tr>
                <td><%=resourceBundle.getString("company.employee")%>:</td>
                <td><input type="text" name="Count" required></td>
                <td><span style="color: red;"><%= request.getAttribute("invalid") %></span></td>
            </tr>
            <tr>
                <td><%=resourceBundle.getString("company.date")%>:</td>
                <td><input type="text" name="Date" required></td>
                <td><span style="color: red;"><%= request.getAttribute("invalid") %></span></td>
            </tr>
            <tr>
                <td><%=resourceBundle.getString("company.revenue")%>:</td>
                <td><input type="text" name="Revenue" required></td>
                <td><span style="color: red;"><%= request.getAttribute("invalid") %></span></td>
            </tr>
            <tr>
                <td><%=resourceBundle.getString("company.location")%>:</td>
                <td><input type="text" name="Location" required></td>
                <td><span style="color: red;"><%= request.getAttribute("invalid") %></span></td>
            </tr>
            <tr>
                <td><%=resourceBundle.getString("company.ceo")%>:</td>
                <td>First Name:<input type="text" name="First" required></td>
                <td>Middle Name:<input type="text" name="Middle"></td>
                <td>Last Name:<input type="text" name="Last" required></td>
                <td><span style="color: red;"><%= request.getAttribute("invalid") %></span></td>
            </tr>
            <tr>
                <td><%=resourceBundle.getString("company.number")%>:</td>
                <td><input type="text" name="Number" required></td>
                <td><span style="color: red;"><%= request.getAttribute("invalid") %></span></td>
            </tr>
            <tr>
                <td><%=resourceBundle.getString("company.stock")%>:</td>
                <td><input type="text" name="Stock" required></td>
                <td><span style="color: red;"><%= request.getAttribute("invalid") %></span></td>
            </tr>
            <tr>
                <td><%=resourceBundle.getString("company.customer")%>:</td>
                <td><input type="text" name="Customer" required></td>
                <td><span style="color: red;"><%= request.getAttribute("invalid") %></span></td>
            </tr>
            <tr>
                <input type="hidden" value="create" name="create">
                <td colspan="3"><input type="submit" value="<%=resourceBundle.getString("submit")%>"></td>
            </tr>
        </table>
    </form>

    
</body>

</html>
