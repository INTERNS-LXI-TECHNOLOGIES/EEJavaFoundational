<%@ page import="java.sql.*" %>
<%@ page import="java.io.*" %> 
<%@ page import="java.util.*" %> 
<%@ page import="com.lxisoft.model.Model"%>
<!DOCTYPE HTML >
<html>
<head>
<title>MOCK EXAM</title>
</head>
<body background="image/earth.jpg">
	<% int edit=Integer.parseInt(request.getParameter("Edit"));
	//out.println("Id : "+edit);%>
<form >
<h2><font color="#87CEFA" style="margin-left: 43%">Datas of mock Exam</h2><br><br>
  <label for="fname" color="white" style="margin-left: 25.2%"> <font color="#87CEFA" >Id</font></label>
  <input type="text" name="Id" size="60" value=<%out.println(edit);%>><br><br>
  <label for="fname" color="white" style="margin-left: 21%"> <font color="#87CEFA">Question</font></label>
  <input type="text" name="question1" size="60"><br><br>

  <label for="fname" color="white" style="margin-left: 21.8%"> <font color="#87CEFA">Answer</font></label>
  <input type="text" name="Answer1" size="60"><br><br>

  <label for="fname" color="white" style="margin-left: 21.8%"> <font color="#87CEFA">Option1</font></label>
  <input type="text" name="option11" size="60"><br><br>

  <label for="fname" color="white" style="margin-left: 21.8%"> <font color="#87CEFA">Option2</font></label>
  <input type="text" name="option21" size="60"><br><br>

  <label for="fname" color="white" style="margin-left: 21.8%"> <font color="#87CEFA">Option3</font></label>
  <input type="text" name="option31" size="60">
  <div align ="center">
</font>
<button formaction="update" type="submit" >submit</button>
<button formaction="table.jsp" type="submit" >back</button>
</form>
</div>
</body>
</html>