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
    <form action="ProductServlet" method="post">
        
<br>
<h1 style = "color:rgb(140, 42, 165)">Product Details</h1>
<br>
<p2 style = "color:rgb(0, 255, 13) ">Enter The Name Of Product</p2>
<input type="text" name="namee">
<br>
<p2 style = "color:rgb(0, 255, 13) ">Enter The Id Of Product </p2>
<input type="text" name="idd">
<br>
<p2 style = "color:rgb(0, 255, 13) ">Enter The Cost Of Product</p2>
<input type="text" name="cost">
<br>
<p2 style = "color:rgb(0, 255, 13) ">Enter The mfDate Of Product</p2>
<input type="text" name="mfDate">
<br>
<p2 style = "color:rgb(0, 255, 13) ">Enter The lsDate Of Product</p2>
<input type="text" name="lsDate">
<br><br>
<select name="selected" >
  <option value="Create">Create </option>
  <option value="Read"> Read</option>
  <option value="Update">UPDATE</option>
  <option value="Delete"> DELETE</option>
  <option value="NON">NON </option>
  </select>
  <br>

<input style = "color:rgb(255, 0, 17)" type="submit" value="next">
        </form>
        <form action="index.html" method="get">
          <input type="submit" value="Go Back">
          </form>
</html>