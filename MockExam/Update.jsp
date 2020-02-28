 <%@page import="com.lxisoft.Model.ExamModel"%>
<%@page import="com.lxisoft.Repository.SqlRepository"%>
<%@page import="java.util.ArrayList"%>
<html>
<%
	ArrayList<ExamModel> models = new ArrayList<ExamModel>();
  	SqlRepository sqlrepo = new SqlRepository();
  models = sqlrepo.readFromDatabase(models);
%>
	<body>
	<div>
	<form>
		<h1>UPDATE</h1>
		<table style="width:70%" align = "center">
  <tr>
  	<th>QuestionNo</th>
    <th>Question</th>
    <th>Option1</th>
    <th>Option2</th>
    <th>Option3</th>
    <th>Option4</th>
    <th>Answer</th>
    <th>Update</th>
  </tr>
  <%
  for(int i =0;i<models.size();i++)
  {
  	%>
  <tr align="center">
  	<td><h3><%out.println(i+1);%></h3></td>
  	<td><h3><%out.println(models.get(i).getQuestion());%></h3></td>
    <td><h3><%out.println(models.get(i).getOpt1());%></h3></td>
    <td><h3><%out.println(models.get(i).getOpt2());%></h3></td>
    <td><h3><%out.println(models.get(i).getOpt3());%> </h3></td>
    <td><h3><%out.println(models.get(i).getOpt4());%> </h3></td>
    <td><h3><%out.println(models.get(i).getAnswer());%></h3></td>
    <td><button name ="Update" formaction ="Updatequestion.jsp" value =<%out.println(i);%>UPDATE</button></td>
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