<%@page import="com.lxisoft.servlet.*"%>
<%@page import="com.lxisoft.model.*"%>
<%@page import="com.lxisoft.repository.*"%>
<%@page import="java.util.*"%>
<!DOCTYPE HTML>
<html>
  <head>
    <title>Exam Questions</title>
  </head>

   <body>

   	<div>
   	<% QuestionDatabase db = new QuestionDatabase();
    ArrayList<Question> questionList = new ArrayList<Question>();
    questionList = db.viewDatabase(questionList); %>
  
    <%  for (int i=0;i<questionList.size();i++)  {%>
    <tr>        
      <td><%out.println(questionList.get(i).getId()+" ?");%></td>
      <td><%out.println("\n"+questionList.get(i).getQuestion());%></td>
      <td><%out.println("\n"+questionList.get(i).getOption1());%></td>
      <td><%out.println("\n"+questionList.get(i).getOption2());%></td>
      <td><%out.println("\n"+questionList.get(i).getOption3());%></td>
      <td><%out.println("\n"+questionList.get(i).getOption4());%></td>
      <td><%out.println("\n"+questionList.get(i).getAnswer());%></td> 
    
      <td><a href="edit.jsp?id=<%=questionList.get(i).getId()%>"><button>Edit</button></a></td>
      <td><a href="questionDelete?id=<%=questionList.get(i).getId()%>"><button>Delete</button></a></td> 
        <%}%></tr>


    <a href="index.jsp"><button class="button">Home</button></a>
    </div>
   </body>
</html>
