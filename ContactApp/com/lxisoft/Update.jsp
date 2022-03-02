<!DOCTYPE html> 
<%@ page import = "java.sql.*" %> 
<html> 
  <head>  
  <title>Update Contacts</title> 
  </head>
  <style>
        * {box-sizing: border-box}

        .container {
  padding: 100px;
}
h1 {  
  border-color: rgb(255, 46, 31);  
  border-width: .25em;  
  border-style: double;  
  } 
input[type=text], input[type=password] {
  width: 100%;
  padding: 15px;
  margin: 5px 0 22px 0;
  display: inline-block;
  border: none;
  background: #f1f1f1;
}

input[type=text]:focus, input[type=password]:focus {
  background-color: #ddd;
  outline: none;
}
       hr {
  border: 5px solid #f1f1f1;
  margin-bottom: 25px;
}
     .button {
  border: none;
  border-radius: 13px;
  color: white;
  padding: 16px 32px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
  margin: 4px 2px;
  transition-duration: 0.4s;
  cursor: pointer;
}

.button1 {
  background-color: white;
  color: black;
  border: 2px solid #f70909;
  
}

.button1:hover {
  background-color: #f00303;
  color: white;
}

.button2 {
  background-color: white;
  color: black;
  border: 2px solid #80acfd;
}

.button2:hover {
  background-color: #80acfd;
  color: white;
}
     </style>
  <body>
    <%
     try{
          
          Class.forName("com.mysql.cj.jdbc.Driver").newInstance(); 
         Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/lxisoft","root","root"); 
          PreparedStatement ps = null;
          ResultSet rs = null;
          Statement st  = con.createStatement();
          %>

          <form action=" " method="POST">
          <div class="container">


     <%
     
     //ps = con.createStatement();
     String ph = request.getParameter("ph_no");
     rs = st.executeQuery("SELECT * FROM contacts WHERE ph_no = '"+ph+"'");
     while(rs.next()&&!rs.last()){
     
     %>
          <hr>
        
            <label for="f_name"><b>FIRST_NAME</b></label>
            <input type="text" name="f_name" value= '<%= rs.getString(1) %>'>
        
            <label for="l_name"><b>LAST_NAME</b></label>
            <input type="text" name="l_name" value= '<%= rs.getString(2) %>'>
        
            <label for="ph_no"><b>MOBILE_NUMBER</b></label>
            <input type="text" name="ph_no" value= '<%= rs.getString(3) %>'>
        
            <label for="email"><b>Email</b></label>
            <input type="text" name="email" value= '<%= rs.getString(4) %>'>
            
            <hr>
      <%
     }
     %>

     <center>
     
            <button class="button button2"  name="cancel" type="reset" value="reset">CANCEL</button>

            <button class="button button1" name="delete" type="submit" value="submit">UPDATE</button>

          </center>
                
          </div>
          <% 
          


          String fName = request.getParameter("f_name");
          String lName = request.getParameter("f_name");
          String phn = request.getParameter("ph_no");
          String email = request.getParameter("email");

          if(fName != null && lName != null && phn != null && email != null){


               ps = con.prepareStatement("UPDATE contacts set f_name=?,l_name=?,ph_no=?,email=?,WHERE ph_no = '"+phn+"'");
               ps.setString(1, request.getParameter("f_name"));
               ps.setString(2, request.getParameter("f_name"));
               ps.setString(3, request.getParameter("ph_no"));
               ps.setString(4, request.getParameter("email"));
               ps.executeUpdate();


          }
          }
       finally
        {
            System.out.println("finally block executed");
        }
         %>

          </body>
          </html>
     