package com.mindtree.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.SQLException;
import java.sql.*;  
//import com.mysql.cj.xdevapi.Statement;


public class App{
	public static void main(String args[]) {
		String url = "jdbc:mysql://localhost:3306/milestone";
		String username = "root";
		String password = "vu123";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection(url, username, password);
			System.out.println("Connected.....");
			Statement stmt = conn.createStatement();
			stmt.executeQuery("insert into emp values(1,'ABCD','India')");
			stmt.executeQuery("insert into emp values(2,'CDEF','USA')");
			stmt.executeQuery("insert into emp values(1,'EFGH','Japan')");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}




//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
////import java.sql.ResultSet;
//import java.sql.SQLException;
//
///**
//* @author Crunchify.com 
//* Simple Hello World MySQL Tutorial on how to make JDBC connection, Add and Retrieve Data by App Shah
//* 
//*/
//
//public class App {
//
//	static Connection crunchifyConn = null;
//	static PreparedStatement crunchifyPrepareStat = null;
//
//	public static void main(String[] argv) {
//
//		try {
//			log("-------- Simple Crunchify Tutorial on how to make JDBC connection to MySQL DB locally on macOS ------------");
//			makeJDBCConnection();
//
//			log("\n---------- Adding company 'Crunchify LLC' to DB ----------");
//			addDataToDB("1","ABC", "India");
//			addDataToDB("2", "BCD", "Japan");
//			addDataToDB("3", "CDE", "NY");
//
//			log("\n---------- Let's get Data from DB ----------");
////			getDataFromDB();
//
//			crunchifyPrepareStat.close();
//			crunchifyConn.close(); // connection close
//
//		} catch (SQLException e) {
//
//			e.printStackTrace();
//		}
//	}
//
//	private static void makeJDBCConnection() {
//
//		try {
//			Class.forName("com.mysql.jdbc.Driver");
//			log("Congrats - Seems your MySQL JDBC Driver Registered!");
//		} catch (ClassNotFoundException e) {
//			log("Sorry, couldn't found JDBC driver. Make sure you have added JDBC Maven Dependency Correctly");
//			e.printStackTrace();
//			return;
//		}
//
//		try {
//			// DriverManager: The basic service for managing a set of JDBC drivers.
//			crunchifyConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/milestone", "root", "vu123");
//			if (crunchifyConn != null) {
//				log("Connection Successful! Enjoy. Now it's time to push data");
//			} else {
//				log("Failed to make connection!");
//			}
//		} catch (SQLException e) {
//			log("MySQL Connection Failed!");
//			e.printStackTrace();
//			return;
//		}
//
//	}
//
//	private static void addDataToDB(String id, String name, String address) {
//
//		try {
//			String insertQueryStatement = "INSERT  INTO  emp  VALUES  (?,?,?)";
//
//			crunchifyPrepareStat = crunchifyConn.prepareStatement(insertQueryStatement);
//			crunchifyPrepareStat.setString(1, id);
//			crunchifyPrepareStat.setString(1, name);
//			crunchifyPrepareStat.setString(2, address);
//			
//			// execute insert SQL statement
//			crunchifyPrepareStat.executeUpdate();
//			log(name + " added successfully");
//		} catch (
//
//		SQLException e) {
//			e.printStackTrace();
//		}
//	}
//
////	private static void getDataFromDB() {
////
////		try {
////			// MySQL Select Query Tutorial
////			String getQueryStatement = "SELECT * FROM employee";
////
////			crunchifyPrepareStat = crunchifyConn.prepareStatement(getQueryStatement);
////
////			// Execute the Query, and get a java ResultSet
////			ResultSet rs = crunchifyPrepareStat.executeQuery();
////
////			// Let's iterate through the java ResultSet
////			while (rs.next()) {
////				String name = rs.getString("Name");
////				String address = rs.getString("Address");
////				int employeeCount = rs.getInt("EmployeeCount");
////				String website = rs.getString("Website");
////
////				// Simply Print the results
////				System.out.format("%s, %s, %s, %s\n", name, address, employeeCount, website);
////			}
////
////		} catch (
////
////		SQLException e) {
////			e.printStackTrace();
////		}
////
////	}
//
//	// Simple log utility
//	private static void log(String string) {
//		System.out.println(string);
//
//	}
//}