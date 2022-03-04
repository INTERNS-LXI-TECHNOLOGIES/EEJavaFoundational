<!DOCTYPE html>
<%@ page import = "java.sql.*" %>
<html> 
  <head>  
  <title>Contacts</title> 
  </head> 
  <style>
  * {box-sizing: border-box;}
  .header {
  overflow: hidden;
  background-color: #07a521;
  padding: 20px 10px;
}
.header-right {
  float: right;
  font-family: Impact, Haettenschweiler, 'Arial Narrow Bold', sans-serif;
  font-style: calc();
  font-size: medium;
}

@media screen and (max-width: 500px) {
  .header a {
    float: none;
    display: block;
    text-align: left;
  }
  
  .header-right {
    float: right;
  }
}
table {
  border-collapse: collapse;
  width: 100%;
}

th, td {
  text-align: left;
  padding: 8px;
}

tr:nth-child(even) {
  background-color: #D6EEEE;
}
.button1 {
  background-color: white;
  color: black;
  border: 2px solid #f70909;
  size:50px;
}

.button1:hover {
  background-color: #f00303;
  color: white;
}
 /* body {
    background-image: url('con2.jpg');
    background-repeat: no-repeat;
  }*/
  </style>
  <body>
    <center>

      <div class="header">
        <img src="con.png" alt="logo" align =left width="100" height="100"/>
       <h1> <i> CONTACTS </i> </h1>
       <div class="header-right">
        <a class="active" href="Add.html">ADD</a>
        <a href="#contact">UPDATE</a>
        <a href="Delete.html">DELETE</a>
      </div>
      </div>
     
    <table border="4" width = 80%>
          <tr>
            <th>SL_NO</th>
            <th>FIRST_NAME</th>
            <th>LAST_NAME</th>
            <th>CONTACT</th>
            <th>EMAIL</th>
           
          </tr>
    <%
     try{
          
          Class.forName("com.mysql.cj.jdbc.Driver"); 
         Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/lxisoft","root","root"); 
          Statement st  = con.createStatement(); 
          ResultSet rs = st.executeQuery("select * from contacts ");

          while(rs.next()) 
          {
     %>

     <tr>
               <td> <%= rs.getString(5) %> </td>
               <td> <%= rs.getString(1) %> </td>
               <td> <%= rs.getString(2) %> </td>
               <td> <%= rs.getString(3) %> </td>
               <td> <%= rs.getString(4) %> </td>
               <td> 
               <a href ="Delete.html">DELETE</a>
               </td>
               <td>
                 <a href ="Update.jsp?sl_no=<%=rs.getString(5)%>">UPDATE</a>
              </td>
             </tr>
      <%
      } con.close();
         st.close();
         }catch(Exception e){
     System.out.println(e);
     e.printStackTrace();
    }
    %>

     </table>
         
          </center>
           </body>
           </html>

