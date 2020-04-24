<%@page import="com.lxisoft.servlet.*"%>
<%@page import="com.lxisoft.model.*"%>
<%@page import="com.lxisoft.repository.*"%>
<%@page import="java.util.*"%>
<!DOCTYPE HTML>
<html>
  <head>
    <title>Admin Edit</title>
  <style>
    body{
     background-color: lightblue; 
    /* margin-top:250px;*/
    /* text-align:center;*/
    }

    a {
  float: left;
  display: block;
  color: black;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
  font-size: 20px;
}

    h1 {
        color: black;
        text-align: center;
        font-family: verdana;
      }
  .button {
  background-color: #4CAF50;
  border: none;
  color: white;

   border-radius: 5px;
  padding: 15px 32px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
  margin: 4px 2px;
  cursor: pointer;
} 
.button:hover {  background-color: black; }
.button2 {background-color: #4CAF50;} 
.button2:hover {  background-color: #f44336;}

.search-container {  float: right;}

.search-container button {
  float: right;
  padding: 6px 10px;
  margin-top: 8px;
  margin-right: 16px;
  background: #4CAF50;
  font-size: 17px;
  border: none;
  cursor: pointer;
}

input[type=text] {
  padding: 6px;
  margin-top: 8px;
  font-size: 17px;
  border: none;
}

  

  .pagination {  display: inline-block; }

.pagination a {
  color: black;
  float: left;
  padding: 8px 16px;
  text-decoration: none;
}

.pagination a.active {  background-color: #4CAF50;
  color: white; }

.pagination a:hover:not(.active) {background-color: #ddd;}

  </style>
  </head>
<body>
<h1>Mock Exam</h1>
<h2>Login</h2>


 
 <form action="edit.jsp" method="GET">
 <table border="1" width="100%">
    <tr>
      <th>Id</th>
      <th>Question</th>
      <th>Option 1</th>
      <th>Option 2</th>
      <th>option 3</th>
       <th>Option 4</th>
       <th>Answer</th>
      <th>Change or Delete</th>
    </tr>
    <%
    ExamDatabase db = new ExamDatabase();
    ArrayList<Problem> problemList = new ArrayList<Problem>();
    problemList = db.viewDatabase(problemList); %>
  
    <%  for (int i=0;i<problemList.size();i++)  {%>
    <tr>        
      <td><%out.println(problemList.get(i).getId());%></td>
      <td><%out.println(problemList.get(i).getQuestion());%></td>
      <td><%out.println(problemList.get(i).getOption1());%></td>
      <td><%out.println(problemList.get(i).getOption2());%></td>
      <td><%out.println(problemList.get(i).getOption3());%></td>
      <td><%out.println(problemList.get(i).getOption4());%></td>
      <td><%out.println(problemList.get(i).getAnswer());%></td> 
    
      <td><!-- <a href="edit.jsp?id=<%=problemList.get(i).getId()%>"> --><input type="hidden" name="id" value="<%=problemList.get(i).getId()%>"><button class="button">Edit</button><!-- </a> --><!-- </td> -->
      <!-- <td> --><a href="problemDelete?id=<%=problemList.get(i).getId()%>"><button class="button button2">Delete</button></a></td> 
        <%}%></tr>  
  </table>
		</form>
     <a href="add.html"><button class="button">Creat New Question</button></a>
     <a href="index.jsp"><button class="button">LOg Out</button></a>
     
</body>
</html>




     <!-- <td> <a href="edit.jsp?id=<%=problemList.get(i).getId()%>"> --><!-- <input type="hidden" name="id" value="<%=problemList.get(i).getId()%>"><button class="button">Edit</button></a> -->
      <!-- <td><a href="problemDelete?id=<%=problemList.get(i).getId()%>"><button class="button button2">Delete --><!-- </button></a></td> 
        <%}%></tr>  
  </table>
    </form> -->
    <!--  <a href="add.html"><button class="button">Creat New Question</button></a>
     <a href="index.jsp"><button class="button">LOg Out</button></a> --> -->
