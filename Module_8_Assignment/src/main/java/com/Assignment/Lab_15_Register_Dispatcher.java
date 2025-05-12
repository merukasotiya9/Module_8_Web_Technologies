//1. Create a registration form in JSP. 
//2. Send form data to a servlet, process it, and forward the response back to a JSP using 
//RequestDispatcher. 
package com.Assignment;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/Lab_15_Register_Dispatcher")
public class Lab_15_Register_Dispatcher extends HttpServlet {
	private static final long serialVersionUID = 1L;
     public Lab_15_Register_Dispatcher()
     {
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
		String myname=request.getParameter("name");
		String mymail=request.getParameter("email");
		String mypass=request.getParameter("password");
		
		request.setAttribute("Username", myname);
		request.setAttribute("Email", mymail);
		request.setAttribute("password", mypass);
		
		response.setContentType("text/html");
		request.getRequestDispatcher("registersucces.jsp").forward(request, response);	
	}

}
