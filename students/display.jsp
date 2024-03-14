<%@ page import ="com.divisosoft.studentapp.*" %>
<%@ page import="java.util.*" %>
<html>
    <head>
        <title>THIS IS DISPLAY PAGE</title>
        <style>
            table{
                text-align: center;
                margin-left:100px;
            }
            td{
                width: 100px;
            }
            header {
                background-color: #f2f2f2;
                text-align: center;
            }
        </style>
    </head>
    <body>
        <header>
            <h1>Student details</h1>
            <form action="Showstudents" method="get">
                <input type="text" name="search" >
                <input type="submit" value="search">
            </form>
        </header>
        <table border="1">
            <th>id</th>
            <th>name <a href="Showstudents? sort=ASC">&#x25B2;</a><a href="Showstudents? sort=DESC">&#x25Bc;</a></th>
            <th>gender</th>
            <th>mark</th>
            <th>age</th>
            <% List <Student> listOfStudents = (List<Student>)request.getAttribute("stdentList");
                for(Student st :listOfStudents){ %>
                    <tr>
                    <td><%= st.getId() %></td>
                    <td><%= st.getName() %></td>
                    <td><%= st.getGender() %></td>
                    <td><%= st.getMark() %></td>
                    <td><%= st.getAge() %></td>
                    </tr>
                   
               <% } %>
        </table>
        <form action ="Showstudents" method="get">
       <% for(int i=0;i<4;i++){ %>

        <input type="submit" name="page" value="<%= i %>">
       <%}%>
        </form>
    </body>
</html>