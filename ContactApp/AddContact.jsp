<!DOCTYPE html>
<html>
<head>
  <title>Add Contact</title>
  <style>
    body {
      font-family: Arial, sans-serif;
      margin: 0;
      padding: 0;
      background-color: #f2f2f2;
    }

    .container {
      width: 600px; /* Adjusted width for desktop */
      margin: 50px auto;
      background-color: #fff;
      padding: 20px;
      border-radius: 5px;
      box-shadow: 0 2px 5px rgba(0, 0, 0, 0.3);
    }

    .container h1 {
      text-align: center;
      margin-bottom: 20px;
      color: #333;
    }

    .container label {
      display: block;
      margin-bottom: 5px;
      color: #333;
    }

    .container input[type="text"],
    .container input[type="tel"],
    .container input[type="file"] {
      width: 100%;
      padding: 10px;
      margin-bottom: 10px;
      border: 1px solid #ccc;
      border-radius: 5px;
      box-sizing: border-box;
      color: #333;
    }

    .container input[type="submit"] {
      width: 100%;
      padding: 10px;
      background-color: #007bff;
      color: #fff;
      border: none;
      border-radius: 5px;
      cursor: pointer;
    }

    .container input[type="submit"]:hover {
      background-color: #0069d9;
    }

    #imageContainer {
      width: 150px;
      height: 150px;
      margin: 0 auto 20px;
      border-radius: 50%;
      overflow: hidden;
    }

    #profileImage {
      width: 100%;
      height: 100%;
      object-fit: cover;
    }
  </style>
</head>
<body>

  <div class="container">
    <h1>Add Contact</h1>
    <form action="ContactServlet" method="post" >
      <label for="firstName">First Name:</label>
      <input type="text" id="firstName" name="firstName"><br><br>

      <label for="lastName">Last Name:</label>
      <input type="text" id="lastName" name="lastName"><br><br>

      <label for="phoneNumber">Phone Number:</label>
      <input type="tel" id="phoneNumber" name="phoneNumber" inputmode="numeric"><br><br>

      <label for="profilePhoto">Profile Photo:</label>
      <input type="file" id="profilePhoto" name="profilePhoto" onchange="previewImage(event)"><br><br>

      <div id="imageContainer">
        <img id="profileImage" src="#" alt="Preview" style="display: none;">
      </div><br><br>

      <input type="submit" value="Save" id="save-button">
    </form>
  </div>
<script>
  function previewImage(event) {
    var reader = new FileReader();
    reader.onload = function() {
      var output = document.getElementById('profileImage');
      output.src = reader.result;
      output.style.display = "block";
    }
    reader.readAsDataURL(event.target.files[0]);
  }

  document.querySelector('#save-button').addEventListener('click', function() {
    alert('Contact saved successfully!');
  });
</script>
</body>
</html>
