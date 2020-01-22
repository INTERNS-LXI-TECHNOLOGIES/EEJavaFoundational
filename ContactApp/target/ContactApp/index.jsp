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
<% response.sendRedirect("viewall"); %>

	<a href="viewall">skip</a></center>
</body>
</html>
