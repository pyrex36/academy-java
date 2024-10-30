package com.bptn.course._feedapp_jdbc_postgresql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class FeedAppClass {
	
	private static final String userName = "postgres";
	private static final String password = "pg4301";
	private static final String dbName = "FeedApp";
	private static final String port = "5432";
	private static final String dbUrl = "localhost";
	
	public Connection createConnection() {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection("jdbc:postgresql://"+ dbUrl+ ":" + port + "/" + dbName,
					userName, password);
		} catch (Exception e) {
			System.out.println(e.getClass().getName() + " : " + e.getMessage());
			System.exit(0);
		}
		System.out.println("Opened database successfully!");
		  return conn;
	}
	public void addUser(Connection conn, String firstName, String lastName, String username,
			String phone,String emailId, String password, boolean emailVerified) {
		PreparedStatement stmt = null;
		try {
            String sql = "INSERT INTO \"user\" (\"firstName\", \"lastName\", \"username\", \"phone\", \"emailId\", \"password\", \"emailVerified\", \"createdOn\") "
            		+ "VALUES (?, ?, ?, ?, ?, ?, ?, CURRENT_TIMESTAMP)";
            stmt = conn.prepareStatement(sql);
            
            // set values for the placeholder in the query
            stmt.setString(1, firstName); 
            stmt.setString(2, lastName); 
            stmt.setString(3, username); 
            stmt.setString(4, phone);
            stmt.setString(5, emailId);
            stmt.setString(6, password);
            stmt.setBoolean(7, emailVerified);
            
            // execute the query
            int resultCount = stmt.executeUpdate();
            System.out.println(resultCount + " record(s) inserted");
            stmt.close();
		} catch (SQLException ex) {
			System.out.println("Exception: " + ex.getMessage());
//		} finally {
//			try {
//				if (stmt != null) stmt.close();
//			} catch (SQLException ex) {
//				System.out.println("Exception: " + ex.getMessage());
//			}
		}
	}
	  // Method to close the database connection
    public boolean closeConnection(Connection conn) {
        boolean flag = true;
        try {
            if (conn != null) conn.close();
        } catch (SQLException ex) {
            flag = false;
            System.out.println("Exception:" + ex.getMessage());
        }
        return flag;
    }

}
