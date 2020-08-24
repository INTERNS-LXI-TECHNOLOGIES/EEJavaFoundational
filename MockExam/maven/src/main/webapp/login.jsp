<html>
	
	<head>
		<title>Login User</title>
		    	<style>
		body{
		 background-color:#f7cac9 ;	
      text-align:center;  
		
		}	
		h1 {
  			color: black;
  			text-align: center;
  			font-family: courier;
			}
.button {
  padding: 15px 25px;
  font-size: 24px;
  text-align: center;
  cursor: pointer;
  outline: none;
  color: #fff;
  background-color: #4CAF50;
  border: none;
  border-radius: 15px;
  box-shadow: 0 9px #999;
}

.button:active {
  background-color: #3e8e41;
  box-shadow: 0 5px #666;
  transform: translateY(4px);
}
	</style>
	</head>
	<body>
		<h1>Login Details</h1>
		<form  method="GET" action =""  >
			Name : &nbsp &nbsp&nbsp<input type="text" placeholder=" UserName" name="username" required><br><br>
			Password :<input type="password" placeholder="  Password" name="password" required><br><br>
		<input type="button" class="button" value="Login" onclick="check(this.form)">
		</form>
		<input type="submit" class="button" value="Home">


		
	</body>
</html>