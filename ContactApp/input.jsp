<%@ page import = "com.lxisoft.app.Contact"%>
<%@ page import = " java.util.*"%>

<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Contacts</title>
  <style>
    .container {
      max-width: 800px;
      margin: 0 auto;
      padding: 20px;
      box-sizing: border-box;
      box-shadow: 0 2px 5px rgba(0, 0, 0, 0.3);
    }

    h1 {
      text-align: center;
      margin-bottom: 20px;
    }

    .dropdown {
      position: relative;
      display: inline-block;
    }

    .dropdown-content {
      display: none;
      position: absolute;
      background-color: #f9f9f9;
      min-width: 190px;
      box-shadow: 0px 8px 16px 0px rgba(0, 0, 0, 0.2);
      z-index: 1;
    }

    .dropdown-content ul {
      list-style-type: none;
      padding: 0;
    }

    .dropdown-content ul li a {
      color: black;
      padding: 8px 10px;
      text-decoration: none;
      display: block;
    }

    .dropdown-content ul li a:hover {
      background-color: #f3f3f3;
    }

    .dropdown:hover .dropdown-content {
      display: block;
    }

    .contacts {
      list-style-type: none;
      padding: 0;
    }

    .contact {
      padding: 14px;
      border-bottom: 1px solid #ccc;
      display: flex;
      align-items: center;
      justify-content: space-between;
    }

    .contact .name {
      flex: 1;
      margin-right: 20px;
      font-weight: bold;
    }

    .container input[type="text"],
    .container input[type="tel"] {
      width: calc(100% - 24px);
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
    }

    .add-button:hover {
      background-color: #0069d9;
    }

    .search-bar {
      display: flex;
      margin-bottom: 20px;
    }

    .search-bar input[type="text"] {
      width: 100%;
      padding: 10px;
      border: 1px solid #ccc;
      border-radius: 5px;
      box-sizing: border-box;
      color: #333;
    }

    .search-bar button {
      padding: 10px;
      background-color: #007bff;
      color: #fff;
      border: none;
      border-radius: 0 5px 5px 0;
      cursor: pointer;
      height: 40px;
    }

    .search-bar button:hover {
      background-color: #0069d9;
    }

    /* Style for the "More" button */
    #more {
      background-color: transparent;
      border: none;
      cursor: pointer;
      font-size: 24px;
      margin-right: 8px;
      color: dodgerblue;
    }

    #more:hover {
      color: darkblue;
    }

  </style>
</head>
<body>
<h1>Contacts</h1>
<div class="container">
  <div class="dropdown">
    <button id="more">+</button>
    <div class="dropdown-content">
      <ul>
        <li><a href="ReadServlet">Show Created Contacts</a></li>
        <li><a href="ContactServlet?action=edit">Edit Contact</a></li>
        <li><a href="ContactServlet?action=delete">Delete Contact</a></li>
      </ul>
    </div>
  </div>
  <div class="search-bar">
    <input type="text" id="search-input" placeholder="Search contacts...">
    <button id="search-button">Search</button>
  </div>
  <ul class="contacts">
    <li class="contact">
      <span class="name">Afsal lxi</span>
      <span class="phone">+91 9961695788</span>
    </li>
    <li class="contact">
      <span class="name">ibrahim lxi</span>
      <span class="phone">+91 8925451512</span>
    </li>
    <li class="contact">
      <span class="name">fairuz lxi</span>
      <span class="phone">+91 8086057721</span>
    </li>
    <li class="contact">
      <span class="name">yedhu lxi</span>
      <span class="phone">+91 7012530929</span>
    </li>
    <li class="contact">
      <span class="name">kiran lxi</span>
      <span class="phone">+91 7736713112</span>
    </li>
    <li class="contact">
      <span class="name">Nimmy  lxi</span>
      <span class="phone">+91 7736282172</span>
    </li>
    <li class="contact">
      <span class="name">jayaram lxi</span>
      <span class="phone">+91 8281964760</span>
    </li>
    <table border="2">

  </table>
  <form action="AddContact.jsp" method="post">
    <input type="submit" value="+ Add Contact">
  </form>
</div>

<script>
  const searchInput = document.getElementById('search-input');
  const searchButton = document.getElementById('search-button');

  searchButton.addEventListener('click', function() {
    const searchTerm = searchInput.value.toLowerCase();
    const contacts = document.querySelectorAll('.contact');

    contacts.forEach(function(contact) {
      const name = contact.querySelector('.name').textContent.toLowerCase();
      const phone = contact.querySelector('.phone').textContent.toLowerCase();

      if (name.includes(searchTerm) || phone.includes(searchTerm)) {
        contact.style.display = 'block';
      } else {
        contact.style.display = 'none';
      }
    });
  });
</script>

</body>
</html>
