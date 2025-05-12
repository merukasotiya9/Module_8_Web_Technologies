package com.Assignment;


import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;



@WebServlet("/CGI_Information")
public class CGI_Information extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public CGI_Information() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException 
	{
		PrintWriter out=response.getWriter();
		String myname=request.getParameter("name");
		String myemail=request.getParameter("email");
		String mypass=request.getParameter("password");

		
		out.println("<h1>Login Successfully..</h1>");
		out.println("Name :- "+myname+"\n");
		out.println("Email :- "+myemail+"\n");
		out.println("password :- "+mypass+"\n");

	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException
	{
		
	}

}
