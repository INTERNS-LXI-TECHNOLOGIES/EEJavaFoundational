<%@ page import="com.lxisoft.model.Model"%>
<%@ page import="java.util.ArrayList"%>
<!DOCTYPE html>
<html>
<head>
	<title>question1</title>
</head>
<body bgcolor="FloralWhite">
<style>
.container {
  height: 700px;
  position: relative;
  border: 5px solid midnightblue;
}

.center {
  margin: 0;
  position: absolute;
  top: 50%;
  left: 50%;
  -ms-transform: translate(-50%, -50%);
  transform: translate(-50%, -50%);
}
.button_css
{
	background-color: midnightblue;
	color: white;
	width: 150px;
	height: 40px;
  border-radius: 12px;
   display: inline-block;
  font-size: 16px;
  text-decoration: none;
}
input[type=text] {
  width: 300%;
  padding: 12px 20px;
  border: 2px solid red;
  border-radius: 4px;
}
</style>
<div class="container">
<div class="center">
<p>
  
  <form>
<font size="6" color="midnightblue"><i><b>Welcome to Display Page</b></i></font><br><br><br>
<% ArrayList<Model> model=(ArrayList<Model>)session.getAttribute("disp");%>
  <table>
     <tr>
    <th><h2>slno</h2></th>
    <th><h2>Question</h2></th> 
    <th><h2>Option 1</h2></th>
    <th><h2>Option 2</h2></th>
    <th><h2>Option 3</h2></th>
    <th><h2>Option 4</h2></th>
  </tr>
    <%for(int i=0;i<model.size();i++)
    {%> <tr>
      <td><h2><%out.println(model.get(i).getSlno());%></h2></td>
      <td><h2><%out.println(model.get(i).getQn());%></h2></td>
      <td><h2><%out.println(model.get(i).getOpt1());%></h2></td>
      <td><h2><%out.println(model.get(i).getOpt2());%></h2></td>
      <td><h2><%out.println(model.get(i).getOpt3());%></h2></td>
      <td><h2><%out.println(model.get(i).getOpt4());%></h2></td>
       </tr>

    <br>
   <% }
    %>
   
  </table>
<button formaction="AdminMenu.jsp" class="button_css" name="done" >DONE</button> 
</form>
</div>
</div>
</div>

</p>
</body>
</html>