<%@page import = "com.sanfar.config.*"%>
<%@page contentType = "text/html;charset=UTF-8" pageEncoding = "UTF-8"%>
<!DOCTYPE html>
<html>
<body background="image/COVID19.jpg">
   
<form >
	<h1><font color="#87CEFA" style="margin-left: 40%">Covid19AffidavitRequester</font></h1>
  <label for="fname" color="white" style="margin-left: 21%"> <font color="#87CEFA">Name</font></label>
  <input type="text" name="name" size="60"><br><br>

  <label for="fname" color="white" style="margin-left: 21.8%"> <font color="#87CEFA">phoneNumber</font></label>
  <input type="text" name="phoneNumber" size="60"><br><br>

  <label for="fname" color="white" style="margin-left: 21.8%"> <font color="#87CEFA">address</font></label>
  <input type="text" name="address" size="60"><br><br>

  <label for="fname" color="white" style="margin-left: 21.8%"> <font color="#87CEFA">vehicleNumber</font></label>
  <input type="text" name="vehicleNumber" size="60"><br><br>

  <label for="fname" color="white" style="margin-left: 21.8%"> <font color="#87CEFA">vehicleType</font></label>
  <input type="text" name="vehicleType" size="60"><br><br>

  <label for="fname" color="white" style="margin-left: 21%"> <font color="#87CEFA">startingLocation</font></label>
  <input type="text" name="startingLocation" size="60"><br><br>

  <label for="fname" color="white" style="margin-left: 21.8%"> <font color="#87CEFA">destination</font></label>
  <input type="text" name="destination" size="60"><br><br>

  <label for="fname" color="white" style="margin-left: 21.8%"> <font color="#87CEFA">startingDate</font></label>
  <input type="text" name="startingDate" size="60"><br><br>

  <label for="fname" color="white" style="margin-left: 21.8%"> <font color="#87CEFA">startingTime</font></label>
  <input type="text" name="startingTime" size="60"><br><br>

  <label for="fname" color="white" style="margin-left: 21.8%"> <font color="#87CEFA">endingDate</font></label>
  <input type="text" name="endingDate" size="60"><br><br>

   <label for="fname" color="white" style="margin-left: 21.8%"> <font color="#87CEFA">endingtime</font></label>
  <input type="text" name="endingtime" size="60"><br><br>

  <label for="fname" color="white" style="margin-left: 21.8%"> <font color="#87CEFA">copassengername</font></label>
  <input type="text" name="copassengername" size="60"><br><br>

  <label for="fname" color="white" style="margin-left: 21.8%"> <font color="#87CEFA">relation</font></label>
  <input type="text" name="relation" size="60"><br><br>

  <label for="fname" color="white" style="margin-left: 21.8%"> <font color="#87CEFA">reason</font></label>
  <input type="text" name="reason" size="60"><br><br>

  <div align ="center">
  
  <button formaction="add" >Submit</button><br><br><button formaction="admin.jsp">back</button>
 
</form>
</div>
</body>
</html>