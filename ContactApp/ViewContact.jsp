 
<html>
<head>
<body>
<%@page import="com.lxisoft.modal.Contact,com.lxisoft.repository.AddressBook,java.util.*"%>
<style>
		table, th, td {
  border: 1px solid black;
}
	</style>
	<title>View-Contact</title>
	<link rel="stylesheet" type="text/css" href="css/bootstrap.css">
</head>
<body>
	

<%
Contact cm=new Contact();
AddressBook addressbook=new AddressBook();
ArrayList<Contact> s=addressbook.read(); 
out.println("\n"+s+"\n");
//out.println(addressbook.read());
%>
<tr>
              <td><%addressbook.read();%></td>
			  </tr>

</table>
</body>
</html>