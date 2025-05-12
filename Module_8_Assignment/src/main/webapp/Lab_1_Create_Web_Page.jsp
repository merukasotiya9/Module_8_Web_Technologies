<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>First-Program</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 20px;
        }
        nav a {
            margin-right: 15px;
            text-decoration: none;
            color: #0077cc;
        }
        table {
            width: 100%;
            border-collapse: collapse;
            margin-top: 15px;
        }
        table, th, td {
            border: 1px solid #ccc;
            padding: 8px;
        }
        form {
            margin-top: 20px;
        }
    </style>

</head>
<body>

<!-- A navigation menu with anchor tags.  -->
<!-- Navigation Menu -->
    <nav>
        <a href="#Home">Home</a>
        <a href="#Contact">Contact</a>
        <a href="#About Us">About Us</a>
        <a href="#lists">Lists</a>
        <a href="#Login">Login</a>
    </nav>

<!-- A form with input fields, labels, and a submit button.  -->
    <!-- Form Section -->
    <h2 id="form">User Form</h2>
    <form>
        <label for="name">Enter Your Name:</label>
        <input type="text" id="name" name="name" required><br><br>

        <label for="email">Enter Your Email:</label>
        <input type="email" id="email" name="email" required><br><br>

        <button type="submit">Submit</button>
    </form>
<!-- A table that displays user data.  -->
    <!-- Table Section -->
    <h2 id="table">User Data Table</h2>
    <table>
        <thead>
            <tr>
                <th>Name</th>
                <th>Email</th>
                <th>City</th>
            </tr>
        </thead>
        <tbody>
            <tr>
                <td>Zeel Gaadhe</td>
                <td>Zeelgadhe@gmail.com</td>
                <td>Ahemdabad</td>
            </tr>
            <tr>
                <td>Meru Kasotiya</td>
                <td>mkbharwad@gmail.com</td>
                <td>Dholka</td>
            </tr>
        </tbody>
    </table>

<!-- Images with appropriate alt text.  -->
    <!-- Images Section -->
    <h2 id="images">Images</h2>
    <img src="data:image/jpeg;base64,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" alt="Placeholder image of a product">
    <img src="data:image/jpeg;base64,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" alt="Thumbnail of a user profile">


<!-- Both ordered and unordered lists.  -->
    <!-- Lists Section -->
    <h2 id="lists">Lists</h2>
    <h3>Ordered List - Steps to Register</h3>
    <ol>
        <li>Enter your name</li>
        <li>Provide your email</li>
        <li>Click submit</li>
    </ol>

    <h3>Unordered List - Features</h3>
    <ul>
        <li>Responsive design</li>
        <li>Fast performance</li>
        <li>User-friendly interface</li>
    </ul>


</body>
</html>