<!DOCTYPE html>
<html>
<head>
	<title>countdown</title>
</head>
<style>
	* {
   margin: 0;
   padding: 0;
   font-family: 'Arimo', sans-serif;
   -webkit-touch-callout: none;
    -webkit-user-select: none;
    -khtml-user-select: none;
    -moz-user-select: none;
    -ms-user-select: none;
    user-select: none;
}

body {
   background: #d7d7d7;
   color: white;
}

/*=================
* TIMER
*=================*/

.timer {
   width: 550px;
   height: 248px;
   display: block;
   position: absolute;
   top: 50%; left: 50%;
   margin-left: -(550px / 2);
   margin-top: -(248px / 2);
   color: white;
   
   * { cursor: default; }

   h3 {
      width: 100%;
      font-size: 26px;
      letter-spacing: 4px;
      text-align: center;
   }

   &--clock {
      width: 100%;
      position: relative;
      padding-left: 6px;
      margin-top: 22px;;
      overflow: hidden;

      .clock-display-grp {
         width: 100%;
         position: relative;

         .number-grp {
            width: auto;
            display: block;
            height: 156px;
            float: left;
            overflow: hidden;

            .number-grp-wrp {
               width: 100%;
               position: relative;

               .num {
                  width: 100%;
                  position: relative;
                  height: 156px;

                  p {
                     width: auto;
                     display: table;
                     font-size: 205px;
                     line-height: 150px; //180
                     font-weight: bold;
                  }

               }

            }

         }
      }

      .clock-separator {
         width: auto;
         float: left;
         display: block;
         height: 156px;

         p {
            width: auto;
            display: table;
            font-size: 205px;
            line-height: 150px; //180
            font-weight: bold;
         }

      }

   }
   h4 {
      width: 100%;
      font-size: 10px;
      letter-spacing: 6px;
      text-align: center;
      padding-top: 25px;
      float: left;
   }
}

.reload {
   width: 125px;
   height: 14px;
   position: absolute;
   bottom: 50vh;
   left: 50%;
   margin-left: -(125px / 2);
   opacity: 0;
   display: none;
   cursor: pointer;
   z-index: 9999;
   
   &:hover {
      svg path { fill: darken(white, 60%); }
      p { color: darken(white, 60%); }
   }
   
   svg {
      width: 12px;
      height: 12px;
      float: left;
      margin-right: 10px;
   }
   p {
      color: #2b2b2b;
      font-size: 12px;
      float: left;
      line-height: 11px;
   }
}
</style>
<body>
<div class="timer">
   <h3>JAVASCRIPT COUNTDOWN</h3>
   <div class="timer--clock">
      <div class="minutes-group clock-display-grp">
         <div class="first number-grp">
            <div class="number-grp-wrp">
               <div class="num num-0"><p>0</p></div>
               <div class="num num-1"><p>1</p></div>
               <div class="num num-2"><p>2</p></div>
               <div class="num num-3"><p>3</p></div>
               <div class="num num-4"><p>4</p></div>
               <div class="num num-5"><p>5</p></div>
               <div class="num num-6"><p>6</p></div>
               <div class="num num-7"><p>7</p></div>
               <div class="num num-8"><p>8</p></div>
               <div class="num num-9"><p>9</p></div>
            </div>
         </div>
         <div class="second number-grp">
            <div class="number-grp-wrp">
               <div class="num num-0"><p>0</p></div>
               <div class="num num-1"><p>1</p></div>
               <div class="num num-2"><p>2</p></div>
               <div class="num num-3"><p>3</p></div>
               <div class="num num-4"><p>4</p></div>
               <div class="num num-5"><p>5</p></div>
               <div class="num num-6"><p>6</p></div>
               <div class="num num-7"><p>7</p></div>
               <div class="num num-8"><p>8</p></div>
               <div class="num num-9"><p>9</p></div>
            </div>
         </div>
      </div>
      <div class="clock-separator"><p>:</p></div>
      <div class="seconds-group clock-display-grp">
         <div class="first number-grp">
            <div class="number-grp-wrp">
               <div class="num num-0"><p>0</p></div>
               <div class="num num-1"><p>1</p></div>
               <div class="num num-2"><p>2</p></div>
               <div class="num num-3"><p>3</p></div>
               <div class="num num-4"><p>4</p></div>
               <div class="num num-5"><p>5</p></div>
               <div class="num num-6"><p>6</p></div>
               <div class="num num-7"><p>7</p></div>
               <div class="num num-8"><p>8</p></div>
               <div class="num num-9"><p>9</p></div>
            </div>
         </div>
         <div class="second number-grp">
            <div class="number-grp-wrp">
               <div class="num num-0"><p>0</p></div>
               <div class="num num-1"><p>1</p></div>
               <div class="num num-2"><p>2</p></div>
               <div class="num num-3"><p>3</p></div>
               <div class="num num-4"><p>4</p></div>
               <div class="num num-5"><p>5</p></div>
               <div class="num num-6"><p>6</p></div>
               <div class="num num-7"><p>7</p></div>
               <div class="num num-8"><p>8</p></div>
               <div class="num num-9"><p>9</p></div>
            </div>
         </div>
      </div>
   </div>
   <h4>THE MOST SIMPLE WAY YOU WOULD HAVE FOUND.</h4>
