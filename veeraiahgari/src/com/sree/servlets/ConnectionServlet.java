package com.sree.servlets;

import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class ConnectionServlet extends HttpServlet implements Servlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Connection con;
	PreparedStatement ps;
	public void init(ServletConfig c) throws ServletException{
		String driver = c.getInitParameter("driver");
		String url = c.getInitParameter("host");
		String user = c.getInitParameter("user");
		String pwd = c.getInitParameter("pass");
		String dbName = c.getInitParameter("dbName");
		try{
			Class.forName(driver).newInstance();  
            con = DriverManager  
                    .getConnection(url + dbName, user, pwd);
            //System.out.println("connected");
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
}
