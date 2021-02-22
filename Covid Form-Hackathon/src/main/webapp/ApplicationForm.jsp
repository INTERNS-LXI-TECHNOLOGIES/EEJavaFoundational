<%@page import="com.lxisoft.servlet.*"%>
<%@page import="com.lxisoft.model.*"%>
<%@page import="java.util.*"%>
<%@page import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
  <title>Covid Application </title>
</head>
<body>
  <h1><a href="Index.jsp"> Application Form</a></h1>

  <form action="AddApplicationServlet" method ="post">
  <input type="text" name="name" placeholder="Name of Applicant" required/></br></br>
  <input type="text" name="phno" placeholder="Phone Number of Applicant" required/></br></br>
  <input type="text" name="address" placeholder="Address in where the program is conducting" required/></br></br>
  <input type="text" name="type"  placeholder="Type of Function" required/></br></br>
  <input type="text" name="people"  placeholder="Number Of people attending the program" required/></br></br>
   <input type="checkbox" value="None" id="radioOne" name="T&C" required/></br>
     <p> By clicking Register, you agree on our <a href="terms.jsp">terms and condition</a>.</p>
   <input type="submit" value="Apply "/>
  </form>
</div>
</body>
</html>