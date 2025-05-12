//1. Create a Java servlet program using both GenericServlet and HttpServlet and 
//compare their implementation. 
package com.Assignment;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/Lab_9_HttpServlet")
public class Lab_9_HttpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Lab_9_HttpServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException 
	{
		PrintWriter out=response.getWriter();
		String myfn=request.getParameter("firstname");
		String myln=request.getParameter("lastname");
		String myage=request.getParameter("age");
		String myemail=request.getParameter("email");
		
		out.println("FirstName Is :- "+myfn);
		out.println("LastName Is :- "+myln);
		out.println("Age Is :- "+myage);
		out.println("Email is :- "+myemail);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException 
	{
		
	}

}
