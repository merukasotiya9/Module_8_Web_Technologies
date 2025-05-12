<!--1. Write a program using HttpServlet to handle HTTP-specific requests like GET and POST. -->

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration Form</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f2f2f2;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }

        .register-container {
            background-color: #fff;
            padding: 30px 35px;
            border-radius: 10px;
            box-shadow: 0 0 15px rgba(0,0,0,0.1);
            width: 400px;
        }

        h2 {
            text-align: center;
            margin-bottom: 20px;
            color: #333;
        }

        input[type="text"], input[type="email"], input[type="password"], input[type="date"], select {
            width: 100%;
            padding: 10px;
            margin: 8px 0 16px 0;
            border: 1px solid #ccc;
            border-radius: 4px;
            box-sizing: border-box;
        }

        label {
            font-weight: bold;
        }

        .gender-options {
            margin-bottom: 16px;
        }

        .gender-options input {
            margin-right: 5px;
        }

        .checkbox {
            margin-bottom: 16px;
        }

        input[type="submit"] {
            width: 100%;
            background-color: #007BFF;
            color: white;
            padding: 12px;
            border: none;
            border-radius: 4px;
            cursor: pointer;
            font-size: 16px;
        }

        input[type="submit"]:hover {
            background-color: #0056b3;
        }
    </style></head>
<body>
<div class="register-container">
    <h2>Registration Form</h2>
    <form method="get" action="Lab_11_Get_Post_Method">
        <label for="name">Full Name:</label>
        <input type="text" name="name" placeholder="Enter your full name" required />

        <label for="email">Email:</label>
        <input type="email" name="email" placeholder="Enter your email" required />

        <label for="password">Password:</label>
        <input type="password" name="password" placeholder="Create a password" required />

        
        <label>Gender:</label>
        <div class="gender-options">
            <input type="radio" name="gender" value="Male" required /> Male
            <input type="radio" name="gender" value="Female" /> Female
            <input type="radio" name="gender" value="Other" /> Other
        </div>

        <input type="submit" value="Register" />
    </form>
</div>

</body>
</html>