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
		 background-color: white ;	
		 margin-top:250px;
		 text-align:center;
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
  padding: 15px 32px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
  margin: 4px 2px;
  cursor: pointer;

  .button:hover {  background-color: black;}
}	
	</style>
  </head>

   <body>

   	<div>
   		 <h1>Welcome To MockExam</h1>
      <br>
      <br>
      <br>
      <br>
    <a href="admin.html"><button class="button">Admin Login</button></a>
    <a href="adduesr.html"><button class="button">New User</button></a>
    <a href="login.html"><button class="button">Login</button></a>
    </div>
   </body>
</html>
