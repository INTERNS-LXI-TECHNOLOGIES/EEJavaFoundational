<%@page import="com.divisosoft.movie.*"%> 
<%@page import="java.util.*"%>
<html>
    <head>
        <title>Movie Details</title>
        <style>
            body {
                text-align: center;
                background-color: rgb(175, 229, 241);
                margin: 0%;
            }
            header{
                background-color: cornflowerblue;
                padding: 0.5em;
            }

            table {
                margin: auto;
                height: 280;
                width: 800;
                border-collapse: collapse;
                border: 2px solid black;
                background-color: aliceblue;
            }

            th, td {
                border: 1px solid black;
                padding: 8px;
                font-weight: bold;
            }

            th {
                background-color: #0f0f0f;
                color: aliceblue;
            }
            input[type="text"] {
            padding: 8px; 
            margin-right: 5px; 
            width: 500px;
        }

        input[type="button"] {
            padding: 6px;
        }
        </style>
    </head>
    <body>
        <header>
            <h2>Movie Details</h1>
        </header><br><br>

        <%
        try { 
            List<Movie> movies = (List<Movie>) request.getAttribute("searchMovies");
        %>
                    <%
                        for(Movie movie: movies) {
                    %>
                    <table>
                    <tr>
                        <th colspan="2"><%=movie.getName()%>  Details</th>
                    </tr>
                        <tr>
                            <td>Movie name</td>
                            <td><%=movie.getName()%></td>
                        </tr>
                        <tr>
                            <td>Year</td>
                            <td><%=movie.getYear()%></td>
                        </tr>
                        <tr>
                            <td>Hero name</td>
                            <td><%=movie.getHero()%></td>
                        </tr>
                        <tr>
                            <td>Heroine Name </td>
                            <td><%=movie.getHeroine()%></td>
                        </tr>
                        <tr>
                            <td>Villain Name </td>
                            <td><%=movie.getVillain()%></td>
                        </tr>
                        </table><br>
                    <%
                    }
                } catch(Exception e) {
                    e.printStackTrace();
                }
                %>
                
    </body>    
</html>
