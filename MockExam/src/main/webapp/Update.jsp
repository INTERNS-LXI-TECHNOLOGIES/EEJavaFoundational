<!DOCTYPE html>
<%@page import="com.lxisoft.Model.ExamModel"%>
<%@page import="com.lxisoft.Repository.SqlRepository"%>
<%@page import="java.util.ArrayList"%>
<html>
<%
	ArrayList<ExamModel> models=new ArrayList<ExamModel>();
  	SqlRepository sqlrepo=new SqlRepository();
  	models=sqlrepo.readFromDatabase(models);
%>
	<body>
	<div>
	<form>
		<center><h1>UPDATE</h1></center>
		<table style="width:70%" align ="center">
  <tr>
  	<!-- <th><h2>Qno</h2></th> -->
    <th><h2>Question</h2></th> 
    <th><h2>Option 1</h2></th>
    <th><h2>Option 2</h2></th>
    <th><h2>Option 3</h2></th>
    <th><h2>Option 4</h2></th>
    <th><h2>Answer</h2></th>
    <th><h2>Update</h2></th>
  </tr>
  <%
  for(int i=0;i<models.size();i++)
  {
  	%>
  <tr align="center">
  	<!--   <td><h2><%out.println(models.get(i).getId());%></h2></td> -->
      <td><h2><%out.println(models.get(i).getQuestion());%></h2></td>
      <td><h2><%out.println(models.get(i).getOpt1());%></h2></td>
      <td><h2><%out.println(models.get(i).getOpt2());%></h2></td>
      <td><h2><%out.println(models.get(i).getOpt3());%></h2></td>
      <td><h2><%out.println(models.get(i).getOpt4());%></h2></td>
      <td><h2><%out.println(models.get(i).getAnswer());%></h2></td>
      <td><button name ="Update" formaction ="Updatequestion.jsp" value=<%out.println(i);%>>UPDATE</button></td>
  </tr>
  <%
	}
  %>
</table><br>
	<button formaction="Admin.jsp" class="button">BACK</button> 
	</form>
	</div>
	</body>
</html>