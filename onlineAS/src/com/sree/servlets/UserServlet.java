/**
 * 
 */
package com.sree.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sree.DAO.UserDao;

/**
 * @author ptblr2015
 *
 */
public class UserServlet extends HttpServlet implements Servlet{
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		HttpSession session = request.getSession(false); 
		String name = (String) session.getAttribute("name");
		
		 RequestDispatcher rd=request.getRequestDispatcher("User.jsp");    
         rd.include(request,response);   
		
	}

}
