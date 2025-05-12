<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% String myname=request.getParameter("name");
	String email=request.getParameter("email");
	String password=request.getParameter("password");
	String gender=request.getParameter("gender");
	%>
	
	<%= "person name is :-"+ myname %><br>
	<%= "person email is :-"+ email %><br>
	<%= "person password is :-"+ password %><br>
	<%= "person gender is :-"+ gender %><br>
	
</body>
</html>