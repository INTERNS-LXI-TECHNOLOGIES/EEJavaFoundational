<html>
    <head>
        <title>Welcome You</title>
        </head>
<body>
<h1>School</h1>
<br>
<form action="Upload" method="post" enctype="multipart/form-data">
    <title>Enter the Name</title>
<input type="text" name="name">
<br><br>
<title>Upload the image</title>
<input type="file" name="image">
<br>
<input type="submit" value="Upload">
</form>

<form action="Download" method="get" enctype="multipart/form-data">
    <title>Enter the Name</title>
<input type="text" name="id">

<input type="submit" value="Download">
</form>
</body>
</html>
