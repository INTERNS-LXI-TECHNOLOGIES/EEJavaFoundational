<!DOCTYPE html>
<html>
<head>
    <title>Create Company</title>
    <style>
        table {
            border-collapse: collapse;
            width: 50%;
            margin: 0 auto;
        }

        th, td {
            padding: 8px;
            text-align: left;
            border-bottom: 1px solid #ddd;
        }
    </style>
</head>
<body>
    <h1>Create User</h1>
   <form action="/DemoApplication/createCompanyController" method="post">

        <table>
            <tr>
                <td><label for="company_name">CompanyName:</label></td>
                <td><input type="text" id="company_name" name="company_name" required></td>
            </tr>
            <tr>
                <td><label for="employee_count">EmployeeCount:</label></td>
                <td><input type="text" id="employee_count" name="employee_count" required></td>
            </tr>
            <tr>
                 <td><label for="location">Location:</label></td>
                   <td><input type="text" id="location" name="location" required></td>
                        </tr>
                        <tr>

                       <td><label for="ceo_name">CeoName:</label></td>
                        <td><input type="text" id="ceo_name" name="ceo_name" required></td>
                         </tr>

                       <tr>
                      <td><label for="phone_number">PhoneNumber:</label></td>
                      <td><input type="text" id="phone_number" name="phone_number" required></td>
                       </tr>
        </table>
        <br>
        <input type="submit" value="Create Company">
    </form>
</body>
</html>

