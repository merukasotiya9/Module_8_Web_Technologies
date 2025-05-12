//1. Create a Java servlet program using both GenericServlet and HttpServlet and 
//compare their implementation. 
package com.Assignment;
import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/Lab_9_GenericServlet")
public class Lab_9_GenericServlet extends GenericServlet {
	private static final long serialVersionUID = 1L;
       
    
	@Override
	public void service(ServletRequest request, ServletResponse response) 
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

}
