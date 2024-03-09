<%@ page import="com.divisosoft.contactapp.*" %>
<html>
    <head><title>this is updation page</title></head>
<body>
    <form action="Updationservlet" method="post">
    <% Contact contact = (Contact) request.getAttribute("con"); %>
    <label>your id :</label>
    <input type="text" value="<%= contact.getId() %>" name="id" readonly><br>
    <label>your name :</label>
    <input type="text" value="<%= contact.getName() %>" name="name"><br>
    <label>your phonenumber :</label>
    <input type="text" value="<%= contact.getPhonenumber() %>" name="phonenumber"><br>
    <label>your email :</label>
    <input type="text" value="<%= contact.getEmail() %>" name="email"><br>
    <input type="submit" value="update" name="option">
    <input type="submit" value="delete" name="option">
    </form>
</body>
</html>