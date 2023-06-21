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
    <%@ page import="com.Lxisoft.Files.*,java.util.List" %>
    <%  
    Controller myCount = (Controller)session.getAttribute("og");
    List<Question> questions = myCount.loadQuestions();
        
     Question question = questions.get(9);
     String options = request.getParameter("option");
     String score = myCount.removeLastChar(options);
     myCount.updateScore(question, score);
     out.println("you got "+ myCount.userscore+" out of "+ myCount.loadQuestions().size() +" Right answers\n");
     int percent = (myCount.userscore*100)/questions.size();

  



%>

<% if(percent<50){ %>
    <P>  <% out.println("you Failed in the Quiz"); %></P>
    <%  } %>
    <% if(percent>=50){ %>
        <p> <% out.println("you are passed"); %> </p>
        <% } %>
</body>
</html>


