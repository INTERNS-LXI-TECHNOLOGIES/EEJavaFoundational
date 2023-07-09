<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Result</title>



</head>
<body>
    <link rel="stylesheet" href="index.css">
    <h1>Results</h1>
    <%@ page import="demoApp.*,java.util.List" %>
    <%
    Repository db = new Repository();
        db.result();

        
                 out.println("you got "+ db.score+" out of "+ 10 +" Right answers\n");
                 int percent = (db.score*100)/10;
    %>

<% if(percent<50){ %>
    <P>  <% out.println( db.userName + " you Failed in the Quiz"); %></P>
    <%  } %>
    <% if(percent>=50){ %>
        <p> <% out.println(db.userName + " you are passed"); %> </p>
        <% } %>
</body>
</html>


 