<!DOCTYPE html>
<html>
<head>
	<title>instructions</title>
</head>
<body bgcolor="FloralWhite">
<style>
   body {
  background-image: url('full-hd-colourful-download-trees-simple-jpg.jpg');
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
  top: 25%;
  left: 30%;
  -ms-transform: translate(-30%, -30%);
  transform: translate(-20%, -20%);
}
.button_css
{
	background-color: #3cb371;
  color: white;
  width: 150px;
  height: 40px;
  border-radius: 12px;
   display: inline-block;
  font-size: 16px;
  text-decoration: none;
}

</style>
<div class="container">
<div class="center">
<p>
  <% int mark=Integer.parseInt(session.getAttribute("count").toString());%>
<h1><font color="midnightblue">you have successfully completed the mock exam !!!</font></h1>
<h1><font color="midnightblue">your score :<%out.println(mark);%></font></h1>
<%int m=Integer.parseInt(session.getAttribute("count").toString());
%>
<br>
<br>
<h1><font color="midnightblue">have a good day</font></h1>
</p>
</div>
</div>
<%   %>
</body>
</html>