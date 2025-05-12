//1. CREATE A JAVA SERVLET THAT: 
//O DISPLAYS THE HTTP REQUEST HEADERS. 
//O SENDS AN HTTP RESPONSE WITH CUSTOM HEADERS. 

package com.Assignment;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
@WebServlet("/Lab_5_creat_servlet")
public class Lab_5_creat_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	    @Override
	    protected void doGet(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {

	        // Set custom response header
	        response.setHeader("X-Custom-Header", "MyCustomValue");

	        // Set response content type
	        response.setContentType("text/html");

	        PrintWriter out = response.getWriter();
	        out.println("<html><body>");
	        out.println("<h2>HTTP Request Headers:</h2>");
	        out.println("<ul>");

	        // Display all request headers
	        Enumeration<String> headerNames = request.getHeaderNames();
	        while (headerNames.hasMoreElements()) {
	            String header = headerNames.nextElement();
	            String value = request.getHeader(header);
	            out.println("<li><strong>" + header + ":</strong> " + value + "</li>");
	        }

	        out.println("</ul>");
	        out.println("</body></html>");
	    }
	
}