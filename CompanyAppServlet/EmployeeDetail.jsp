<html>
<head>
<title>Company Details</title>
<style>
  body{
    text-align: center;
    background-color: rgb(42, 165, 93);
    background-image :url("companyImg.jpg") ;
	 
  }
  </style>
</head>
<body>
    <form action="EmployeeServlet" method="post">

<h1 style = "color:rgb(140, 42, 165)"> Employee Details</h1>
<label style = "color:rgb(115, 0, 255) "> Enter The Name  Of Employee </label>
<input type="text" name="nameee">
<br>
<label style = "color:rgb(115, 0, 255) "> Enter The Id Of Employee</label>
<input type="text" name="idd">
<br>
<label style = "color:rgb(115, 0, 255) "> Enter The Age Of Employee</label>
<input type="text" name="age">
<br>
<label style = "color:rgb(115, 0, 255) "> Enter The PhoneNumber Of Employee</label>
<input type="text" name="phoneNumber">
<br>
<label style = "color:rgb(115, 0, 255) "> Enter The Address Of Employee</label>
<input type="text" name="Address">
<br><br>
<select name="select">
  <option value ="Create">CREATE</option>
  <option value ="Read">READ</option>
  <option value = "Update">UPDATE</option>
  <option value = "Delete">DELETE</option>
  <option value = "Non">NON</option>
</select>
<br><br>

<input style = "color:rgb(255, 0, 17)" type="submit" value="next">
        </form>
        <form action="index.html" method = "get">
          <input type="submit" value="Go Back">
          </form>
        </body>
</html>