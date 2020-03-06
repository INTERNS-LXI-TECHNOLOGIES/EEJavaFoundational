<!DOCTYPE html>
<html>
<body bgcolor="OldLace">
<style>
.container {
  height: 700px;
  position: relative;
  border: 5px solid oldlace;
}
.center {
  margin: 0;
  position: absolute;
  top: 50%;
  left: 50%;
  -ms-transform: translate(-50%, -50%);
  transform: translate(-50%, -50%);
}
.button_css
{
	background-color:midnightblue ;
	color:white ;
  background-repeat:no-repeat;
	width: 150px;
	height: 40px;
}
</style>
<div>
<form>
<center><h1>ADMIN</h1>	
<button formaction="View.jsp" class="button_css">VIEW</button>
<button formaction="Add.jsp" class="button_css">ADD</button>
<button formaction="Update.jsp"  class="button_css">UPDATE</button>
<button formaction="Delete.jsp" class="button_css">DELETE</button>
<button formaction ="index.jsp" class="button_css">BACK</button> 
</center>
</form>
</div>
</body>
</html>
