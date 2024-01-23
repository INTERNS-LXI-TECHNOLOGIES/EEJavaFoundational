<html>
<head>
    <title>Result</title>
    <style>
        body {
            text-align: center;
            background-color: #ADD8E6;
        }
    </style>
	    <script>
        function goBack() {
            window.history.back();
        }
    </script>
</head>
<body>
    <%
        int first = Integer.parseInt(request.getParameter("first"));
        int second = Integer.parseInt(request.getParameter("second"));
		String operation = request.getParameter("select").trim();
		
		int result = 0;
		switch(operation)
		{
			case "addition":
				result = first + second;
				break;
				
			case "multiplication":
				result = first * second;
				break;
				
			case "substraction":
				result = first -second;
				break;
				
			case "division":
				if (second != 0) {
                    result = first / second;
                } 
				else 
				{
                    result = 0;
                }
                break;
				
			default:
			 result = 0;			
		}		
    %>
    <h2>Result:</h2>
    <p><%=first%> <%=operation%> <%=second%> = <%=result%></p>
	<button onclick="goBack()">GoBack</button>
</body>
</html>