</div>
<div class="reload">
   <svg version="1.1" id="Layer_1" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" x="0px" y="0px" viewBox="0 0 65 65" enable-background="new 0 0 65 65" xml:space="preserve">
      <path fill="#2b2b2b" d="M60.2,2.5c-2.3-0.2-4.4,1.5-4.6,3.9l-0.2,2.3c-6-5.6-13.8-8.7-22-8.7C15.5,0,0.9,14.5,0.9,32.4c0,17.9,14.5,32.4,32.4,32.4
         c12.3,0,23.5-6.9,29-17.9c1.1-2.1,0.2-4.7-1.9-5.7c-2.1-1.1-4.7-0.2-5.7,1.9c-4.1,8.1-12.3,13.2-21.4,13.2
         c-13.2,0-23.9-10.7-23.9-23.9c0-13.2,10.7-23.9,23.9-23.9c6.1,0,11.9,2.3,16.4,6.5l-3.4-0.3c-2.3-0.2-4.4,1.5-4.6,3.9
         c-0.2,2.3,1.5,4.4,3.9,4.6l12.7,1.1c0.1,0,0.3,0,0.4,0c1,0,2-0.3,2.7-1c0.9-0.7,1.4-1.8,1.5-2.9l1.2-13.4
         C64.3,4.7,62.5,2.7,60.2,2.5z"/>
    </svg>
   <p>NOW, WITH 12:34</p>
</div>
<script>
	TweenLite.defaultEase = Expo.easeOut;

initTimer("00:11"); // other ways --> "0:15" "03:5" "5:2"

var reloadBtn = document.querySelector('.reload');
var timerEl = document.querySelector('.timer');

function initTimer (t) {
   
   var self = this,
       timerEl = document.querySelector('.timer'),
       minutesGroupEl = timerEl.querySelector('.minutes-group'),
       secondsGroupEl = timerEl.querySelector('.seconds-group'),

       minutesGroup = {
          firstNum: minutesGroupEl.querySelector('.first'),
          secondNum: minutesGroupEl.querySelector('.second')
       },

       secondsGroup = {
          firstNum: secondsGroupEl.querySelector('.first'),
          secondNum: secondsGroupEl.querySelector('.second')
       };

   var time = {
      min: t.split(':')[0],
      sec: t.split(':')[1]
   };

   var timeNumbers;

   function updateTimer() {

      var timestr;
      var date = new Date();

      date.setHours(0);
      date.setMinutes(time.min);
      date.setSeconds(time.sec);

      var newDate = new Date(date.valueOf() - 1000);
      var temp = newDate.toTimeString().split(" ");
      var tempsplit = temp[0].split(':');

      time.min = tempsplit[1];
      time.sec = tempsplit[2];

      timestr = time.min + time.sec;
      timeNumbers = timestr.split('');
      updateTimerDisplay(timeNumbers);

      if(timestr === '0000')
         countdownFinished();

      if(timestr != '0000')
         setTimeout(updateTimer, 1000);

   }

   function updateTimerDisplay(arr) {

      animateNum(minutesGroup.firstNum, arr[0]);
      animateNum(minutesGroup.secondNum, arr[1]);
      animateNum(secondsGroup.firstNum, arr[2]);
      animateNum(secondsGroup.secondNum, arr[3]);

   }

   function animateNum (group, arrayValue) {

      TweenMax.killTweensOf(group.querySelector('.number-grp-wrp'));
      TweenMax.to(group.querySelector('.number-grp-wrp'), 1, {
         y: - group.querySelector('.num-' + arrayValue).offsetTop
      });

   }
   
   setTimeout(updateTimer, 1000);

}

function countdownFinished() {
   setTimeout(function () {
      TweenMax.set(reloadBtn, { scale: 0.8, display: 'block' });
      TweenMax.to(timerEl, 1, { opacity: 0.2 });
      TweenMax.to(reloadBtn, 0.5, { scale: 1, opacity: 1 }); 
   }, 1000);
}

reloadBtn.addEventListener('click', function () {
   TweenMax.to(this, 0.5, { opacity: 0, onComplete:
      function () { 
         reloadBtn.style.display= "none";
      } 
   });
   TweenMax.to(timerEl, 1, { opacity: 1 });
   initTimer("12:35");
});
</script>
</body>
</html>