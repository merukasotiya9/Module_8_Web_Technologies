package com.Assignment;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Lab_13_RequestDispatcher")
public class Lab_13_RequestDispatcher extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Lab_13_RequestDispatcher() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException
	{
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException 
	{

		String name=request.getParameter("username");
		String pass=request.getParameter("password");
		
		if(name.equals("meru") && pass.equals("meru123"))
		{
			response.setContentType("text/html");
			request.getRequestDispatcher("Lab_13_Welcome.jsp").forward(request, response);
		}
		else
		{
			response.setContentType("text/html");
			request.getRequestDispatcher("Lab_13_error.jsp").forward(request, response);
		}
		
		
	}

}
