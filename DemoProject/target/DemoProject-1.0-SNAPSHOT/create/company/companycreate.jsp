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
   <form action="/DemoProject/CompanyController" method="post">

        <table>
            <tr>
                <td><label for="company_name">CompanyName:</label></td>
                <td><input type="text" id="company_name" name="company_name" required></td>
            </tr>
                           
        </table>
        <br>
        <input type="submit" value="Create Company">
    </form>
</body>
</html>