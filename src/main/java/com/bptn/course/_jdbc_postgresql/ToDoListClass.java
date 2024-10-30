package com.bptn.course._jdbc_postgresql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ToDoListClass {
	
	private static final String userName = "postgres";
	private static final String password = "pg4301";
	private static final String dbName = "todolist";
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
		System.out.println("Connected to DB!");
		  return conn;
	}
	public void getAllUsers(Connection conn) {
		try {
			// step 1 - create the statement
			Statement myStatement = conn.createStatement();
			String myQuery = "SELECT * FROM users";
			ResultSet rs  = myStatement.executeQuery(myQuery);
			while(rs.next()) {
				System.out.println("User Id: " + rs.getInt("userId") + "\t");
				System.out.println("User Name: " + rs.getString("username") + "\t");
				System.out.println("Email: " + rs.getString("email") + "\t");
				System.out.println("Create At: " + rs.getString("createdAt") + "\t");
				System.out.println();
			}
			myStatement.close();
		} catch (SQLException e) {
			System.out.println("Exception: " + e.getMessage());
		}
	}
	public void getTaskByDate(Connection conn, String dueDate) {
		try {
			Statement myStatement = conn.createStatement();
			String myQuery = "SELECT * FROM tasks WHERE\"dueDate\"=" + "'" + dueDate + "'";
			ResultSet rs  = myStatement.executeQuery(myQuery);
			while (rs.next()) {
			System.out.println("Task Description: " + rs.getString("taskDescription") + "\t");
			System.out.println();
			}
			myStatement.close();
		} catch (SQLException e) {
			System.out.println("Exception:" + e.getMessage());
		}
	}
	
	public boolean closeConnection(Connection conn) {
		boolean flag = true;
		try {
			conn.close();
		} catch (SQLException e) {
			flag = false;
			System.out.println("Exception:" + e.getMessage());
		}
		System.out.println("Conection closed..");		
		return flag;
	}

}

