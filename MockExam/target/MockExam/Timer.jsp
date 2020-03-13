<html>   
<head> 
    <script> 
       var mins = 2; 
       var secs = mins * 60; 
       function countdown()
       { 
       setTimeout('Decrement()', 60); 
       } 
          
        function Decrement() { 
            if (document.getElementById) { 
                minutes = document.getElementById("minutes"); 
                seconds = document.getElementById("seconds");   
                
                if (seconds < 59) { 
                    seconds.value = secs; 
                }   
               
                else { 
                    minutes.value = getminutes(); 
                    seconds.value = getseconds(); 
                } 
               
                if (mins < 1) { 
                    minutes.style.color = "red"; 
                    seconds.style.color = "red"; 
                } 
                
                if (mins < 0) { 
                    alert('time up'); 
                    minutes.value = 0; 
                    seconds.value = 0; 
                } 
               
                else { 
                    secs--; 
                    setTimeout('Decrement()', 1000); 
                } 
            } 
        }   
        function getminutes() { 
          
            mins = Math.floor(secs / 60); 
            return mins; 
        }   
        function getseconds() { 
            
            return secs - Math.round(mins * 60); 
        } 
    </script> 
</head> 
<body onload="countdown();"> 
    <div> 
        Time Left :: 
        <input id="minutes" type="text" style="width: 10px; 
             border: none; font-size: 16px;  
            font-weight: bold; color: black;"><font size="5"> : 
                        </font> 
        <input id="seconds" type="text" style="width: 20px; 
                        border: none; font-size: 16px; 
                        font-weight: bold; color: black;"> 
    </div> 
</body> 
  
</html> 