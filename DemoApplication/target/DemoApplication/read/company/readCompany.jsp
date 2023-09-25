<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.util.*, com.lxi.ibrahim.workshoptwo.company.companymodel.*" %>
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
    <table>
       <tr>
               <!--   <td><a href="/workshop/companyServlet?companyId=<%= company.getCompanyId() %>"> -->


                  <td><%= cm.getCompany_name() %></td>
                  <td><%= cm.getEmployee_count() %></td>
                  <td><%= cm.getLocation() %></td>
                  <td><%= cm.getCeo_name() %></td>
                  <td><%= cm.getPhone_number() %></td>

               </tr>
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