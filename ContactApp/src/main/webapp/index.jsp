<html>
<title>CONTACT APP</title>
<head><CENTER> <b>welcome to contact App</b></CENTER></head>
<body>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page isELIgnored="false"%>
 
<fmt:setLocale value="${param.lang}" />
<fmt:setBundle basename="messages" />
 
<html lang="${param.lang}">
<h2>
            <fmt:message key="label.chooseRequestLocale" />
        </h2>
 <p>
            <fmt:message key="label.requestLocaleContent" />
        </p>
 <p>
            <fmt:message key="label.changeLang" />
        </p>

<fmt:message key="label.welcome" />
<ul>
<li><a href="?lang=en">en</a></li>
 <li><a href="?lang=ml">ml</a></li>
 
 </ul>
<jsp:forward page="viewall" />

	<a href="viewall">skip</a></center>
</body>
</html>
