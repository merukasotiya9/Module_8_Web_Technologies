<!-- 1. Create a Java servlet program using both GenericServlet and HttpServlet and  -->
<!-- compare their implementation.  -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Generic Servlet Form</h1>
<form action="Lab_9_HttpServlet" method="get">
<input type="text" name="firstname" placeholder="Enter your firstname"><br>
<input type="text" name="lastname" placeholder="Enter your lastname"><br>
<input type="text" name="age" placeholder="Enter your age"><br>
<input type="text" name="email" placeholder="Enter your Email"><br>
<input type="submit" value="login">
</form>
</body>
</html>