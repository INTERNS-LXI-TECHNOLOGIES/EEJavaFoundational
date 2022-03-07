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
  border-radius: 12px;
  border: 2px solid #f70909;
  size:50px;
}

.button1:hover {
  background-color: #f00303;
  color: white;
}
.button2 {
  background-color: white;
  color: black;
  border-radius: 12px;
  border: 2px solid #63f182;
}

.button2:hover {
  background-color: #65ff87;
  color: white;
}
.btn {
  background-color: white;
  color: rgb(10, 126, 0);
  border-radius: 12px;
  padding: 13px 53px;
  border: 2px solid #a3f4ff;
}

.btn:hover {
  background-color: #a3fcff;
   box-shadow: 0 12px 16px 0 rgba(0,0,0,0.24), 0 17px 50px 0 rgba(0,0,0,0.19);
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
        <img src="imgs/con.png" alt="logo" align =left width="100" height="100"/>
       <h1> <i> CONTACTS </i> </h1>
       <div class="header-right">
       <button class="btn"> <a class="active" href="Add.html">ADD</a> </button>
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
              <button class="button1"> <a href ="Delete.html">DELETE</a> </button>
               </td>
               <td>
               <button class="button2">  <a href ="Updateform.jsp?sl_no=<%=rs.getString(5)%>">UPDATE</a></button>
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

