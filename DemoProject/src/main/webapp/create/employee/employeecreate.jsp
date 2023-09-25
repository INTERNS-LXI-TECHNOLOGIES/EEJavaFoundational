<!DOCTYPE html>
<html>
<head>
    <title>Create Employee</title>
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
   <form action="/DemoProject/EmployeeController" method="post">

        <table>
            <tr>
                <td><label for="employee_id">EmployeeId:</label></td>
                <td><input type="text" id="employee_id" name="employee_id" required></td>
            </tr>
                           
        </table>
        <br>
        <input type="submit" value="Create Employee">
    </form>
</body>
</html>