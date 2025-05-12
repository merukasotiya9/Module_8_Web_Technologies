//1. Use ServletContext to share data across multiple servlets. 
//2. Create a web application listener that logs application start and stop events.
package com.Assignment;

import java.io.IOException;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Lab_14_servletContext extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest reqest, HttpServletResponse response) 
			throws ServletException, IOException 
	{
		ServletContext context=getServletContext();
		response.getWriter().write("<html><body>");
		response.getWriter().write("<h2>App Name Is :-</h2>"+context.getInitParameter("App_Name"));
		response.getWriter().write("</html></body>");
		System.out.println("config :- "+getServletConfig());
		System.out.println("Context :- "+getServletContext());
	}
}
