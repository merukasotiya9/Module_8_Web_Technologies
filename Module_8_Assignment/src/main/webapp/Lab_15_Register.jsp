<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration Page</title>
</head>
<body>
<h2>User Registration</h2>
    <form action="Lab_15_Register_Dispatcher" method="post">
        Name: <input type="text" name="name" placeholder="Enter your name" /><br/>
        Email: <input type="email" name="email" placeholder="Enter your email" /><br/>
        Password: <input type="password" name="password" placeholder="Enter your password" /><br/>
        <input type="submit" value="Register" />
    </form>
</body>
</html>