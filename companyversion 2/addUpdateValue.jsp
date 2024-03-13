<%@page import="com.divisosoft.version2.*"%>
<%@page import="java.util.*"%>
<html>
    <head>
        <title>add update values</title>
        <style>
            body{
                text-align: center;
                background-color: antiquewhite;
                margin: 0%;
            }
            header{
                background-color: rgb(251, 251, 250);
                padding: 1em;
            }
            label {
                display: block;
                margin: 10px 0;
                text-align: left;
            }
            input {
                width: 100%;
                padding: 8px;
                margin-bottom: 16px;
                box-sizing: border-box;
                border: 1px solid #ccc;
                border-radius: 4px;
            }
            #submit{
                background-color: brown;
            }
        </style>
    </head>
    <body>
       <%
       List<Company> company = (List<Company>)request.getAttribute("companydate"); 
        for(Company com : company)
        {
        %>
        <form action="companyDetails" method="post">
            <label>Enter new Company Name</label>
            <input type="text" value="<%=com.getName()%>" name="companyName" required><br><br>

            <label>Enter Company Address</label>
            <input type="text" value="<%=com.getAddress()%>" name="companyaddress" required><br><br>

            <label>Enter Location</label>
            <input type="text" value="<%=com.getLocation()%>" name="companyLocation" required><br><br>

            <label>Enter Phone</label>
            <input type="text" value="<%=com.getPhone()%>" name="companyPhone" required><br><br>

            <label>Enter CEO Name</label>
            <input type="text" value="<%=com.getCeoName()%>" name="companyCeo" required><br><br><br>

            <label>Re-enter Old Company Name</label>
            <input type="text" name="update" required>

            <input type="submit" name="action" id="submit" value="Update">
        </form>
        <% 
        }
        %>
    </body>
</html>