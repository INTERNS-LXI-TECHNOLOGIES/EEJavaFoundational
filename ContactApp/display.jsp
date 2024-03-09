<%@ page import= "com.divisosoft.contactapp.*" %>
<%@ page import="java.util.*" %>
<html>
    <head>
        <title>THIS IS DISPLAY PAGE</title>
       <style>

        table{
           text-align: center;
           margin:auto;  
        }
       </style>
    </head>
    <body>
       
        <table border="1">
            <th>id</th>
            <th>name</th>
            <th>phone number</th>
            <th>e mail</th>
        <% List <Contact> contactList = ( List<Contact> )request.getAttribute("contactList");
            
          for(Contact con:contactList){%>
           <tr>
            <td><a href="Fetchdataservlet?id=<%= con.getId() %>"><h1><%= con.getId() %></h1></a></td>
            <td><h1><%= con.getName() %></h1></td>
            <td><h1><%= con.getPhonenumber() %></h1></td>
            <td><h1><%= con.getEmail() %></h1></td>
           </tr>
        <%}%> 
        </table> 
        <a href="Displayingservlet"></a>
        <form action="Displayingservlet" metod="get">
           
     <% for(int i =0; i<4 ;i++){ %>
        <input type="submit" name="page" value="<%= i %>">

    <% }%>
        </form>
    </body>


</html>