<%@ page import="java.util.*,com.lxisoft.yasirhussain.amazon.company.model.*,java.sql.*,java.io.*" %>
<html>

<head>
    <title>Update Company</title>
</head>

<body>
    <% 
       int id = Integer.parseInt(request.getParameter("companyId"));
       CompanyModel company = null;
       Set<CompanyModel> companies = (Set<CompanyModel>) application.getAttribute("companyset");
        Iterator<CompanyModel> iterator = companies.iterator();
            while (iterator.hasNext()) {
                CompanyModel company1 = iterator.next();
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
                <td><%=resourceBundle.getString("company.ceo")%>:</td>
                <td><%=company.getCeoName()%></td>
                <td>First Name:<input type="text" name="First" ></td>
                <td>Middle Name:<input type="text" name="Middle"></td>
                <td>Last Name:<input type="text" name="Last" ></td>
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
