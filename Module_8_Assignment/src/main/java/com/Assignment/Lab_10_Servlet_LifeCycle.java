//1. Write a servlet program and override all life cycle methods to log messages when each 
//method is called.
package com.Assignment;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/Lab_9_Servlet_LifeCycle")
public class Lab_10_Servlet_LifeCycle extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Lab_10_Servlet_LifeCycle() 
    {
        super();
    }

	public void init(jakarta.servlet.ServletConfig config) throws ServletException 
	{
		System.out.println("Servlet Object will be Intialized by invoking init() method.");
	}

	protected void service(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException 
	{
		System.out.println("It will handle the client request , in this phase service() method Invoked.");
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException 
	{
        System.out.println("doGet() called - Handling GET request.");
        PrintWriter out=response.getWriter();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException 
	{
		 System.out.println("doPost() called - Handling POST request.");
	       response.setContentType("text/html");
	       request.getRequestDispatcher("");
	}
//	public void destroy() 
//	{
//		System.out.println("When the server shut down , destroy() method will be executed & servlet object will be deleted..");
//	}

}
