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
  left: 30%;
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
 <% ArrayList<Model> model=(ArrayList<Model>)session.getAttribute("disp");
    int obj=Integer.parseInt(request.getParameter("update"));
  %> 
  <form action="update" method="get">
<font size="6" color="midnightblue"><i><b>Welcome to update Page</b></i></font><br><br><br>
<font size="5" color="midnightblue">Question : </font> <input type="text" name="Question" placeholder="<%out.println(model.get(obj).getQn());%>"><br>
<font size="5" color="midnightblue">Option 1 : </font> <input type="text" name="Option1" placeholder="<%out.println(model.get(obj).getOpt1());%>"><br>
<font size="5" color="midnightblue">Option 2 : </font> <input type="text" name="Option2" placeholder="<%out.println(model.get(obj).getOpt2());%>"><br>
<font size="5" color="midnightblue">Option 3 : </font> <input type="text" name="Option3" placeholder="<%out.println(model.get(obj).getOpt3());%>"><br>
<font size="5" color="midnightblue">Option 4 : </font> <input type="text" name="Option4" placeholder="<%out.println(model.get(obj).getOpt4());%>"><br>
<font size="5" color="midnightblue">Answer no : </font> <input type="text" name="Ans" placeholder="<%out.println(model.get(obj).getAns());%>"><br><br>
 <button class="button_css" value=<%out.println(obj);%> name="update">
 <button  formaction="AdminMenu.jsp" class="button_css" name="back">BACK</button>
</form>
</div>
</div>
</div>

</p>
</body>
</html>