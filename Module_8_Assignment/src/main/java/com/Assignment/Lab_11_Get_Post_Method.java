//1. Write a program using HttpServlet to handle HTTP-specific requests like GET and POST.
package com.Assignment;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Lab_11_Get_Post_Method")
public class Lab_11_Get_Post_Method extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Lab_11_Get_Post_Method() {
        super();
            }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException 
	{
		String myname=request.getParameter("name");
		String myemail=request.getParameter("email");
		String mypass=request.getParameter("password");
		String gender=request.getParameter("gender");
		
		PrintWriter out=response.getWriter();
		out.println("My Name is :- "+myname);
		out.println("My Email is :- "+myemail);
		out.println("My Password is :- "+mypass);
		out.println("My Gender is :- "+gender);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException 
	{
		response.setContentType("text/html");
		request.getRequestDispatcher("login.jsp").forward(request, response);
	}

}
