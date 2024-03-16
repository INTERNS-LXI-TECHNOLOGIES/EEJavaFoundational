<%@ page import = "com.lxisoft.app.Contact"%>
<%@ page import = " java.util.*"%>

<html >
<head>
  <title>hello</title>
</head>
<body>
<table border="2">
<%
    <tr>
    <td>Name</td>
    <td>phoneNumber</td>
    </tr>
    List<Contact> contactList = (ArrayList<Contact>) request.getAttribute("contacts");
    for (Contact contact : contactList)
    {
    %>

    <tr>
    <td><%=contact.getName()%></td>
    <td><%=contact.getPhoneNo()%></td>
    </tr>
<%}%>
  </table>
  <form action="input.jsp" method="post">
    <input type="submit" value="+ Add Contact">
  </form>
</body>
</html>
