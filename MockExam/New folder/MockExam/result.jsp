<html>
	
	<head>
		<title>Login User</title>
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
<% int mark = Integer.parseInt(request.getAttribute("score").toString()); %>

<li><h1> Thank U For Attending The Exam </h1></li>
        <li><h1> You Got <%out.println(mark);%> Marks.</h1></li>

        <%
   
   if(totalMark >=1)
   {
    %>
    <h1><%out.println("Congratulations....");%></h1>
    <h1><%out.println("Exam Passed");%></h1>
   <%
   }
   else
   {
    %>

    <h1><%out.println("!! Sorry !!");%></h1><br>
    <h1><%out.println("Exam Failed");%></h1>
   <%
   }
   %>
   <br>
        
  <a href="index.jsp"><input type="submit" class="button" value="Home"></a> 

<!--  if(totalMark >=1)
   {
    %>
    <h1><%out.println("Congratulations....");%></h1>
    <h1><%out.println("Exam Passed");%></h1>
   <%
   }
   else
   {
    %>

    <h1><%out.println("!! Sorry !!");%></h1><br>
    <h1><%out.println("Exam Failed");%></h1>
   <%
   }
   %>
   <br>
 -->
</body>
</html>