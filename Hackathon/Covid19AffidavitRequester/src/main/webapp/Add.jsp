<!DOCTYPE html>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
<%@page import = "com.amritha.config.*"%>
<%@page contentType = "text/html;charset=UTF-8" pageEncoding = "UTF-8"%>
<html>	
<head>
<form>
	<div>
	<h1></h1>
		<center><font size="6">NEW User</font><br>
  <label for="name">Name </label>
  <input type="text" id="name" name="name"><br><br>
  <label for="address">Address =</label>
  <input type="text" id="address" name="address"><br><br>
  <label for="phone">Phone Number =</label>
  <input type="text" id="phonenumber" name="phonenumber"><br><br>
  <label for="vehiclenumber">Vehicle number =</label>
  <input type="text" id="vehiclenumber" name="vehiclenumber"><br><br>
  <label for="vehicleType">Vehicle Type =</label>
  <input type="text" id="vehicleType" name="vehicleType"><br><br>
    <label for="location">Location=</label>
  <input type="text" id="locationAmr" name="locationAmr"><br><br>
  <label for="destination">Destination =</label>
  <input type="text" id="destinationAmr" name="destinationAmr"><br><br>
  <label for="copassenger">Co-Passenger =</label>
  <input type="text" id="coPassenger" name="coPassenger"><br><br>
  <label for="relation">Relation With you =</label>
  <input type="text" id="relation" name="relation"><br><br>
  <label for="reason">Reason =</label>
  <input type="text" id="reasonAmr" name="reasonAmr"><br><br>
  <label for="time">Time you need to travel =</label>
  <input type="text" id="timeAmr" name="timeAmr"><br><br>
  <button formaction="Admin.jsp" class="button">Back</button> 
  <button formaction="AddServlet" class="button">Submit</button>
  <button type="reset" class="button">Reset</button></center>
</div>
</form>
</body>
</html>
