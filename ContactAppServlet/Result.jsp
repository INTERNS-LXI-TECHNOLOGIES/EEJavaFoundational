<%@ page import="com.lxisoft.contact.Contact" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<html>
<head>
    <title>Welcome</title>
</head>
<body>
    <table border="2">
        <tr>
            <th>Contact Name</th>
            <th>Contact Number</th>
        </tr>
        <% 
        List<Contact> list = (ArrayList<Contact>) request.getAttribute("contact");
        for (Contact con : list) {
        %>
        <tr>
            <td><%= con.getName() %></td>
            <td><%= con.getContactNumber() %></td>
        </tr>
        <% } %>
    </table>
    <input type="submit" value>
</body>
</html>
