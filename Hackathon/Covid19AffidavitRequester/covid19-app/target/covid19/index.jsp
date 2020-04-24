<!DOCTYPE html>
<html>
<head>
	<title>Request Affidavit</title>
	<style type="text/css">
		head,body{
			/*background-color: #7fcdcd;*/
			position: fixed;
		}
		#heading{
			text-align: center;
			position: relative;
			left:-40px;
			top: 100px;
		}
		button
		{
			background-color: #008cba;
			text-indent: 0px;
			border:1px solid dark;
			display:inline-block;
			font-family: Arial;
			color: black;
			font-size: 16px;
			height: 45px;
			width: 145px;
			text-decoration: none;
			text-align: center;text-shadow: 1px 1px 0px;
			line-height: 10px;
			overflow: hidden;
			border-radius: 15px; 
			outline: none;
			margin-top: 200px;
			margin-left: auto;
		}
		#box{
			background-image: url("pic.jpg");
			background-color: lightgrey;
			width: 1150px;
			border:15px solid green;
			padding: 50px;
			padding-top: 5px;
			margin: 35px;
			border-radius: 45px;
			height: 400px;

		}
		#btn{

			border-radius: 15px;
			border-color: black;
			margin-top: -20px;
			position: relative;
			top: 30px;
			left: 450px;
			down: 40px;
		}
		h1
		{
			font-size: 50px;
		}
	</style>
</head>
<body>
	
	<div id="box">
		<div id="heading">
			<h1>AFFIDAVIT REQUEST</h1>
		</div>
		<div id="btn">
		<a href="secured/add.jsp"><button>REQUEST</button></a>
		<a href="secured/check.jsp"><button>Status</button></a>
		<!-- <a href="register.jsp"><button>Register</button></a> -->
		</div>
	</div>
</body>
</html>
