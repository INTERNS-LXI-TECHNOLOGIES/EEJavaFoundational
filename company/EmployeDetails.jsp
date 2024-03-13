<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Company Information</title>
    <style>
        body {
            background-image: url("Screenshot 2024-02-07 162243.png");
            background-size: cover;
            margin: 0;
            font-family: Arial, sans-serif;
        }

        h1 {
            color: white;
        }

        label {
            color: white;
            display: block;
            margin-top: 10px;
        }

        input, select {
            margin-bottom: 10px;
            padding: 5px;
            width: 100%;
        }

        form {
            max-width: 600px;
            margin: 50px auto;
            padding: 20px;
            background: rgba(0, 0, 0, 0.5);
            border-radius: 10px;
        }

        input[type="submit"] {
            background-color: #4CAF50;
            color: white;
            padding: 10px 15px;
            border: none;
            border-radius: 5px;
            cursor: pointer;
        }
    </style>
</head>
<body>
<form action="EmployeServlet" method="post">
        <h1>Employee Information</h1>

        <label for="employeeName">Name of employee:</label>
        <input type="text" id="employeeName" name="employeeName">

        <label for="employeeId">Employee ID:</label>
        <input type="text" id="employeeId" name="employeeId">

        <label for="employeeNumber">Employee contact number:</label>
        <input type="text" id="employeeNumber" name="employeeNumber">

        <label for="employeeDob">Employee DOB:</label>
        <input type="date" id="employeeDob" name="employeeDob">

        <label for="employeeAddress">Employee address:</label>
        <input type="text" id="employeeAddress" name="employeeAddress">

        <select name="selectt">
            <option value="create">Create</option>
            <option value="read">Read</option>
            <option value="update">Update</option>
            <option value="delete">Delete</option>
            <option value="nun">Nun</option>
        </select>

        <br>
        <input type="submit" value="Update">
    </form>
</body>
