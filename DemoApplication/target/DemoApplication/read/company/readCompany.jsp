<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<%@ page import="java.util.*, com.lxisoft.ibrahim.workshoptwo.company.companymodel.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<!DOCTYPE html>
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
<head>
    <title>Read Company Details</title>
</head>
<body>
    <h1>Items List</h1>

   <% ArrayList<CompanyModel> companyDetails = (ArrayList<CompanyModel>) request.getAttribute("companyDetails"); %>

    <table>

                 <%
                 ArrayList<CompanyModel> companyDetail = (ArrayList<CompanyModel>) request.getAttribute("companyDetails");

                 if (companyDetails != null && !companyDetails.isEmpty()) {
                     for (CompanyModel companyModel : companyDetail) {
                 %>
                     <tr>
                         <td><%= companyModel.getCompany_name() %></td>
                         <td><%= companyModel.getEmployee_count() %></td>
                         <td><%= companyModel.getLocation() %></td>
                         <td><%= companyModel.getCeo_name() %></td>
                         <td><%= companyModel.getPhone_number() %></td>
                     </tr>
                 <%
                     }
                 } else {
                 %>
                     <tr>
                         <td colspan="5">No company details available.</td>
                     </tr>
                 <%
                 }
                 %>

               <head>
        <body>
            <c:forEach var="cm" items="${items}">
                <tr>
                    <td><c:out value="${cm.company_name}" /></td>
                    <td><c:out value="${cm.employee_count}" /></td>
                    <td><c:out value="${cm.location}" /></td>
                    <td><c:out value="${cm.ceo_name}" /></td>
                    <td><c:out value="${cm.phone_number}" /></td>
                </tr>
            </c:forEach>

        </body>
    </table>
</body>
</html>