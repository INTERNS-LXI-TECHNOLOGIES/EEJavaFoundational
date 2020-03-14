<%@ page import="com.lxisoft.model.Model"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="com.lxisoft.sqlRepository.SqlRepository"%>
<!DOCTYPE html>
<html>
<head>
  <title>question1</title>
</head>
<body bgcolor="FloralWhite">
<style>
  body {
  background-image: url('orig_202868.jpg');
    background-position: center;
  background-repeat: no-repeat;
  background-size: cover;
  height: 100%
}
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
.button {
  background-color: #4CAF50; /* Green */
  border: none;
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
  border: 2px solid #4CAF50;
  border-radius: 12px;
}

.button1:hover {
  background-color: #4CAF50;
  color: white;
}

.button2 {
  background-color: white; 
  color: black; 
  border: 2px solid #008CBA;
  border-radius: 12px;
}

.button2:hover {
  background-color: #008CBA;
  color: white;
}
input[type=text] {
  width: 300%;
  padding: 12px 20px;
  border: 2px solid red;
  border-radius: 4px;
}
table, th, td {
  border: 1px solid black;
  border-collapse: collapse;
}
</style>
<div class="container">
<div class="center">
<p>
<font size="6" color="midnightblue"><i><b>Welcome to Delete Page</b></i></font><br><br><br>
<% ArrayList<Model> model=new ArrayList<Model>();
SqlRepository sql=new SqlRepository();
model=sql.selectFrom(model);%>
 <form>
  <table>
     <tr>
    <th><h2>slno</h2></th>
    <th><h2>Question</h2></th> 
    <th><h2>Option 1</h2></th>
    <th><h2>Option 2</h2></th>
    <th><h2>Option 3</h2></th>
    <th><h2>Option 4</h2></th>
    <th><h2>Delete</h2></th>
  </tr> 
    <%for(int i=0;i<model.size();i++)
    {%>
     <tr> 
      <td><h2><%out.println(i+1);%></h2></td>
      <td><h2><%out.println(model.get(i).getQn());%></h2></td>
      <td><h2><%out.println(model.get(i).getOpt1());%></h2></td>
      <td><h2><%out.println(model.get(i).getOpt2());%></h2></td>
      <td><h2><%out.println(model.get(i).getOpt3());%></h2></td>
      <td><h2><%out.println(model.get(i).getOpt4());%></h2></td>
<td><button formaction="delete" class="button button1" name="delete" value="<%out.println(model.get(i).getSlno());%>">delete</button></td>
       <%}%>
     </tr>
    <br>
  </table>
</form>
<form>
<button formaction="AdminMenu.jsp" class="button button2" name="done" >DONE</button> 
</form>
</div>
</div>
</div>

</p>
</body>
</html>