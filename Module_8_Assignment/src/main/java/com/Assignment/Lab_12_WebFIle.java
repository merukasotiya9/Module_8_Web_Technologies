//1. Create a servlet and configure it in web.xml for deployment.
package com.Assignment;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//@WebServlet("/Lab_12_WebFIle")
public class Lab_12_WebFIle extends HttpServlet {
	private static final long serialVersionUID = 1L;
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
    		throws ServletException, IOException 
    {
    	PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h2>Welcome to the Java Servlet configured via web.xml!</h2>");
        out.println("</html></body>");
        
        out.println(request.getParameter("username"));
        out.println(request.getParameter("email"));
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException 
	{
		
	}

}
