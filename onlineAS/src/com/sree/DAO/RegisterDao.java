/**
 * 
 */
package com.sree.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Statement;

/**
 * @author ptblr2015
 *
 */
public class RegisterDao {

	 public static boolean validate(String email) {          
	        boolean status = false;  
	        Connection conn = null;  
	        PreparedStatement pst = null;  
	        ResultSet rs = null;  
	  
	        String url = "jdbc:mysql://localhost:3306/";  
	        String dbName = "sreenath";  
	        String driver = "com.mysql.jdbc.Driver";  
	        String userName = "root";  
	        String password = "";  
	        try {  
	            Class.forName(driver).newInstance();  
	            conn = DriverManager  
	                    .getConnection(url + dbName, userName, password);  
	  
	            pst = conn  
	                    .prepareStatement("select email from user where email=?");  
	            pst.setString(1, email);  
	  
	            rs = pst.executeQuery();  
	            status = rs.next(); 
	        } catch (Exception e) {  
	            System.out.println(e);  
	        } finally {  
	            if (conn != null) {  
	                try {  
	                    conn.close();  
	                } catch (SQLException e) {  
	                    e.printStackTrace();  
	                }  
	            }  
	            if (pst != null) {  
	                try {  
	                    pst.close();  
	                } catch (SQLException e) {  
	                    e.printStackTrace();  
	                }  
	            }  
	            if (rs != null) {  
	                try {  
	                    rs.close();  
	                } catch (SQLException e) {  
	                    e.printStackTrace();  
	                }  
	            }  
	        }  
	        return status;  
	    }
	 public static int register(String name,String password,String email,String country){
		 
	        Connection conn = null;  
	        PreparedStatement pst = null;  
	        ResultSet rs = null;
	        int last_inserted_id = 0;
	  
	        String url = "jdbc:mysql://localhost:3306/";  
	        String dbName = "sreenath";  
	        String driver = "com.mysql.jdbc.Driver";  
	        String userName = "root";  
	        String pass = "";  
	        try {  
	            Class.forName(driver).newInstance();  
	            conn = DriverManager  
	                    .getConnection(url + dbName, userName, pass);  
	  
	            pst = conn  
	                    .prepareStatement("insert into user(name,password,email,country)  values(?,?,?,?)",Statement.RETURN_GENERATED_KEYS);  
	            pst.setString(1, name);
	            pst.setString(2, password);
	            pst.setString(3, email);
	            pst.setString(4, country);
	            pst.execute();
	            rs = pst.getGeneratedKeys();
	            System.out.println ("user: " + rs.next());
                if(rs.next())
                {
                     last_inserted_id = rs.getInt(1);
                }
                else {
                	 last_inserted_id = 0;
                }
	  
	        } catch (Exception e) {  
	            System.out.println(e);  
	        } finally {  
	            if (conn != null) {  
	                try {  
	                    conn.close();  
	                } catch (SQLException e) {  
	                    e.printStackTrace();  
	                }  
	            }  
	            if (pst != null) {  
	                try {  
	                    pst.close();  
	                } catch (SQLException e) {  
	                    e.printStackTrace();  
	                }  
	            }  
	            if (rs != null) {  
	                try {  
	                    rs.close();  
	                } catch (SQLException e) {  
	                    e.printStackTrace();  
	                }  
	            }  
	        }  
	        return last_inserted_id;  
	 }
	
}
