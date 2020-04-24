<%@page import = "com.lxisoft.config.*"%>
<%@page contentType = "text/html;charset=UTF-8" pageEncoding = "UTF-8"%>
<!DOCTYPE HTML >
<html>
<%
  Internationalization international=new Internationalization();
  String language = session.getAttribute("language").toString();
  if(language==null)
  {
    language="en";
  }
  session.setAttribute("language",language);
  String mockexam = international.localization(language,"IN","MOCK-EXAM");
  String login = international.localization(language,"IN","Login");
  String userName = international.localization(language,"IN","UserName");
  String password = international.localization(language,"IN","Password");
  String submit = international.localization(language,"IN","Submit"); 
  %>
<head>

</head>
<link rel="stylesheet" href="style.css">
<body>
	<div class="box">
		<form method="POST" action="j_security_check">
			<h2><font color="#87CEFA"><%out.println(mockexam);%></font></h2><br><br>
			<div class="inputbox">
				<label ><font color="#87CEFA"><%out.println(userName);%></font></label>
  				<input type="text" name="j_username">
  				
  				</div>
  			<div class="inputbox">
  				<label ><font color="#87CEFA"><%out.println(password);%></font></label>
  				<input type="text" name="j_password">	
  			</div>
			</font>
		<div style="text-align:center;">
		<button type="submit" ><%out.println(submit);%></button>
	</div>
	</div>
</form>
</body>
</html>