<%@ page import="java.util.*"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8"> 
        <meta content="text/html; charset=UTF-8" http-equiv="Content-Type">
        <title>Welcome</title>
    </head>
<body>
    <%
    ResourceBundle resourceBundle = (ResourceBundle)session.getAttribute("resource");
    if(resourceBundle != null){
    %>
    <h1><%=resourceBundle.getString("welcome.message")%></h1>
<h1><a href="/workshop/company/company.jsp"><%=resourceBundle.getString("company.details")%></a></h1>
<h1><a href="/workshop/employee/employee.jsp"><%=resourceBundle.getString("employee.details")%></a></h1>
<h1><a href="/workshop/product/product.jsp"><%=resourceBundle.getString("product.details")%></a></h1>
<%

    }
    %>
<h2>Choose a Language | ഭാഷ തിരഞ്ഞെടുക്കുക</h2>
    <form action="./setLanguage" method="post">
        <label for="language">Choose a Language:</label>
        <select id="language" name="language">
            <option value="en">English</option>
            <option value="ml">മലയാളം</option> <!-- Malayalam -->
            <!-- Add more language options as needed -->
        </select>
        <input type="submit" value="Submit">
    </form>
</body>
</html>
