<%@page import="com.lxisoft.servlet.*"%>
<%@page import="com.lxisoft.model.*"%>
<%@page import="com.lxisoft.repository.*"%>
<%@page import="java.util.*"%>
<!DOCTYPE HTML>
<html>
  <head>
    <title>Mock Exam</title>
  <style>
    body{
     background-color:#C2F6A6; 
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
  background-color:#C2F6A6;
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

   <form>
 <table border="1" width="100%">
    <tr>
      <th>Name</th>
      <th>Mark</th>
    </tr>  
<% // int mark = Integer.parseInt(request.getAttribute("score").toString());
    <% QuestionDatabase db = new QuestionDatabase();
    ArrayList<User> userList = new ArrayList<User>();
    userList = db.viewUserDatabase(userList); %>
%>

<li><h1> The Persons Who Attented The Exam</h1></li>
  <li><h1></h1></li>
  <%  for (int i=0;i<userList.size();i++)  {%>
   <tr>        
      <td><br><%out.println("\n"+userList.get(i).getName());%></td>
      <td><br><%out.println("\n"+userList.get(i).getMark());%></td>

      <%}%></tr> 
    </table>
    </form>  
  <a href="index.jsp"><!-- <button type="submit">Home</button> --><input type="submit" class="button" value="Home"></a> 


 <!--   <tr>
      <th>Name</th>
      <th>Mark</th>
    </tr>  
<% // int mark = Integer.parseInt(request.getAttribute("score").toString());
    <% QuestionDatabase db = new QuestionDatabase();
    ArrayList<User> userList = new ArrayList<User>();
    userList = db.viewUserDatabase(userList); %>
%>

<li><h1> The Persons Who Attented The Exam</h1></li>
  <li><h1></h1></li>
  <%  for (int i=0;i<userList.size();i++)  {%>
   <tr>        
      <td><br><%out.println("\n"+userList.get(i).getName());%></td>
      <td><br><%out.println("\n"+userList.get(i).getMark());%></td>

      <%}%></tr> 
    </table>
    </form>   -->

</body>
</html>        