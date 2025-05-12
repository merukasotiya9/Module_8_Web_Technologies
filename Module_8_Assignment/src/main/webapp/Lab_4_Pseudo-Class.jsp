<!-- 1. Create a navigation menu and use pseudo-classes to:  -->
<!-- o Change the color of links on hover.  -->
<!-- o Style form inputs when they are focused. -->

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
  <title>Navigation Menu with Pseudo-classes</title>
  <style>
    /* Basic navigation styling */
    nav {
      background-color: #333;
      padding: 10px;
    }

    nav ul {
      list-style-type: none;
      margin: 0;
      padding: 0;
      display: flex;
    }

    nav ul li {
      margin-right: 20px;
    }

    nav ul li a {
      color: white;
      text-decoration: none;
      padding: 5px 10px;
      transition: color 0.3s ease;
    }

    /* Pseudo-class: Change link color on hover */
    nav ul li a:hover {
      color: #ff9900;
    }

    /* Style form */
    form {
      margin-top: 20px;
    }

    input[type="text"],
    input[type="email"],
    input[type="password"] {
      padding: 8px;
      margin-bottom: 10px;
      border: 1px solid #ccc;
      border-radius: 4px;
    }

    /* Pseudo-class: Style input when focused */
    input:focus {
      border-color: #ff9900;
      outline: none;
      background-color: #fefbe9;
    }
  </style>
  </head>
<body>

  <!-- Navigation Menu -->
  <nav>
    <ul>
      <li><a href="#">Home</a></li>
      <li><a href="#">About</a></li>
      <li><a href="#">Services</a></li>
      <li><a href="#">Contact</a></li>
    </ul>
  </nav>

  <!-- Form -->
  <form>
    <label for="name">Name:</label><br>
    <input type="text" id="name" name="name" placeholder="enter your name"><br>

    <label for="email">Email:</label><br>
    <input type="email" id="email" name="email" placeholder="enter your email"><br>

    <label for="password">Password:</label><br>
    <input type="password" id="password" name="password" placeholder="enter your password"><br>

    <input type="submit" value="Submit">
  </form>
</body>
</html>
