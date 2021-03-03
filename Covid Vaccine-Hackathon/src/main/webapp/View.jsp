<!DOCTYPE html>
<html>
<%@page import="com.lxisoft.model.Contact,com.lxisoft.servlet.*,com.lxisoft.repository.*,com.lxisoft.servlet.*"%>
<%@page import="java.sql.*,java.io.*,java.util.*"%>
<%@page import="java.sql.Connection"%>
<head>
	<title>Covid 19</title>
</head>
<body bgcolor="red">
  <center>
    <table border="">
      <tr>
        <th>Name</th>
        <th>Age</th>
        <th>Address</th>
        <th>MailID</th>
        <th>Number</th>
        <th>Blood Group</th>
        <th>Reject</th>
      </tr>
      <tr>
<%  
  ArrayList<Userdetails> user= new ArrayList<Userdetails>();
  user = (ArrayList<Userdetails>) request.getAttribute("list");
  for(UserDetails userdetails : User)
    { 
      %>
     <tr>
        <td><%out.println(userdetails.getID());%></td>
        <td><a href="Update.jsp?id=<%=contact.getID()%>&temp=<%=userdetails.getName()%>&temp1=<%=userdetails.getAge()%>&temp2=<%=userdetails.getAddress()%>&temp3=<%=userdetails.getMailId()%>&temp4=<%=userdetails.getNumber()%>&temp4=<%=userdetails.getBloodGroup()%>"><input type="button" name="submit" value="<%=userdetails.getName()%>"></a></td>
        <td><%out.println(userdetails.getAge());%></td>   
        <td><%out.println(userdetails.getAddress());%></td>
        <td><%out.println(userdetails.getMailId());%></td>
        <td><%out.println(userdetails.getNumber());%></td>
         <td><%out.println(userdetails.getBloodGroup());%></td>
        <td><a href="Reject.jsp?id=<%=contact.getID()%>&name=<%=contact.getName()%>"><input type="button" name="submit" value="REJECT"></a></td>
     </tr>
      <%   
    }
    %>
      </tr>
    </table>
    <tr><h1><b> THE DETAILS OF THE PATIENT </b></h1></tr>  
    <table>
       <tr><td></td><td><a href="adduser.jsp" type="submit"> ADD USER </a></td></tr>
       <tr><td></td><td><a href="Search.jsp" type="submit"> SEARCH USER </a></td></tr>
        <tr><td></td><td><a href="logout.jsp" type="submit"> LOGOUT </a></td></tr>
    </table>
         </center>
</body>
</html>