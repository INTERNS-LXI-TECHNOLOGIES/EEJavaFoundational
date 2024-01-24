<html>
<head>
    <title>Calculations</title>
</head>
<body>

<%  
    String num1 = request.getParameter("number1");
    String num2 = request.getParameter("number2");
    String operation = request.getParameter("operation");
    double result = 0;

    if (num1 != null && num2 != null) {
        try {
            if(operation.equals("add")){
                result = Double.parseDouble(num1) + Double.parseDouble(num2);
            }
            else if(operation.equals("sub")){
                result = Double.parseDouble(num1) - Double.parseDouble(num2);
            }
            else if(operation.equals("multi")){
                result = Double.parseDouble(num1) * Double.parseDouble(num2);
            }
            else if(operation.equals("div")){
                if (Double.parseDouble(num2) != 0) {
                    result = Double.parseDouble(num1) / Double.parseDouble(num2);
                }
            }
        }
        catch (NumberFormatException e) {
%>
            <p>Error: Invalid input. Please enter valid numbers.</p>
<%
        }
        out.println(result);
    }
    else {
%>
        <p>Error: Missing input. Please provide both numbers.</p>
<%
    }
%><br>
<a href="addvalues.html">go to back page</a>

</body>
</html>
