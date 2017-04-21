package com.java.jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class MyDbClass {

	private static String dbUrl = "jdbc:derby:C:\\Users\\paypal\\MyDB;user=abi3202;password=Athi2987";
	private static Connection con = null;
	private static Statement stmt = null;
	private static PreparedStatement pstmt = null;

	public static void main(String[] args) throws SQLException {

		createConnection();
		insertBooks();
		selectBooks();
		shutdown();

	}


	private static void createConnection() throws SQLException {
		DriverManager.registerDriver(new org.apache.derby.jdbc.EmbeddedDriver());
		con = DriverManager.getConnection(dbUrl);
	}

	private static void insertBooks() {
		
		try {
			stmt = con.createStatement();
			stmt.executeQuery("insert");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
	
	private static void selectBooks() {
		
		
		
	}

	private static void shutdown() {
		
	}

}
