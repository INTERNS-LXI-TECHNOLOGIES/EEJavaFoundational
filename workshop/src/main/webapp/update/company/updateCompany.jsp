<%@ page import="java.util.*,com.lxi.yadhu.wktwo.company.model.*,java.sql.*,java.io.*" %>
<html>

<head>
    <title>Update Company</title>
</head>

<body>
    <% 
       int id = Integer.parseInt(request.getParameter("companyId"));
       Company company = null;
       Set<Company> companies = (Set<Company>) application.getAttribute("companyset");
        Iterator<Company> iterator = companies.iterator();
            while (iterator.hasNext()) {
                Company company1 = iterator.next();
                // Process the element (e.g., print it)
                if(((Integer)company1.getCompanyId()).equals(id)){
                    company= company1;
                    break;
                }
                
            }
         ResourceBundle resourceBundle = (ResourceBundle)session.getAttribute("resource");

       
    %>
    <form action="/workshop/companyValidator" method="post">
        <table>
            <tr>
                <td><%=resourceBundle.getString("company.name")%>:</td>
                <td><input type="text" name="Company" value="<%=company.getCompanyName()%>"></td>
                <td><span style="color: red;"><%= request.getAttribute("invalid") %></span></td>
            </tr>
            <tr>
                <td><%=resourceBundle.getString("company.industry")%>:</td>
                <td><input type="text" name="Industry" value="<%=company.getIndustry()%>"></td>
                <td><span style="color: red;"><%= request.getAttribute("invalid") %></span></td>
            </tr>
            <tr>
                <td><%=resourceBundle.getString("company.employee")%>:</td>
                <td><input type="text" name="Count" value="<%=company.getEmployeeCount()%>"></td>
                <td><span style="color: red;"><%= request.getAttribute("invalid") %></span></td>
            </tr>
            <tr>
                <td><%=resourceBundle.getString("company.date")%>:</td>
                <td><input type="text" name="Date"  value="<%=company.getFoundedDate()%>"></td>
                <td><span style="color: red;"><%= request.getAttribute("invalid") %></span></td>
            </tr>
            <tr>
                <td><%=resourceBundle.getString("company.revenue")%>:</td>
                <td><input type="text" name="Revenue" value="<%=company.getRevenue()%>"></td>
                <td><span style="color: red;"><%= request.getAttribute("invalid") %></span></td>
            </tr>
            <tr>
                <td><%=resourceBundle.getString("company.location")%>:</td>
                <td><input type="text" name="Location" value="<%=company.getLocation()%>"></td>
                <td><span style="color: red;"><%= request.getAttribute("invalid") %></span></td>
            </tr>
            <tr>
                <td><%=resourceBundle.getString("company.ceo")%>:</td>
                <td><%=company.getCeoName()%></td>
                <td>First Name:<input type="text" name="First" ></td>
                <td>Middle Name:<input type="text" name="Middle"></td>
                <td>Last Name:<input type="text" name="Last" ></td>
                <td><span style="color: red;"><%= request.getAttribute("invalid") %></span></td>
            </tr>
            <tr>
                <td><%=resourceBundle.getString("company.number")%>:</td>
                <td><input type="text" name="Number" value="<%=company.getPhoneNumber()%>"></td>
                <td><span style="color: red;"><%= request.getAttribute("invalid") %></span></td>
            </tr>
            <tr>
                <td><%=resourceBundle.getString("company.stock")%>:</td>
                <td><input type="text" name="Stock" value="<%=company.getStockSymbol()%>"></td>
                <td><span style="color: red;"><%= request.getAttribute("invalid") %></span></td>
            </tr>
            <tr>
                <td><%=resourceBundle.getString("company.customer")%>:</td>
                <td><input type="text" name="Customer" value="<%=company.getCustomerCount()%>"></td>
                <td><span style="color: red;"><%= request.getAttribute("invalid") %></span></td>
            </tr>
            <tr>
                <input type="hidden" value="update" name="update">
                <input type="hidden" value="<%=company.getCompanyId()%>" name="id">
                <td colspan="3"><input type="submit" value="<%=resourceBundle.getString("submit")%>"></td>
            </tr>
        </table>
    </form>
</body>

</html>
