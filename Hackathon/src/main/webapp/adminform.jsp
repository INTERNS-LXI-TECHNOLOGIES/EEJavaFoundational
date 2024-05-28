<html>
    <head>
        <title>this is admin form</title>
    </head>
    <body>
       
        <form action="adminservlet"  method="post" enctype="multipart/form-data">
            <label>enter name</label>
            <input type="text" name="name"><br><br>
            <label>enter email</label>
            <input type="email" name="email"><br><br>
            <label>enter password</label>
            <input type="password" name="password"><br><br>
            <label>photo</label>
            <input type="file" name="photo"><br><br>
            <input type="submit" name="submit">
        </form>
    </body> 
</html>