/**
 * 
 */
package com.sree.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sree.DAO.RegisterDao;

/**
 * @author ptblr2015
 *
 */
public class RegisterServlet extends HttpServlet implements Servlet {
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		response.setContentType("text/html");    
        PrintWriter out = response.getWriter();    
          
        String n=request.getParameter("userName");    
        String p=request.getParameter("userPass");    
        String e=request.getParameter("userEmail"); 
        String c=request.getParameter("userCountry");
          
        HttpSession session = request.getSession(false);  
        if(session!=null)  
        session.setAttribute("name", n);  
  
        if(!RegisterDao.validate(e)){  
        	RegisterDao.register(n,p,e,c);
            RequestDispatcher rd=request.getRequestDispatcher("index.jsp");    
            rd.forward(request,response);    
        }    
        else{    
        	
            out.print("<p style=\"color:red\">Useremail already exist</p>");    
            RequestDispatcher rd=request.getRequestDispatcher("register.jsp");    
            rd.forward(request,response);    
        }    
  
        out.close();  
		
	}

}
