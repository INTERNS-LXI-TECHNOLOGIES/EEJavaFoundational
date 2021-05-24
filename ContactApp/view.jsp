<%@page import="com.lxisoft.servlet.*"%>
<%@page import="com.lxisoft.model.*"%>
<%@page import="com.lxisoft.repository.*"%>
<%@page import="java.util.*,java.sql.*"%>

<!DOCTYPE html>
<html>
<head>
	<title>Contacts</title>
</head>
<body>
	<center><h1>Contact List</h1></center>
	<table border="1" cellpadding="5" cellspacing="5">
		<tr>
			<th>Name</th>
			<th>Number</th>
			<th>E-Mail</th>
			<th>Actions</th>
		</tr>
		<%
		List<Contact> contacts = (List<Contact>)request.getAttribute("contactList");
		for(int i=0;i<contacts.size();i++){

		%>
		<!--<c:forEach var="contacts" items="${contactList}">-->
		<tr>
		   	<td><%=contacts.name%></td>
			<td><%=contact.number%></td>
			<td><%contact.eMail%></td>
			<td><a href="edit.jsp?id=<%=contacts.sno%> & name=<%=contacts.name%> & num =<%=contacts.number%>"><button class="button">Edit</button></a>
			<a href="contactDelete?name=<%=contacts.name%>"><button class="button button2">Delete</button></a></td>	
		</tr>
		<%}%>
	    <!--</c:forEach>-->
	</table>


	    <c:if test="${pageNumber != 1}">
        <td><a href="view?page=${pageNumber - 1}">Previous</a></td>
        </c:if>
 
  
        <table border="1" cellpadding="5" cellspacing="5">
            <tr>
                <c:forEach begin="1" end="${noOfPages}" var="i">
                    <c:choose>
                        <c:when test="${pageNumber eq i}">
                            <td>${i}</td>
                        </c:when>
                        <c:otherwise>
                            <td><a href="view?page=${i}">${i}</a></td>
                        </c:otherwise>
                    </c:choose>
                </c:forEach>
            </tr>
        </table>
     
        <c:if test="${pageNumber lt noOfPages}">
            <td><a href="view?page=${pageNumber + 1}">Next</a></td>
        </c:if>
	    </table>
</body>
</html>



































