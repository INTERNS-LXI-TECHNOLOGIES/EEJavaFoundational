<!DOCTYPE html> 
<%@ page import = "java.sql.*" %> 
<html> 
  <head>  
  <title>Delete Contacts</title> 
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
          
          Class.forName("com.mysql.cj.jdbc.Driver"); 
         Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/lxisoft","root","root"); 
          Statement st  = con.createStatement(); 
           
          ResultSet rs = st.executeQuery("select * from contacts where sl_no = '"+Integer.parseInt(request.getParameter("sl_no"))+"'");
          PreparedStatement ps = null;
          while(rs.next()) 
          {
              //- Integer num = rs.getInt(5);
     %>
     <form action="Delete.jsp" method="POST">
          <div class="container">
           <center> <h1> <b>DELETE CONTACT</b></h1></center>

           <hr>

               <label for="sl_no"><b>SL_NO</b></label>
            <input type="text"  name="sl_no" value="<%=rs.getString(5)%>">

           


            <br>
          
            <hr>

            

          <center>
            <button class="button button2"  name="cancel" onclick="alert('Hello\nThe option you have selected is an CANCEL!!!')" type="reset" value="reset">CANCEL</button>

            <button class="button button1" name="delete" onclick="alert('Hello\nThe option you have selected is an DELETE!!!')" type="submit" value="submit">DELETE</button>

          </center>
               <%
      } con.close();
         st.close();
         }catch(Exception e){
     System.out.println(e);
     e.printStackTrace();
    }
    %>
          </div>
     
          
     </form>
</body>
</html>