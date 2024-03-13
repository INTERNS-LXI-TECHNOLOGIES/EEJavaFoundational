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
        input[type="button"] 
        {
            padding: 6px;
        }
        #pagination 
        {
            text-align: center;
            margin-top: 20px;
        }

        input[type="submit"] 
        {
            background-color: #ebeced;
            color: rgb(8, 8, 8);
            padding: 10px 15px;
            margin: 5px;
            border: none;
            border-radius: 3px;
            cursor: pointer;
            transition: background-color 0.3s;
            font-weight: bold;
        }
        select {
            padding: 8px;
            font-size: 14px;
            border: 1px solid #ccc;
            border-radius: 3px;
            background-color: #fff;
            color: #333;
            cursor: pointer;
        }
    </style>
</head>
<body>
    <header>
        <h2>Movie Details</h2>
    </header><br><br>

    <form action="search" method="get">
        <input class="search-icon" type="text" name="search">
        <input type="submit" value="&#x1F50D;">
    </form>

    <form action="movieDetails" method="get">
        <select name="sort">
            <option value="">Sort By</option>
            <option value="name">Sort By Name</option>
            <option value="year">Sort By Year</option>
        </select>
        <input type="submit" value="Sort">
    </form>

    <%
        try { 
            List<Movie> movies = (List<Movie>) request.getAttribute("movies");
        %>
        <%
            for(Movie movie: movies) {
        %>
        <table>
            <tr>
                <th colspan="2"><%=movie.getName()%> Details</th>
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
    
    <form action="movieDetails" method="get">
        <%
            for (int i = 1; i <= 10; i++) {
        %>
        <input type="submit" name="action" value="<%=i%>">
        <% } %>
    </form>
            
</body>    
</html>
