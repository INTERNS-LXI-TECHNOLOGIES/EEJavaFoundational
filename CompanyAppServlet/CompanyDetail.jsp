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
    <form action="CompanyServlet" method="post">
     
        <h1 style = "color:rgb(140, 42, 165)">Company Details</h1>
        <br>
  <p2 style = "color:rgb(212, 255, 13) ">Enter The Name Of Company</p2>
<input type="text" name="name">
<br>
<p2 style = "color:rgb(212, 255, 13) ">Enter The Id Of Company</p2>
<input type="text" name="id">
<br>
<p2 style = "color:rgb(212, 255, 13) ">Enter The coName Of Company</p2>
<input type="text" name="coName">
<br>
<p2 style = "color:rgb(212, 255, 0) ">Enter The location Of Company</p2>
<input type="text" name="location">
<br>
<p2 style = "color:rgb(212, 255, 13) ">Enter The contactNumber Of Company</p2>
<input type="text" name="contactNumber">
<br></br>
<select id = "selectAnyOne"  name="SELECT">
  <option value="Create"> CREATE</option>
  <option value="Read"> READ</option>
  <option value="Update"> UPDATE</option>
  <option value="Delete"> DELETE</option>
  <option value="NON"> NON</option>
</select>
<br></br>
<input style = "color:rgb(255, 0, 17)" type="submit" value="next">
        </form>
        <form action="index.html" method="post">
          <input type="submit" value="Go Back">
          </form>
        </body>
</html>