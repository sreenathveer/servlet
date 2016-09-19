package com.sree.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HomeServlet extends HttpServlet implements Servlet {
	
	/**
	 * This is to get the data from the browser
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response)throws IOException, ServletException{
			RequestDispatcher rd= request.getRequestDispatcher("cs");
			rd.include(request,response);
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			out.println("<html><body><h3>Welcome to Servlets</h3></body></html>");
	}
	 
}
