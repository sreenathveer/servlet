/**
 * 
 */
package com.sree.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.sree.services.*;
import com.sree.DAO.*;

/**
 * @author ptblr2015
 *
 */
@WebServlet(name = "UserUpdateServlet", urlPatterns = {"/UserUpdateServlet"})
public class UserUpdateServlet extends HttpServlet {
 
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        User emp = new User();
        emp.setUserId(Integer.parseInt(request.getParameter("empId")));
        emp.setName(request.getParameter("empName"));
        emp.setEmail(request.getParameter("phone"));
        emp.setEmail(request.getParameter("email"));
        emp.setCountry(request.getParameter("salary"));
        emp.setCountry(request.getParameter("designation"));
        UserDao eb = new UserDao();
        eb.update(emp);
        response.sendRedirect("User.jsp");       
    }
 
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
 
       @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
 
     @Override
    public String getServletInfo() {
        return "Short description";
    }
}
