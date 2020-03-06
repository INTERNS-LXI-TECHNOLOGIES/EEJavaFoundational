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

</style>
<div class="container">
<div class="center">
<p>
<h1><font color="midnightblue">Read The Instructions Below</font></h1>
<ol>
 <h2><font color="midnightblue"><li>You Have got 10 Minutes to complete the exam</li></font> </h2>
 <h2><font color="MidnightBlue"><li>do not use mobile phone without the permission of invigilator</li></font></h2>
 <h2><font color="MidnightBlue"><li>read the questions carefully and select the answer given below</li></font></h2>
 <h2><font color="MidnightBlue"><li>you can ask as many papers from the invigilator as you wish</li></font></h2>
 <h2><font color="MidnightBlue"><li>any malpractice will lead to debar</li></font></h2>
</ol>
<form method="get" action="check">
  <input type="button" class="button button1" onclick="window.location.href = 'http://localhost:8080/mockExam/page0.jsp';" value="BACK"/>
  <input type="submit" class="button button2"  value="NEXT" />
</form>
     <%
      // ArrayList<Model> model=new ArrayList<Model>();
      //  model = (ArrayList<Model>)session.getAttribute("array");
      // for(int i=0;i<model.size();i++)
      //   {
      //      out.println("<h2>array size : "+model.size()+"<h2>");
      //    out.println("<h2>slno : "+model.get(i).getSlno()+"<h2>");
      //    out.println("<h2>qn : "+model.get(i).getQn()+"<h2>");
      //    out.println("<h2>opt 1 : "+model.get(i).getOpt1()+"<h2>");
      //    out.println("<h2>opt 2 : "+model.get(i).getOpt2()+"<h2>");
      //   }
    %>
</p>
</div>
</div>
</body>
</html>