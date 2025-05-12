//1. Write a servlet that uses ServletConfig to fetch initialization parameters. 
package com.Assignment;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;


//@WebServlet("/Lab_12_Servletconfig")
public class Lab_12_Servletconfig extends HttpServlet 
{
	ServletConfig config=null;
	private static final long serialVersionUID = 1L;
    
    public Lab_12_Servletconfig() 
    {
        super();
    }

	
	public void init(ServletConfig config) throws ServletException 
	{
		this.config=config;
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException 
	{
		ServletConfig config=getServletConfig();
		response.getWriter().write(getInitParameter("Name"));
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException 
	{
		
	}

}
