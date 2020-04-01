<%@page import="com.lxisoft.servlet.*"%>
<%@page import="com.lxisoft.model.*"%>
<%@page import="com.lxisoft.repository.*"%>
<%@page import="java.util.*"%>
<!DOCTYPE HTML>
<html>
  <head>
    <title>Contact App</title>
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
   <div>
    <a href="add.html"><button class="button">Add Contact</button></a>
    <!-- <a href="view.jsp"><button class="button">View Contacts</button></a> -->
     <div class="search-container">
    <form action="result.jsp" method="GET" > 
      <button class="button">Search</button>    
      <input type="text" placeholder="Search Name" name="searchname" required><br><br>
     
    </form>   </div></div>
    <div> <h1>Contacts</h1></div>

<table border="1" width="100%">
    <tr>
      <th>Id</th>
      <th>First Name</th>
      <th>Last Name</th>
      <th>Phone Number</th>
      <th>Change OR Delete</th>
    </tr>
    <%
    ContactDatabase db = new ContactDatabase();
    ArrayList<Contact> contactList = new ArrayList<Contact>();
    contactList = db.viewDatabase(contactList); %>
  
    <%  for (int i=0;i<contactList.size();i++)  {%>
    <tr>        
      <td><%out.println(contactList.get(i).getId());%></td>
      <td><%out.println(contactList.get(i).getFirstname());%></td>
      <td><%out.println(contactList.get(i).getLastname());%></td>
      <td><%out.println(contactList.get(i).getNumber());%></td> 
    
      <td><a href="edit.jsp?id=<%=contactList.get(i).getId()%>"><button class="button">Edit</button></a><!-- </td> -->
      <!-- <td> --><a href="contactDelete?id=<%=contactList.get(i).getId()%>"><button class="button button2">Delete</button></a></td> 
        <%}%></tr>  
  </table>

    <div class="pagination">
  <a href="#">&laquo;</a>
  <a href="#">1</a>
  <a class="active" href="#">2</a>
  <a href="#">3</a>
  <a href="#">4</a>
  <a href="#">5</a>
  <a href="#">6</a>
  <a href="#">&raquo;</a>
</div>


  </body>
</html>
