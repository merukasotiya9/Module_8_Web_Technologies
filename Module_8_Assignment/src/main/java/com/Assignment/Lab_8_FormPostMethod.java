//1. Write a simple Java servlet that accepts parameters from a user and displays a response. 
package com.Assignment;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Lab_8_FormPostMethod")
public class Lab_8_FormPostMethod extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	public Lab_8_FormPostMethod() {
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
		String myemail=request.getParameter("email");
		String mypass=request.getParameter("password");
		String gender=request.getParameter("password");
		
		PrintWriter out=response.getWriter();
		out.println(myname);
		out.println(myemail);
		out.println(mypass);
		out.println(gender);
		
			response.setContentType("text/html");
			request.getRequestDispatcher("login.jsp").forward(request, response);	
	}

}
