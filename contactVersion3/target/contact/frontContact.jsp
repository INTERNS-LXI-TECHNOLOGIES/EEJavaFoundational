<html>
<head>
<style>
body{
    background-color: blueviolet;
}
    </style>
    </head>
<body>
    <form action="ContactApp" method="post">
        <h2>Enter The Name</h2>
        <input type="text" name="name" placeholder=" Name" >
        <h2>Enter The Contact Number</h2>
        <input type="text" name="contactNumber" placeholder=" Contact Number"  required>
        <br><br>
        <button type="submit">Save</button>
        <br><br>   
    </form>

    <form action="imgServlet" method="post" enctype="multipart/form-data">
        Select image to upload:
        <input type="file" name="image" id="image">
        <br><br>
        <input type="submit" value="Upload Image" >
    </form>


    </body>
</html>