<%@page import="java.util.*"%>
<%@ page import="com.lxisoft.school.School" %>

<html>
    <head>
        </head>
        <body>
            <% List<School> li = (ArrayList<School>)request.getAttribute("list");
                   
  %>
            <table border="2">
  
            <tr>
                <th>Id</th>
                <th>Name</th>
                <th>Bolob</th>
                </tr>
               <% for(School s:li)
                {%>
                <tr>
                       <td><a href="delete.jsp"><%=s.getId()%></a></td> 
                       <td><%=s.getName()%></td> 
                       <td><%=s.getInputstream()%></td> 
                    </tr>


<%}%>



    </table>
    <form action="index.jsp" >
        <input type="submit" value="back" style="src:brown">
</form>
            </body>
            </html>