<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page isELIgnored="false" %>
<fmt:setLocale value="${param.lang}" />
<fmt:setBundle basename="messages"/>

<html lang="${param.lang}">
		<head>
			<title> Index page of Contact App </title>
			 <link rel="stylesheet" type="css" href="jsp/styles.css">
			 <script>
						
						var beep=new Audio();
						beep.src="sound1.mp3";

						</script>
		</head>	
		<body style="background-color:#d9e6f2"> 
			<h3 align="center">CONTACT APPLICATION</h3>
					<fmt:message key="welcome" />
				</br>
					<center><a href="View" ><img src="images/contacts.png" height="150px"; width="140px";></a>

					<h1>	 <fmt:message key="label.chooseRequestLocale" /></h1>
						<h4> <fmt:message key="label.requestLocaleContent" /></h4>
						<h3> <fmt:message key="label.changeLang" /></h3>
				

<ul>
		<li><a href="?lang=en"><fmt:message key="label.lang.en" /></a></li>
		<li><a href="?lang=ml"><fmt:message key="label.lang.de" /></a></li>
		<li><a href="?lang=fr"><fmt:message key="label.lang.fr" /></a></li>
		
	</ul>

					</center>
			   <nav>
					
					<button  onclick="beep.play()">play</button></td></nav>
					
		</body>
</html>