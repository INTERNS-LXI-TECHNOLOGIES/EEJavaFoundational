<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8"  pageEncoding="UTF-8"%>

 
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; UTF-8">
    <title>Example</title>
</head>
<fmt:requestEncoding value = "UTF-8" />
<fmt:setLocale value="mal"/>
<fmt:setBundle basename="text"/>
<body>
	സ്വാഗതം
    <h2>
        <fmt:message key="welcome" />
    </h2>
    </form>
</body>
</html>