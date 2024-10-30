package com.bptn.course._feedapp_jdbc_postgresql;

import java.sql.Connection;

public class Main {

	public static void main(String[] args) {
		// create an instance of FeedAppClass
		FeedAppClass jdbc = new FeedAppClass();
		
		// establish a connection to the database
		Connection conn = jdbc.createConnection();
		
		// insert a new user into the user table
		jdbc.addUser(conn, "Ray", "Mist", "raymist", "18292831", "ray@mist.com", "Ray@22", true);
		// close the database connection
		jdbc.closeConnection(conn);
	}

}
