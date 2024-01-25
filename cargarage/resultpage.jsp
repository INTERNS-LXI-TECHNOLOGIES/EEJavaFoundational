<%@ page import="com.divisosoft.car.Tyre"%>
<html>
<head>
<title>CAR DETAILS</title>
</head>
<body>
<h2>Tyre Details</h2>
<% 
    Tyre[] retrievedTyreArray = (Tyre[]) request.getAttribute("tyreArray");
    if (retrievedTyreArray != null) {
        for (int i = 0; i < 4; i++) { 
%>
            <p>Debug - Tyre Details <%= i + 1 %> Size: <%= retrievedTyreArray[i].getSize() %></p>
<% 
        }
    } else {
%>
        <p>Debug - Tyre Array is null</p>
<% } %>

</body>
</html>


