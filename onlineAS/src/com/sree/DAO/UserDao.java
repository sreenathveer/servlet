/**
 * 
 */
package com.sree.DAO;

import java.sql.Connection;  
import java.sql.DriverManager;  
import java.sql.PreparedStatement;  
import java.sql.ResultSet;  
import java.sql.SQLException;  
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;

import com.sree.services.*;
import com.sun.istack.internal.logging.Logger;


/**
 * @author ptblr2015
 *
 */
public class UserDao {
	
	private static final String url = "jdbc:mysql://localhost:3306/";  
	private static final String dbName = "sreenath";  
	//private static final String driver = "com.mysql.jdbc.Driver";  
	private static final String userName = "root";  
	private static final String password = "";
     
	public User getUser (int id) {
		Connection con = null;  
        PreparedStatement pst = null;  
	    ResultSet rs = null;
	    User user = null;
	    
	     
	    try{
	    	//Class.forName(driver).newInstance();  
	            con = DriverManager  
	                    .getConnection(url + dbName, userName, password);  
	         pst = con.prepareStatement("SELECT * FROM user WHERE id="+id);
	        rs = pst.executeQuery();
	        if (rs.next()) {
                user = new User();
                user.setUserId(rs.getInt(1));
                user.setName(rs.getString(2));
                user.setUserName(rs.getString(3));
                user.setPassword(rs.getString(4));
                user.setEmail(rs.getString(5));
                user.setDate(rs.getString(6));
                user.setCountry(rs.getString(7));
             }
	    } catch (SQLException e){
	        e.printStackTrace();
	    }
	    return user;  
	}
	public List<User> getUsers(){
		List<User> list = new ArrayList<>();
        Connection con = null;
        PreparedStatement pst = null;  
        ResultSet rs = null;
        try {
        	con = DriverManager  
                    .getConnection(url + dbName, userName, password);  
        	pst = con.prepareStatement("SELECT * FROM user");
        	rs = pst.executeQuery();
            while (rs.next()) {
            	User user = new User();
                user.setUserId(rs.getInt(1));
                user.setName(rs.getString(2));
                user.setUserName(rs.getString(3));
                user.setPassword(rs.getString(4));
                user.setEmail(rs.getString(5));
                user.setDate(rs.getString(6));
                user.setCountry(rs.getString(7));
                list.add(user);
            }
        } catch (SQLException ex) {
 
        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException ex) {
                
            }
        }
        return list;
    }
	  public void update(User e) {
	        Connection con = null;
	        PreparedStatement pst = null;
	        try {
	            //Class.forName(JDBC_DRIVER);
	        	con = DriverManager  
		                    .getConnection(url + dbName, userName, password);  
		        pst = con.prepareStatement("UPDATE user SET name=?, email=?, country=? WHERE id=?");
	            pst.setString(1, e.getName());
	            pst.setString(2, e.getEmail());
	            pst.setString(3, e.getCountry());
	            pst.setInt(4, e.getUserId());
	            pst.executeUpdate();
	        } catch (SQLException ex) {
	 
	        } finally {
	            try {
	                if (pst != null) {
	                    pst.close();
	                }
	                if (con != null) {
	                    con.close();
	                }
	            } catch (SQLException ex) {
	                Logger.getLogger(User.class.getName(), null).log(Level.SEVERE, null, ex);
	            }
	        }
	    }
	  public void delete(int id){
		  Connection con = null;
		  PreparedStatement pst = null;
		  try{
			  con = DriverManager.getConnection(url + dbName,userName,password);
			  pst = con.prepareStatement("DELETE From user where id=?");
			  pst.execute("DELETE FROM user WHERE id=" + String.valueOf(id));
	        } catch (SQLException ex) {
	 
	        } finally {
	            try {
	                if (pst != null) {
	                    pst.close();
	                }
	                if (con != null) {
	                    con.close();
	                }
	            } catch (SQLException ex) {
	                Logger.getLogger(User.class.getName(),null).log(Level.SEVERE, null, ex);
	            }
	        }
	  }
	
}
