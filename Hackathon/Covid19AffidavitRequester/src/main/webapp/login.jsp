<%@page import = "com.sanfar.config.*"%>
<%@page contentType = "text/html;charset=UTF-8" pageEncoding = "UTF-8"%>
<!DOCTYPE HTML >
<html>
<head>
  <h2><font color="#87CEFA">Covid19AffidavitRequester</font></h2><br><br>
</head>
<body background="image/COVID19.jpg">
	<div class="box">
		<form method="POST" action="j_security_check">
			
			<div class="inputbox">
				<label ><font color="#87CEFA">USERNAME</font></label>
  				<input type="text" name="j_username">
  				
  				</div>
  			<div class="inputbox">
  				<label ><font color="#87CEFA">PASSWORD</font></label>
  				<input type="text" name="j_password">	
  			</div>
			</font>
		<div style="text-align:center;">
		<button type="submit" >Submit</button>
	</div>
	</div>
</form>
</body>
</html>